package com.EBusiness.controller;

import com.EBusiness.dao.bo.*;
import com.EBusiness.services.interfaces.IShopMall;
import com.EBusiness.services.interfaces.IUserAllInfo;
import com.EBusiness.util.BaseResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/userInfo")
public class UserInfoController {
    @Autowired
    private IUserAllInfo userAllInfo;
    @Autowired
    private IShopMall shopMall;


    @RequestMapping("/getBaseInfo")
    @ResponseBody
    public BaseResponse<UserBaseInfo> getBaseInfo(UserBaseInfo param){
        BaseResponse<UserBaseInfo> response = new BaseResponse<>();
        if (userAllInfo.getUserInfo(param).getResult().size()>0){
            UserBaseInfo result = userAllInfo.getUserInfo(param).getResult().get(0);
            response.setResult(result);
            response.setSuccess(true);
        }else {
            response.setResult(null);
            response.setSuccess(false);
        }
        return response;
    }
//    新增一个用户
    @RequestMapping("/addUser")
    @ResponseBody
    public BaseResponse<Integer> addUser(HttpServletRequest request, UserBaseInfo param){
        BaseResponse<Integer> response = new BaseResponse<>();
        response = userAllInfo.addUserInfo(param);
        if (response.getResult()!=null && response.getResult()>0){
            response.setSuccess(true);
        }else {
            response.setSuccess(false);
            response.setResultMessage("参错错误");
        }
        return response;
    }
    @RequestMapping("/updateBaseInfo")
    @ResponseBody
    public BaseResponse<Integer> editUserInfo(HttpServletRequest request,UserBaseInfo param){
        //改动密码时同时修改log表
        BaseResponse<Integer> response = new BaseResponse<>();
        response = userAllInfo.editUserInfo(param);
        if (response.getResult()==null){
            response.setSuccess(false);
            response.setResultMessage("修改失败");
        }else {
            response.setSuccess(true);
            response.setResultMessage("修改成功");
        }
        return response;
    }

    @RequestMapping("/getUserAddress")
    @ResponseBody
    public BaseResponse<List<UserAddress>> getUserAddress(UserLogInfo param){
        return null;
    }

    @RequestMapping("/updateUserAddress")
    @ResponseBody
    public BaseResponse<Integer> editUserAddresss(UserAddress param){
        return null;
    }

    @RequestMapping("addUserAddress")
    @ResponseBody
    public BaseResponse<Integer> addUserAddress(UserAddress param){
        return null;
    }

