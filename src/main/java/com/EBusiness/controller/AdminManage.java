package com.EBusiness.controller;

import com.EBusiness.dao.bo.*;
import com.EBusiness.services.interfaces.IBackStageManage;
import com.EBusiness.services.interfaces.ICommunity;
import com.EBusiness.services.interfaces.IShopMall;
import com.EBusiness.services.interfaces.IUserAllInfo;
import com.EBusiness.util.BaseResponse;
import com.sun.org.apache.xpath.internal.operations.Or;
import org.omg.PortableInterceptor.INACTIVE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.HttpRequestHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.security.PublicKey;
import java.util.List;


//后台人员进行管理
@Controller
@RequestMapping("/BackStage")
public class AdminManage {
    @Autowired
    private IBackStageManage backStageManege;
    @Autowired
    private IUserAllInfo userAllInfo;
    @Autowired
    private IShopMall shopMall;
    @Autowired
    private ICommunity community;

    //管理员登录
    @RequestMapping("/logIn")
    @ResponseBody
    public BaseResponse<AdminInfo> logIn(HttpServletRequest request,AdminInfo param){
        BaseResponse<AdminInfo> response = new BaseResponse<>();
        AdminInfo adminInfo = backStageManege.LogOnAdmin(param);
        adminInfo.setAdminPassword("");
        adminInfo.setAdminAccount(param.getAdminAccount());

        if (adminInfo != null){
            response.setSuccess(true);
            response.setResultMessage("登录成功");
            response.setResult(adminInfo);
            //弱登录成功则将账号信息存在session中，方便接下来使用
            HttpSession session = request.getSession();
            session.setAttribute("Admin",adminInfo);
        }else {
            response.setSuccess(false);
            response.setResultMessage("用户名或密码错误");
        }
        return response;
    }

    //新增管理员
    @RequestMapping("/addAdmin")
    @ResponseBody
    public BaseResponse<Integer> addAdmin(HttpServletRequest request,AdminInfo param){
        BaseResponse<Integer> response = new BaseResponse<>();
        // 获取当前操作用户的角色权限
        AdminInfo adminInfo = (AdminInfo)request.getSession().getAttribute("Admin");
        String role = adminInfo.getAdminLevel();
        response = backStageManege.addAdmin(param,role);
        return  response;
    }

    @RequestMapping("/delAdmin")
    @ResponseBody
    public BaseResponse<Integer> delAdmin(HttpServletRequest request,AdminInfo param){
        BaseResponse<Integer> response = new BaseResponse<>();
        AdminInfo adminInfo = (AdminInfo)request.getSession().getAttribute("Admin");
        String role = adminInfo.getAdminLevel();
        response = backStageManege.delAdmin(param,role);
        if (response!=null){
            response.setSuccess(true);
        }else {
            response.setSuccess(false);
        }
        return response;
    }
    //只能查询比自己等级低的管理员
    @RequestMapping("/listAdmin")
    @ResponseBody
    public BaseResponse<List<AdminInfo>> listAdmin(HttpServletRequest request,AdminInfo param){
        BaseResponse<List<AdminInfo>> response = new BaseResponse<>();
        // 获取当前操作用户的角色权限
        AdminInfo adminInfo = (AdminInfo)request.getSession().getAttribute("Admin");
        String role = adminInfo.getAdminLevel();
        response = backStageManege.getAdmin(param,role);
        if (response == null) {
            response.setResultMessage("查询结果为空");
            response.setSuccess(false);
        }else {
            response.setSuccess(true);
        }
        return response;
    }

    @RequestMapping("/getRole")
    @ResponseBody
    public BaseResponse<List<AdminLevel>> getRole(HttpServletRequest request,AdminLevel param){
        BaseResponse<List<AdminLevel>> response = new BaseResponse<>();
        response = backStageManege.getRole(param);
        if (response == null){
            response.setSuccess(false);
            return response;
        }else {
            response.setSuccess(true);
            return response;
        }

    }

