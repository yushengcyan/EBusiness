package com.EBusiness.services.interfaces;

import com.EBusiness.dao.BeanRsp.ShopProduct;
import com.EBusiness.dao.bo.*;
import com.EBusiness.util.BaseResponse;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

//有关商城模块接口
public interface IShopMall {
    //获取商城基本信息
    public BaseResponse<List<ShopBaseInfo>> getShopInfo (ShopBaseInfo param);
    //修改店铺信息（店家关闭店铺也在此中）
    public BaseResponse<Integer> editShopInfo(ShopBaseInfo param);
    //增加店铺
    public BaseResponse<Integer> addShopInfo(ShopBaseInfo param);
    //删除店铺
    public BaseResponse<Integer> delShopInfo(ShopBaseInfo param);

    //获取商品信息
    public BaseResponse<List<CommodityBaseInfo>> getCommodityInfo(CommodityBaseInfo param);
    //修改商品信息
    public BaseResponse<Integer> editCommodityInfo(CommodityBaseInfo param);
    //增加商品
    public BaseResponse<Integer> addCommodityInfo(CommodityBaseInfo param);
    //删除商品
    public BaseResponse<Integer> delCommodityInfo(CommodityBaseInfo param);
    //获取商品和店铺的关联关系
    public BaseResponse<List<ShopCommodity>> shopUnionProduct(ShopCommodity param);
    //封装页面获取的商品和店铺信息
    public BaseResponse<List<ShopProduct>> getShopProduct(CommodityBaseInfo param);
//    搜索框获取商品信息
    public BaseResponse<List<ShopProduct>> getShopProduct(ShopCommodity param);
    //上传商品图片
    public BaseResponse<Integer> addProductImg(HttpServletRequest request, HttpServletResponse response,ProductImg param)
    throws IOException,ServletException;
    //删除图片
    public BaseResponse<Integer> delProductImg(ProductImg param);
    //获取商品图片
    public BaseResponse<List<ProductImg>> getImg(ProductImg param);

    public BaseResponse<Integer> addImg(ProductImg param);

    //获取商品类别
    public BaseResponse<List<CommodityType>> getProductType(CommodityType param);

//    获取商品评价
    public BaseResponse<List<CommodityComment>> getComment(CommodityComment param);

//    获取购物车信息
    public BaseResponse<List<ShopTrolley>> getShopCart(ShopTrolley param);
//    添加购物车
    public BaseResponse<Integer> addShopCart(ShopTrolley param);
//    删除购物车
    public BaseResponse<Integer> delShopCart(ShopTrolley param);
//    更改购物车信息
    public BaseResponse<Integer> editShopCart(ShopTrolley param);
// 购物新增订单 需判断账户余额是否足够
    public BaseResponse<Integer> addOrder(OrderInfo param);
//    更改订单状态（商家发货 用户收货）
    public BaseResponse<Integer> editOrder(OrderInfo param);
//  获取店铺商品列表
    public BaseResponse<List<ShopCommodity>> getShopCommodity(ShopCommodity param);
//    删除店铺中商品
     public BaseResponse<Integer> delPro(ShopCommodity param);
    public BaseResponse<Integer> editPro(ShopCommodity param);
    public BaseResponse<Integer> addShopCommodity(ShopCommodity param);
//    获取店铺等级
public BaseResponse<List<ShopLevel>> getShopLevel(ShopLevel param);


}