    @RequestMapping("delUserAddress")
    @ResponseBody
    public BaseResponse<Integer> delUserAddress(UserAddress param){
        return null;
    }

//    获取订单
    @RequestMapping("getOrderInfo")
    @ResponseBody
    public BaseResponse<List<OrderInfo>> getOrder(HttpServletRequest request,OrderInfo param){
        BaseResponse<List<OrderInfo>> response = new BaseResponse<>();
        response = userAllInfo.getOrderInfo(param);
        if (response.getResult()==null){
            response.setResultMessage("获取订单记录失败");
            response.setSuccess(false);
        }else if (response.getResult().size()==0){
            response.setResultMessage("没有订单记录");
            response.setSuccess(true);
        }else {
            response.setSuccess(true);
        }
        return response;
    }

//    删除订单（用户自己操作即修改订单状态为不可见）
//    获取好友信息
    @RequestMapping("/delOrder")
    @ResponseBody
    public BaseResponse<Integer> delOrder(HttpServletRequest request,OrderInfo param){
        BaseResponse<Integer> response = new BaseResponse<>();
        response = userAllInfo.editOrder(param);
        if (response.getResult()==null){
            response.setSuccess(false);
            response.setResultMessage("删除失败");
        }else{
            response.setSuccess(true);
            response.setResultMessage("删除成功");
        }
        return response;
    }

//    获取好友
    @RequestMapping("/getFriend")
    @ResponseBody
    public BaseResponse<List<UserFriends>> getFriends(HttpServletRequest request,UserFriends param){
        BaseResponse<List<UserFriends>> response = new BaseResponse<>();
        response = userAllInfo.getUserFriend(param);
        if (response.getResult()==null){
            response.setSuccess(false);
            response.setResultMessage("参数不正确");
        }else if (response.getResult().size()==0){
            response.setSuccess(true);
            response.setResultMessage("暂时没有好友");
        }else{
            response.setSuccess(true);
        }
        return response;
    }
//      删除好友
    @RequestMapping("/delFriend")
    @ResponseBody
    public BaseResponse<Integer> delFriend(HttpServletRequest request,UserFriends param){
        BaseResponse<Integer> response = new BaseResponse<>();
        response = userAllInfo.editUserFriend(param);
        if (response.getResult()==null){
            response.setSuccess(false);
            response.setResultMessage("删除失败");
        }else{
            response.setSuccess(true);
            response.setResultMessage("删除成功");
        }
        return response;
    }
//    新增好友
    @RequestMapping("/addFriend")
    @ResponseBody
    public BaseResponse<Integer> addFriend(HttpServletRequest request,UserFriends param){
        BaseResponse<Integer> response = new BaseResponse<>();
        response = userAllInfo.addUserFriend(param);
        if (response.getResult()==null){
            response.setSuccess(false);
            response.setResultMessage("删除失败");
        }else{
            response.setSuccess(true);
            response.setResultMessage("删除成功");
        }
        return response;
    }
//    获取收藏
    @RequestMapping("/getCollect")
    @ResponseBody
    public BaseResponse<List<UserCollection>> getCollect(HttpServletRequest request,UserCollection param){
        BaseResponse<List<UserCollection>> response = new BaseResponse<>();
        response = userAllInfo.getUserCollection(param);
        if (response.getResult()==null){
            response.setSuccess(false);
            response.setResultMessage("参数错误");
        }else if (response.getResult().size()==0){
            response.setSuccess(true);
            response.setResultMessage("暂时没有收藏");
        }else{
            response.setSuccess(true);
        }
        return response;
    }

//    删除收藏
    @RequestMapping("/delCollect")
    @ResponseBody
    public BaseResponse<Integer> delCollect(HttpServletRequest request,UserCollection param){
        BaseResponse<Integer> response = new BaseResponse<>();
        response = userAllInfo.editCollection(param);
        if (response == null){
            response.setResult(null);
            response.setSuccess(false);
            response.setResultMessage("删除失败");
        }else{
            response.setSuccess(true);
            response.setResultMessage("删除成功");
        }
        return response;
    }

//    获取购物车记录
    @RequestMapping("/getShopCart")
    @ResponseBody
    public BaseResponse<List<ShopTrolley>> getShopCart(HttpServletRequest request,ShopTrolley param){
        BaseResponse<List<ShopTrolley>> response = new BaseResponse<>();
        response = shopMall.getShopCart(param);
        if (response.getResult()==null){
            response.setSuccess(false);
            response.setResultMessage("参数错误");
        }else{
            response.setSuccess(true);
            if (response.getResult().size()==0){
                response.setResultMessage("没有购物车记录");
            }else{
                response.setResultMessage("查询成功");
            }
        }
        return  response;
    }

//    移出购物车
    @RequestMapping("/delShopCart")
    @ResponseBody
    public BaseResponse<Integer> delShopCart(HttpServletRequest request,ShopTrolley param){
        BaseResponse<Integer> response = new BaseResponse<>();
        response = shopMall.delShopCart(param);
        if (response.getResult()==null){
            response.setSuccess(false);
            response.setResultMessage("参数错误");
        }else{
            response.setSuccess(true);
            if (response.getResult()>0){
                response.setResultMessage("删除成功");
            }else {
                response.setResultMessage("删除失败");
            }
        }
        return response;
    }

//    管理用户收货地址
    @RequestMapping("/getAddress")
    @ResponseBody
    public BaseResponse<List<UserAddress>> getAddress(HttpServletRequest request,UserAddress param){
        BaseResponse<List<UserAddress>> response = new BaseResponse<>();
        response = userAllInfo.getAddress(param);
        if (response.getResult()==null){
            response.setSuccess(false);
            response.setResultMessage("参数错误");
        }else{
            response.setSuccess(true);
            if (response.getResult().size()==0){
                response.setResultMessage("暂时没有收货地址，请添加收货地址");
            }else{
                response.setResultMessage("查询成功");
            }
        }
        return response;
    }

    @RequestMapping("/editAddress")
    @ResponseBody
    public BaseResponse<Integer> editAddress(HttpServletRequest request,UserAddress param){
        BaseResponse<Integer> response = new BaseResponse<>();
        response = userAllInfo.editAddress(param);
        if (response.getResult()==null){
            response.setSuccess(false);
            response.setResultMessage("参数错误");
        }else{
            response.setSuccess(true);
            if (response.getResult()==0){
                response.setResultMessage("修改失败");
            }else{
                response.setResultMessage("修改成功");
            }
        }
        return response;
    }

    @RequestMapping("/addAddress")
    @ResponseBody
    public BaseResponse<Integer> addAddress(HttpServletRequest request,UserAddress param){
        BaseResponse<Integer> response = new BaseResponse<>();
        response = userAllInfo.addAddress(param);
        if (response.getResult()==null){
            response.setSuccess(false);
            response.setResultMessage("参数错误");
        }else{
            response.setSuccess(true);
            if (response.getResult()==0){
                response.setResultMessage("新增失败");
            }else{
                response.setResultMessage("新增成功");
            }
        }
        return response;
    }
}
