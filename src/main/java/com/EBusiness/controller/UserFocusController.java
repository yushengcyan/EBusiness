package com.EBusiness.controller;

import com.EBusiness.dao.bo.UserCollection;
import com.EBusiness.dao.bo.UserFriends;
import com.EBusiness.dao.bo.UserLogInfo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@RequestMapping("/userFocus")
public class UserFocusController {

    //关注好友
    @RequestMapping("/getFriend")
    @ResponseBody
    public List<UserFriends> getFridends(UserLogInfo param){
        return null;
    }
    @RequestMapping("/addFriend")
    @ResponseBody
    public int addFridends(UserFriends param){
        return 0;
    }

    @RequestMapping("/editFriend")
    @ResponseBody
    public int editFridends(UserFriends param){
        return 0;
    }

    @RequestMapping("/delFriend")
    @ResponseBody
    public int delFridends(UserFriends param){
        return 0;
    }

    //关注店铺文章等
    @RequestMapping("/getCollection")
    @ResponseBody
    public List<UserCollection> getUserCollection(UserCollection param){
        return null;
    }

    @RequestMapping("/editCollection")
    @ResponseBody
    public int editCollection(UserCollection param){
        return 0;
    }
    @RequestMapping("/addCollection")
    @ResponseBody
    public int addCOlleciton(UserCollection param){
        return 0;
    }



}
