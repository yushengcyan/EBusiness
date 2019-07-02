package com.EBusiness.services.Impl;

import com.EBusiness.dao.BeanRsp.ShopProduct;
import com.EBusiness.dao.bo.*;
import com.EBusiness.dao.interfaces.*;
import com.EBusiness.services.interfaces.IShopMall;
import com.EBusiness.util.BaseResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Service
public class ShopMallSVImpl implements IShopMall {
    @Autowired
    private ShopBaseInfoMapper shopBaseInfoMapper;
    @Autowired
    private CommodityBaseInfoMapper productMapper;
    @Autowired
    private ShopCommodityMapper shopCommodityMapper;
    @Autowired
    private ProductImgMapper imgMapper;
    @Autowired
    private CommodityTypeMapper typeMapper;
    @Autowired
    private CommodityCommentMapper commentMapper;
    @Autowired
    private ShopTrolleyMapper shopCartMapper;
    @Autowired
    private UserWalletMapper walletMapper;
    @Autowired
    private OrderInfoMapper orderMapper;
    @Autowired
    private ShopLevelMapper levelMapper;

    @Override
    public BaseResponse<List<ShopBaseInfo>> getShopInfo(ShopBaseInfo param) {
        BaseResponse<List<ShopBaseInfo>> response = new BaseResponse<>();
        ShopBaseInfoExample example = new ShopBaseInfoExample();
        ShopBaseInfoExample.Criteria criteria = example.createCriteria();
        if (param != null){
            if (!StringUtils.isEmpty(param.getShopAccount())){
                criteria.andShopAccountEqualTo(param.getShopAccount());
            }
            if (!StringUtils.isEmpty(param.getShopName())){
                criteria.andShopNameLike("%"+param.getShopName()+"%");
            }
            if (!StringUtils.isEmpty(param.getShopUserAccount())){
                criteria.andShopUserAccountEqualTo(param.getShopUserAccount());
            }
            if (!StringUtils.isEmpty(param.getShopUserName())){
                criteria.andShopUserNameLike("%"+param.getShopName()+"%");
            }
            List<ShopBaseInfo> list = shopBaseInfoMapper.selectByExample(example);
            response.setResult(list);
//            for (ShopBaseInfo shop:list){
//                if (shop.getShopStartTime()!=null){
////                    shop.setDateUtil.getDateString(shop.getShopStartTime(),"YYYY-MM-DD hh:mm:ss");
//                }
//                if (shop.getShopEndTime() != null){
//
//                }
//            }
        }else{
            response = null;
        }
        return response;
    }

    @Override
    public BaseResponse<Integer> editShopInfo(ShopBaseInfo param) {
        BaseResponse<Integer> response = new BaseResponse<>();
        ShopBaseInfoExample example = new ShopBaseInfoExample();
        ShopBaseInfoExample.Criteria criteria = example.createCriteria();
        if (param!=null){
            if (!StringUtils.isEmpty(param.getShopAccount())){
                criteria.andShopAccountEqualTo(param.getShopAccount());
            }
            if (!StringUtils.isEmpty(param.getShopId())){
                criteria.andShopIdEqualTo(param.getShopId());
            }
            Integer i = 0;
            i = shopBaseInfoMapper.updateByExampleSelective(param,example);
            response.setResult(i);
        }else {
            response.setResult(null);
        }
        return response;
    }

    @Override
    public BaseResponse<Integer> addShopInfo(ShopBaseInfo param) {
        BaseResponse<Integer> response = new BaseResponse<>();
        //店铺账号自动生成，先查询出目前账号最大值
        Integer sAccount = 0;
        String account = shopBaseInfoMapper.getAccount().get(0).substring(3);
        sAccount = Integer.parseInt(account)+1;
        param.setShopAccount("sp_"+sAccount);
        if (param != null){
            if (StringUtils.isEmpty(param.getShopUserAccount())){
                response.setResult(null);
                return response;
            }
            if (StringUtils.isEmpty(param.getShopName())){
                response.setResult(null);
                return response;
            }
            if (StringUtils.isEmpty(param.getShopUserName())){
                response.setResult(null);
                return response;
            }
            if (StringUtils.isEmpty(param.getShopLevel())){
                param.setShopLevel(1);
            }
            if (StringUtils.isEmpty(param.getShopMoney())){
                BigDecimal b = new BigDecimal(0);
                param.setShopMoney(b);
            }
            if (StringUtils.isEmpty(param.getShopNumber())){
                param.setShopNumber(0);
            }

            Integer i = 0;
            i = shopBaseInfoMapper.insert(param);
            response.setResult(i);
            return response;
        }else {
            response.setResult(null);
            return response;
        }
    }

