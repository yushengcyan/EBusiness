package com.EBusiness.services.Impl;

import com.EBusiness.dao.bo.*;
import com.EBusiness.dao.interfaces.*;
import com.EBusiness.services.interfaces.ICommunity;
import com.EBusiness.util.BaseResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

@Service
public class CommunitySVImp implements ICommunity {
    @Autowired
    private ArticleTypeMapper typeMapper;
    @Autowired
    private ArticleMapper articleMapper;
    @Autowired
    private ArticleUpMapper upMapper;
    @Autowired
    private AritcleCommentMapper commentMapper;
    @Autowired
    private UserFriendsMapper friendsMapper;
    @Autowired
    private UserBaseInfoMapper userInfoMapper;

    @Override
    public BaseResponse<List<ArticleType>> getArticleType(ArticleType param) {
        BaseResponse<List<ArticleType>> response = new BaseResponse<>();
        ArticleTypeExample example = new ArticleTypeExample();
        ArticleTypeExample.Criteria criteria = example.createCriteria();
        if (param==null){
            List<ArticleType> list = typeMapper.selectByExample(example);
            response.setResult(list);
        }else{
            if (!StringUtils.isEmpty(param.getArticleTypeId())){
                criteria.andArticleTypeIdEqualTo(param.getArticleTypeId());
            }
            if (!StringUtils.isEmpty(param.getArticleTypeName())){
                criteria.andArticleTypeNameLike("%"+param.getArticleTypeName()+"%");
            }
            List<ArticleType> list = typeMapper.selectByExample(example);
            response.setResult(list);
        }
        return response;
    }

    @Override
    public BaseResponse<Integer> addArticleType(ArticleType param) {
        return null;
    }

    @Override
    public BaseResponse<Integer> delArticleType(ArticleType param) {
        return null;
    }

    @Override
    public BaseResponse<Integer> editArticleType(ArticleType param) {
        return null;
    }

    @Override
    public BaseResponse<List<Article>> getArticle(Article param) {
        BaseResponse<List<Article>> response = new BaseResponse<>();
        if (param==null){
            response.setResult(null);
            return response;
        }else{
            ArticleExample example = new ArticleExample();
            ArticleExample.Criteria criteria = example.createCriteria();
            if (!StringUtils.isEmpty(param.getArticleId())){
                criteria.andArticleIdEqualTo(param.getArticleId());
            }
            if (!StringUtils.isEmpty(param.getUserAccount())){
                criteria.andUserAccountEqualTo(param.getUserAccount());
            }
            if (!StringUtils.isEmpty(param.getArticleTypeId())){
                criteria.andArticleTypeIdEqualTo(param.getArticleTypeId());
            }
            if (!StringUtils.isEmpty(param.getArticleTitle())){
                criteria.andArticleTitleLike("%"+param.getArticleTitle()+"%");
            }
            List<Article> list = articleMapper.selectByExample(example);
            response.setResult(list);
        }
        return response;
    }

    @Override
    public BaseResponse<Integer> delAritcle(Article param) {
        BaseResponse<Integer> response = new BaseResponse<>();
        if (param==null){
            response.setResult(null);
            return response;
        }else {
            ArticleExample example = new ArticleExample();
            ArticleExample.Criteria criteria = example.createCriteria();
            if (!StringUtils.isEmpty(param.getArticleId())) {
                criteria.andArticleIdEqualTo(param.getArticleId());
            }
            if (!StringUtils.isEmpty(param.getUserAccount())) {
                criteria.andUserAccountEqualTo(param.getUserAccount());
            }
            if (!StringUtils.isEmpty(param.getArticleTypeId())) {
                criteria.andArticleTypeIdEqualTo(param.getArticleTypeId());
            }
            if (!StringUtils.isEmpty(param.getArticleTitle())) {
                criteria.andArticleTitleLike("%" + param.getArticleTitle() + "%");
            }
            int i = articleMapper.deleteByExample(example);
            response.setResult(i);
        }
        return response;
    }

