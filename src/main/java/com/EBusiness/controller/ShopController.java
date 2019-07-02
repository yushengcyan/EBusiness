package com.EBusiness.controller;

import com.EBusiness.dao.BeanRsp.ShopProduct;
import com.EBusiness.dao.bo.*;
import com.EBusiness.services.interfaces.IShopMall;
import com.EBusiness.services.interfaces.IUserAllInfo;
import com.EBusiness.util.BaseResponse;
import com.EBusiness.util.InputImg;
import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.math.BigDecimal;
import java.util.List;

@Controller
@RequestMapping("/shop")
public class ShopController {
    @Autowired
    private IShopMall shopMall;
    @Autowired
    private IUserAllInfo userAllInfo;

    @RequestMapping("/getShopUnionProduct")
    @ResponseBody
//    初始化加载页面时，先获取商品，然后通过遍历商品获取店铺
    public BaseResponse<List<ShopProduct>> getShopProduct(HttpServletRequest request, CommodityBaseInfo param){
        BaseResponse<List<ShopProduct>> response = new BaseResponse<>();
        response = shopMall.getShopProduct(param);
        if (response!=null){
            response.setSuccess(true);
        }else{
            response.setSuccess(false);
        }
        return response;
    }

//    搜索框获取商品信息
    @RequestMapping("/search")
    @ResponseBody
    public BaseResponse<List<ShopProduct>> searchShopProduct(HttpServletRequest request, ShopCommodity param){
        BaseResponse<List<ShopProduct>> response = new BaseResponse<>();
//        response = shopMall.getShopProduct(param);
//        if (response.getResult()!=null){
//            response.setSuccess(true);
//        }else{
//            response.setSuccess(false);
//        }
//        先将参数组为商品名进行查询
        CommodityBaseInfo proParam = new CommodityBaseInfo();
        proParam.setCommodityName(param.getCommodityName());
        response = shopMall.getShopProduct(proParam);
//        如果参数为商品名则将查询参数作为店铺名参数查询
        if (response==null||response.getResult().size()==0){
            ShopBaseInfo shopParam = new ShopBaseInfo();
            shopParam.setShopName(param.getCommodityName());
            shopMall.getShopInfo(shopParam);
        }
        return response;
    }


    //获取店铺信息
    @RequestMapping("/getShopInfo")
    @ResponseBody
    public BaseResponse<List<ShopBaseInfo>> getShopInfo(HttpServletRequest request,ShopBaseInfo param){
        BaseResponse<List<ShopBaseInfo>> response = new BaseResponse<>();
        response = shopMall.getShopInfo(param);
        if (response!=null){
            response.setSuccess(true);
        }else {
            response.setSuccess(false);
        }
        return response;
    }

    @RequestMapping("/addShop")
    @ResponseBody
    public BaseResponse<Integer> addShop(HttpServletRequest request,ShopBaseInfo param){
        BaseResponse<Integer> response = new BaseResponse<>();
        response = shopMall.addShopInfo(param);
        if (response.getResult()==null){
            response.setSuccess(false);
            response.setResultMessage("参数错误");
        }else{
            response.setSuccess(true);
            if (response.getResult()>0){
                response.setResultMessage("新增店铺成功");
            }else {
                response.setResultMessage("新增店铺失败");
            }
        }
        return response;
    }

    @RequestMapping("/editShop")
    @ResponseBody
    public BaseResponse<Integer> editShop(HttpServletRequest request,ShopBaseInfo param){
        BaseResponse<Integer> response = new BaseResponse<>();
        response = shopMall.editShopInfo(param);
        if (response.getResult()==null){
            response.setSuccess(false);
            response.setResultMessage("参数错误");
        }else{
            response.setSuccess(true);
            if (response.getResult()>0){
                response.setResultMessage("新增店铺成功");
            }else {
                response.setResultMessage("新增店铺失败");
            }
        }
        return response;
    }