    //修改管理员信息
    @RequestMapping("/editAdmin")
    @ResponseBody
    public BaseResponse<Integer> editAdmin(HttpServletRequest request,AdminInfo param){
        BaseResponse<Integer> response = new BaseResponse<>();
        // 获取当前操作用户的角色权限
        AdminInfo adminInfo = (AdminInfo)request.getSession().getAttribute("Admin");
        String role = adminInfo.getAdminLevel();
        response =  backStageManege.editAdmin(param,role);
        if (response.getResult()>0){
            response.setResultMessage("更改成功");
        }else {
            response.setResultMessage("更改失败");
        }
        return  response;
    }

    /*
    获取用户人数、交易额、交易数量、论坛帖子数量等信息(所有管理员均可查看)
     */
    @RequestMapping("/getUserCount")
    @ResponseBody
    public BaseResponse<Integer> getUserCount(HttpServletRequest request, UserBaseInfo param){
        BaseResponse<Integer> rsp = new BaseResponse<>();
        //管理员查看时不需要参数
        rsp = backStageManege.getUserCount(param);
        if (rsp.getResult()>0){
            rsp.setSuccess(true);
        }
        return rsp;
    }

    @RequestMapping("/getTradeCount")
    @ResponseBody
    public BaseResponse<Integer> getTradeCount(HttpServletRequest request, OrderInfo param){
        BaseResponse<Integer> rsp = new BaseResponse<>();
        rsp = backStageManege.getTradeCount(param);
        if (rsp.getResult()>0){
            rsp.setSuccess(true);
        }
        return rsp;
    }
    @RequestMapping("/getTradeMoney")
    @ResponseBody
    public BaseResponse<Float> getTradeMoney(HttpServletRequest request, OrderInfo param){
        BaseResponse<Float> rsp = new BaseResponse<>();
        rsp = backStageManege.getTradeMoney(param);
        if (rsp!=null){
            rsp.setSuccess(true);
        }else {
            rsp.setSuccess(false);
        }
        return rsp;

    }

    @RequestMapping("/getArticleCount")
    @ResponseBody
    public BaseResponse<Integer> getPostCount(HttpServletRequest request, Article param){
        BaseResponse<Integer> rsp = new BaseResponse<>();
        rsp = community.getCount(param);
        return rsp;

    }

    @RequestMapping("/getShopInfo")
    @ResponseBody
    public BaseResponse<List<ShopBaseInfo>> getShopInfo(HttpServletRequest request,ShopBaseInfo param){
        BaseResponse<List<ShopBaseInfo>> response = new BaseResponse<>();
        response = shopMall.getShopInfo(param);
        if (response.getResult() == null){
            response.setSuccess(false);
            response.setResultMessage("获取店铺信息失败");
        }else{
            response.setSuccess(true);
        }
        return response;
    }
    @RequestMapping("/getProductInfo")
    @ResponseBody
    public BaseResponse<List<CommodityBaseInfo>> getProductInfo(HttpServletRequest request,CommodityBaseInfo param){
        BaseResponse<List<CommodityBaseInfo>> response = new BaseResponse<>();
        response = shopMall.getCommodityInfo(param);
        if (response.getResult() != null){
            response.setSuccess(true);
        }else {
            response.setSuccess(false);
            response.setResultMessage("商品信息查询失败");
        }
        return response;
    }

