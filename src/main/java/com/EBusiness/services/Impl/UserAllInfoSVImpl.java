package com.EBusiness.services.Impl;

import com.EBusiness.dao.bo.*;
import com.EBusiness.dao.interfaces.*;
import com.EBusiness.services.interfaces.IUserAllInfo;
import com.EBusiness.util.BaseResponse;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.xml.soap.SAAJResult;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserAllInfoSVImpl implements IUserAllInfo {
    @Autowired
    private UserLogInfoMapper logInfoMapper;
    @Autowired
    private UserBaseInfoMapper baseInfoMapper;
    @Autowired
    private OrderInfoMapper orderInfoMapper;
    @Autowired
    private UserFriendsMapper friendsMapper;
    @Autowired
    private UserCollectionMapper collectionMapper;
    @Autowired
    private UserAddressMapper addressMapper;


    @Override
    public BaseResponse<UserLogInfo> LogIn(UserLogInfo param) {
        BaseResponse<UserLogInfo> response = new BaseResponse<>();

        List<UserLogInfo> list = new ArrayList<>();
        UserLogInfoExample example = new UserLogInfoExample();
        UserLogInfoExample.Criteria criteria = example.createCriteria();
        criteria.andUserAccountEqualTo(param.getUserAccount());
        criteria.andUserPasswordEqualTo(param.getUserPassword());
        list = logInfoMapper.selectByExample(example);
        if (list.size()==0){
            response.setResult(null);
            response.setResultMessage("账号不存在");
        }else{
            //需判断用户帐号是否应注销停用
            if (list.get(0).getUserStatus()==0){
                list.get(0).setUserPassword("");
                response.setResult(list.get(0));
            }else {
                response.setResult(null);
                response.setResultMessage("账号已注销");
            }
        }
        return response;
    }

    @Override
    public BaseResponse<Integer> LogOut(UserLogInfo param) {
        BaseResponse<Integer> response = new BaseResponse<>();
        int rsp = 0;
        UserLogInfoExample example = new UserLogInfoExample();
        UserLogInfoExample.Criteria criteria = example.createCriteria();
        criteria.andUserAccountEqualTo(param.getUserAccount());
        criteria.andUserPasswordEqualTo(param.getUserPassword());
        List<UserLogInfo> logInfos = logInfoMapper.selectByExample(example);
        //如果存在该用户登录信息,则更新登录信息
        if (logInfos.size()>0){
            rsp = logInfoMapper.updateByExample(param,example);
        }
        response.setResult(rsp);
        return response;
    }

    @Override
    public BaseResponse<Integer> UpdateUserInfo(UserBaseInfo param) {
        BaseResponse<Integer> response = new BaseResponse<>();
        int rsp = 0;
        //需判断是否更改密码和用户手机号
        UserBaseInfoExample baseInfoExample = new UserBaseInfoExample();
        UserLogInfoExample logInfoExample = new UserLogInfoExample();
        UserBaseInfoExample.Criteria criteria = baseInfoExample.createCriteria();
        UserLogInfoExample.Criteria criteria1 = logInfoExample.createCriteria();
        if (!StringUtils.isEmpty(param.getUserAccount())){
            criteria.andUserAccountEqualTo(param.getUserAccount());
            criteria1.andUserAccountEqualTo(param.getUserAccount());
        }
//        if (!StringUtils.isEmpty(param.getUserPassword())){
//            criteria.andUserPasswordEqualTo(param.getUserPassword());
//            criteria1.andUserPasswordEqualTo(param.getUserPassword());
//        }
//        if (!StringUtils.isEmpty(param.getUserPhoneNum())){
//            criteria.andUserPhoneNumEqualTo(param.getUserPhoneNum());
//            criteria1.andUserPhoneNumEqualTo(param.getUserPhoneNum());
//        }
//        if (!StringUtils.isEmpty(param.getUserBirthday())){
//            criteria.andUserBirthdayEqualTo(param.getUserBirthday());
//        }
        UserLogInfo logInfo = new UserLogInfo();
        logInfo.setUserPassword(param.getUserPassword());
        logInfo.setUserPhoneNum(param.getUserPhoneNum());

        //更新登录和基础表信息
        logInfoMapper.updateByExampleSelective(logInfo,logInfoExample);
        rsp = baseInfoMapper.updateByExampleSelective(param,baseInfoExample);
        response.setResult(rsp);
        return response;
    }

    @Override
    public BaseResponse<List<UserBaseInfo>> getUserInfo(UserBaseInfo param) {
        BaseResponse<List<UserBaseInfo>> response = new BaseResponse<>();
        UserBaseInfoExample example = new UserBaseInfoExample();
        UserBaseInfoExample.Criteria criteria = example.createCriteria();
        if (!StringUtils.isEmpty(param.getUserAccount())){
            criteria.andUserAccountEqualTo(param.getUserAccount());
        }
        if (!StringUtils.isEmpty(param.getUserId())){
            criteria.andUserIdEqualTo(param.getUserId());
        }
        if (!StringUtils.isEmpty(param.getUserPhoneNum())){
            criteria.andUserPhoneNumEqualTo(param.getUserPhoneNum());
        }
        if (!StringUtils.isEmpty(param.getUserPassword())){
          criteria.andUserPasswordEqualTo(param.getUserPassword());
        }
        //        分页处理
        PageHelper.startPage(0,5);
        List<UserBaseInfo> list = baseInfoMapper.selectByExample(example);
        for (UserBaseInfo baseInfo:list) {
            //对获取的密码做不返回处理
            baseInfo.setUserPassword("");
        }

        response.setResult(list);
        return response;
    }

    @Override
    public BaseResponse<Integer> editUserInfo(UserBaseInfo param) {
        BaseResponse<Integer> response = new BaseResponse<>();
        UserBaseInfoExample example = new UserBaseInfoExample();
        UserBaseInfoExample.Criteria criteria = example.createCriteria();
        if (!StringUtils.isEmpty(param.getUserAccount())){
            criteria.andUserAccountEqualTo(param.getUserAccount());
        }
        int i = 0;
        i = baseInfoMapper.updateByExampleSelective(param,example);
        if (i>0){
            response.setResult(i);
        }else{
            response.setResult(null);
        }
        return response;
    }

    @Override
    public BaseResponse<Integer> delUserInfo(UserBaseInfo param) {
        BaseResponse<Integer> response = new BaseResponse<>();
        //需要同时处理多张表，如个登录单等表都将处理
        UserBaseInfoExample example = new UserBaseInfoExample();
        UserBaseInfoExample.Criteria criteria = example.createCriteria();
        UserLogInfoExample example1 = new UserLogInfoExample();
        UserLogInfoExample.Criteria criteria1 = example1.createCriteria();
        if (param!=null){
            if (!StringUtils.isEmpty(param.getUserAccount())){
                criteria.andUserAccountEqualTo(param.getUserAccount());
                criteria1.andUserAccountEqualTo(param.getUserAccount());
            }
            if (!StringUtils.isEmpty(param.getUserId())){
                criteria.andUserIdEqualTo(param.getUserId());
            }
            int i = baseInfoMapper.deleteByExample(example);
            logInfoMapper.deleteByExample(example1);
            response.setResult(i);
        }else{
            response = null;
        }
        return response;
    }

    @Override
    public BaseResponse<Integer> addUserInfo(UserBaseInfo param) {
        BaseResponse<Integer> response = new BaseResponse<>();
        //新增时需要同步在登录表中插入数据
        if (param!=null){
            if (StringUtils.isEmpty(param.getUserAccount())){
                response.setResult(null);
                return response;
            }
            if (StringUtils.isEmpty(param.getUserPassword())){
                response.setResult(null);
                return response;
            }
            if (StringUtils.isEmpty(param.getUserName())){
//                response = null;
//                return response;
                param.setUserName(param.getUserAccount());
            }
            if (StringUtils.isEmpty(param.getUserPhoneNum())){
                response.setResult(null);
                return response;
            }
            //判断账号是否存在
            UserBaseInfoExample example = new UserBaseInfoExample();
            UserBaseInfoExample.Criteria criteria = example.createCriteria();
            criteria.andUserAccountEqualTo(param.getUserAccount());
            List<UserBaseInfo> list = baseInfoMapper.selectByExample(example);
            if (list.size()>0){
                response.setResultMessage("该账号已存在");
                return response;
            }
            //在登录表中插入数据
            UserLogInfo userLogInfo = new UserLogInfo();
            userLogInfo.setUserAccount(param.getUserAccount());
            userLogInfo.setUserPassword(param.getUserPassword());
            userLogInfo.setUserPhoneNum(param.getUserPhoneNum());
            userLogInfo.setUserStatus(0);
            logInfoMapper.insert(userLogInfo);
            Integer i = 0;
            i = baseInfoMapper.insert(param);
            response.setResult(i);
        }else {
            response.setResult(null);
        }
        return response;
    }

    @Override
    public BaseResponse<List<OrderInfo>> getOrderInfo(OrderInfo param) {
        BaseResponse<List<OrderInfo>> response = new BaseResponse<>();
        OrderInfoExample example = new OrderInfoExample();
        OrderInfoExample.Criteria criteria = example.createCriteria();
        if (param!=null){
            if (!StringUtils.isEmpty(param.getUserOrdeId())){
                criteria.andUserOrdeIdEqualTo(param.getUserOrdeId());
            }
            if (!StringUtils.isEmpty(param.getUserAccount())){
                criteria.andUserAccountEqualTo(param.getUserAccount());
            }
            if (!StringUtils.isEmpty(param.getMerchantAccount())){
                criteria.andMerchantAccountEqualTo(param.getMerchantAccount());
            }
            if (!StringUtils.isEmpty(param.getCommodityId())){
                criteria.andCommodityIdEqualTo(param.getCommodityId());
            }
            if (!StringUtils.isEmpty(param.getCommodityName())){
                criteria.andCommodityNameEqualTo(param.getCommodityName());
            }
            if (!StringUtils.isEmpty(param.getUserAddress())){
                criteria.andUserAddressLike("%"+param.getUserAddress()+"%");
            }
            if (!StringUtils.isEmpty(param.getMerchantAddress())){
                criteria.andMerchantAddressLike("%"+param.getMerchantAddress()+"%");
            }
            if (!StringUtils.isEmpty(param.getOrderStatus())){
//                判断订单是否被用户删除，若被用户删除，则用户不可见
                if (param.getOrderStatus()==99){
                    criteria.andOrderStatusNotEqualTo(99);
                }else{
                    criteria.andOrderStatusEqualTo(param.getOrderStatus());
                }
            }
            List<OrderInfo> list = orderInfoMapper.selectByExample(example);
            response.setResult(list);
        }else {
            response.setResult(null);
        }
        return response;
    }

    @Override
    public BaseResponse<Integer> editOrder(OrderInfo param) {
        BaseResponse<Integer> response = new BaseResponse<>();
        OrderInfoExample example = new OrderInfoExample();
        OrderInfoExample.Criteria criteria = example.createCriteria();
        //订单号唯一，即可确认订单
        if (!StringUtils.isEmpty(param.getUserOrdeId())){
            criteria.andUserOrdeIdEqualTo(param.getUserOrdeId());
        }
        if (!StringUtils.isEmpty(param.getUserAccount())){
            criteria.andUserAccountEqualTo(param.getUserAccount());
        }

        Integer i = 0;
        i = orderInfoMapper.updateByExampleSelective(param,example);
        if (i>0){
            response.setResult(i);
        }else {
            response.setResult(null);
        }
        return response;
    }

    @Override
    public BaseResponse<Integer> delOrder(OrderInfo param) {
        BaseResponse<Integer> response = new BaseResponse<>();
        OrderInfoExample example = new OrderInfoExample();
        OrderInfoExample.Criteria criteria = example.createCriteria();
        //订单号唯一，即可确认订单
        if (!StringUtils.isEmpty(param.getUserOrdeId())){
            criteria.andUserOrdeIdEqualTo(param.getUserOrdeId());
        }
        if (!StringUtils.isEmpty(param.getUserAccount())){
            criteria.andUserAccountEqualTo(param.getUserAccount());
        }
        Integer i = 0;
        i = orderInfoMapper.deleteByExample(example);
        if (i>0){
            response.setResult(i);
        }else {
            response = null;
        }
        return response;
    }

    @Override
    public BaseResponse<Integer> addOrder(OrderInfo param) {
        BaseResponse<Integer> response = new BaseResponse<>();
        OrderInfoExample example = new OrderInfoExample();
        OrderInfoExample.Criteria criteria = example.createCriteria();
        //新增时部分用户帐号、商品账号、店铺账号不能为空
        if (StringUtils.isEmpty(param.getMerchantAccount())){
            response = null;
            return response;
        }
        if (StringUtils.isEmpty(param.getUserAccount())){
            response = null;
            return response;
        }
        if (StringUtils.isEmpty(param.getCommodityId())){
            response = null;
            return response;
        }

        Integer i = 0;
        i = orderInfoMapper.insert(param);
        if (i>0){
            response.setResult(i);
        }else {
            response = null;
        }
        return response;
    }

    @Override
    public BaseResponse<Object> getTotalOrder(OrderInfo param) {

        return null;
    }

    @Override
    public BaseResponse<Integer> editOrderInfo(OrderInfo param) {
        return null;
    }

    @Override
    public BaseResponse<Integer> delOrderInfo(OrderInfo param, String role) {
        return null;
    }


    @Override
    public BaseResponse<List<UserFriends>> getUserFriend(UserFriends param) {
        BaseResponse<List<UserFriends>> response = new BaseResponse<>();
        if (param==null){
            response.setResult(null);
            return response;
        }else {
            UserFriendsExample example = new UserFriendsExample();
            UserFriendsExample.Criteria criteria = example.createCriteria();
            if (!StringUtils.isEmpty(param.getFridendId())){
                criteria.andFridendIdEqualTo(param.getFridendId());
            }
            if (!StringUtils.isEmpty(param.getFriendedUserAccount())){
                criteria.andFriendedUserAccountEqualTo(param.getFriendedUserAccount());
            }

            if (!StringUtils.isEmpty(param.getFriendedUserName())){
                criteria.andFriendedUserNameLike("%"+param.getFriendedUserName()+"%");
            }
            if (!StringUtils.isEmpty(param.getFriendingUserAccount())){
                criteria.andFriendingUserAccountEqualTo(param.getFriendingUserAccount());

            }if (!StringUtils.isEmpty(param.getFriendingUserName())){
                criteria.andFriendingUserNameEqualTo(param.getFriendingUserName());
            }
            if (!StringUtils.isEmpty(param.getFriendStatus())){
                criteria.andFriendStatusEqualTo(param.getFriendStatus());
            }
            List<UserFriends> list = friendsMapper.selectByExample(example);
            response.setResult(list);
        }
        return response;
    }

    @Override
    public BaseResponse<Integer> editUserFriend(UserFriends param) {
        BaseResponse<Integer> response = new BaseResponse<>();
        if (param==null){
            response = null;
            return response;
        }else{
            UserFriendsExample example = new UserFriendsExample();
            UserFriendsExample.Criteria criteria = example.createCriteria();
            if (!StringUtils.isEmpty(param.getFriendedUserAccount())){
                criteria.andFriendedUserAccountEqualTo(param.getFriendedUserAccount());
            }
            if (!StringUtils.isEmpty(param.getFriendingUserAccount())){
                criteria.andFriendingUserAccountEqualTo(param.getFriendingUserAccount());
            }
            if (!StringUtils.isEmpty(param.getFridendId())){
                criteria.andFridendIdEqualTo(param.getFridendId());
            }
            int i = friendsMapper.updateByExampleSelective(param,example);
            if (i>0){
                response.setResult(i);
            }else{
                response.setResult(null);
            }
            return response;
        }
    }

    @Override
    public BaseResponse<Integer> delUserFriend(UserFriends param) {
        BaseResponse<Integer> response = new BaseResponse<>();
        UserFriendsExample example = new UserFriendsExample();
        UserFriendsExample.Criteria criteria = example.createCriteria();
        if (param==null){
            response = null;
            return response;
        }else {
            if (!StringUtils.isEmpty(param.getFridendId())) {
                criteria.andFridendIdEqualTo(param.getFridendId());
            }
            if (!StringUtils.isEmpty(param.getFriendingUserName())) {
                criteria.andFriendingUserNameEqualTo(param.getFriendingUserName());
            }
            if (!StringUtils.isEmpty(param.getFriendingUserAccount())) {
                criteria.andFriendingUserAccountEqualTo(param.getFriendingUserAccount());
            }
            if (!StringUtils.isEmpty(param.getFriendedUserAccount())) {
                criteria.andFriendedUserAccountEqualTo(param.getFriendedUserAccount());
            }
            if (!StringUtils.isEmpty(param.getFriendedUserName())) {
                criteria.andFriendedUserNameEqualTo(param.getFriendedUserName());
            }
            int i = friendsMapper.deleteByExample(example);
            response.setResult(i);
            return response;
        }
    }

    @Override
    public BaseResponse<Integer> addUserFriend(UserFriends param) {
        BaseResponse<Integer> response = new BaseResponse<>();
        if (StringUtils.isEmpty(param.getFriendingUserAccount())){
            response = null;
            return response;
        }
        if (StringUtils.isEmpty(param.getFriendedUserAccount())){
            response = null;
            return response;
        }
        if (StringUtils.isEmpty(param.getFriendNickname())){
           param.setFriendNickname(param.getFriendedUserName());
        }
        int i = friendsMapper.insert(param);
        response.setResult(i);
        return response;
    }

    @Override
    public BaseResponse<List<UserCollection>> getUserCollection(UserCollection param) {
        BaseResponse<List<UserCollection>> response = new BaseResponse<>();
        UserCollectionExample example = new UserCollectionExample();
        example.isDistinct();
        UserCollectionExample.Criteria criteria = example.createCriteria();
        if (param==null){
            response.setResult(null);
            return response;
        }
        if (!StringUtils.isEmpty(param.getCollectionId())){
            criteria.andCollectionIdEqualTo(param.getCollectionId());
        }
        if (!StringUtils.isEmpty(param.getUserAccount())){
            criteria.andUserAccountEqualTo(param.getUserAccount());
        }
        if (!StringUtils.isEmpty(param.getCollectedAccout())){
            criteria.andCollectedAccoutEqualTo(param.getCollectedAccout());
        }
        if (!StringUtils.isEmpty(param.getCollectionStatus())){
            criteria.andCollectionStatusEqualTo(param.getCollectionStatus());
        }
        if (!StringUtils.isEmpty(param.getCollectionType())){
            criteria.andCollectionTypeEqualTo(param.getCollectionType());
        }
        List<UserCollection> list = collectionMapper.selectByExample(example);
        response.setResult(list);
        return response;
    }

    @Override
    public BaseResponse<Integer> editCollection(UserCollection param) {
        BaseResponse<Integer> response = new BaseResponse<>();
        UserCollectionExample example = new UserCollectionExample();
        UserCollectionExample.Criteria criteria = example.createCriteria();
        if (!StringUtils.isEmpty(param.getCollectionId())){
            criteria.andCollectionIdEqualTo(param.getCollectionId());
        }
        if (!StringUtils.isEmpty(param.getUserAccount())){
            criteria.andUserAccountEqualTo(param.getUserAccount());
        }
        if (!StringUtils.isEmpty(param.getCollectedAccout())){
            criteria.andCollectedAccoutEqualTo(param.getCollectedAccout());
        }
        int i = collectionMapper.updateByExampleSelective(param,example);
        if (i>0){
            response.setResult(i);
        }else{
            response = null;
        }
        return response;
    }

    @Override
    public BaseResponse<Integer> delCollection(UserCollection param) {
        BaseResponse<Integer> response = new BaseResponse<>();
        UserCollectionExample example = new UserCollectionExample();
        UserCollectionExample.Criteria criteria = example.createCriteria();
        if (!StringUtils.isEmpty(param.getCollectionId())){
            criteria.andCollectionIdEqualTo(param.getCollectionId());
        }
        if (!StringUtils.isEmpty(param.getUserAccount())){
            criteria.andUserAccountEqualTo(param.getUserAccount());
        }
        if (!StringUtils.isEmpty(param.getCollectedAccout())){
            criteria.andCollectedAccoutEqualTo(param.getCollectedAccout());
        }
        int i = collectionMapper.deleteByExample(example);
        if (i>0){
            response.setSuccess(true);
            response.setResult(i);
        }else{
            response = null;
        }
        return response;
    }

    @Override
    public BaseResponse<Integer> addCollection(UserCollection param) {
        BaseResponse<Integer> response = new BaseResponse<>();

        if (StringUtils.isEmpty(param.getUserAccount())){
            response.setResult(null);
            return response;
        }
        if (StringUtils.isEmpty(param.getCollectedAccout())){
            response.setResult(null);
            return response;
        }
        if (StringUtils.isEmpty(param.getCollectionStatus())){
            param.setCollectionStatus(0);
        }
        int i = collectionMapper.insert(param);
        response.setResult(i);

        return response;
    }

    @Override
    public BaseResponse<List<UserAddress>> getAddress(UserAddress param) {
        BaseResponse<List<UserAddress>> response = new BaseResponse<>();
        if (param==null){
            response.setResult(null);
            return response;
        }else {
            UserAddressExample example = new UserAddressExample();
            UserAddressExample.Criteria criteria = example.createCriteria();
            if (!StringUtils.isEmpty(param.getUserAddressId())){
                criteria.andUserAddressIdEqualTo(param.getUserAddressId());
            }
            if (!StringUtils.isEmpty(param.getUserAccount())){
                criteria.andUserAccountEqualTo(param.getUserAccount());
            }
            if (!StringUtils.isEmpty(param.getUserAddressStatus())){
                criteria.andUserAddressStatusEqualTo(param.getUserAddressStatus());
            }
            if (!StringUtils.isEmpty(param.getUserName())){
                criteria.andUserNameLike("%"+param.getUserName()+"%");
            }
            if (!StringUtils.isEmpty(param.getUserPhone())){
                criteria.andUserPhoneEqualTo(param.getUserPhone());
            }
            List<UserAddress> list = addressMapper.selectByExample(example);
            response.setResult(list);
        }
        return response;
    }

    @Override
    public BaseResponse<Integer> addAddress(UserAddress param) {
        BaseResponse<Integer> response = new BaseResponse<>();
        if (param==null){
            response.setResult(null);
            return response;
        }else{
            if (StringUtils.isEmpty(param.getUserAccount())){
                response.setResult(null);
            }
            int i = addressMapper.insert(param);
            response.setResult(i);
        }
        return response;
    }

    @Override
    public BaseResponse<Integer> delAddress(UserAddress param) {
        return null;
    }

    @Override
    public BaseResponse<Integer> editAddress(UserAddress param) {
        BaseResponse<Integer> response = new BaseResponse<>();
        if (param==null){
            response.setResult(null);
            return response;
        }else{
            UserAddressExample example = new UserAddressExample();
            UserAddressExample.Criteria criteria = example.createCriteria();
            if (!StringUtils.isEmpty(param.getUserAddressId())){
                criteria.andUserAddressIdEqualTo(param.getUserAddressId());
            }
            if (!StringUtils.isEmpty(param.getUserAccount())){
                criteria.andUserAccountEqualTo(param.getUserAccount());
            }
            int i = addressMapper.updateByExampleSelective(param,example);
            response.setResult(i);
        }
        return response;
    }
}