    //获取指定商品信息
    @RequestMapping("/getProduct")
    @ResponseBody
    public BaseResponse<List<CommodityBaseInfo>> getProduct(HttpServletRequest request,CommodityBaseInfo param){
        BaseResponse<List<CommodityBaseInfo>> response = new BaseResponse<>();
        response = shopMall.getCommodityInfo(param);
        if (response.getResult()==null){
            response.setSuccess(false);
        }else {
            response.setSuccess(true);
        }
        return response;
    }

//    @RequestMapping("/getImg")
//    public void getImg(HttpServletResponse response, ShopBaseInfo shop, CommodityBaseInfo product)throws Exception{
//        FileInputStream fileInputStream = null;
//        File file = new File("C:/Users/Administrator.SG-20160911WJVD/Desktop/ProductImg/YSL_1.jpg");
//        fileInputStream = new FileInputStream(file);
//        //设置文件返回类型
//        response.setContentType("image/jpg");
//        //设置该图片允许跨区访问
//        response.setHeader("Access-Control-Allow-Origin","*");
//        //复制文件
//        IOUtils.copy(fileInputStream,response.getOutputStream());
//    }
//
//    public void getImg(HttpServletResponse response)throws Exception{
//        FileInputStream fileInputStream = null;
////        文件路径位置，如果为服务器只是路径地址不一样
//        File file = new File("C:/Users/Administrator.SG-20160911WJVD/Desktop/ProductImg/YSL_1.jpg");
//        fileInputStream = new FileInputStream(file);
//        //设置文件返回类型
//        response.setContentType("image/jpg");
//        //设置该图片允许跨区访问
//        response.setHeader("Access-Control-Allow-Origin","*");
//        //复制文件
//        IOUtils.copy(fileInputStream,response.getOutputStream());
//    }
////
//    获取商品图片
    @RequestMapping("/getImg")
    @ResponseBody
    public BaseResponse<List<ProductImg>> getImg(HttpServletRequest request,ProductImg param){
        BaseResponse<List<ProductImg>> response = new BaseResponse<>();
        response = shopMall.getImg(param);
        if (response.getResult()==null){
            response.setSuccess(false);
            response.setResultMessage("参数错误");
        }else{
            response.setSuccess(true);
            if (response.getResult().size()>0){
                response.setResultMessage("获取图片成功");
            }else{
                response.setResultMessage("暂无图片");
            }
        }
        return response;
    }
//    上传图片
    @RequestMapping("/addImg")
    @ResponseBody
    public BaseResponse<Integer> addImg(HttpServletRequest request, HttpServletResponse response,ProductImg param)throws  Exception{
        BaseResponse<Integer> response1 = new BaseResponse<>();
        response1 = shopMall.addProductImg(request,response,param);
        if (response1==null){
            response1.setSuccess(false);
            response1.setResultMessage("上传失败");
        }else{
            response1.setSuccess(true);
        }
        return response1;
    }

//    获取商品类别
    @RequestMapping("/getProductType")
    @ResponseBody
    public BaseResponse<List<CommodityType>> getProductType(HttpServletRequest request,CommodityType param){
        BaseResponse<List<CommodityType>> response = new BaseResponse<>();
        response = shopMall.getProductType(param);
        if (response.getResult()==null){
            response.setSuccess(false);
        }else {
            response.setSuccess(true);
        }
        return response;
    }

//    获取商品评论
    @RequestMapping("/getComment")
    @ResponseBody
    public BaseResponse<List<CommodityComment>> getComment(HttpServletRequest request,CommodityComment param){
        BaseResponse<List<CommodityComment>> response = new BaseResponse<>();
        response = shopMall.getComment(param);
        if (response.getResult()==null){
            response.setSuccess(false);
            response.setResultMessage("参数不能为空");
        }else {
            response.setSuccess(true);
            if (response.getResult().size()==0){
                response.setResult(null);
                response.setResultMessage("没有查询结果");
            }else{
                response.setResultMessage("查询成功");
            }
        }
        return response;
    }

//    添加购物车
    @RequestMapping("/delShopCart")
    @ResponseBody
    public BaseResponse<Integer> delShopCart(HttpServletRequest request,ShopTrolley param){
        BaseResponse<Integer> response = new BaseResponse<>();
        response = shopMall.delShopCart(param);
        if (response.getResult()==null){
            response.setSuccess(false);
            response.setResultMessage("参数错误");
        }else{
            if (response.getResult() > 0) {
                response.setSuccess(true);
                response.setResultMessage("移出购物车成功");
            }else{
                response.setSuccess(true);
                response.setResultMessage("移出购物车失败");
            }
        }
        return response;
    }