    @Override
    public BaseResponse<Integer> addArticle(Article param) {
        BaseResponse<Integer> response = new BaseResponse<>();
        if (param==null){
            response.setResult(null);
            return response;
        }else {
            if (StringUtils.isEmpty(param.getUserAccount())){
                response.setResult(null);
                return response;
            }
            if (StringUtils.isEmpty(param.getArticleTitle())){
                response.setResult(null);
                return response;
            }
            if (StringUtils.isEmpty(param.getArticleTypeId())){
                param.setArticleTypeId(1);
            }
            int i = articleMapper.insert(param);
            response.setResult(i);
        }
        return response;
    }

    @Override
    public BaseResponse<Integer> getCount(Article param) {
        BaseResponse<Integer> response = new BaseResponse<>();
        ArticleExample example = new ArticleExample();
        ArticleExample.Criteria criteria = example.createCriteria();
        int i = 0;
        if (param==null){
            i = articleMapper.countByExample(example);
        }else {
            if (!StringUtils.isEmpty(param.getArticleTypeId())){
                criteria.andArticleIdEqualTo(param.getArticleId());
            }
            if (!StringUtils.isEmpty(param.getUserAccount())){
                criteria.andUserAccountEqualTo(param.getUserAccount());
            }
            if (!StringUtils.isEmpty(param.getArticleTypeId())){
                criteria.andArticleTypeIdEqualTo(param.getArticleTypeId());
            }
            i = articleMapper.countByExample(example);
        }
        response.setResult(i);
        return response;
    }

    @Override
    public BaseResponse<List<ArticleUp>> getUpCount(ArticleUp param) {

        return null;
    }

    @Override
    public BaseResponse<Integer> upArticle(ArticleUp param) {
        BaseResponse<Integer> response = new BaseResponse<>();
        if (param==null){
            response.setResult(null);
            return response;
        }else{
//            先查询是否有该条点赞记录
            ArticleUpExample example = new ArticleUpExample();
            ArticleUpExample.Criteria criteria = example.createCriteria();
            if (!StringUtils.isEmpty(param.getArticleId())){
                criteria.andArticleIdEqualTo(param.getArticleId());
            }
            if (!StringUtils.isEmpty(param.getUserAccount())){
                criteria.andUserAccountEqualTo(param.getUserAccount());
            }
            if (!StringUtils.isEmpty(param.getArticleUpId())){
                criteria.andArticleUpIdEqualTo(param.getArticleUpId());
            }

//           记录修改失败返回-1 成功若改为点赞，则为0，取消点赞为-1
            List<ArticleUp> list = upMapper.selectByExample(example);
            if (list.size()>0){
                if (list.get(0).getArticleUpStatus()==0){
                    param.setArticleUpStatus(1);
                }else {
                    param.setArticleUpStatus(0);
                }
                int i = upMapper.updateByExample(param,example);
                if(i>0){
                    response.setResult(param.getArticleUpStatus());
                }else{
                    response.setResult(-1);
                }
            }else {
                int i = upMapper.insert(param);
                if (i>0){
                    response.setResult(param.getArticleUpStatus());
                }else {
                    response.setResult(-1);
                }
            }
        }
        return response;
    }

    @Override
    public BaseResponse<List<AritcleComment>> getComment(AritcleComment param) {
        BaseResponse<List<AritcleComment>> response = new BaseResponse<>();
        if (param==null){
            response.setResult(null);
            return response;
        }else{
            AritcleCommentExample example = new AritcleCommentExample();
            AritcleCommentExample.Criteria criteria = example.createCriteria();
            if (!StringUtils.isEmpty(param.getArticleCommentId())){
                criteria.andArticleCommentIdEqualTo(param.getArticleCommentId());
            }
            if (!StringUtils.isEmpty(param.getAuthorAccount())){
                criteria.andAuthorAccountEqualTo(param.getAuthorAccount());
            }
            if (!StringUtils.isEmpty(param.getArticleId())){
                criteria.andArticleIdEqualTo(param.getArticleId());
            }
            if (!StringUtils.isEmpty(param.getUserAccount())){
                criteria.andUserAccountEqualTo(param.getUserAccount());
            }
            List<AritcleComment> list = commentMapper.selectByExample(example);
            response.setResult(list);
        }
        return response;
    }