    @Override
    public BaseResponse<Integer> delShopInfo(ShopBaseInfo param) {
        BaseResponse<Integer> response = new BaseResponse<>();
        ShopBaseInfoExample example = new ShopBaseInfoExample();
        ShopBaseInfoExample.Criteria criteria = example.createCriteria();
        if (param != null){
            if (!StringUtils.isEmpty(param.getShopUserAccount())){
                criteria.andShopUserAccountEqualTo(param.getShopUserAccount());
            }
            if (!StringUtils.isEmpty(param.getShopUserName())){
                criteria.andShopUserNameEqualTo(param.getShopUserName());
            }
            if (!StringUtils.isEmpty(param.getShopAccount())){
                criteria.andShopAccountEqualTo(param.getShopAccount());
            }
            if (!StringUtils.isEmpty(param.getShopName())){
                criteria.andShopNameEqualTo(param.getShopName());
            }
            if (!StringUtils.isEmpty(param.getShopId())){
                criteria.andShopIdEqualTo(param.getShopId());
            }
        }
        Integer i = 0;
        i = shopBaseInfoMapper.deleteByExample(example);
        response.setResult(i);
        return response;
    }

    @Override
    public BaseResponse<List<CommodityBaseInfo>> getCommodityInfo(CommodityBaseInfo param) {
        BaseResponse<List<CommodityBaseInfo>> response = new BaseResponse<>();
        CommodityBaseInfoExample example = new CommodityBaseInfoExample();
        CommodityBaseInfoExample.Criteria criteria = example.createCriteria();
        if (param != null){
            if (!StringUtils.isEmpty(param.getCommodityId())){
                criteria.andCommodityIdEqualTo(param.getCommodityId());
            }
            if (!StringUtils.isEmpty(param.getCommodityName())){
                criteria.andCommodityNameLike("%"+param.getCommodityName()+"%");
            }
            if (!StringUtils.isEmpty(param.getCommodityStatus())){
                criteria.andCommodityStatusEqualTo(param.getCommodityStatus());
            }
            if (!StringUtils.isEmpty(param.getCommodityPrice())) {
                BigDecimal big = new BigDecimal(0.0);
                criteria.andCommodityPriceBetween(big, param.getCommodityPrice());
            }
            if (!StringUtils.isEmpty(param.getCommodityTypeId())){
                criteria.andCommodityTypeIdEqualTo(param.getCommodityTypeId());
            }
        }
        List<CommodityBaseInfo> list = productMapper.selectByExample(example);
        if (list.size()>0){
            response.setResult(list);
        }else{
            response.setResult(null);
        }
        return response;
    }

    @Override
    public BaseResponse<Integer> editCommodityInfo(CommodityBaseInfo param) {
        BaseResponse<Integer> response = new BaseResponse<>();
        CommodityBaseInfoExample example = new CommodityBaseInfoExample();
        CommodityBaseInfoExample.Criteria criteria = example.createCriteria();
        if (param!=null){
            if (!StringUtils.isEmpty(param.getCommodityId())){
                criteria.andCommodityIdEqualTo(param.getCommodityId());
            }
        }
        Integer i = productMapper.updateByExampleSelective(param,example);
        response.setResult(i);
        return response;
    }

    @Override
    public BaseResponse<Integer> addCommodityInfo(CommodityBaseInfo param) {
        BaseResponse<Integer> response = new BaseResponse<>();
        if (param!=null){
            if (StringUtils.isEmpty(param.getCommodityName())){
                response.setResult(null);
                return response;
            }
        }
        int i = productMapper.insert(param);
        response.setResult(i);
        return response;
    }

