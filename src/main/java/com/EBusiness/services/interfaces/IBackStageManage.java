package com.EBusiness.services.interfaces;

import com.EBusiness.dao.bo.AdminInfo;
import com.EBusiness.dao.bo.AdminLevel;
import com.EBusiness.dao.bo.OrderInfo;
import com.EBusiness.dao.bo.UserBaseInfo;
import com.EBusiness.util.BaseResponse;

import java.util.List;

//后台管理模块接口
public interface IBackStageManage {
    //登录后台
    public AdminInfo LogOnAdmin(AdminInfo param);
    //新增后台管理人员 role 为当前操作管理员的角色
    public BaseResponse<Integer> addAdmin(AdminInfo param,String role);
    //后台管理人员管理接口
    public BaseResponse<Integer> editAdmin(AdminInfo param,String role);
    //查询后台管理人员
    public BaseResponse<List<AdminInfo>> getAdmin(AdminInfo param,String role);
    //删除管理员
    public BaseResponse<Integer> delAdmin(AdminInfo param,String role);
    //获取角色权限表描述
    public BaseResponse<List<AdminLevel>> getRole(AdminLevel param);
    //获取用户数量
    public BaseResponse<Integer> getUserCount(UserBaseInfo param);
    //获取总交易额
    public BaseResponse<Float> getTradeMoney(OrderInfo param);
    //获取总交易数量
    public BaseResponse<Integer> getTradeCount(OrderInfo param);
    //发帖总数
    public BaseResponse<Integer> getPostCount();

}