    /*
    商品管理，判断权限
     */
    @RequestMapping("/addProduct")
    @ResponseBody
    public BaseResponse<Integer> addProduct(HttpServletRequest request,CommodityBaseInfo param){
        BaseResponse<Integer> response = new BaseResponse<>();
        String role = ((AdminInfo)request.getSession().getAttribute("Admin")).getAdminLevel();
        if (judgeRole(role)){
            response = shopMall.addCommodityInfo(param);
            if (response!=null){
                response.setSuccess(true);
            }
        }else{
            response.setSuccess(false);
            response.setResultMessage("管理员操作权限不足");
        }
        return response;
    }
    @RequestMapping("/delProduct")
    @ResponseBody
    public BaseResponse<Integer> delProduct(HttpServletRequest request,CommodityBaseInfo param) {
        BaseResponse<Integer> response = new BaseResponse<>();
        String role = ((AdminInfo) request.getSession().getAttribute("Admin")).getAdminLevel();
        if (judgeRole(role)) {
            response = shopMall.delCommodityInfo(param);
            if (response != null) {
                response.setSuccess(true);
            }else {
                response.setSuccess(false);
            }
        } else {
            response.setSuccess(false);
        }
        return response;
    }
    @RequestMapping("/editProduct")
    @ResponseBody
    public BaseResponse<Integer> editProduct(HttpServletRequest request,CommodityBaseInfo param){
        BaseResponse<Integer> response = new BaseResponse<>();
        String role = ((AdminInfo) request.getSession().getAttribute("Admin")).getAdminLevel();
        if (judgeRole(role)){
            response = shopMall.editCommodityInfo(param);
            if (response!=null){
                response.setSuccess(true);
            }else {
                response.setSuccess(false);
            }
        }else {
            response.setSuccess(false);
            response.setResultMessage("权限不足");
        }
        return response;
    }

    /*
    店铺管理 判断权限
     */
    @RequestMapping("/addShopInfo")
    @ResponseBody
    public BaseResponse<Integer> addShop(HttpServletRequest request,ShopBaseInfo param){
        BaseResponse<Integer> response = new BaseResponse<>();
        String role = ((AdminInfo) request.getSession().getAttribute("Admin")).getAdminLevel();
        if (judgeRole(role)){
            response = shopMall.addShopInfo(param);
            if (response!=null){
                response.setSuccess(true);
            }else {
                response.setSuccess(false);
            }
        }else {
            response.setSuccess(false);
            response.setResultMessage("权限不足");
        }
        return response;
    }
    @RequestMapping("/delShop")
    @ResponseBody
    public BaseResponse<Integer> delShop(HttpServletRequest request,ShopBaseInfo param){
        BaseResponse<Integer> response = new BaseResponse<>();
        String role = ((AdminInfo) request.getSession().getAttribute("Admin")).getAdminLevel();
        if (judgeRole(role)){
            response = shopMall.delShopInfo(param);
            if (response!=null){
                response.setSuccess(true);
            }else {
                response.setSuccess(false);
            }
        }else {
            response.setSuccess(false);
            response.setResultMessage("权限不足");
        }
        return response;
    }
    @RequestMapping("/editShop")
    @ResponseBody
    public BaseResponse<Integer> editShop(HttpServletRequest request,ShopBaseInfo param){
        BaseResponse<Integer> response = new BaseResponse<>();
        String role = ((AdminInfo) request.getSession().getAttribute("Admin")).getAdminLevel();
        if (judgeRole(role)){
            response = shopMall.editShopInfo(param);
            if (response.getResult()!=null){
                response.setSuccess(true);
            }else {
                response.setSuccess(false);
            }
        }else {
            response.setSuccess(false);
            response.setResultMessage("权限不足");
        }
        return response;
    }

    /*
    用户的管理
     */
    @RequestMapping("/getUser")
    @ResponseBody
    public BaseResponse<List<UserBaseInfo>> getUser(HttpServletRequest request,UserBaseInfo param){
        BaseResponse<List<UserBaseInfo>> response = new BaseResponse<>();
        String role = ((AdminInfo) request.getSession().getAttribute("Admin")).getAdminLevel();
        if (judgeRole(role)){
            response = userAllInfo.getUserInfo(param);
            if (response!=null){
                response.setSuccess(true);
            }else {
                response.setSuccess(false);
            }
        }else {
            response.setSuccess(false);
        }
        return response;
    }