    @RequestMapping("/addShopCart")
    @ResponseBody
    public BaseResponse<Integer> addShopCart(HttpServletRequest request,ShopTrolley param){
        BaseResponse<Integer> response = new BaseResponse<>();
        response = shopMall.addShopCart(param);
        if (response.getResult()==null){
            response.setSuccess(false);
            response.setResultMessage("参数错误");
        }else{
            if (response.getResult() > 0) {
                response.setSuccess(true);
                response.setResultMessage("添加购物车成功");
            }else{
                response.setSuccess(true);
                response.setResultMessage("添加购物车失败");
            }
        }
        return response;
    }

//    下订单
    @RequestMapping("/addOrder")
    @ResponseBody
    public BaseResponse<Integer> addOrder(HttpServletRequest request,OrderInfo param){
        BaseResponse<Integer> response = new BaseResponse<>();
        response = shopMall.addOrder(param);
        if (response.getResult()==null){
            response.setSuccess(false);
            response.setResultMessage("参数错误");
        }else{
            if (response.getResult() > 0) {
                response.setSuccess(true);
                response.setResultMessage("已成功下单");
            }else if (response.getResult()<0){
                response.setSuccess(false);
                response.setResultMessage("账户余额不足");
            }else{
                response.setSuccess(false);
                response.setResultMessage("下单失败");
            }
        }
        return response;
    }

    @RequestMapping("/getOrder")
    @ResponseBody
    public BaseResponse<List<OrderInfo>> getOrder(HttpServletRequest request,OrderInfo param){
        BaseResponse<List<OrderInfo>> response = new BaseResponse<>();
        response = userAllInfo.getOrderInfo(param);
        if (response.getResult()==null){

            response.setSuccess(false);
            response.setResultMessage("参数错误");
        }else{
            if (response.getResult().size() > 0) {
                response.setSuccess(true);
                response.setResultMessage("获取订单信息成功");
            }else{
                response.setSuccess(true);
                response.setResultMessage("暂无订单");
            }
        }
        return response;
    }
    @RequestMapping("/editOrder")
    @ResponseBody
    public BaseResponse<Integer> editOrder(HttpServletRequest request,OrderInfo param){
        BaseResponse<Integer> response = new BaseResponse<>();
        response = userAllInfo.editOrder(param);
        if (response.getResult()==null){

            response.setSuccess(false);
            response.setResultMessage("参数错误");
        }else{
            if (response.getResult() > 0) {
                response.setSuccess(true);
                response.setResultMessage("订单已在送货途中");
            }else{
                response.setSuccess(true);
                response.setResultMessage("订单状态改变失败");
            }
        }
        return response;
    }

    //获取店铺商品列表
    @RequestMapping("/getShopProductList")
    @ResponseBody
    public BaseResponse<List<ShopCommodity>> getShopProductList(HttpServletRequest request,ShopCommodity param){
        BaseResponse<List<ShopCommodity>> response = new BaseResponse<>();
        response = shopMall.getShopCommodity(param);
        if (response.getResult()==null){
            response.setSuccess(false);
            response.setResultMessage("参数错误");
        }else {
            response.setSuccess(true);
            if (response.getResult().size()>0){
                response.setResultMessage("商品列表获取成功");
            }else{
                response.setResultMessage("暂时没有商品");
            }
        }
        return  response;
    }

//    删除店铺中商品
    @RequestMapping("/delPro")
    @ResponseBody
    public BaseResponse<Integer> delPro(HttpServletRequest request,ShopCommodity param){
    BaseResponse<Integer> response = new BaseResponse<>();
    response = shopMall.delPro(param);
    if (response.getResult()==null){

        response.setSuccess(false);
        response.setResultMessage("参数错误");
    }else{
        if (response.getResult() > 0) {
            response.setSuccess(true);
            response.setResultMessage("商品已删除");
        }else{
            response.setSuccess(true);
            response.setResultMessage("商品移出失败");
        }
    }
    return response;
}

