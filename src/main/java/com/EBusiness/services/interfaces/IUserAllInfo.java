package com.EBusiness.services.interfaces;

import com.EBusiness.dao.bo.*;
import com.EBusiness.util.BaseResponse;
import org.apache.ibatis.type.IntegerTypeHandler;

import java.util.List;

//个人信息所有接口
public interface IUserAllInfo {
    //登录
    public BaseResponse<UserLogInfo> LogIn(UserLogInfo param);
    //注销
    public BaseResponse<Integer> LogOut(UserLogInfo param);
    //修改个人信息
    public BaseResponse<Integer> UpdateUserInfo(UserBaseInfo param);
    //查询个人信息
    public BaseResponse<List<UserBaseInfo>> getUserInfo(UserBaseInfo param);
    //修改个人信息
    public BaseResponse<Integer> editUserInfo(UserBaseInfo param);
    //删除用户
    public BaseResponse<Integer> delUserInfo(UserBaseInfo param);
    //注册用户
    public BaseResponse<Integer> addUserInfo(UserBaseInfo param);
    //查询个人订单记录
    public BaseResponse<List<OrderInfo>> getOrderInfo(OrderInfo param);
    //管理员修改订单（用户确定收货等操作也会修改订单）
    public BaseResponse<Integer> editOrder(OrderInfo param);
    //删除订单
    public BaseResponse<Integer> delOrder(OrderInfo param);
    //新增订单
    public BaseResponse<Integer> addOrder(OrderInfo param);

    //统计个人消费记录，包括消费条数、消费总金额，购买物品总件数
    public BaseResponse<Object> getTotalOrder(OrderInfo param);
    //删除个人订单（非后台管理员删除订单只是更改订单状态）
    public BaseResponse<Integer> editOrderInfo(OrderInfo param);
    public BaseResponse<Integer> delOrderInfo(OrderInfo param,String role);
    //查看个人好友
    public BaseResponse<List<UserFriends>> getUserFriend(UserFriends param);
    //更改好友备注
    public BaseResponse<Integer> editUserFriend(UserFriends param);
    //删除个人好友（非后台管理员删除好友只是更改好友状态）
    public BaseResponse<Integer> delUserFriend(UserFriends param);
    //新增个人好友
    public BaseResponse<Integer> addUserFriend(UserFriends param);
    //查看个人收藏
    public BaseResponse<List<UserCollection>> getUserCollection(UserCollection param);
    //编辑个人收藏（如加备注）
    public BaseResponse<Integer> editCollection(UserCollection param);
    //删除收藏
    public BaseResponse<Integer> delCollection(UserCollection param);
    //新增收藏
    public BaseResponse<Integer> addCollection(UserCollection param);
//    获取用户收货地址
    public BaseResponse<List<UserAddress>> getAddress(UserAddress param);
//    管理收货地址
    public BaseResponse<Integer> addAddress(UserAddress param);
    public BaseResponse<Integer> delAddress(UserAddress param);
    public BaseResponse<Integer> editAddress(UserAddress param);


}