    @RequestMapping("/editUser")
    @ResponseBody
    public BaseResponse<Integer> delUser(HttpServletRequest request,UserBaseInfo param){
        BaseResponse<Integer> response = new BaseResponse<>();
        String role = ((AdminInfo) request.getSession().getAttribute("Admin")).getAdminLevel();
        if (judgeRole(role)){
            response = userAllInfo.delUserInfo(param);
            if (response!=null){
                response.setSuccess(true);
            }else {
                response.setSuccess(false);
            }
        }else {
            response.setSuccess(false);
        }
        return response;
    }

    @RequestMapping("/delUser")
    @ResponseBody
    public BaseResponse<Integer> editUser(HttpServletRequest request,UserBaseInfo param){
        BaseResponse<Integer> response = new BaseResponse<>();
        String role = ((AdminInfo) request.getSession().getAttribute("Admin")).getAdminLevel();
        if (judgeRole(role)){
            response = userAllInfo.editUserInfo(param);
            if (response!=null){
                response.setSuccess(true);
            }else {
                response.setSuccess(false);
            }
        }else {
            response.setSuccess(false);
        }
        return response;
    }

    @RequestMapping("/addUser")
    @ResponseBody
    public BaseResponse<Integer> addUser(HttpServletRequest request,UserBaseInfo param){
        BaseResponse<Integer> response = new BaseResponse<>();
        String role = ((AdminInfo) request.getSession().getAttribute("Admin")).getAdminLevel();
        if (judgeRole(role)){
            response = userAllInfo.addUserInfo(param);
            if (response!=null){
                response.setSuccess(true);
            }else {
                response.setSuccess(false);
            }
        }else {
            response.setSuccess(false);
        }
        return response;
    }

    /*
    订单处理
     */
    @RequestMapping("/getOrder")
    @ResponseBody
    public BaseResponse<List<OrderInfo>> getOrder(HttpServletRequest request,OrderInfo param){
        BaseResponse<List<OrderInfo>> response = new BaseResponse<>();
        String role = ((AdminInfo) request.getSession().getAttribute("Admin")).getAdminLevel();
        if (judgeRole(role)){
            response = userAllInfo.getOrderInfo(param);
            if (response!=null){
                response.setSuccess(true);
            }else {
                response.setSuccess(false);
            }
        }else {
            response.setSuccess(false);
        }
        return response;
    }

    @RequestMapping("/editOrder")
    @ResponseBody
    public BaseResponse<Integer> editOrder(HttpServletRequest request,OrderInfo param){
        BaseResponse<Integer> response = new BaseResponse<>();
        String role = ((AdminInfo) request.getSession().getAttribute("Admin")).getAdminLevel();
        if (judgeRole(role)){
            response = userAllInfo.editOrder(param);
            if (response!=null){
                response.setSuccess(true);
            }else {
                response.setSuccess(false);
            }
        }else {
            response.setSuccess(false);
        }
        return response;
    }

    @RequestMapping("/delOrder")
    @ResponseBody
    public BaseResponse<Integer> delOrder(HttpServletRequest request,OrderInfo param){
        BaseResponse<Integer> response = new BaseResponse<>();
        String role = ((AdminInfo) request.getSession().getAttribute("Admin")).getAdminLevel();
        if (judgeRole(role)){
            response = userAllInfo.delOrder(param);
            if (response!=null){
                response.setSuccess(true);
            }else {
                response.setSuccess(false);
            }
        }else {
            response.setSuccess(false);
        }
        return response;
    }

    @RequestMapping("/addOrder")
    @ResponseBody
    public BaseResponse<Integer> addOrder(HttpServletRequest request,OrderInfo param){
        BaseResponse<Integer> response = new BaseResponse<>();
        String role = ((AdminInfo) request.getSession().getAttribute("Admin")).getAdminLevel();
        if (judgeRole(role)){
            response = userAllInfo.addOrder(param);
            if (response!=null){
                response.setSuccess(true);
            }else {
                response.setSuccess(false);
            }
        }else {
            response.setSuccess(false);
        }
        return response;
    }


