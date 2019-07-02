package com.EBusiness.dao.bo;

public class AdminInfo implements Comparable<AdminInfo>{
    private Integer adminId;

    private String adminAccount;

    private String adminPassword;

    private String adminLevel;

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public String getAdminAccount() {
        return adminAccount;
    }

    public void setAdminAccount(String adminAccount) {
        this.adminAccount = adminAccount;
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }

    public String getAdminLevel() {
        return adminLevel;
    }

    public void setAdminLevel(String adminLevel) {
        this.adminLevel = adminLevel;
    }

    @Override
    public int compareTo(AdminInfo o) {
//        按照id升序排序
        return this.getAdminId().compareTo(o.getAdminId());
    }

    @Override
    public String toString() {
        return "AdminInfo{" +
                "adminId=" + adminId +
                ", adminAccount='" + adminAccount + '\'' +
                ", adminPassword='" + adminPassword + '\'' +
                ", adminLevel='" + adminLevel + '\'' +
                '}';
    }
}