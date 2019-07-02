package com.EBusiness.dao.bo;

import java.math.BigDecimal;
import java.util.Date;

public class OrderInfo {
    private Integer userOrdeId;

    private String userAccount;

    private String merchantAccount;

    private String userAddress;

    private String merchantAddress;

    private String commodityId;

    private String commodityName;

    private BigDecimal commodityPrice;

    private Integer commodityNumber;

    private BigDecimal discountPrice;

    private BigDecimal orderMoney;

    private Integer orderStatus;

    private String userPhoneNumber;

    private Date orderTradeTime;

    private Date orderStartTime;

    private Date orderEndTime;

    private String orderExt;

    public Integer getUserOrdeId() {
        return userOrdeId;
    }

    public void setUserOrdeId(Integer userOrdeId) {
        this.userOrdeId = userOrdeId;
    }

    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }

    public String getMerchantAccount() {
        return merchantAccount;
    }

    public void setMerchantAccount(String merchantAccount) {
        this.merchantAccount = merchantAccount;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public String getMerchantAddress() {
        return merchantAddress;
    }

    public void setMerchantAddress(String merchantAddress) {
        this.merchantAddress = merchantAddress;
    }

    public String getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(String commodityId) {
        this.commodityId = commodityId;
    }

    public String getCommodityName() {
        return commodityName;
    }

    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName;
    }

    public BigDecimal getCommodityPrice() {
        return commodityPrice;
    }

    public void setCommodityPrice(BigDecimal commodityPrice) {
        this.commodityPrice = commodityPrice;
    }

    public Integer getCommodityNumber() {
        return commodityNumber;
    }

    public void setCommodityNumber(Integer commodityNumber) {
        this.commodityNumber = commodityNumber;
    }

    public BigDecimal getDiscountPrice() {
        return discountPrice;
    }

    public void setDiscountPrice(BigDecimal discountPrice) {
        this.discountPrice = discountPrice;
    }

    public BigDecimal getOrderMoney() {
        return orderMoney;
    }

    public void setOrderMoney(BigDecimal orderMoney) {
        this.orderMoney = orderMoney;
    }

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getUserPhoneNumber() {
        return userPhoneNumber;
    }

    public void setUserPhoneNumber(String userPhoneNumber) {
        this.userPhoneNumber = userPhoneNumber;
    }

    public Date getOrderTradeTime() {
        return orderTradeTime;
    }

    public void setOrderTradeTime(Date orderTradeTime) {
        this.orderTradeTime = orderTradeTime;
    }

    public Date getOrderStartTime() {
        return orderStartTime;
    }

    public void setOrderStartTime(Date orderStartTime) {
        this.orderStartTime = orderStartTime;
    }

    public Date getOrderEndTime() {
        return orderEndTime;
    }

    public void setOrderEndTime(Date orderEndTime) {
        this.orderEndTime = orderEndTime;
    }

    public String getOrderExt() {
        return orderExt;
    }

    public void setOrderExt(String orderExt) {
        this.orderExt = orderExt;
    }
}