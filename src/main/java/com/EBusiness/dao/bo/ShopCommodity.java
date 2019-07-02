package com.EBusiness.dao.bo;

public class ShopCommodity {
    private Integer shopCommodityId;

    private String shopAccount;

    private String shopName;

    private Integer commodityId;

    private String commodityName;

    private String shopCommodityExt1;

    private Long commodityDiscount;

    public Integer getShopCommodityId() {
        return shopCommodityId;
    }

    public void setShopCommodityId(Integer shopCommodityId) {
        this.shopCommodityId = shopCommodityId;
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

    public String getShopCommodityExt1() {
        return shopCommodityExt1;
    }

    public void setShopCommodityExt1(String shopCommodityExt1) {
        this.shopCommodityExt1 = shopCommodityExt1;
    }

    public Long getCommodityDiscount() {
        return commodityDiscount;
    }

    public void setCommodityDiscount(Long commodityDiscount) {
        this.commodityDiscount = commodityDiscount;
    }
}