    @Override
    public BaseResponse<Integer> delCommodityInfo(CommodityBaseInfo param) {
        BaseResponse<Integer> response = new BaseResponse<>();
        CommodityBaseInfoExample example = new CommodityBaseInfoExample();
        CommodityBaseInfoExample.Criteria criteria = example.createCriteria();
        if (param!=null){
            if (!StringUtils.isEmpty(param.getCommodityId())){
                criteria.andCommodityIdEqualTo(param.getCommodityId());
            }
            if (!StringUtils.isEmpty(param.getCommodityName())){
                criteria.andCommodityNameEqualTo(param.getCommodityName());
            }
            if (!StringUtils.isEmpty(param.getCommoditySize())){
                criteria.andCommoditySizeEqualTo(param.getCommoditySize());
            }
            if (!StringUtils.isEmpty(param.getCommodityColor())){
                criteria.andCommodityColorEqualTo(param.getCommodityColor());
            }
        }
        Integer i = 0;
        i = productMapper.deleteByExample(example);
        response.setResult(i);
        return response;
    }

    @Override
    public BaseResponse<List<ShopCommodity>> shopUnionProduct(ShopCommodity param) {
        BaseResponse<List<ShopCommodity>> response = new BaseResponse<>();
        ShopCommodityExample example = new ShopCommodityExample();
        ShopCommodityExample.Criteria criteria = example.createCriteria();
        if (param!= null){
            if (!StringUtils.isEmpty(param.getCommodityId())){
                criteria.andCommodityIdEqualTo(param.getCommodityId());
            }
            if (!StringUtils.isEmpty(param.getShopAccount())){
                criteria.andShopAccountEqualTo(param.getShopAccount());
            }
            if (!StringUtils.isEmpty(param.getCommodityName())){
                criteria.andCommodityNameLike("%"+param.getCommodityName()+"%");
            }
            if (!StringUtils.isEmpty(param.getShopName())){
                criteria.andShopNameLike("%"+param.getShopName()+"%");
            }
        }
        List<ShopCommodity> list = shopCommodityMapper.selectByExample(example);
        response.setResult(list);
        return response;
    }

//    较麻烦
    @Override
    public BaseResponse<List<ShopProduct>> getShopProduct(CommodityBaseInfo param) {
        BaseResponse<List<ShopProduct>> response = new BaseResponse<>();
        List<ShopProduct> result = new ArrayList<>();

        //获取商品列表
        List<CommodityBaseInfo> productList = new ArrayList<>();
        if (this.getCommodityInfo(param)==null){
            response.setResult(null);
        }else{
            productList = this.getCommodityInfo(param).getResult();
            //遍历商品列表，将商品对应的店铺信息存入
            for (CommodityBaseInfo product:productList) {
                ShopProduct shopProduct = new ShopProduct();
                shopProduct.setCommodityBaseInfo(product);
                //获取商品与店铺关联关系
                ShopCommodity shopCommodity = new ShopCommodity();
                shopCommodity.setCommodityId(product.getCommodityId());
                shopCommodity.setCommodityName(product.getCommodityName());
                List<ShopCommodity> shopUnionPro = this.shopUnionProduct(shopCommodity).getResult();
                //将对应关系传回给返回值类型
                shopProduct.setShopCommodity(shopUnionPro);
                //遍历商品店铺关联关系，获取店铺信息
                List<ShopBaseInfo> shopListRsp = new ArrayList<>();
                List<ProductImg> ImgListRsp = new ArrayList<>();
                for (ShopCommodity union:shopUnionPro) {
                    ShopBaseInfo shopParam = new ShopBaseInfo();
                    shopParam.setShopAccount(union.getShopAccount());
                    shopParam.setShopName(union.getShopName());
                    ShopBaseInfo shopRsp = new ShopBaseInfo();
                    //每次只能取到一个店铺，因为店铺账号唯一
                    if (this.getShopInfo(shopParam).getResult()==null ||
                            this.getShopInfo(shopParam).getResult().size()==0){
                        continue;
                    }else {
                        shopRsp = this.getShopInfo(shopParam).getResult().get(0);
                        shopListRsp.add(shopRsp);
                    }
                    //遍历店铺，通过店铺和商品编号获取商品图片
                    ProductImg paramImg = new ProductImg();
                    paramImg.setCommodityId(union.getCommodityId());
                    paramImg.setShopAccount(union.getShopAccount());
                    List<ProductImg> imgList = this.getImg(paramImg).getResult();
                    if (imgList.size()==0){
                        continue;
                    }else{
                        ImgListRsp.add(imgList.get(0));
                    }
                }
                shopProduct.setShopBaseInfoList(shopListRsp);
                shopProduct.setProductImgs(ImgListRsp);
                result.add(shopProduct);
            }
            response.setResult(result);
        }
        return response;
    }
//    搜索框输入商品名或店铺名获取值
    public BaseResponse<List<ShopProduct>> getShopProduct(ShopCommodity param){
        BaseResponse<List<ShopProduct>> response = new BaseResponse<>();
        List<ShopProduct> endResult = new ArrayList<>();
        if (param!=null){
//            优先认为传入参数是搜索商品名
            ShopCommodityExample example = new ShopCommodityExample();
            ShopCommodityExample.Criteria criteria = example.createCriteria();
            if (!StringUtils.isEmpty(param.getCommodityName())){
                criteria.andCommodityNameLike("%"+param.getCommodityName()+"%");
            }
            List<ShopCommodity> list = shopCommodityMapper.selectByExample(example);
//            若将参数为商品名为搜索到东西，则将参数认为是店铺名
            if (list.size()==0){
                ShopCommodityExample example1 = new ShopCommodityExample();
                ShopCommodityExample.Criteria criteria1 = example1.createCriteria();
                if (!StringUtils.isEmpty(param.getCommodityName())){
                    criteria1.andShopNameLike("%"+param.getCommodityName()+"%");
                }
                List<ShopCommodity> list1 = shopCommodityMapper.selectByExample(example1);
//                参数作为店名和商品名都没有结果
                if (list1.size()==0){
                    response.setResult(null);
                    response.setResultMessage("没有查询到结果");
                }else{
//                    遍历已经获取到的店铺
                    for (ShopCommodity shopPro:list1){
                        BaseResponse<List<ShopProduct>> result = new BaseResponse<>();
                        CommodityBaseInfo paramPro = new CommodityBaseInfo();
                        paramPro.setCommodityName(shopPro.getCommodityName());
                        paramPro.setCommodityId(shopPro.getCommodityId());
//                    获取每次遍历结果
                        result = this.getShopProduct(paramPro);
                        if (result!=null&&result.getResult().size()>0){
                            for (ShopProduct res:result.getResult()) {
                                endResult.add(res);
                            }
                        }
                    }
                    response.setResult(endResult);
                }
            }else {
                //遍历关系表，获取商品和对应店铺关系获取商品信息
                for (ShopCommodity shopPro:list){
                    BaseResponse<List<ShopProduct>> result = new BaseResponse<>();
                    CommodityBaseInfo paramPro = new CommodityBaseInfo();
                    paramPro.setCommodityName(shopPro.getCommodityName());
                    paramPro.setCommodityId(shopPro.getCommodityId());
//                    获取每次遍历结果
                    result = this.getShopProduct(paramPro);
                    if (result!=null&&result.getResult().size()>0){
                        for (ShopProduct res:result.getResult()) {
                            endResult.add(res);
                        }
                    }
                }
                response.setResult(endResult);
            }
        }
        return response;
    }
    @Override
    public BaseResponse<Integer> addProductImg(HttpServletRequest request, HttpServletResponse response,ProductImg param)throws IOException, ServletException {
        //获取该店铺下商品的最后一张图片编号在其后新增编号
        BaseResponse<Integer> response1 = new BaseResponse<>();
        if (param!=null){
            ProductImgExample example = new ProductImgExample();
            ProductImgExample.Criteria criteria = example.createCriteria();
            if (!StringUtils.isEmpty(param.getShopAccount())){
                criteria.andShopAccountEqualTo(param.getShopAccount());
            }
            if (!StringUtils.isEmpty(param.getCommodityId())){
                criteria.andCommodityIdEqualTo(param.getCommodityId());
            }
            //获取已有图片的后缀编码
            List<ProductImg> result = imgMapper.selectByExample(example);
            UploadServlet uploadServlet = new UploadServlet();
            String imgId = new String();
            if (result.size()>0){
                //获取最后一条记录的图片id
                String id = result.get(result.size()-1).getImgId();
                int imgNo = Integer.parseInt(id.substring(id.lastIndexOf("_")+1))+1;
                imgId = id.substring(0,id.lastIndexOf("_")+1)+imgNo;
                //向服务器写入文件
                uploadServlet.doPost(request,response,id);
            }else{
//                上传图片
                imgId = param.getShopAccount()+param.getCommodityId()+"_1";
                uploadServlet.doPost(request,response,imgId);
            }
            //将图片记录插入数据库中
            param.setImgId(imgId);
            Integer i = imgMapper.insert(param);
            response1.setResult(i);
            return response1;
        }else{
            response = null;
            return response1;
        }
    }

