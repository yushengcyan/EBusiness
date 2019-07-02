package com.EBusiness.controller;

import com.EBusiness.dao.bo.*;
import com.EBusiness.services.interfaces.ICommunity;
import com.EBusiness.services.interfaces.IUserAllInfo;
import com.EBusiness.util.BaseResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/community")
public class CommunityController  {
    @Autowired
    private ICommunity community;
    @Autowired
    private IUserAllInfo userAllInfo;

//    获取文章类型
    @RequestMapping("/getType")
    @ResponseBody
    public BaseResponse<List<ArticleType>> getType(HttpServletRequest request, ArticleType param){
        BaseResponse<List<ArticleType>> response = new BaseResponse<>();
        response = community.getArticleType(param);
        if (response.getResult()==null){
            response.setSuccess(false);
            response.setResultMessage("参数错误");
        }else{
            response.setSuccess(true);
            if (response.getResult().size()==0){
                response.setResultMessage("没有查到该类型");
            }else{
                response.setResultMessage("查询成功");
            }
        }
        return response;
    }

//    获取文章
    @RequestMapping("/getArticle")
    @ResponseBody
    public BaseResponse<List<Article>> getArticle(HttpServletRequest request,Article param){
        BaseResponse<List<Article>> response = new BaseResponse<>();
        response = community.getArticle(param);
        if (response.getResult()==null){
            response.setSuccess(false);
            response.setResultMessage("参数错误");
        }else{
            response.setSuccess(true);
            if (response.getResult().size()==0){
                response.setResultMessage("没有查到文章");
            }else{
                response.setResultMessage("查询成功");
            }
        }
        return response;
    }
//新增文章
    @RequestMapping("/addArticle")
    @ResponseBody
    public BaseResponse<Integer> addArticle(HttpServletRequest request, Article param){
        BaseResponse<Integer> response = new BaseResponse<>();
        response = community.addArticle(param);
        if (response.getResult()==null){
            response.setSuccess(false);
            response.setResultMessage("参数错误");
        }else{
            response.setSuccess(true);
            if (response.getResult()==0){
                response.setResultMessage("发布失败");
            }else{
                response.setResultMessage("发布成功");
            }
        }
        return  response;
    }



    //    点赞（取消点赞）
    @RequestMapping("/likeUp")
    @ResponseBody
    public BaseResponse<Integer> likeUp(HttpServletRequest request, ArticleUp param){
        BaseResponse<Integer> response = new BaseResponse<>();
        response = community.upArticle(param);
        if (response.getResult()==null){
            response.setSuccess(false);
            response.setResultMessage("参数错误");
        }else{
            response.setSuccess(true);
            if (response.getResult()==0){
                response.setResultMessage("修改失败");
            }else if (response.getResult()==1){
                response.setResultMessage("更改状态");
            }else{
                response.setResultMessage("新增点赞记录");
            }
        }
        return response;
    }

    @RequestMapping("/addCollect")
    @ResponseBody
    public BaseResponse<Integer> addCollect(HttpServletRequest request, UserCollection param){
        BaseResponse<Integer> response = new BaseResponse<>();
        response = userAllInfo.addCollection(param);
        if (response.getResult()==null){
            response.setSuccess(false);
            response.setResultMessage("参数错误");
        }else{
            response.setSuccess(true);
            if (response.getResult()==0){
                response.setResultMessage("新增失败");
            }else{
                response.setResultMessage("新增收藏成功");
            }
        }
        return  response;
    }

    //获取文章评论
    @RequestMapping("/getComment")
    @ResponseBody
    public BaseResponse<List<AritcleComment>> getComment(HttpServletRequest request,AritcleComment param){
        BaseResponse<List<AritcleComment>> response = new BaseResponse<>();
        response = community.getComment(param);
        if (response.getResult()==null){
            response.setSuccess(false);
            response.setResultMessage("参数错误");
        }else {
            response.setSuccess(true);
            if (response.getResult().size()==0){
                response.setResultMessage("暂时没有评论");
            }else {
                response.setResultMessage("查询成功");
            }
        }
        return response;
    }
//评论
    @RequestMapping("/addComment")
    @ResponseBody
    public BaseResponse<Integer> addComment(HttpServletRequest request, AritcleComment param){
        BaseResponse<Integer> response = new BaseResponse<>();
        response = community.addComment(param);
        if (response.getResult()==null){
            response.setSuccess(false);
            response.setResultMessage("参数错误");
        }else{
            response.setSuccess(true);
            if (response.getResult()==0){
                response.setResultMessage("评论失败");
            }else{
                response.setResultMessage("评论成功");
            }
        }
        return  response;
    }

//    关注（取消关注）用户
    @RequestMapping("/Focus")
    @ResponseBody
    public BaseResponse<Integer> Focus(HttpServletRequest request, UserFriends param){
        BaseResponse<Integer> response = new BaseResponse<>();
        response = community.focusFriend(param);
        if (response.getResult()==null){
            response.setSuccess(false);
            response.setResultMessage("参数错误");
        }else{
            if (response.getResult()==-1){
                response.setResultMessage("修改关注状态失败");
                response.setSuccess(false);
            }else {
                response.setSuccess(true);
                if (response.getResult()==0){
                    response.setResultMessage("关注");
                }else{
                    response.setResultMessage("取消关注");
                }
            }
        }
        return  response;
    }


}
