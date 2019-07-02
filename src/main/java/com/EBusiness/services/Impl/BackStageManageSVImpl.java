package com.EBusiness.services.Impl;

import com.EBusiness.dao.bo.*;
import com.EBusiness.dao.interfaces.AdminInfoMapper;
import com.EBusiness.dao.interfaces.AdminLevelMapper;
import com.EBusiness.dao.interfaces.OrderInfoMapper;
import com.EBusiness.dao.interfaces.UserBaseInfoMapper;
import com.EBusiness.services.interfaces.IBackStageManage;
import com.EBusiness.util.BaseResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

@Service
public class BackStageManageSVImpl implements IBackStageManage {
    @Autowired
    private AdminInfoMapper adminInfoMapper;
    @Autowired
    private UserBaseInfoMapper userBaseInfoMapper;
    @Autowired
    private OrderInfoMapper orderInfoMapper;
    @Autowired
    private AdminLevelMapper adminRoleMapper;

    @Override
    public AdminInfo LogOnAdmin(AdminInfo param) {
        AdminInfoExample example = new AdminInfoExample();
        AdminInfoExample.Criteria criteria = example.createCriteria();
        if (!StringUtils.isEmpty(param.getAdminAccount())){
            criteria.andAdminAccountEqualTo(param.getAdminAccount());
        }
        if (!StringUtils.isEmpty(param.getAdminPassword())){
            criteria.andAdminPasswordEqualTo(param.getAdminPassword());
        }
        List<AdminInfo> list = adminInfoMapper.selectByExample(example);
        return list.get(0);
    }

    @Override
    public BaseResponse<Integer> addAdmin(AdminInfo param,String role) {
        BaseResponse<Integer> response = new BaseResponse<>();
//        判断管理员帐号和密码不能为空
        if ((StringUtils.isEmpty(param.getAdminAccount())) ||
                (StringUtils.isEmpty(param.getAdminPassword()))){
            response = null;
            return response;
        }else {
            //判断新增用户的角色权限是否高于当前操作用户
            if (!judgeRole(param, role)) {
                response.setResultMessage("用户角色权限不够");
                response.setSuccess(false);
                return response;
            }
            //插入前先判断是否存在该用户
            AdminInfoExample example = new AdminInfoExample();
            AdminInfoExample.Criteria criteria = example.createCriteria();
            criteria.andAdminAccountEqualTo(param.getAdminAccount());
            criteria.andAdminPasswordEqualTo(param.getAdminPassword());
            List<AdminInfo> list = adminInfoMapper.selectByExample(example);
            if (list.size() > 0) {
                response.setResultMessage("该账户已存在");
                response.setSuccess(false);
                response.setResult(0);
                return response;
            } else {
                if (StringUtils.isEmpty(param.getAdminLevel())){
                    param.setAdminLevel("5");
                }
                int i = 0;
                i = adminInfoMapper.insert(param);
                response.setResult(i);
                response.setSuccess(true);
                response.setResultMessage("新增成功");
            }
            return response;
        }
    }


    @Override
    public BaseResponse<Integer> editAdmin(AdminInfo param, String role) {
        BaseResponse<Integer> response = new BaseResponse<>();
        AdminInfoExample example = new AdminInfoExample();
        AdminInfoExample.Criteria criteria = example.createCriteria();
        //编辑前需判断是否修改用户权限，以及修改权限是否足够
        if (judgeRole(param,role)){
            //修改时账号唯一，其余均可修改。
            if (!StringUtils.isEmpty(param.getAdminAccount())){
                criteria.andAdminAccountEqualTo(param.getAdminAccount());
            }
            //若权限等级未选择，则默认为最低级管理员
            if (StringUtils.isEmpty(param.getAdminLevel())){
                param.setAdminLevel("5");
            }
            Integer integer = adminInfoMapper.updateByExampleSelective(param,example);
            response.setResult(integer);
            response.setSuccess(true);
        }else{
            response = null;
            response.setResultMessage("角色权限不足");
        }
        return response;
    }

    @Override
    public BaseResponse<List<AdminInfo>> getAdmin(AdminInfo param, String role) {
        BaseResponse<List<AdminInfo>> response = new BaseResponse<>();
        AdminInfoExample example = new AdminInfoExample();
        AdminInfoExample.Criteria criteria = example.createCriteria();
        if (param!=null){
            if(!judgeRole(param,role)){
                response.setSuccess(false);
                response.setResultMessage("管理员权限不够");
                return response;
            }else{
                if (!StringUtils.isEmpty(param.getAdminLevel())) {
                    criteria.andAdminLevelGreaterThanOrEqualTo(param.getAdminLevel());
                }
                if (!StringUtils.isEmpty(param.getAdminAccount())){
                    criteria.andAdminAccountEqualTo(param.getAdminAccount());
                }
            }
        }
        List<AdminInfo> list = adminInfoMapper.selectByExample(example);
        for(int i = 0;i<list.size();i++){
            if (StringUtils.isEmpty(list.get(i).getAdminAccount())){
                list.remove(i);
            }
        }
        response.setResult(list);

        return response;
    }

