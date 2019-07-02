package com.EBusiness.dao.bo;

import java.util.Date;

public class ArticleUp {
    private Integer articleUpId;

    private Integer articleId;

    private String userAccount;

    private Integer articleUpStatus;

    private Date articleUpTime;

    public Integer getArticleUpId() {
        return articleUpId;
    }

    public void setArticleUpId(Integer articleUpId) {
        this.articleUpId = articleUpId;
    }

    public Integer getArticleId() {
        return articleId;
    }

    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }

    public Integer getArticleUpStatus() {
        return articleUpStatus;
    }

    public void setArticleUpStatus(Integer articleUpStatus) {
        this.articleUpStatus = articleUpStatus;
    }

    public Date getArticleUpTime() {
        return articleUpTime;
    }

    public void setArticleUpTime(Date articleUpTime) {
        this.articleUpTime = articleUpTime;
    }
}