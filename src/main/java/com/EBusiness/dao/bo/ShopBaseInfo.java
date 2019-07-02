package com.EBusiness.dao.bo;

import java.math.BigDecimal;
import java.util.Date;

public class ShopBaseInfo {
    private Integer shopId;

    private String shopAccount;

    private String shopUserAccount;

    private String shopName;

    private String shopUserName;

    private Integer shopLevel;

    private BigDecimal shopMoney;

    private Integer shopNumber;

    private String shopAddress;

    private Integer shopStatus;

    private Date shopStartTime;

    private Date shopEndTime;

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public String getShopAccount() {
        return shopAccount;
    }

    public void setShopAccount(String shopAccount) {
        this.shopAccount = shopAccount;
    }

    public String getShopUserAccount() {
        return shopUserAccount;
    }

    public void setShopUserAccount(String shopUserAccount) {
        this.shopUserAccount = shopUserAccount;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getShopUserName() {
        return shopUserName;
    }

    public void setShopUserName(String shopUserName) {
        this.shopUserName = shopUserName;
    }

    public Integer getShopLevel() {
        return shopLevel;
    }

    public void setShopLevel(Integer shopLevel) {
        this.shopLevel = shopLevel;
    }

    public BigDecimal getShopMoney() {
        return shopMoney;
    }

    public void setShopMoney(BigDecimal shopMoney) {
        this.shopMoney = shopMoney;
    }

    public Integer getShopNumber() {
        return shopNumber;
    }

    public void setShopNumber(Integer shopNumber) {
        this.shopNumber = shopNumber;
    }

    public String getShopAddress() {
        return shopAddress;
    }

    public void setShopAddress(String shopAddress) {
        this.shopAddress = shopAddress;
    }

    public Integer getShopStatus() {
        return shopStatus;
    }

    public void setShopStatus(Integer shopStatus) {
        this.shopStatus = shopStatus;
    }

    public Date getShopStartTime() {
        return shopStartTime;
    }

    public void setShopStartTime(Date shopStartTime) {
        this.shopStartTime = shopStartTime;
    }

    public Date getShopEndTime() {
        return shopEndTime;
    }

    public void setShopEndTime(Date shopEndTime) {
        this.shopEndTime = shopEndTime;
    }
}