define('module/front/userCenter',function (require,exports,module) {
    var $ = require('jquery');
    require('util/jsviews/jsrender');
    require('util/jsviews/jsviews');

    var ajaxUrl = "/EBusiness/userInfo";
    var _this;
    //选择订单类型
    var orderType;

    var Init = function () {
        _this = this;
        //页面初始化加载
        account =  _this.getUrlParam(document.referrer,"account");
        _this.judgeLog();
        var params;
        //    初始化导航栏url地址
        var account = _this.getQueryVariable("account");
        //如果已经登录，则跳转页面后面加参数
        if(account!=null||account!=''){
            $("#userCenter").attr("href",'/EBusiness/html/front/UserCenter.html?account='+account);
            $("#homePage").attr("href",'/EBusiness/html/front/HomePage.html?account='+account);
            $("#communityCenter").attr("href",'/EBusiness/html/front/Community.html?account='+account)
        }else{
            $("#userCenter").attr("href",'/EBusiness/html/front/UserCenter.html');
            $("#homePage").attr("href",'/EBusiness/html/front/HomePage.html');
            $("#communityCenter").attr("href",'/EBusiness/html/front/Community.html');
        }
        if(account != false){
            params = {
                userAccount:account,
            };
        }else{
            params = {
                userAccount:_this.getQueryVariable("account"),
            };
        }
        _this.getBaseInfo(params);

        
        //购物车数量加减
        $(document).on('click','.subCount',function () {
            //获取下一个节点 即输入框的值
            var inputNode = $(this).next();
            var count = inputNode.val();
            if (count<=1){
                inputNode.val(count);
            }else{
                inputNode.val(--count);
            //    改变金额  通过获取父节点的下一个节点
            //    td级节点
                var tdNode = $(this).parent().parent().parent();
                //价格节点
                tdNode.next().html("￥"+inputNode.val()*tdNode.prev().html())
            }

        })
        $(document).on('click','.addCount',function () {
            //获取上一个节点
            var inputNode = $(this).prev();
            //订单商品数量
            var count = inputNode.val();
            if (count>=99){
                count=99;
            }else {
                //此时若使用count++则数字不会变，计算优先级在赋值之后
                inputNode.val(++count);
                var tdNode = $(this).parent().parent().parent();
                tdNode.next().html("￥"+inputNode.val()*tdNode.prev().html());
            }
        })

        //点击选择事件
        $(document).on('click','.choseInfo',function () {
            var choseInfo = $(this).attr("choseInfo");
            $(".choseInfo").css({
                "color":"#337ab7",
                "font-weight":"500",
            });
            $(this).css({
                "color":"red",
                "font-weight":"600",
            });
            switch(choseInfo){
                //获取个人资料
                case "1":
                    param = {
                        userAccount:_this.getQueryVariable("account"),
                    };
                    _this.getBaseInfo(param);
                    ;break;
                // 获取个人订单记录
                case "2":
                    param={
                        userAccount:_this.getQueryVariable("account"),
                        orderStatus:99,
                    }
                    _this.getOrderInfo(param);
                    ;break;
                // 购物车情况
                case "3":
                    param = {
                        userAccount:_this.getQueryVariable("account"),
                    };
                    _this.getShopTrolley(param);
                    ;break;
                //好友记录
                case "4":

                    param = {
                        friendingUserAccount:_this.getQueryVariable("account"),
                        friendStatus:0,
                    };
                    _this.getFriends(param);
                    ;break;
                //个人收藏
                case "5":
                    param = {
                        userAccount:_this.getQueryVariable("account"),
                        collectionStatus:0,
                    };
                    _this.getCollect(param);
                    break;
                //个人消息
                case "6":
                    param = {
                        messagingUserAccount:_this.getQueryVariable("account"),
                    };
                    _this.getCollect(param);
                    ;break;
                default:$("#showInfo").html("选择错误");break;
            }
        });

    //    评论弹窗
        $(document).on('click',".content",function () {
            $("#pinglun").show();
        })

    //    删除订单
        $(document).on('click','.delOrder',function () {
            param = {
                userOrdeId:$(this).attr("orderId"),
                orderStatus:99,
            };
            _this.delOrder(param);
        });
        //确认收货
        $(document).on('click','.accetpOrder',function () {
            param = {
                userOrdeId:$(this).attr("orderId"),
                orderStatus:3,
            };
            _this.delOrder(param);
        });
    //    删除好友
        $(document).on('click','.delFriend',function () {
            param={
                fridendId:$(this).attr("friendId"),
                friendStatus:1
            };
            _this.delFriend(param)
        });
    //    删除收藏
        $(document).on('click','.delCollect',function () {
            param = {
                collectionId:$(this).attr("collectionId"),
                collectionStatus:1,
            };
            _this.delCollect(param);
        });
    //    获取不同类型订单
        $(document).on('click','.getorderByType',function () {
            param={
                userAccount:_this.getQueryVariable("account"),
                orderStatus:$(this).attr("orderType"),
            };
            orderType = $(this).attr("orderType");
            $(".getorderByType").css({
                "color":"dodgerblue",
            });
            $(this).css({
                "color":"blue",
            });
            _this.getOrderInfo(param);
        });
    //    获取不同类型收藏
        $(document).on('click','.getCollectByType',function () {
            param = {
                userAccount:_this.getQueryVariable("account"),
                collectionType:$(this).attr("collectType"),
                collectionStatus:0,
            };
            $('.collectInfo').css({
                "color":"blue"
            });
            $(this).css({
                "color":"cornflowerblue"
            })
            _this.getCollect(param);
        });
    //    修改个人信息
        $(document).on('click','#editUserSave',function () {
            param = {
                userAccount:$("#editAccount").val(),
                userName:$("#editName").val(),
                // userPassword:$("#editPassword").val(),
                userSexy:$("#editSexy option:selected").val(),
                userPhoneNum:$("#editPhone").val(),
                userEmail:$("#editEmail").val(),
            };
            _this.editUser(param);
        });
    //    取消修改
        $(document).on('click','.cancel',function () {
            var param = {
                userAccount:_this.getQueryVariable("account"),
            };
            _this.getBaseInfo(param);
        });
    //    移出购物车
        $(document).on('click','.removeShopCart',function () {
            debugger
            param = {
                shopTrolleyId:$(this).attr("shopCartId"),
                userAccount:_this.getQueryVariable("account"),
            };
            _this.delShopCart(param);
        });
    //    购买商品
        $(document).on('click','.buy',function () {

            //获取到tr级节点
            var trNode = $(this).parent().parent();
            //获取第一个td子节点的值
            var tdNode = trNode.children(":first");
            var proName = tdNode.html();
            var shopName = tdNode.attr("shopName");
            var proPrice = tdNode.next().html();
            //.eq(0)也是获取第一个子节点
            var proNum = tdNode.next().next().children(":first").children(":first").children().eq(0).next().val();
            param = {
                userAccount:_this.getQueryVariable("account"),
                commodityName:proName,
                commodityPrice:proPrice,
                commodityNum:proNum,
                commodityId:$(this).attr("proId"),
                shopAccount:$(this).attr("shopAccount"),
                shopName:shopName,
            };
            // _this.buyProduct(param);
            // 跳转确认订单页，将商品、店铺、数量参数传入即可
            window.location.href="/EBusiness/html/front/ConfirmOrder.html?shopAccount="
            +param.shopAccount+"&productId="+param.commodityId+
                "&account="+params.userAccount+"&count="+param.commodityNum;
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

    getBaseInfo = function (param) {
        $.ajax({
            data:param,
            type:"POST",
            dataType:"JSON",
            url:ajaxUrl+"/getBaseInfo",
            success:function (data) {
                // $("#choseInfo").css({"font-weight":"bold"});
                if (data.result!=null && data.success){
                    _this.closeOther(0);
                    $("#userInfo").css({display:"block"});
                    var tmpl = $.templates("#userInfoTmpl");
                    var htmlOut = tmpl.render(data.result);
                    $("#userInfo").html(htmlOut);
                }else{
                    _this.closeOther(1,data.resultMessage)
                }
            }
        });
    };

    getOrderInfo = function (param) {
        $.ajax({
            data:param,
            type:"POST",
            dataType:"JSON",
            url:ajaxUrl+"/getOrderInfo",
            success:function (data) {
                if (data.result!=null && data.success){
                    _this.closeOther(0);
                    $("#orderInfo").css({display:"block"});
                    var tmpl = $.templates("#orderInfoTmpl");
                    var htmlOut = tmpl.render(data.result);
                    $("#orderInfoShow").html(htmlOut);
                    if (orderType!=2){
                        $(".accetpOrder").hide();
                    }
                    if (orderType!=3){
                        $(".content").hide()
                    }
                }else{
                    _this.closeOther(1,data.resultMessage);
                }
            }
        });
    };

    getFriends = function (param) {
        $.ajax({
            data:param,
            type:"POST",
            dataType:"JSON",
            url:ajaxUrl+"/getFriend",
            success:function (data) {
                if (data.result!=null && data.success &&data.result.length>0){
                    _this.closeOther(0);
                    $("#friend").css({display:"block"});
                    debugger
                    var tmpl = $.templates("#friendInfoShowTmpl");
                    var htmlOut = tmpl.render(data.result);
                    $("#friendInfoShow").html(htmlOut);
                }else{
                    _this.closeOther(1,data.resultMessage);
                }
            }
        });
    };

    getCollect = function (param) {
        $.ajax({
            data:param,
            type:"POST",
            dataType:"JSON",
            url:ajaxUrl+"/getCollect",
            success:function (data) {
                if (data.result!=null && data.success){
                    _this.closeOther(0);
                    $("#collectInfo").css({display:"block"});
                    if (data.result.length>0) {
                        var tmpl = $.templates("#collectInfoTmpl");
                        var htmlOut = tmpl.render(data.result);
                        $("#collectInfoShow").html(htmlOut);
                    }else{
                        $("#collectInfoShow").css({
                            "margin-left":"40px",
                        })
                        $("#collectInfoShow").html("   没有收藏");
                    }
                }else{
                    _this.closeOther(1,data.resultMessage,"#collectInfoShow");
                }
            }
        });
    };

    delOrder = function (param) {
        $.ajax({
            data:param,
            type:"POST",
            dataType:"JSON",
            url:ajaxUrl+"/delOrder",
            success:function (data) {
                if (data.result!=null && data.success){
                    // alert(data.resultMessage);
                    _this.closeOther(0);
                    param={
                        userAccount:_this.getQueryVariable("account"),
                        orderStatus:99,
                    }
                    _this.getOrderInfo(param);
                }else{
                    _this.closeOther(1,data.resultMessage);
                }
            }
        });
    };


    delFriend = function (param) {
        $.ajax({
            data:param,
            type:"POST",
            dataType:"JSON",
            url:ajaxUrl+"/delFriend",
            success:function (data) {
                if (data.result!=null && data.success){
                    alert(data.resultMessage);
                    _this.closeOther(0);
                    param = {
                        friendingUserAccount:_this.getQueryVariable("account"),
                        friendStatus:0,
                    }
                    _this.getFriends(param);
                }else{
                    _this.closeOther(1,data.resultMessage);
                }
            }
        });
    };

    delCollect = function (param) {
        $.ajax({
            data:param,
            type:"POST",
            dataType:"JSON",
            url:ajaxUrl+"/delCollect",
            success:function (data) {
                if (data.result!=null && data.success){
                    alert(data.resultMessage);
                    _this.closeOther(0);
                    param = {
                        userAccount:_this.getQueryVariable("account"),
                        collectionStatus:0,
                    }
                    _this.getCollect(param);
                }else{
                    _this.closeOther(1,data.resultMessage);
                }
            }
        });

    };

    editUser = function (param) {
        $.ajax({
            data:param,
            type:"POST",
            dataType:"JSON",
            url:ajaxUrl+"/updateBaseInfo",
            success:function (data) {
                if (data.result!=null && data.success){
                    alert(data.resultMessage);
                    _this.closeOther(0);
                    param = {
                        userAccount:_this.getQueryVariable("account"),
                    }
                    _this.getBaseInfo(param);
                }else{
                    _this.closeOther(1,data.resultMessage);
                }
            }
        });
    };

    getShopTrolley = function (param) {
        $.ajax({
            data:param,
            type:"POST",
            dataType:"JSON",
            url:ajaxUrl+"/getShopCart",
            success:function (data) {
                if (data.result!=null && data.success){
                    _this.closeOther(0);
                    $("#shopCart").css({
                        "display":"block",
                    });
                    //计算每条订单总金额 方便页面加载数据
                    for (var i=0;i<data.result.length;i++){
                        data.result[i].shopTrolleyExt = data.result[i].commodityPrice * data.result[i].commodityNum
                    }
                    var tmpl = $.templates("#shopCartInfoTmpl");
                    var htmlOut = tmpl.render(data.result);
                    $("#shopCartInfo").html(htmlOut);
                }else{
                    _this.closeOther(1,data.resultMessage);
                }
            }
        });
    };

    delShopCart = function (param) {
        $.ajax({
            data:param,
            type:"POST",
            dataType:"JSON",
            url:"/EBusiness/shop/delShopCart",
            success:function (data) {
                debugger
                if (data.result!=null && data.success) {
                    param = {
                        userAccount:_this.getQueryVariable("account"),
                    };
                    _this.getShopTrolley(param);
                }
            }
        });
    };

    buyProduct = function (param) {
        $.ajax({
            data:param,
            type:"POST",
            dataType:"JSON",
            url:ajaxUrl+"/delShopCart",
            success:function (data) {

                if (data.result!=null && data.success) {
                    param = {
                        userAccount:_this.getQueryVariable("account"),
                    };
                    _this.getShopTrolley(param);
                }
            }
        });

    };

    //点击某一个选项时，其余项不显示
    closeOther = function (param,data,id) {
        if (param==0){
            $(".edit").css({"display":"none"});
        }else{
            $(".edit").css({"display":"none"});
            if (id!=''&&id!=null) {
                var s = id
                alert(s)
                $(id).html(data);
            }else{
                $("#tips").html("抱歉，您还没有登录哦");
                if (data!=""){
                    $("#tips").html(data);
                }
                $("#tips").css({
                    "text-Align":"center",
                    "font-size":"30px",
                    "font-weigth":"bold",
                    "margin-top":"50px",
                    "border":"none",
                    "display":"block",
                });
            }

        }

        // $("#userInfo").css({"display":"none"});
        // $("#orderInfo").css({"display":"none"});
        // $("#friendInfo").css({"display":"none"});
        // $("#collectInfo").css({"display":"none"});
        // $("#shopCart").css({"display":"none"});
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


    exports.Init = Init();
})