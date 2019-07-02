package com.EBusiness.dao.bo;

public class UserLevel {
    private Integer userLevelId;

    private Integer userLevelLowScore;

    private Integer userLevelHighScore;

    private String userLevelName;

    private String userLevelExt;

    public Integer getUserLevelId() {
        return userLevelId;
    }

    public void setUserLevelId(Integer userLevelId) {
        this.userLevelId = userLevelId;
    }

    public Integer getUserLevelLowScore() {
        return userLevelLowScore;
    }

    public void setUserLevelLowScore(Integer userLevelLowScore) {
        this.userLevelLowScore = userLevelLowScore;
    }

    public Integer getUserLevelHighScore() {
        return userLevelHighScore;
    }

    public void setUserLevelHighScore(Integer userLevelHighScore) {
        this.userLevelHighScore = userLevelHighScore;
    }

    public String getUserLevelName() {
        return userLevelName;
    }

    public void setUserLevelName(String userLevelName) {
        this.userLevelName = userLevelName;
    }

    public String getUserLevelExt() {
        return userLevelExt;
    }

    public void setUserLevelExt(String userLevelExt) {
        this.userLevelExt = userLevelExt;
    }
}