package com.EBusiness.dao.bo;

import java.util.Date;

public class UserFriends {
    private Integer fridendId;

    private String friendingUserAccount;

    private String friendingUserName;

    private String friendedUserAccount;

    private String friendedUserName;

    private String friendNickname;

    private Integer friendStatus;

    private Date friendTime;

    private Date friendLastTime;

    private String friendExt;

    public Integer getFridendId() {
        return fridendId;
    }

    public void setFridendId(Integer fridendId) {
        this.fridendId = fridendId;
    }

    public String getFriendingUserAccount() {
        return friendingUserAccount;
    }

    public void setFriendingUserAccount(String friendingUserAccount) {
        this.friendingUserAccount = friendingUserAccount;
    }

    public String getFriendingUserName() {
        return friendingUserName;
    }

    public void setFriendingUserName(String friendingUserName) {
        this.friendingUserName = friendingUserName;
    }

    public String getFriendedUserAccount() {
        return friendedUserAccount;
    }

    public void setFriendedUserAccount(String friendedUserAccount) {
        this.friendedUserAccount = friendedUserAccount;
    }

    public String getFriendedUserName() {
        return friendedUserName;
    }

    public void setFriendedUserName(String friendedUserName) {
        this.friendedUserName = friendedUserName;
    }

    public String getFriendNickname() {
        return friendNickname;
    }

    public void setFriendNickname(String friendNickname) {
        this.friendNickname = friendNickname;
    }

    public Integer getFriendStatus() {
        return friendStatus;
    }

    public void setFriendStatus(Integer friendStatus) {
        this.friendStatus = friendStatus;
    }

    public Date getFriendTime() {
        return friendTime;
    }

    public void setFriendTime(Date friendTime) {
        this.friendTime = friendTime;
    }

    public Date getFriendLastTime() {
        return friendLastTime;
    }

    public void setFriendLastTime(Date friendLastTime) {
        this.friendLastTime = friendLastTime;
    }

    public String getFriendExt() {
        return friendExt;
    }

    public void setFriendExt(String friendExt) {
        this.friendExt = friendExt;
    }
}