    /*
    好友管理
     */
    @RequestMapping("/getFriend")
    @ResponseBody
    public BaseResponse<List<UserFriends>> getFriend(HttpServletRequest request,UserFriends param){
        BaseResponse<List<UserFriends>> response = new BaseResponse<>();
        String role = ((AdminInfo) request.getSession().getAttribute("Admin")).getAdminLevel();
        if (judgeRole(role)){
            response = userAllInfo.getUserFriend(param);
            if (response!=null){
                response.setSuccess(true);
            }else {
                response.setSuccess(false);
            }
        }else {
            response.setSuccess(false);
        }
        return response;
    }

    @RequestMapping("/delFriend")
    @ResponseBody
    public BaseResponse<Integer> delFriend(HttpServletRequest request,UserFriends param){
        BaseResponse<Integer> response = new BaseResponse<>();
        String role = ((AdminInfo) request.getSession().getAttribute("Admin")).getAdminLevel();
        if (judgeRole(role)){
            response = userAllInfo.delUserFriend(param);
            if (response!=null){
                response.setSuccess(true);
            }else {
                response.setSuccess(false);
            }
        }else {
            response.setSuccess(false);
        }
        return response;
    }



    /*
    用户收藏管理
     */
    @RequestMapping("/getCollect")
    @ResponseBody
    public BaseResponse<List<UserCollection>> getCollect(HttpServletRequest request,UserCollection param){
        BaseResponse<List<UserCollection>> response = new BaseResponse<>();
        String role = ((AdminInfo) request.getSession().getAttribute("Admin")).getAdminLevel();
        if (judgeRole(role)){
            response = userAllInfo.getUserCollection(param);
            if (response!=null){
                response.setSuccess(true);
            }else {
                response.setSuccess(false);
            }
        }else {
            response.setSuccess(false);
        }
        return response;
    }

    @RequestMapping("/editCollect")
    @ResponseBody
    public BaseResponse<Integer> editCollect(HttpServletRequest request,UserCollection param){
        BaseResponse<Integer> response = new BaseResponse<>();
        String role = ((AdminInfo) request.getSession().getAttribute("Admin")).getAdminLevel();
        if (judgeRole(role)){
            response = userAllInfo.editCollection(param);
            if (response!=null){
                response.setSuccess(true);
            }else {
                response.setSuccess(false);
            }
        }else {
            response.setSuccess(false);
        }
        return response;
    }

    @RequestMapping("/delCollect")
    @ResponseBody
    public BaseResponse<Integer> delCollect(HttpServletRequest request,UserCollection param){
        BaseResponse<Integer> response = new BaseResponse<>();
        String role = ((AdminInfo) request.getSession().getAttribute("Admin")).getAdminLevel();
        if (judgeRole(role)){
            response = userAllInfo.delCollection(param);
            if (response!=null){
                response.setSuccess(true);
            }else {
                response.setSuccess(false);
            }
        }else {
            response.setSuccess(false);
        }
        return response;
    }

    @RequestMapping("/addCollect")
    @ResponseBody
    public BaseResponse<Integer> addCollect(HttpServletRequest request,UserCollection param){
        BaseResponse<Integer> response = new BaseResponse<>();
        String role = ((AdminInfo) request.getSession().getAttribute("Admin")).getAdminLevel();
        if (judgeRole(role)){
            response = userAllInfo.addCollection(param);
            if (response!=null){
                response.setSuccess(true);
            }else {
                response.setSuccess(false);
            }
        }else {
            response.setSuccess(false);
        }
        return response;
    }

    //判断管理员是否有操作权限
    public boolean judgeRole(String role){
        if (Integer.parseInt(role)<2){
            return true;
        }else{
            return false;
        }
    }
}
