package com.EBusiness.dao.bo;

public class UserAddress {
    private Integer userAddressId;

    private String userAccount;

    private String userName;

    private String userPhone;

    private String userAddress;

    private Integer userAddressStatus;

    private Integer userAddressOrder;

    public Integer getUserAddressId() {
        return userAddressId;
    }

    public void setUserAddressId(Integer userAddressId) {
        this.userAddressId = userAddressId;
    }

    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public Integer getUserAddressStatus() {
        return userAddressStatus;
    }

    public void setUserAddressStatus(Integer userAddressStatus) {
        this.userAddressStatus = userAddressStatus;
    }

    public Integer getUserAddressOrder() {
        return userAddressOrder;
    }

    public void setUserAddressOrder(Integer userAddressOrder) {
        this.userAddressOrder = userAddressOrder;
    }
}