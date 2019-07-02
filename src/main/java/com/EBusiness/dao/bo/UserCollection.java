package com.EBusiness.dao.bo;

import java.util.Date;

public class UserCollection {
    private Integer collectionId;

    private String userAccount;

    private String collectedAccout;

    private Integer collectionStatus;

    private Integer collectionType;

    private Integer collectionOrder;

    private Date collectionTime;

    private String collectionRemark;

    private Date collectionLastTime;

    private String collectionExt;

    public Integer getCollectionId() {
        return collectionId;
    }

    public void setCollectionId(Integer collectionId) {
        this.collectionId = collectionId;
    }

    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }

    public String getCollectedAccout() {
        return collectedAccout;
    }

    public void setCollectedAccout(String collectedAccout) {
        this.collectedAccout = collectedAccout;
    }

    public Integer getCollectionStatus() {
        return collectionStatus;
    }

    public void setCollectionStatus(Integer collectionStatus) {
        this.collectionStatus = collectionStatus;
    }

    public Integer getCollectionType() {
        return collectionType;
    }

    public void setCollectionType(Integer collectionType) {
        this.collectionType = collectionType;
    }

    public Integer getCollectionOrder() {
        return collectionOrder;
    }

    public void setCollectionOrder(Integer collectionOrder) {
        this.collectionOrder = collectionOrder;
    }

    public Date getCollectionTime() {
        return collectionTime;
    }

    public void setCollectionTime(Date collectionTime) {
        this.collectionTime = collectionTime;
    }

    public String getCollectionRemark() {
        return collectionRemark;
    }

    public void setCollectionRemark(String collectionRemark) {
        this.collectionRemark = collectionRemark;
    }

    public Date getCollectionLastTime() {
        return collectionLastTime;
    }

    public void setCollectionLastTime(Date collectionLastTime) {
        this.collectionLastTime = collectionLastTime;
    }

    public String getCollectionExt() {
        return collectionExt;
    }

    public void setCollectionExt(String collectionExt) {
        this.collectionExt = collectionExt;
    }
}