    @Override
    public BaseResponse<Integer> delProductImg(ProductImg param) {
        return null;
    }

    @Override
    public BaseResponse<List<ProductImg>> getImg(ProductImg param) {
        BaseResponse<List<ProductImg>> response = new BaseResponse<>();
        ProductImgExample example = new ProductImgExample();
        ProductImgExample.Criteria criteria = example.createCriteria();
        if (!StringUtils.isEmpty(param.getImgId())){
            criteria.andImgIdEqualTo(param.getImgId());
        }
        if (!StringUtils.isEmpty(param.getShopAccount())){
            criteria.andShopAccountEqualTo(param.getShopAccount());
        }
        if (!StringUtils.isEmpty(param.getCommodityId())){
            criteria.andCommodityIdEqualTo(param.getCommodityId());
        }
        List<ProductImg> result = imgMapper.selectByExample(example);
        response.setResult(result);
        return response;
    }

    @Override
    public BaseResponse<Integer> addImg(ProductImg param) {
        BaseResponse<Integer> response = new BaseResponse<>();
        if (param==null){
            response.setResult(null);
            return response;
        }else {
            if (StringUtils.isEmpty(param.getCommodityId())){
                response.setResult(null);
                return response;
            }
            if (StringUtils.isEmpty(param.getShopAccount())){
                response.setResult(null);
                return response;
            }
            if (StringUtils.isEmpty(param.getImgId())){
                response.setResult(null);
                return response;
            }
            int i = imgMapper.insert(param);
            response.setResult(i);
        }
        return response;
    }

