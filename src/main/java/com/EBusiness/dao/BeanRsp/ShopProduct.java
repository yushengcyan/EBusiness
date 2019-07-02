package com.EBusiness.dao.BeanRsp;

import com.EBusiness.dao.bo.CommodityBaseInfo;
import com.EBusiness.dao.bo.ProductImg;
import com.EBusiness.dao.bo.ShopBaseInfo;
import com.EBusiness.dao.bo.ShopCommodity;

import java.util.List;

//商品页展示商品返回数据类型
public class ShopProduct {
    private CommodityBaseInfo commodityBaseInfo;

    private List<ShopCommodity> shopCommodity;

    private List<ShopBaseInfo> shopBaseInfoList;

    private List<ProductImg> productImgs;

    public List<ProductImg> getProductImgs() {
        return productImgs;
    }

    public void setProductImgs(List<ProductImg> productImgs) {
        this.productImgs = productImgs;
    }

    public CommodityBaseInfo getCommodityBaseInfo() {
        return commodityBaseInfo;
    }

    public void setCommodityBaseInfo(CommodityBaseInfo commodityBaseInfo) {
        this.commodityBaseInfo = commodityBaseInfo;
    }

    public List<ShopCommodity> getShopCommodity() {
        return shopCommodity;
    }

    public void setShopCommodity(List<ShopCommodity> shopCommodity) {
        this.shopCommodity = shopCommodity;
    }

    public List<ShopBaseInfo> getShopBaseInfoList() {
        return shopBaseInfoList;
    }

    public void setShopBaseInfoList(List<ShopBaseInfo> shopBaseInfoList) {
        this.shopBaseInfoList = shopBaseInfoList;
    }
}
