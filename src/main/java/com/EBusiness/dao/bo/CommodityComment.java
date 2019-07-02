package com.EBusiness.dao.bo;

import java.util.Date;

public class CommodityComment {
    private Integer commodityCommentId;

    private Integer commodityId;

    private String commodityCommentContent;

    private Date commodityCommentTime;

    private String userAccount;

    private String shopAccount;

    private String commodityCommentExt;

    public Integer getCommodityCommentId() {
        return commodityCommentId;
    }

    public void setCommodityCommentId(Integer commodityCommentId) {
        this.commodityCommentId = commodityCommentId;
    }

    public Integer getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(Integer commodityId) {
        this.commodityId = commodityId;
    }

    public String getCommodityCommentContent() {
        return commodityCommentContent;
    }

    public void setCommodityCommentContent(String commodityCommentContent) {
        this.commodityCommentContent = commodityCommentContent;
    }

    public Date getCommodityCommentTime() {
        return commodityCommentTime;
    }

    public void setCommodityCommentTime(Date commodityCommentTime) {
        this.commodityCommentTime = commodityCommentTime;
    }

    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }

    public String getShopAccount() {
        return shopAccount;
    }

    public void setShopAccount(String shopAccount) {
        this.shopAccount = shopAccount;
    }

    public String getCommodityCommentExt() {
        return commodityCommentExt;
    }

    public void setCommodityCommentExt(String commodityCommentExt) {
        this.commodityCommentExt = commodityCommentExt;
    }
}