    @Override
    public BaseResponse<List<CommodityType>> getProductType(CommodityType param) {
        BaseResponse<List<CommodityType>> response = new BaseResponse<>();
        CommodityTypeExample example = new CommodityTypeExample();
        CommodityTypeExample.Criteria criteria = example.createCriteria();
        if (param!=null){
            if (!StringUtils.isEmpty(param.getCommodityTypeId())){
                criteria.andCommodityTypeIdEqualTo(param.getCommodityTypeId());
            }
            if (!StringUtils.isEmpty(param.getCommodityTypeName())){
                criteria.andCommodityTypeNameLike("%"+param.getCommodityTypeName()+"%");
            }
            List<CommodityType> list = typeMapper.selectByExample(example);
            if (list.size()>0){
                response.setResult(list);
            }else {
                response.setResult(list);
                response.setResultMessage("不存在该类型");
            }
        }else {
            response.setResult(null);
        }
        return response;
    }

    @Override
    public BaseResponse<List<CommodityComment>> getComment(CommodityComment param) {
        BaseResponse<List<CommodityComment>> response = new BaseResponse<>();
        if (param==null){
            response.setResult(null);
            response.setResultMessage("参数不能为空");
        }else {
            CommodityCommentExample example = new CommodityCommentExample();
            CommodityCommentExample.Criteria criteria = example.createCriteria();
            if (!StringUtils.isEmpty(param.getCommodityId())){
                criteria.andCommodityIdEqualTo(param.getCommodityId());
            }
            if (!StringUtils.isEmpty(param.getShopAccount())){
                criteria.andShopAccountEqualTo(param.getShopAccount());
            }
            if (!StringUtils.isEmpty(param.getUserAccount())){
                criteria.andUserAccountEqualTo(param.getUserAccount());
            }
            if (!StringUtils.isEmpty(param.getCommodityCommentId())){
                criteria.andCommodityCommentIdEqualTo(param.getCommodityCommentId());
            }
            List<CommodityComment> list = new ArrayList<>();
            list = commentMapper.selectByExample(example);
            response.setResult(list);
        }
        return response;
    }

