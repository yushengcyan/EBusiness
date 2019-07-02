/**
 * Created by ZLL on 2019/4/22.
 */
define('module/front/homepage',function (require,exports,module) {

    var $ = require('jquery');
    require('util/jquery/jquery.params');
    require('util/jsviews/jsrender');
    require('util/jsviews/jsviews');

    var ajaxUrl = '/EBusiness/shop';
    var _this;

    Init = function () {
        _this = this;

        _this.judgeLog();
        //获取商品类别
        var paramType;
        _this.getProductType(paramType);
        //页面初始化加载商品
        //若有商品参数传递则查询传递商品
        if (_this.getQueryVariable("productId")==''||
            _this.getQueryVariable("productId")==null||
            _this.getQueryVariable("productId")=='null'){
            var param = {
                commodityTypeId:1,
            }
            _this.getProduct(param);
        }else {
            var param = {
                commodityId:_this.getQueryVariable("productId"),
            }
            _this.getProduct(param);
        }

        //初始化导航栏url地址
        var account = _this.judgeLog();

        //点击商品同步跳转页面
        $(document).on('click','.shopTabletd',function () {
            var shopAccount = $(this).attr("shopAccount");
            var commodityId = $(this).attr("productId");
            var account = _this.getQueryVariable('account')
            var url = "/EBusiness/html/front/ProductDetail.html?shopAccount="
                +shopAccount+"&productId="+commodityId+"&account="+account;
            window.open(url);
        });
    //点击类别选择商品
        $(document).on('click','.typeClick',function () {
            param = {
                commodityTypeId:$(this).attr("typeId"),
            };
            _this.getProduct(param);
        });

    //    搜索商品或店铺
        $(document).on('click','#searchPro',function () {
            param = {
                commodityName:$("#searchContent").val(),
            };
            _this.searchProduct(param);
        });

     //申请开店弹窗
        $(document).on('click','#addShop',function (){
            $("#addShopFloat").show();
        });
        $(document).on('click','.cancel',function (){
            $("#addShopFloat").hide();
        });
    //    开店申请
        $(document).on('click','#addShopInfo',function () {
            debugger
            if (!_this.judgeLog()){
                alert("抱歉，您还未登录")
                return
            }else{
                param = {
                    shopName:$("#shopName").val(),
                    shopUserName:$("#shopUserName").val(),
                    shopAddress:$("#shopAddress").val(),
                    shopUserAccount:_this.judgeLog(),
                };
                _this.addShop(param);
            }
        });


    };


    getProduct = function (param) {
        $.ajax({
            data:param,
            type:"POST",
            dataType:"JSON",
            url:ajaxUrl+"/getShopUnionProduct",
            success:function (data) {
                debugger
                if (data.success && typeof (data) != 'undefined'){
                    var endResult = data.result;
                    var template = $.templates("#proInfoTmp");
                    var htmlOut = template.render(data.result);
                    $("#proInf").html(htmlOut);

                    var len=0;
                    for (var i=0;i<endResult.length;i++){
                        shopRestlut=endResult[i].shopBaseInfoList;
                        len=len+shopRestlut.length;
                    }
                    //当超过三行时才出现分页
                    if(len/5>3){
                        $("#page").css({display:"block"});
                    }
                }
            }
        });
    };

    getProductType = function(param){
        $.ajax({
            data:param,
            type:"POST",
            dataType:"JSON",
            url:ajaxUrl+"/getProductType",
            success:function (data) {
                if (data.success && typeof (data) != 'undefined' &&data.result != null){
                    var template = $.templates("#typeTmpl");
                    var htmlOut = template.render(data.result);
                    $("#type").html(htmlOut);
                }
            }
        })
    };

    //搜索关键字悠闲搜索商品，当关键字搜索不到商品时，关键字搜素店铺
    searchProduct = function (param) {
        $.ajax({
            async:false,
            data:param,
            type:"POST",
            dataType:"JSON",
            url:ajaxUrl+"/getShopUnionProduct",
            success:function (data) {
                if (data.success && typeof (data) != 'undefined'){
                    var endResult = data.result;
                    var template = $.templates("#proInfoTmp");
                    var htmlOut = template.render(data.result);
                    $("#proInf").html(htmlOut);

                    var len=0;
                    for (var i=0;i<endResult.length;i++){
                        shopRestlut=endResult[i].shopBaseInfoList;
                        len=len+shopRestlut.length;
                    }
                    //当超过三行时才出现分页
                    if(len/5>3){
                        $("#page").css({display:"block"});
                    }
                }else{
                    alert(data.resultMessage);
                    shopParam = {
                        shopName:param.commodityName,
                    }
                    _this.getShopInfo(shopParam);
                }
            }
        })
    };

    getShopInfo = function (param) {
        $.ajax({
            async: false,
            data: param,
            type: "POST",
            dataType: "JSON",
            url: ajaxUrl + "/getShopInfo",
            success: function (data) {
                if (data.result!=null && data.success&&data.result.length>0){
                    //隐藏掉之前查询的商品信息
                    $("#proInfo").hide();
                    var template = $.templates("#shopInfoTmpl");
                    var htmlOut = template.render(data.result);
                    $("#shopInfo").html(htmlOut);
                }else {
                    $("#shopInfo").html("没有商品或店铺信息");
                }
            }
        })
    };

    //新增店铺
    addShop = function (param) {
        $.ajax({
            async: false,
            data: param,
            type: "POST",
            dataType: "JSON",
            url: ajaxUrl + "/addShop",
            success: function (data) {
                debugger
                if (data.success && data.result!=null &&data.result>0){
                    alert(data.resultMessage);
                    $("#addShopFloat").hide();
                }
            }
        })
    };

    logOut = function (param) {
        $.ajax({

        })
    }

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
    }

    exports.Init = Init();

})