    @Override
    public BaseResponse<Integer> delAdmin(AdminInfo param, String role) {
        BaseResponse<Integer> response = new BaseResponse<>();
        if (param!=null) {
            if (judgeRole(param, role)) {
                AdminInfoExample example = new AdminInfoExample();
                AdminInfoExample.Criteria criteria = example.createCriteria();
                if (!StringUtils.isEmpty(param.getAdminAccount())) {
                    criteria.andAdminAccountEqualTo(param.getAdminAccount());
                }
                if (!StringUtils.isEmpty(param.getAdminId())) {
                    criteria.andAdminIdEqualTo(param.getAdminId());
                }
                if (!StringUtils.isEmpty(param.getAdminLevel())) {
                    criteria.andAdminLevelEqualTo(param.getAdminLevel());
                }
                Integer i = 0;
                i = adminInfoMapper.deleteByExample(example);
                response.setResult(i);
                return response;
            } else {
                response = null;
                return response;
            }
        }else {
            return null;
        }
    }

    @Override
    public BaseResponse<List<AdminLevel>> getRole(AdminLevel param) {
        BaseResponse<List<AdminLevel>> response = new BaseResponse<>();
        AdminLevelExample example = new AdminLevelExample();
        AdminLevelExample.Criteria criteria = example.createCriteria();
        if (param!=null){
            if (!StringUtils.isEmpty(param.getAdminLevelId())){
                criteria.andAdminLevelIdEqualTo(param.getAdminLevelId());
            }
            if (!StringUtils.isEmpty(param.getAdminLevelRole())){
                criteria.andAdminLevelRoleLike("%"+param.getAdminLevelRole()+"%");
            }
            if (!StringUtils.isEmpty(param.getAdminLevelDesc())){
                criteria.andAdminLevelDescLike("%"+param.getAdminLevelDesc()+"%");
            }
        }
        List<AdminLevel> levels = adminRoleMapper.selectByExample(example);
        response.setResult(levels);
        return response;
    }

    @Override
    public BaseResponse<Integer> getUserCount(UserBaseInfo param) {
        BaseResponse<Integer> response = new BaseResponse<>();
        UserBaseInfoExample example = new UserBaseInfoExample();
        UserBaseInfoExample.Criteria criteria = example.createCriteria();
        if (param != null){
            if (!StringUtils.isEmpty(param.getUserAccount())){
                criteria.andUserAccountEqualTo(param.getUserAccount());
            }
            if (!StringUtils.isEmpty(param.getUserPhoneNum())){
                criteria.andUserPhoneNumEqualTo(param.getUserPhoneNum());
            }
        }
        int i = 0;
        i = userBaseInfoMapper.countByExample(example);
        response.setResult(i);
        return response;
    }

    @Override
    public BaseResponse<Float> getTradeMoney(OrderInfo param) {
        BaseResponse<Float> response = new BaseResponse<>();
        OrderInfoExample example = new OrderInfoExample();
        OrderInfoExample.Criteria criteria = example.createCriteria();
        if (param != null){
            if (!StringUtils.isEmpty(param.getCommodityId())){
                criteria.andCommodityIdEqualTo(param.getCommodityId());
            }
            if (!StringUtils.isEmpty(param.getMerchantAccount())){
                criteria.andMerchantAccountEqualTo(param.getMerchantAccount());
            }
            if (!StringUtils.isEmpty(param.getUserAccount())){
                criteria.andUserAccountEqualTo(param.getUserAccount());
            }
            if (!StringUtils.isEmpty(param.getUserOrdeId())){
                criteria.andUserOrdeIdEqualTo(param.getUserOrdeId());
            }
        }
        float f = 0;
        f = orderInfoMapper.getTotlaOrderMoney(example);
        response.setResult(f);
        return response;
    }

    @Override
    public BaseResponse<Integer> getTradeCount(OrderInfo param) {
        BaseResponse<Integer> response = new BaseResponse<>();
        OrderInfoExample example = new OrderInfoExample();
        OrderInfoExample.Criteria criteria = example.createCriteria();
        if (param != null){
            if (!StringUtils.isEmpty(param.getCommodityId())){
                criteria.andCommodityIdEqualTo(param.getCommodityId());
            }
            if (!StringUtils.isEmpty(param.getMerchantAccount())){
                criteria.andMerchantAccountEqualTo(param.getMerchantAccount());
            }
            if (!StringUtils.isEmpty(param.getUserAccount())){
                criteria.andUserAccountEqualTo(param.getUserAccount());
            }
            if (!StringUtils.isEmpty(param.getUserOrdeId())){
                criteria.andUserOrdeIdEqualTo(param.getUserOrdeId());
            }
        }
        Integer i = 0;
        i = orderInfoMapper.countByExample(example);
        response.setResult(i);
        return response;
    }

    @Override
    public BaseResponse<Integer> getPostCount() {
        BaseResponse<Integer> response = new BaseResponse<>();
        return null;
    }

    //判断操作用户角色权限是否足够 当角色权限足够时返回true
    public boolean judgeRole(AdminInfo param,String role){
        if (param == null){
            return true;
        }else{
            if (!StringUtils.isEmpty(param.getAdminLevel())){
                if (Integer.parseInt(role)<=Integer.parseInt(param.getAdminLevel())){
                    return true;
                }else {
                    return false;
                }
            }else {
                return true;
            }
        }
    }


}