    @Override
    public BaseResponse<List<ShopTrolley>> getShopCart(ShopTrolley param) {
        BaseResponse<List<ShopTrolley>> response = new BaseResponse<>();
        if (param==null){
            response.setResult(null);
            return response;
        }else{
            ShopTrolleyExample example = new ShopTrolleyExample();
            ShopTrolleyExample.Criteria criteria = example.createCriteria();
            if (!StringUtils.isEmpty(param.getUserAccount())){
                criteria.andUserAccountEqualTo(param.getUserAccount());
            }
            if (!StringUtils.isEmpty(param.getShopAccount())){
                criteria.andShopAccountEqualTo(param.getShopAccount());
            }
            if (!StringUtils.isEmpty(param.getCommodityId())){
                criteria.andCommodityIdEqualTo(param.getCommodityId());
            }
            if (!StringUtils.isEmpty(param.getShopTrolleyId())){
                criteria.andShopTrolleyIdEqualTo(param.getShopTrolleyId());
            }
            if (!StringUtils.isEmpty(param.getShopName())){
                criteria.andShopNameLike("%"+param.getShopName()+"%");
            }
            if (!StringUtils.isEmpty(param.getCommodityName())){
                criteria.andCommodityNameLike("%"+param.getCommodityName()+"%");
            }
            List<ShopTrolley> list = shopCartMapper.selectByExample(example);
            response.setResult(list);
        }
        return response;
    }

    @Override
    public BaseResponse<Integer> addShopCart(ShopTrolley param) {
        BaseResponse<Integer> response = new BaseResponse<>();
        if (param == null){
            response.setResult(null);
            return response;
        }else{

            if (StringUtils.isEmpty(param.getCommodityId())){
                response.setResult(null);
                return response;
            }
            if (StringUtils.isEmpty(param.getShopAccount())){
                response.setResult(null);
                return response;
            }
            if (StringUtils.isEmpty(param.getUserAccount())){
                response.setResult(null);
                return response;
            }
            int i = shopCartMapper.insert(param);
            response.setResult(i);
        }
        return response;
    }

    @Override
    public BaseResponse<Integer> delShopCart(ShopTrolley param) {
        BaseResponse<Integer> response = new BaseResponse<>();
        if (param==null){
            response.setResult(null);
            return response;
        }else{
            ShopTrolleyExample example = new ShopTrolleyExample();
            ShopTrolleyExample.Criteria criteria = example.createCriteria();
            if (!StringUtils.isEmpty(param.getShopTrolleyId())){
                criteria.andShopTrolleyIdEqualTo(param.getShopTrolleyId());
            }
            if (!StringUtils.isEmpty(param.getShopAccount())){
                criteria.andShopAccountEqualTo(param.getShopAccount());
            }
            if (!StringUtils.isEmpty(param.getUserAccount())){
                criteria.andUserAccountEqualTo(param.getUserAccount());
            }
            if (!StringUtils.isEmpty(param.getCommodityId())){
                criteria.andCommodityIdEqualTo(param.getCommodityId());
            }
            int i = shopCartMapper.deleteByExample(example);
            response.setResult(i);
        }
        return response;
    }

    @Override
    public BaseResponse<Integer> editShopCart(ShopTrolley param) {
        return null;
    }

