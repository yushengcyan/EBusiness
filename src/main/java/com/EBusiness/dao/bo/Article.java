package com.EBusiness.dao.bo;

import java.util.Date;

public class Article {
    private Integer articleId;

    private String userAccount;

    private String articleTitle;

    private String articleComtent;

    private Integer articleTypeId;

    private Integer productId;

    private Date articleFirstTime;

    private Date atricleLastTime;

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

    public String getArticleTitle() {
        return articleTitle;
    }

    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle;
    }

    public String getArticleComtent() {
        return articleComtent;
    }

    public void setArticleComtent(String articleComtent) {
        this.articleComtent = articleComtent;
    }

    public Integer getArticleTypeId() {
        return articleTypeId;
    }

    public void setArticleTypeId(Integer articleTypeId) {
        this.articleTypeId = articleTypeId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Date getArticleFirstTime() {
        return articleFirstTime;
    }

    public void setArticleFirstTime(Date articleFirstTime) {
        this.articleFirstTime = articleFirstTime;
    }

    public Date getAtricleLastTime() {
        return atricleLastTime;
    }

    public void setAtricleLastTime(Date atricleLastTime) {
        this.atricleLastTime = atricleLastTime;
    }
}