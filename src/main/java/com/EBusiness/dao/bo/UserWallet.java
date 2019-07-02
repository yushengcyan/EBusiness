package com.EBusiness.dao.bo;

import java.util.Date;

public class UserWallet {
    private Integer userWalletId;

    private String userAccount;

    private Long userBalance;

    private Long userConsumption;

    private Date userWaleteTime;

    public Integer getUserWalletId() {
        return userWalletId;
    }

    public void setUserWalletId(Integer userWalletId) {
        this.userWalletId = userWalletId;
    }

    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }

    public Long getUserBalance() {
        return userBalance;
    }

    public void setUserBalance(Long userBalance) {
        this.userBalance = userBalance;
    }

    public Long getUserConsumption() {
        return userConsumption;
    }

    public void setUserConsumption(Long userConsumption) {
        this.userConsumption = userConsumption;
    }

    public Date getUserWaleteTime() {
        return userWaleteTime;
    }

    public void setUserWaleteTime(Date userWaleteTime) {
        this.userWaleteTime = userWaleteTime;
    }
}