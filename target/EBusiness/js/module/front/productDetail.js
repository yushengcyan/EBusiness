/**
 * Created by ZLL on 2019/4/23.
 */

define('module/front/productDetail',function (require,exports,module){

    var $ = require('jquery');

    require('util/jsviews/jsrender');
    require('util/jsviews/jsviews');
    require('util/jquery/jquery.params');

    var ajaxUrl = '/EBusiness/shop';
    var _this;

    Init = function () {
        _this = this;
        var paramList = _this.GetRequest();
        var url = window.location.href;
        var shopParam = {
            shopAccount:_this.getQueryVariable("shopAccount")
        };
        var proParam = {
            commodityId:_this.getQueryVariable("productId")
        };
        var imgParam = {
            shopAccount:_this.getQueryVariable("shopAccount"),
            commodityId:_this.getQueryVariable("productId"),
        };


        //判断是否登录
        var account = _this.judgeLog();
        if(!judgeLog()){
            alert("抱歉，您还未登录");
            $("#userCenter").attr("href",'/EBusiness/html/front/UserCenter.html');
            $("#homePage").attr("href",'/EBusiness/html/front/HomePage.html');
            $("#communityCenter").attr("href",'/EBusiness/html/front/Community.html');
            $("#ownShop").attr("href","/EBusiness/html/front/ShopInfo.html")

        }else {
            $("#userCenter").attr("href",'/EBusiness/html/front/UserCenter.html?account='+account);
            $("#homePage").attr("href",'/EBusiness/html/front/HomePage.html?account='+account);
            $("#communityCenter").attr("href",'/EBusiness/html/front/Community.html?account='+account)
            $("#ownShop").attr("href","/EBusiness/html/front/ShopInfo.html?account="+account)
        }
        //商品评价参数
        var commentParam = {
            commodityId:_this.getQueryVariable("productId"),
            shopAccount:_this.getQueryVariable("shopAccount")
        };
        //页面加载时传参 获取所加载商品详情页面的店铺信息和商品信息
        //获取商品信息
        _this.getProductDetail(proParam);
        //获取店铺信息
        _this.getShopInfo(shopParam);
        //获取商品图片
        _this.getImg(imgParam)
        //获取店铺等级名
        // _this.getShopLevel(levelParam);
    //    商品评价
    //     _this.getComment(commentParam);


    //    商品小图滑过时触发事件
        $(document).on('mouseover','.ImgMouseOver',function () {
            var src = $(this).children().eq(0).children().eq(0).attr("src")
            $("#bigImg").attr("src",$(this).children().eq(0).children().eq(0).attr("src"))
        });

    //商品详情、商品评论
    //    选择商品信息
        $(document).on('click','#chosePro',function () {
            //选中时CSS样式改变
            $("#proInfo").css({
                "display":"block"
            });
            $("#Content").css({
                "display":"none",
            });
            $(this).css({
                "border":"2px solid red",
                "border-right":"dashed 1px"
            });
            $("#choseComment").css({
                "border":"none"
            });

            param = {
                commodityId:_this.getQueryVariable("productId"),
            };
            _this.getProductDetail(param);
        });
        //选择商品评论
        $(document).on('click','#choseComment',function () {
            $("#proInfo").css({
                "display":"none"
            });
            $("#Content").css({
                "display":"block",
            });
            $(this).css({
                "border":"2px solid red"
            });
            $("#chosePro").css({
                "border":"none",
                "border-right":"dashed 1px"
            });
            _this.getComment(commentParam);
        });

    //    购买商品
        $(document).on('click','#buy',function () {
            var buyCount = $("#proCount").val();
            var proCount = $("#proNum").attr("value");
            if (proCount==""||proCount==null){
                proCount=0;
            }
            if (_this.judgeBuy(buyCount,proCount)) {
                //获取参数列表
                var param = window.location.search.substring(1);
                window.location.href = "/EBusiness/html/front/ConfirmOrder.html?"+param+"&count="+buyCount;
            }

        });

    //加入购物车
        $(document).on('click','#addShopCart',function () {
            //购买数量和库存
            var buyCount = $("#proCount").val();
            var proCount = $("#proNum").attr("value");
            if (_this.judgeBuy(buyCount,proCount)){
                param = {
                    userAccount:_this.getQueryVariable('account'),
                    commodityId:_this.getQueryVariable('productId'),
                    shopAccount:_this.getQueryVariable('shopAccount'),
                    commodityName:$("#productName").html(),
                    commodityPrice:$("#productPrice").html(),
                    shopName:$("#stitle").html(),
                    commodityNum:buyCount,
                };
                _this.addShopCart(param);
            }
        //    传参，

        })
    }

    getProductDetail = function (param) {
        $.ajax({
            data:param,
            type:"POST",
            dataType:"JSON",
            url:ajaxUrl + "/getProduct",
            success:function (data) {
                if (data.success && typeof (data) != 'undefined'){
                    //在图片旁渲染数据
                    var tmpl = $.templates("#proDetailTmpl");
                    var htmlOut = tmpl.render(data.result);
                    $("#proDetail").html(htmlOut);
                    //修改加载到页面数据
                    var tmplInfo = $.templates("#proInfoTmpl");
                    var htmlInfo = tmplInfo.render(data.result)
                    $("#proInfo").html(htmlInfo);
                }
            }
        })
    };

    getShopInfo = function (param) {
        $.ajax({
            data:param,
            type:"POST",
            dataType:"JSON",
            url:ajaxUrl + "/getShopInfo",
            success:function (data) {
                if (data.success && typeof (data) != 'undefined'){
                    $(".title").html("欢迎来到"+data.result[0].shopName);
                    $("#stitle").html(data.result[0].shopName);
                    //店铺成交额
                    if (data.result[0].shopNumber==null||data.result[0].shopNumber==''){
                        data.result[0].shopNumber = 0;
                    }
                    var htmlNum = "<span style='color:deepskyblue'>"+data.result[0].shopNumber+"</span>";
                    $("#shopNum").append(htmlNum);
                    //店铺等级名
                    var levelName;

                    if(data.result[0].shopLevel==''||data.result[0].shopLevel==null||data.result[0].shopLevel==1){
                        levelName = "青铜信誉店铺";
                    }else if (data.result[0].shopLevel==2){
                        levelName = "白银信誉店铺";
                    }else if (data.result[0].shopLevel ==3){
                        levelName = "黄金店铺";
                    }else if (data.result[0].shopLevel==4){
                        levelName = "白金信誉店铺";
                    }else if (data.result[0].shopLevel==5){
                        levelName = "钻石信誉店铺";
                    }else{
                        levelName = "皇冠信誉店铺";
                    };
                    var htmlOut = "<span style='color:deepskyblue'>"+levelName+"</span>"
                    $("#shopLevel").append(htmlOut)

                    var tmpl = $.templates("");
                }
            }
        })
    };

    getComment = function (param) {
        $.ajax({
            data:param,
            type:"POST",
            dataType:"JSON",
            url:ajaxUrl + "/getComment",
            success:function (data) {
                if (data.success && typeof (data) != 'undefined'){
                    var tmpl = $.templates("#commentInfoTmpl");
                    var htmlout = tmpl.render(data.result);
                    $("#commentInfo").html(htmlout);
                }
            },
            error:function () {
                alert("调用查询评论失败");
            }
        });
    };

    getImg = function (param) {
        $.ajax({
            data:param,
            type:"POST",
            dataType:"JSON",
            url:ajaxUrl + "/getImg",
            success:function (data) {
                if (data.success && typeof (data) != 'undefined' && data.result.length>0){
                    var tmpl = $.templates("#imgInfoTmpl");
                    var htmlout = tmpl.render(data.result);
                    $("#imgInfo").html(htmlout);
                    $("#bigImg").attr("src","../../upload/ProductImg/"+data.result[0].imgId+".jpg");
                }
            },
            error:function () {
                alert("调用查询评论失败");
            }
        });
    }

    addShopCart = function (param) {
        $.ajax({
            data:param,
            type:"POST",
            dataType:"JSON",
            url:ajaxUrl + "/addShopCart",
            success:function (data) {
                if (data.success && typeof (data) != 'undefined'){
                    if (data.success && data.result!=null && data.result>0){
                        alert(data.resultMessage);
                    }else{
                        alert(data.resultMessage)
                    }

                }
            },
            error:function () {
                alert("调用查询评论失败");
            }
        });
    };

    //判断是否能够购买、加入购物车（是否登录，库存是否足够）
    //参数为购买数量，库存数量
    judgeBuy = function (buyCount,proCount) {
        if (_this.getQueryVariable('account')=='' ||
            _this.getQueryVariable('account')==null ||
            _this.getQueryVariable('account')=='null'||
            _this.getQueryVariable('account')=='#'){
            alert("您还没有登录，请登录");
            return(false)
        }else{
            //判断库存是否足够
            //isNaN 方法，如果是数字返回false
            if (isNaN(buyCount) || isNaN(proCount)){
                alert("商品数量参数错误")
                return(false);
            }else{
                if(buyCount>proCount){
                    alert("抱歉，库存数量不足");
                    return(false);
                }else{
                    return(true);
                }
            }
        }
    };
    //判断用户是否登录
    judgeLog = function () {
        var account = _this.getQueryVariable("account");
        //未登录
        if (!account){
            // alert("对不起，您还未登录哦！");
            //未登录
            $("#log").children().eq(1).html("登录");
            $("#log").attr("href","/EBusiness/html/front/logIn.html");
            $("#userCenter").attr("href",'/EBusiness/html/front/UserCenter.html');
            $("#homePage").attr("href",'/EBusiness/html/front/HomePage.html');
            $("#communityCenter").attr("href",'/EBusiness/html/front/Community.html');
            $("#ownShop").attr("href","/EBusiness/html/front/ShopInfo.html")
            return(false);
        }else{
            $("#userCenter").attr("href",'/EBusiness/html/front/UserCenter.html?account='+account);
            $("#homePage").attr("href",'/EBusiness/html/front/HomePage.html?account='+account);
            $("#communityCenter").attr("href",'/EBusiness/html/front/Community.html?account='+account)
            $("#ownShop").attr("href","/EBusiness/html/front/ShopInfo.html?account="+account)
            $("#log").children().eq(1).html("注销");
            var x = window.location.href.substring(0,window.location.href.indexOf("?"));
            $("#log").attr("href",x);
            return(account);
        }
    }
    //获取URL指定参数值参数
    getQueryVariable = function(variable) {
        var query = window.location.search.substring(1);
        var vars = query.split("&");
        for (var i=0;i<vars.length;i++) {
            var pair = vars[i].split("=");
            if(pair[0] == variable){
                return pair[1];
            }
        }
        return(false);
    };

    //获取url中的参数列表
    GetRequest = function() {
        var url = location.search; //获取url中"?"符后的字串
        var theRequest = new Object();
        if (url.indexOf("?") != -1) {
            var str = url.substr(1);
            strs = str.split("&");
            for(var i = 0; i < strs.length; i ++) {
                theRequest[strs[i].split("=")[0]]=unescape(strs[i].split("=")[1]);
            }
        }
        return theRequest;
    }

    exports.Init = Init();


})