    @Override
    public BaseResponse<Integer> addOrder(OrderInfo param) {
        BaseResponse<Integer> response = new BaseResponse<>();
        if (param == null){
            response.setResult(null);
            return response;
        }else{
            if (StringUtils.isEmpty(param.getUserAccount())){
                response.setResult(null);
                return response;
            }
            if (StringUtils.isEmpty(param.getMerchantAccount())){
                response.setResult(null);
                return response;
            }
            if (StringUtils.isEmpty(param.getCommodityId())){
                response.setResult(null);
                return response;
            }
            UserWalletExample example = new UserWalletExample();
            UserWalletExample.Criteria criteria = example.createCriteria();
            if (StringUtils.isEmpty(param.getUserAccount())){
                response.setResult(null);
                return response;
            }
            else{
                criteria.andUserAccountEqualTo(param.getUserAccount());
            }
//            设置发货地
            ShopBaseInfoExample shopExample = new ShopBaseInfoExample();
            ShopBaseInfoExample.Criteria shopCriteria = shopExample.createCriteria();
            shopCriteria.andShopAccountEqualTo(param.getMerchantAccount());
            List<ShopBaseInfo> shopList = shopBaseInfoMapper.selectByExample(shopExample);
            param.setMerchantAddress(shopList.get(0).getShopAddress());

            //            判断余额是否足够
            List<UserWallet> wallets = walletMapper.selectByExample(example);
            float balance = 0;
            if (wallets.size()==0){
                balance=0;
            }else {
                balance = wallets.get(0).getUserBalance();
            }
            float orderMoney = param.getOrderMoney().floatValue();
            if (balance<orderMoney){
                response.setResult(-1);
                response.setResultMessage("账户余额不足");
                return response;
            }else{
                int i = orderMapper.insert(param);
                response.setResult(i);
            }
        }
        return response;
    }

    @Override
//    修改订单状态
    public BaseResponse<Integer> editOrder(OrderInfo param) {
//        修改订单状态，如店家发货，则库存减少
        BaseResponse<Integer> response = new BaseResponse<>();
        if (param==null){
            response.setResult(null);
            return response;
        }else{
            OrderInfoExample example = new OrderInfoExample();
            OrderInfoExample.Criteria criteria = example.createCriteria();
            if (!StringUtils.isEmpty(param.getCommodityId())){
                criteria.andCommodityIdEqualTo(param.getCommodityId());
            }
            if (!StringUtils.isEmpty(param.getMerchantAccount())){
                criteria.andMerchantAccountEqualTo(param.getMerchantAccount());
            }
            if (!StringUtils.isEmpty(param.getUserAccount())){
                criteria.andUserAccountEqualTo(param.getUserAccount());
            }
            if (!StringUtils.isEmpty(param.getUserOrdeId())){
                criteria.andUserOrdeIdEqualTo(param.getUserOrdeId());
            }
//            获取该条订单信息
            List<OrderInfo> queryList = orderMapper.selectByExample(example);
            int buyNum = queryList.get(0).getCommodityNumber();
            String proId = queryList.get(0).getCommodityId();
//            如果操作是商家发货，则减少库存
            if (param.getOrderStatus()==2){
//                先获取该条商品记录
                CommodityBaseInfoExample proInfoExample = new CommodityBaseInfoExample();
                CommodityBaseInfoExample.Criteria criteriaPro = proInfoExample.createCriteria();
                List<CommodityBaseInfo> proList = productMapper.selectByExample(proInfoExample);
//                更改库存数量
                int proNum = Integer.parseInt(proList.get(0).getCommodityExt1());
                proNum = proNum-buyNum;
                CommodityBaseInfo baseInfo = new CommodityBaseInfo();
                baseInfo.setCommodityId(Integer.parseInt(param.getCommodityId()));
                baseInfo.setCommodityExt1(String.valueOf(proNum));
                productMapper.updateByExampleSelective(baseInfo,proInfoExample);
            }

            int i = orderMapper.updateByExampleSelective(param,example);
            response.setResult(i);
        }
        return response;
    }

