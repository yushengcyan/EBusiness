package com.EBusiness.dao.bo;

import java.util.Date;

public class AritcleComment {
    private Integer articleCommentId;

    private Integer articleId;

    private String authorAccount;

    private String articleCommentContent;

    private Integer articleCommentSec;

    private Date articleCommentTime;

    private String userAccount;

    public Integer getArticleCommentId() {
        return articleCommentId;
    }

    public void setArticleCommentId(Integer articleCommentId) {
        this.articleCommentId = articleCommentId;
    }

    public Integer getArticleId() {
        return articleId;
    }

    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    public String getAuthorAccount() {
        return authorAccount;
    }

    public void setAuthorAccount(String authorAccount) {
        this.authorAccount = authorAccount;
    }

    public String getArticleCommentContent() {
        return articleCommentContent;
    }

    public void setArticleCommentContent(String articleCommentContent) {
        this.articleCommentContent = articleCommentContent;
    }

    public Integer getArticleCommentSec() {
        return articleCommentSec;
    }

    public void setArticleCommentSec(Integer articleCommentSec) {
        this.articleCommentSec = articleCommentSec;
    }

    public Date getArticleCommentTime() {
        return articleCommentTime;
    }

    public void setArticleCommentTime(Date articleCommentTime) {
        this.articleCommentTime = articleCommentTime;
    }

    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }
}