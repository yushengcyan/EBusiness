package com.EBusiness.dao.bo;

import java.math.BigDecimal;
import java.util.Date;

public class ShopTrolley {
    private Integer shopTrolleyId;

    private String userAccount;

    private Integer commodityId;

    private String commodityName;

    private String shopAccount;

    private String shopName;

    private Integer commodityNum;

    private BigDecimal commodityPrice;

    private Integer shopTrolleyStatus;

    private Date shopTrolleyAddTime;

    private Date shopTrolleyLastTime;

    private String shopTrolleyExt;

    public Integer getShopTrolleyId() {
        return shopTrolleyId;
    }

    public void setShopTrolleyId(Integer shopTrolleyId) {
        this.shopTrolleyId = shopTrolleyId;
    }

    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }

    public Integer getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(Integer commodityId) {
        this.commodityId = commodityId;
    }

    public String getCommodityName() {
        return commodityName;
    }

    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName;
    }

    public String getShopAccount() {
        return shopAccount;
    }

    public void setShopAccount(String shopAccount) {
        this.shopAccount = shopAccount;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public Integer getCommodityNum() {
        return commodityNum;
    }

    public void setCommodityNum(Integer commodityNum) {
        this.commodityNum = commodityNum;
    }

    public BigDecimal getCommodityPrice() {
        return commodityPrice;
    }

    public void setCommodityPrice(BigDecimal commodityPrice) {
        this.commodityPrice = commodityPrice;
    }

    public Integer getShopTrolleyStatus() {
        return shopTrolleyStatus;
    }

    public void setShopTrolleyStatus(Integer shopTrolleyStatus) {
        this.shopTrolleyStatus = shopTrolleyStatus;
    }

    public Date getShopTrolleyAddTime() {
        return shopTrolleyAddTime;
    }

    public void setShopTrolleyAddTime(Date shopTrolleyAddTime) {
        this.shopTrolleyAddTime = shopTrolleyAddTime;
    }

    public Date getShopTrolleyLastTime() {
        return shopTrolleyLastTime;
    }

    public void setShopTrolleyLastTime(Date shopTrolleyLastTime) {
        this.shopTrolleyLastTime = shopTrolleyLastTime;
    }

    public String getShopTrolleyExt() {
        return shopTrolleyExt;
    }

    public void setShopTrolleyExt(String shopTrolleyExt) {
        this.shopTrolleyExt = shopTrolleyExt;
    }
}