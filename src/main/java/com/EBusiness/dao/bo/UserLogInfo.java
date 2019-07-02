package com.EBusiness.dao.bo;

public class UserLogInfo implements Comparable<UserLogInfo>{
    private Integer userId;

    private String userAccount;

    private String userPhoneNum;

    private String userPassword;

    private Integer userStatus;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }

    public String getUserPhoneNum() {
        return userPhoneNum;
    }

    public void setUserPhoneNum(String userPhoneNum) {
        this.userPhoneNum = userPhoneNum;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public Integer getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(Integer userStatus) {
        this.userStatus = userStatus;
    }

    @Override
    public String toString() {
        return "UserLogInfo{" +
                "userId=" + userId +
                ", userAccount='" + userAccount + '\'' +
                ", userPhoneNum='" + userPhoneNum + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", userStatus=" + userStatus +
                '}';
    }

    @Override
    public int compareTo(UserLogInfo o) {
        return this.getUserId().compareTo(o.getUserId());
    }
}