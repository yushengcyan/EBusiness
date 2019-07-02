package com.EBusiness.services.interfaces;

import com.EBusiness.dao.bo.*;
import com.EBusiness.util.BaseResponse;

import java.util.List;

//社区模块所有接口
public interface ICommunity {
//    获取社区文章类型
    public BaseResponse<List<ArticleType>> getArticleType(ArticleType param);
    public BaseResponse<Integer> addArticleType(ArticleType param);
    public BaseResponse<Integer> delArticleType(ArticleType param);
    public BaseResponse<Integer> editArticleType(ArticleType param);

//    文章管理
    public BaseResponse<List<Article>> getArticle(Article param);
    public BaseResponse<Integer> delAritcle(Article param);
    public BaseResponse<Integer> addArticle(Article param);
//    获取文章数
    public BaseResponse<Integer> getCount(Article param);

//    文章点赞管理
//    获取文章点赞总数
    public BaseResponse<List<ArticleUp>> getUpCount(ArticleUp param);
//    点赞（取消点赞）
    public BaseResponse<Integer> upArticle(ArticleUp param);

//    文章评论管理
    public BaseResponse<List<AritcleComment>> getComment(AritcleComment param);
    public BaseResponse<Integer> addComment(AritcleComment param);
    public BaseResponse<Integer> delComment(AritcleComment param);

//    关注和取消关注用户
    public BaseResponse<Integer> focusFriend(UserFriends param);

}
