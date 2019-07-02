define('module/front/shopInfo',function (require,exports,module) {
    var $ = require('jquery');
    require('util/jsviews/jsrender');
    require('util/jsviews/jsviews');

    var ajaxUrl = "/EBusiness/shop";
    var _this;

    //初始化方法
    var Init = function () {
        _this = this;
        //如果已经登录，则跳转页面后面加参数
        //
        var account = _this.judgeLog();

        //初始化获取店铺基本信息
        var shopParam = {
            shopUserAccount:account,
        };
        _this.getShopInfo(shopParam);

        /*选择事件*/
        $(document).on('click','.choseLog',function () {
            var choseLog = $(this).attr("choseLog");
            switch (choseLog) {
                //获取店铺基本信息
                case '1':
                    param = {
                        shopUserAccount: account
                    };
                    $(".info").hide();
                    $("#shopBaseInfo").show();
                    _this.getShopInfo(param);
                    break;
                //    店铺订单信息
                case "2":
                    param = {
                        merchantAccount: account,
                        pageSize:5,
                        pageNo:1,
                    }
                    $(".info").hide();
                    $("#orderInfo").show();
                    _this.getOrder(param);
                    break;
                //    店铺商品管理
                case "3":
                    debugger
                    if (typeof ($("#shopInfoName").attr("shopInfoAccount"))=='undefined'){
                        $("#proList").children().eq(0).children().eq(0).html("没有店铺信息");
                        return
                    }
                    param = {
                        shopAccount: $("#shopInfoName").attr("shopInfoAccount")
                    };
                    $(".info").hide();
                    $("#productInfo").show();
                    _this.getProductInfo(param);
                    break;
                //    店铺总交易信息
                case "4":
                    param = {
                        shopAccount:$("#shopInfoName").attr("shopInfoAccount")
                    };
                    $(".info").hide();
                    $("#totalInfo").show();
                    // _this.getTotle(param);
                    break;
                default:
                    $("#shopBaseInfo").parent().html("参数错误");

            }

        });

        //店铺基本信息更改
        $(document).on('click','#updateShop',function () {
            $("#updateButton").show();
            $("#shopInfoName").removeAttr("readonly");
            $("#userName").removeAttr("readonly");
            $("#shopAddress").removeAttr("readonly");
        });
        //取消更改
        $(document).on('click','.cancel',function () {
            $("#updateButton").hide();
            $("#editProductInfo").hide();
            $("#addProductInfo").hide();
            // var shopParam = {
            //     shopUserAccount:account,
            // };
            // _this.getShopInfo(shopParam);
        });
        //保存更改店铺信息
        $(document).on('click','#saveShopInfo',function () {
            param = {
                shopId:$("#shopInfoName").attr("shopId"),
                shopAccount:$("#shopInfoName").attr("shopInfoAccount"),
                shopName:$("#shopInfoName").val(),
                shopUserName:$("#userName").val(),
                shopAddress:$("#shopAddress").val(),
            };
            _this.editShop(param);
        });
    //    点击获取订单信息
        $(document).on('click','.getTypeOrder',function () {
            //选中样式颜色改变
            $(".getTypeOrder").css({
                "color":"#337ab7",
            });
            $(this).css({
                "color":"red",
            });
            param = {
                merchantAccount: account,
                orderStatus:$(this).attr("ordertype"),
                pageSize:5,
                pageNo:1,
            };
            _this.getOrder(param);
        });
    //    接收订单发货
        $(document).on('click','#acceptOrder',function (){
            param = {
                userOrdeId:$(this).attr("orderId"),
                orderStatus:2
            }
            _this.eidtOrder(param);
        });
    //    新增商品弹窗
        $(document).on('click','#addProduct',function (){

        });
    //    删除商品弹窗
        $(document).on('click','.delPro',function (){
            debugger
            param = {
                shopCommodityId:$(this).attr("unionId"),
                shopAccount:$("#shopInfoName").attr("shopInfoAccount"),
            };
            _this.delPro(param)
        });
        //更改商品信息弹窗
        $(document).on('click','.editProduct',function (){
            $("#editProductInfo").show();
            param = {
                shopCommodityId:$(this).attr("unionId"),
                shopAccount:$("#shopInfoName").attr("shopInfoAccount"),
            };
            _this.getEditProInfo(param);
            // $("#editProductInfo").show();
        });
        //保存
        $(document).on('click','#editProSave',function (){
            param = {
                shopCommodityId:$(this).attr("unionId"),
                shopAccount:$("#shopInfoName").attr("shopInfoAccount"),
                commodityName:$("#editProName").val(),
                shopCommodityExt1:$("#editProPrice").val(),
                commodityDiscount:$("#eidtProDiscount").val(),
            };
            _this.editPro(param)
        });





    };

    getShopInfo = function (param) {
        $.ajax({
            data:param,
            type:"POST",
            dataType:"JSON",
            url:ajaxUrl+"/getShopInfo",
            success:function (data) {
                $(".info").hide();
                $("#shopBaseInfo").show();

                if (data.result!=null && data.success &&data.result.length>0){
                    var tmpl = $.templates("#shopBaseInfoTmpl");
                    var htmlOut = tmpl.render(data.result[0]);
                    $("#shopBaseInfo").html(htmlOut);
                    $("#addShopAccount").val(data.result[0].shopAccount);
                    $("#addShopProName").val(data.result[0].shopName);
                //加载店铺等级
                    var param = {
                        shopLevelId:$("#shopLevelId").val(),
                    }
                    _this.getShopLevel(param);
                    if(data.result[0].shopNumber=='null'
                        ||data.result[0].shopNumber==null||
                        data.result[0].shopNumber=="") {
                        $("#tradeNum").html(0);
                    }else{
                        $("#tradeNum").html(data.result[0].shopNumber);
                    }
                    if(data.result[0].shopMoney=='null'
                        ||data.result[0].shopMoney==null||
                        data.result[0].shopMoney=="") {
                        $("#tradeMoney").html(0);
                    }else {
                        $("#tradeMoney").html(data.result[0].shopMoney);
                    }
                }else{
                    $("#shopBaseInfo").html("暂时没有店铺信息");
                    $("#totalInfo").html("暂时没有店铺信息");
                }
            }
        });
    };

    editShop = function (param) {
        $.ajax({
            data:param,
            type:"POST",
            dataType:"JSON",
            url:ajaxUrl+"/editShop",
            success:function (data) {
                if (data.result!=null && data.success&&data.result>0){
                    alert(data.resultMessage);
                    var shopParam = {
                        shopUserAccount:account,
                    };
                    _this.getShopInfo(shopParam);
                }else{
                    alert(data.resultMessage)
                }
            }
        });
    };
    //难
    getOrder = function (param) {
        $.ajax({
            data:param,
            type:"POST",
            dataType:"JSON",
            url:ajaxUrl+"/getOrder",
            success:function (data) {
                $(".info").hide();
                $("#orderInfo").show();
                if (data.result!=null && data.success){
                    if (data.result.length>0){

                        var tmpl = $.templates("#orderInfoShowTmpl");
                        var htmlOut = tmpl.render(data.result);
                        $("#orderInfoShow").html(htmlOut);

                        //遍历订单类型，获取当前类型的值
                        var nodes = $(".getTypeOrder");
                        var type="";
                        for(var i=0;i<nodes.length;i++){
                            var color =  $(".getTypeOrder").eq(i).css("color");
                            //通过判断当前选中项的颜色获取类型值
                            if (color=="rgb(255, 0, 0)"){
                                type=$(".getTypeOrder").eq(i).attr("ordertype");
                                break;
                            }
                        }
                        //为全部订单时，不显示操作，只显示订单状态
                        if(type==""||type==2){
                            $(".operator").hide()
                            $(".state").show();
                        }else if (type==1){
                            $(".state").hide();
                            $(".operator").show()
                        }else if(type==3){
                            $(".state").hide();
                            $(".operator").show();
                            $("#acceptOrder").hide();
                        }
                    }else{
                        $("#orderInfoShow").children().eq(0).html(data.resultMessage);
                    }
                }else{
                    $("#orderInfoShow").children().eq(0).children().eq(0).html(data.resultMessage);
                }
            }
        });
    };

    eidtOrder = function (param) {
        $.ajax({
            data:param,
            type:"POST",
            dataType:"JSON",
            url:ajaxUrl+"/editOrder",
            success:function (data) {
                if (data.result!=null && data.success&&data.result>0){
                    var nodes = $(".getTypeOrder");
                    var type="";
                    for(var i=0;i<nodes.length;i++){
                        var color =  $(".getTypeOrder").eq(i).css("color");
                        //通过判断当前选中项的颜色获取类型值
                        if (color=="rgb(255, 0, 0)"){
                            type=$(".getTypeOrder").eq(i).attr("ordertype");
                            break;
                        }
                    }
                    var param = {
                        merchantAccount: _this.judgeLog(),
                        orderStatus:type,
                        pageSize:5,
                        pageNo:1,
                    }
                    _this.getOrder(param);
                }else{
                    alert(data.resultMessage)
                }
            }
        });
    };

    getProductInfo = function (param) {
        debugger
        $.ajax({
            data:param,
            type:"POST",
            dataType:"JSON",
            url:ajaxUrl+"/getShopProductList",
            success:function (data) {
                $(".info").hide();
                $("#productInfo").show();
                if (data.result!=null && data.success){
                    if (data.result.length>0){
                        var tmpl = $.templates("#proListTmpl");
                        var htmlOut = tmpl.render(data.result);
                        $("#proList").html(htmlOut);
                    }
                    else{
                        $("#proList").children().eq(0).html(data.resultMessage);
                    }
                }else{
                    $("#proList").children().eq(0).children().eq(0).html(data.resultMessage);
                }
            }
        });
    };
    getEditProInfo = function () {
        $.ajax({
            data:param,
            type:"POST",
            dataType:"JSON",
            url:ajaxUrl+"/getShopProductList",
            success:function (data) {
                debugger
                if (data.result!=null && data.success){
                    if (data.result.length>0){
                        var tmpl = $.templates("#editProductInfoTmpl");
                        var htmlOut = tmpl.render(data.result[0]);
                        $("#editProductInfo").html(htmlOut);
                    }
                    else{
                        $("#editProductInfo").children().eq(0).html(data.resultMessage);
                    }
                }else{
                    $("#editProductInfo").children().eq(0).children().eq(0).html(data.resultMessage);
                }
            }
        });
    }

    delPro = function (param) {
        $.ajax({
            data:param,
            type:"POST",
            dataType:"JSON",
            url:ajaxUrl+"/delPro",
            success:function (data) {
                debugger
                if (data.result!=null && data.success&&data.result>0){
                    var param = {
                        shopAccount: $("#shopInfoName").attr("shopInfoAccount")
                    };
                    _this.getProductInfo(param);
                }else{
                    alert(data.resultMessage)
                }
            }
        });
    };

    editPro = function (param) {
        debugger
        $.ajax({
            data:param,
            type:"POST",
            dataType:"JSON",
            url:ajaxUrl+"/editPro",
            success:function (data) {
                debugger
                if (data.result!=null && data.success&&data.result>0){
                    $("#editProductInfo").hide()
                    param = {
                        shopAccount: $("#shopInfoName").attr("shopInfoAccount")
                    };
                    _this.getProductInfo(param);
                }else{
                    alert(data.resultMessage)
                }
            }
        });
    }
    //店铺等级信息
    getShopLevel = function (param) {
        $.ajax({
            data:param,
            type:"POST",
            dataType:"JSON",
            url:ajaxUrl+"/getShopLevel",
            success:function (data) {
                debugger
                if (data.result!=null && data.success){
                    if (data.result.length>0){
                        $("#levelName").html(data.result[0].shopLevelName);
                    }
                    else{
                        $("#totalInfo").children().eq(0).html(data.resultMessage);
                    }
                }else{
                    $("#totalInfo").children().eq(0).children().eq(0).html(data.resultMessage);
                }
            }
        });
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
    //获取当前URL指定参数值参数
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
    exports.Init = Init();
});