    @RequestMapping("/editPro")
    @ResponseBody
    public BaseResponse<Integer> editPro(HttpServletRequest request,ShopCommodity param){
        BaseResponse<Integer> response = new BaseResponse<>();
        response = shopMall.editPro(param);
        if (response.getResult()==null){

            response.setSuccess(false);
            response.setResultMessage("参数错误");
        }else{
            if (response.getResult() > 0) {
                response.setSuccess(true);
                response.setResultMessage("商品修改");
            }else{
                response.setSuccess(true);
                response.setResultMessage("商品修改失败");
            }
        }
        return response;
    }


    //    获取店铺等级信息
    @RequestMapping("/getShopLevel")
    @ResponseBody
    public BaseResponse<List<ShopLevel>> getShopLevel(HttpServletRequest request,ShopLevel param){
        BaseResponse<List<ShopLevel>> response = new BaseResponse<>();
        response = shopMall.getShopLevel(param);
        if (response.getResult()==null){
            response.setSuccess(false);
            response.setResultMessage("参数错误");
        }else {
            response.setSuccess(true);
            if (response.getResult().size()>0){
                response.setResultMessage("等级列表获取成功");
            }else{
                response.setResultMessage("没有对应等级");
            }
        }
        return  response;
    }

//    上传图片
    @RequestMapping("/uploadImg")

    public BaseResponse<Integer> uploadImg(HttpServletRequest request, InputImg img) throws Exception{
        BaseResponse<Integer> response = new BaseResponse<>();
        ShopCommodity shopCommodity = new ShopCommodity();
        shopCommodity.setShopAccount((String) request.getAttribute("addProName"));
        shopCommodity.setCommodityName((String) request.getAttribute("addProName"));
        shopCommodity.setShopName((String) request.getAttribute("addShopProName"));
//        判断商品是否存在 如果存在，则返回商品id
        CommodityBaseInfo proParam = new CommodityBaseInfo();
        proParam.setCommodityName((String) request.getAttribute("addProName"));
        List<CommodityBaseInfo> proList = shopMall.getCommodityInfo(proParam).getResult();
        if (proList.size()>0){
            shopCommodity.setCommodityId(proList.get(0).getCommodityId());
        }else{
//            若不存在，则新增商品
            int i = shopMall.addCommodityInfo(proParam).getResult();
            List<CommodityBaseInfo> prolist_1 =shopMall.getCommodityInfo(proParam).getResult();
            shopCommodity.setCommodityId(prolist_1.get(0).getCommodityId());
        }
//        新增店铺商品记录
        int i = shopMall.addShopCommodity(shopCommodity).getResult();

        //如果使用idea中的tomcat部署的话，那么图片就会存放在:E:\idea_work\nest_ssm\target\nest_ssm\img\category这里
        File fileFolder= new File("E:/cyan/EBusiness/src/main/webapp/upload");
        //判断文件夹是否存在,如果不存在 则按照路径建一个
        if (!fileFolder.getParentFile().exists()){
            fileFolder.mkdirs();
        }
        //        给图片命名
        File imgName = new File(fileFolder,shopCommodity.getShopAccount()+"_"
                +shopCommodity.getCommodityId()+"_1"+".jpg");
//        插入记录
        ProductImg imgParam = new ProductImg();
        imgParam.setShopAccount(shopCommodity.getShopAccount());
        imgParam.setCommodityId(shopCommodity.getCommodityId());
        imgParam.setImgId(shopCommodity.getShopAccount()+"_"
                +shopCommodity.getCommodityId()+"_1");

        response = shopMall.addImg(imgParam);
//        将图片写入文件夹
        img.getMultipartFile().transferTo(imgName);

        return response;
    }

}