    @Override
    public BaseResponse<List<ShopCommodity>> getShopCommodity(ShopCommodity param) {
        BaseResponse<List<ShopCommodity>> response = new BaseResponse<>();
        if (param==null){
            response.setResult(null);
            return response;
        }else{
            ShopCommodityExample example = new ShopCommodityExample();
            ShopCommodityExample.Criteria criteria = example.createCriteria();
            if (!StringUtils.isEmpty(param.getCommodityId())){
                criteria.andCommodityIdEqualTo(param.getCommodityId());
            }
            if (!StringUtils.isEmpty(param.getShopCommodityId())){
                criteria.andShopCommodityIdEqualTo(param.getShopCommodityId());
            }
            if (!StringUtils.isEmpty(param.getShopAccount())){
                criteria.andShopAccountEqualTo(param.getShopAccount());
            }
            List<ShopCommodity> list = shopCommodityMapper.selectByExample(example);
            response.setResult(list);
        }
        return response;
    }

    @Override
    public BaseResponse<Integer> delPro(ShopCommodity param) {
        BaseResponse<Integer> response = new BaseResponse<>();
        if (param==null){
            response.setResult(null);
            return response;
        }else{
            ShopCommodityExample example = new ShopCommodityExample();
            ShopCommodityExample.Criteria criteria = example.createCriteria();
            if (!StringUtils.isEmpty(param.getCommodityId())){
                criteria.andCommodityIdEqualTo(param.getCommodityId());
            }
            if (!StringUtils.isEmpty(param.getShopAccount())){
                criteria.andShopAccountEqualTo(param.getShopAccount());
            }
            if (!StringUtils.isEmpty(param.getShopCommodityId())){
                criteria.andShopCommodityIdEqualTo(param.getShopCommodityId());
            }
            int i = shopCommodityMapper.deleteByExample(example);
            response.setResult(i);
        }
        return response;
    }

    @Override
    public BaseResponse<Integer> editPro(ShopCommodity param) {
        BaseResponse<Integer> response = new BaseResponse<>();
        if (param==null){
            response.setResult(null);
            return response;
        }else{
            ShopCommodityExample example = new ShopCommodityExample();
            ShopCommodityExample.Criteria criteria = example.createCriteria();
            if (!StringUtils.isEmpty(param.getCommodityId())){
                criteria.andCommodityIdEqualTo(param.getCommodityId());
            }
            if (!StringUtils.isEmpty(param.getShopAccount())){
                criteria.andShopAccountEqualTo(param.getShopAccount());
            }
            if (!StringUtils.isEmpty(param.getShopCommodityId())){
                criteria.andShopCommodityIdEqualTo(param.getShopCommodityId());
            }
            int i = shopCommodityMapper.updateByExampleSelective(param,example);
            response.setResult(i);
        }
        return response;
    }

    @Override
    public BaseResponse<Integer> addShopCommodity(ShopCommodity param) {
        BaseResponse<Integer> response = new BaseResponse<>();
        if (param==null){
            response.setResult(null);
            return response;
        }else {
            if (StringUtils.isEmpty(param.getShopAccount())){
                response.setResult(null);
                return response;
            }
            if (StringUtils.isEmpty(param.getCommodityId())){
                response.setResult(null);
                return response;
            }
            int i = shopCommodityMapper.insert(param);
            response.setResult(i);
        }
        return response;
    }

    @Override
    public BaseResponse<List<ShopLevel>> getShopLevel(ShopLevel param) {
        BaseResponse<List<ShopLevel>> response = new BaseResponse<>();
        ShopLevelExample example = new ShopLevelExample();
        ShopLevelExample.Criteria criteria = example.createCriteria();
        List<ShopLevel> list = new ArrayList<>();
        if (param==null){
            list = levelMapper.selectByExample(example);
        }else{
            if (!StringUtils.isEmpty(param.getShopLevelId())){
                criteria.andShopLevelIdEqualTo(param.getShopLevelId());
            }
            if (!StringUtils.isEmpty(param.getShopLevelLow())){
                criteria.andShopLevelLowLessThan(param.getShopLevelLow());
            }
            if (!StringUtils.isEmpty(param.getShopLevelName())){
                criteria.andShopLevelNameLike("%"+param.getShopLevelName()+"%");
            }
            list = levelMapper.selectByExample(example);
        }
        response.setResult(list);
        return response;
    }
}
