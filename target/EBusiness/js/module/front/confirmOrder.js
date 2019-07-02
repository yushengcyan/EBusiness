define('module/front/confirmOrder',function (require,exports,module) {
    var $ = require('jquery');
    require('util/jsviews/jsrender');
    require('util/jsviews/jsviews');

    var ajaxUrl = "/EBusiness/shop";
    var _this;

    //初始化方法
    var Init = function () {
        _this = this;
    //    初始化获取地址
        var addressParam = {
            userAccount:_this.getQueryVariable("account"),
        };
        _this.getAddress(addressParam);

    //    初始化获取订单商品信息
        proParam = {
            shopAccount:_this.getQueryVariable("shopAccount"),
            commodityId:_this.getQueryVariable("productId"),
        };
        _this.getProduct(proParam);

    //    初始化导航栏url地址
        var account = _this.getQueryVariable("account");
        //如果已经登录，则跳转页面后面加参数
        if(account!=null||account!=''){
            $("#userCenter").attr("href",'/EBusiness/html/front/UserCenter.html?account='+account);
            $("#homePage").attr("href",'/EBusiness/html/front/HomePage.html?account='+account);
        }


    //    编辑弹窗
        $(document).on('click','.editAddress',function () {
            param = {
                userAddressId:$(this).attr("addressId"),
            };
            _this.getEditAddress(param);
        });
    //    保存编辑地址
        $(document).on('click','#saveEdit',function () {
            param = {
                userAddressId:$(this).attr("addressId"),
                userName:$("#editName").val(),
                userPhone:$("#editPhone").val(),
                userAddress:$("#editUserAddress").val(),
            };
            _this.editAddress(param);
        });

    //    新增地址弹窗
        $(document).on('click','#addAddressClick',function () {
            $("#addAddress").show();
        });
    //    保存新增地址
        $(document).on('click','#saveAdd',function () {
           param = {
               userAccount:_this.getQueryVariable("account"),
               userName:$("#addName").val(),
               userPhone:$("#addPhone").val(),
               userAddress:$("#addUserAddress").val()
           };
           _this.addAddress(param);
        });
    //    取消编辑 新增
        $(document).on('click','.cancel',function () {
            $("#editAddressshow").hide();
            $("#addAddress").hide();
        });
    //    选择地址样式改变 且修改收货地址
        $(document).on('click','.addressLi',function () {
            $(".addressLi").css({
                "border": "2px dashed",
            });
            $(this).css({
                "border": "2px red dashed"
            });
            var address = $(this).children().eq(0).children(0).next().next().children().eq(0).html();
            $("#resultAddress").html(address);
            var name = $(this).children().eq(0).children(2).children().eq(0).html();
            $("#resultUser").html(name);
            var phone = $(this).children().eq(0).children(0).next().next().next().children().eq(0).html();
            $("#resultPhone").html(phone)
        });
    //   提交订单
        $(document).on('click','#submitOrder',function (){
            var discount;
            if (isNaN($("#proDiscount").html())){
                discount=0
            }else {
                discount = $("#proDiscount").html();
            }
            param = {
                userAccount:_this.getQueryVariable("account"),
                merchantAccount:_this.getQueryVariable("shopAccount"),
                userAddress:$("#resultAddress").html(),
                commodityId:_this.getQueryVariable("productId"),
                commodityName:$("#proName").html(),
                commodityPrice:$("#proPrice").html().substring(1),
                commodityNumber:$("#proNum").html(),
                discountPrice:discount,
                orderMoney:$("#resultMoney").html().substring(1),
                orderStatus:1,
                userPhoneNumber:$("#resultPhone").html(),
            };
            _this.addOrder(param);
        });

    }

    getAddress = function (param) {
        $.ajax({
            data:param,
            type:"POST",
            dataType:"JSON",
            url:"/EBusiness/userInfo/getAddress",
            success:function (data) {

                if (data.success && data.result != null){
                    if (data.result.length==0){
                        alert("暂时没有收货信息，请添加");
                        $("#addressInfo").html(data.resultMessage)
                    }else{
                        var tmpl = $.templates("#addressInfoTmpl");
                        var htmlout = tmpl.render(data.result);
                        $("#addressInfo").html(htmlout);

                    //    加载完数据触发一次点击第一个地址
                        $('.addressUl:first>li:first').trigger('click');
                    }
                }  else {
                    alert(data.resultMessage);
                }
            },
        })
    };

    getEditAddress = function (param) {
        $("#editAddressshow").show();
        $.ajax({
            data:param,
            type:"POST",
            dataType:"JSON",
            url:"/EBusiness/userInfo/getAddress",
            success:function (data) {
                if (data.success && data.result != null){
                    var tmpl = $.templates("#editAddressTmp");
                    var htmlout = tmpl.render(data.result);
                    $("#editAddressshow").html(htmlout);
                }  else {
                    alert(data.resultMessage);

                }
            },
        });
    };

    editAddress = function (param) {
        $.ajax({
            data:param,
            type:"POST",
            dataType:"JSON",
            url:"/EBusiness/userInfo/editAddress",
            success:function (data) {
                if (data.success && data.result != null && data.result>0){
                    alert(data.resultMessage);
                    $("#editAddressshow").hide();
                    var addressParam = {
                        userAccount:_this.getQueryVariable("account"),
                    };
                    _this.getAddress(addressParam);
                }  else {
                    alert(data.resultMessage);
                }
            },
        });
    };

    addAddress = function (param) {
        $.ajax({
            data:param,
            type:"POST",
            dataType:"JSON",
            url:"/EBusiness/userInfo/addAddress",
            success:function (data) {
                if (data.success && data.result != null && data.result>0){
                    alert(data.resultMessage);
                    $("#addAddress").hide();
                    var addressParam = {
                        userAccount:_this.getQueryVariable("account"),
                    };
                    _this.getAddress(addressParam);
                }  else {
                    alert(data.resultMessage);
                }
            },
        });
    };

    getProduct = function (param) {
        $.ajax({
            async:false,
            data:param,
            type:"POST",
            dataType:"JSON",
            url:"/EBusiness/shop/getShopUnionProduct",
            success:function (data) {
                if (data.success && typeof (data) != 'undefined' &&data.result != null){
                    $("#proImg").attr("src","../../upload/ProductImg/"+data.result[0].productImgs[0].imgId+".jpg");
                    $("#proName").html(data.result[0].commodityBaseInfo.commodityName);
                    $("#proPrice").html("￥"+data.result[0].commodityBaseInfo.commodityPrice);
                    $("#proNum").html(_this.getQueryVariable("count"));
                    $("#proMoney").html("￥"+_this.getQueryVariable("count")*data.result[0].commodityBaseInfo.commodityPrice);
                    $("#resultMoney").html($("#proMoney").html());
                }
            }
        })
    };

    addOrder = function (param) {
        $.ajax({
            data:param,
            type:"POST",
            dataType:"JSON",
            url:"/EBusiness/shop/addOrder",
            success:function (data) {
                if (data.success && data.result != null && data.result>0){
                    alert(data.resultMessage+",即将返回商城首页");
                    //返回首页
                    var account = _this.getQueryVariable("account");
                    window.location.href = "/EBusiness/html/front/HomePage.html?account="+account;
                }  else {
                    alert(data.resultMessage);
                }
            },
        });
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
    //获取某个url中的某个参数值
    getUrlParam = function (url,paramName) {
        var urlParam = url.substring(url.indexOf("?")+1);
        var vars = urlParam.split("&");
        for (var i = 0; i<vars.length; i++){
            var paramValue = vars[i].split("=");
            if (paramName == paramValue[0]){
                return paramValue[1];
            }
        }
        return(false);
    }

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
    //对外暴露接口
    exports.Init = Init();
})