    @Override
    public BaseResponse<Integer> addComment(AritcleComment param) {
        BaseResponse<Integer> response = new BaseResponse<>();
        if (param==null){
            response.setResult(null);
            return response;
        }else {
            if (StringUtils.isEmpty(param.getAuthorAccount())){
                response.setResult(null);
                return response;
            }
            if (StringUtils.isEmpty(param.getArticleId())){
                response.setResult(null);
                return response;
            }
            if (StringUtils.isEmpty(param.getUserAccount())){
                response.setResult(null);
                return response;
            }
            int i = commentMapper.insert(param);
            response.setResult(i);
        }
        return response;
    }

    @Override
    public BaseResponse<Integer> delComment(AritcleComment param) {
        return null;
    }

    @Override
    public BaseResponse<Integer> focusFriend(UserFriends param) {
        BaseResponse<Integer> response = new BaseResponse<>();
        if (param==null){
            response.setResult(null);
            return response;
        }else {
            if (StringUtils.isEmpty(param.getFriendingUserAccount())){
                response.setResult(null);
                return response;
            }
            if (StringUtils.isEmpty(param.getFriendedUserAccount())){
                response.setResult(null);
                return response;
            }
            UserFriendsExample example = new UserFriendsExample();
            UserFriendsExample.Criteria criteria = example.createCriteria();
//            如果已经关注 ,则说明该条记录存在，直接更新记录 0已关注 1未关注
            if (param.getFriendStatus()==0){
                criteria.andFriendingUserAccountEqualTo(param.getFriendingUserAccount());
                criteria.andFriendedUserAccountEqualTo(param.getFriendedUserAccount());
                param.setFriendStatus(1);
                int i = friendsMapper.updateByExampleSelective(param,example);
                if (i>0){
                    response.setResult(param.getFriendStatus());
                }else{
                    response.setResult(-1);
                }
            }else if (param.getFriendStatus()==1){
//                未关注时，先判断是否有该条记录
                criteria.andFriendingUserAccountEqualTo(param.getFriendingUserAccount());
                criteria.andFriendedUserAccountEqualTo(param.getFriendedUserAccount());
                List<UserFriends> list = friendsMapper.selectByExample(example);
//                有该记录时，则更新该记录状态
                if (list.size()>0){
                    param.setFriendStatus(0);
                    int i = friendsMapper.updateByExampleSelective(param,example);
//                    若更新成功，则返回关注状态
                    if (i>0){
                        response.setResult(param.getFriendStatus());
                    }else {
                        response.setResult(-1);
                    }
                }else{
//                    没有记录时，插入记录
//                    插入关注账号时，先获取用户信息，将用户名插入
                    UserBaseInfo ingUser = new UserBaseInfo();
                    UserBaseInfo edUser = new UserBaseInfo();
//                    关注人信息
                    UserBaseInfoExample ingInfoExample = new UserBaseInfoExample();
                    UserBaseInfoExample.Criteria ingcriteria = ingInfoExample.createCriteria();
                    ingcriteria.andUserAccountEqualTo(param.getFriendingUserAccount());
                    ingUser = userInfoMapper.selectByExample(ingInfoExample).get(0);

//                    被关注人信息
                    UserBaseInfoExample edInfoExample = new UserBaseInfoExample();
                    UserBaseInfoExample.Criteria edcriteria = edInfoExample.createCriteria();
                    edcriteria.andUserAccountEqualTo(param.getFriendedUserAccount());
                    edUser = userInfoMapper.selectByExample(edInfoExample).get(0);

//                    新增记录信息
                    UserFriends friends = new UserFriends();
                    friends.setFriendedUserAccount(param.getFriendedUserAccount());
                    friends.setFriendingUserAccount(param.getFriendingUserAccount());
                    friends.setFriendingUserName(ingUser.getUserName());
                    friends.setFriendedUserName(edUser.getUserName());
                    friends.setFriendNickname(edUser.getUserName());
                    friends.setFriendStatus(0);

                    int i = friendsMapper.insert(friends);
                    if (i>0){
                        response.setResult(friends.getFriendStatus());
                    }else{
                        response.setResult(-1);
                    }
                }

            }
        }
        return response;
    }
}
