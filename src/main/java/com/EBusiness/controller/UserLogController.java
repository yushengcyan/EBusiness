package com.EBusiness.controller;

import com.EBusiness.dao.bo.UserBaseInfo;
import com.EBusiness.dao.bo.UserLogInfo;
import com.EBusiness.services.interfaces.IUserAllInfo;
import com.EBusiness.util.BaseResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/userLog")
public class UserLogController {
    @Autowired
    private IUserAllInfo userAllInfo;

    //    登录
    @RequestMapping("/logIn")
    @ResponseBody
    public BaseResponse<UserLogInfo> LogIn(HttpServletRequest request, UserLogInfo param){
        BaseResponse<UserLogInfo> response = new BaseResponse<>();
        response = userAllInfo.LogIn(param);
        if (response.getResult()==null){
            response.setSuccess(false);
        }else {
            response.setSuccess(true);
//            将登录帐号存入cookie中
            Cookie cookie = new Cookie("account",response.getResult().getUserAccount());
//            保存30分钟
            cookie.setMaxAge(30*60);

        }
        return response;
    }

    //    找回密码
    @RequestMapping("forgetPwd")
    @ResponseBody
    public BaseResponse<Integer> forgetPwd(HttpServletRequest request,UserLogInfo param){
        BaseResponse<Integer> response = new BaseResponse<>();
//        判断用户账号和注册手机号是否匹配
        UserBaseInfo baseInfo = new UserBaseInfo();
        UserBaseInfo judgeParam = new UserBaseInfo();
        judgeParam.setUserAccount(param.getUserAccount());
        judgeParam.setUserPhoneNum(param.getUserPhoneNum());
//        当手机号和账号不匹配
        if (userAllInfo.getUserInfo(judgeParam).getResult().size()==0){
            response.setResult(null);
            response.setResultMessage("账号和手机号不匹配");
            response.setSuccess(false);
        }else{
            judgeParam.setUserPassword(param.getUserPassword());
            response = userAllInfo.UpdateUserInfo(judgeParam);
            if (response.getResult()>0){
                response.setResultMessage("更改成功");
                response.setSuccess(true);
            }else {
                response.setSuccess(false);
                response.setResult(null);
            }
        }
        return response;
    }
    @RequestMapping("logOut")
    @ResponseBody
    public int LogOut(UserLogInfo param){
        return 0;
    }
}
