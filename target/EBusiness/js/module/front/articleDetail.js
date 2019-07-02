define('module/front/articleDetail',function (require,exports,module) {
    var $ = require('jquery');
    require('util/jsviews/jsrender');
    require('util/jsviews/jsviews');

    var ajaxUrl = "/EBusiness/community";
    var _this;

    //初始化方法
    var Init = function () {
        _this = this;
    //    获取用户名，若未登录则无法进行评论等操作

        var account = judgeLog();
        //加载路径地址
        if(!account){
            $("#userCenter").attr("href",'/EBusiness/html/front/UserCenter.html');
            $("#homePage").attr("href",'/EBusiness/html/front/HomePage.html');
            $("#communityCenter").attr("href",'/EBusiness/html/front/Community.html');
        }else{
            $("#userCenter").attr("href",'/EBusiness/html/front/UserCenter.html?account='+account);
            $("#homePage").attr("href",'/EBusiness/html/front/HomePage.html?account='+account);
            $("#communityCenter").attr("href",'/EBusiness/html/front/Community.html?account='+account)
        }
        //    初始加载文章信息
        var titleParam = {
            articleId: _this.getQueryVariable("article"),
        };
        _this.getArticle(titleParam);
        //加载文章评论
        _this.getComment(titleParam)

    //    关注(取关)用户
        $(document).on('click','#addFocus',function () {
            debugger
            if (!account){
                alert("您还未登录哦，请先登录");
                return
            }
            param = {
                friendingUserAccount:account,
                friendedUserAccount:$(this).attr("account"),
                friendedUserName:$(this).parent().prev().prev().children().eq(1).val(),
                friendStatus:$(this).attr("focusStatus"),
            }
            _this.Focus(param)
        });
        //新增评论
        $(document).on('click','#addComment',function (){
            if (!account){
                alert("您还没有登录哦，请先登录");
                return
            }
            param = {
                articleId:$("#title").attr("articleId"),
                authorAccount:$("#author").attr("author"),
                userAccount:account,
                articleCommentContent:$("#comment").html(),
            }
            _this.addComment(param);
        });


    };
    getArticle = function (param) {
        $.ajax({
            data:param,
            type:"POST",
            dataType:"JSON",
            url:ajaxUrl+"/getArticle",
            success:function (data) {
                debugger
                if (data.success && data.result!=null && data.result.length>0){
                    // $("#title").html(data.result[0].articleTitle);
                    // $("#articleContent").html(data.result[0].articleComtent);
                    // $("#author").html();
                    // $("#").html();
                    var tmpl = $.templates("#articleTmpl");
                    var htmlOut = tmpl.render(data.result[0]);
                    $("#article").html(htmlOut);
                    //若没登录
                    if(!_this.judgeLog()){
                        //商品地址
                        $("#proInfo").attr("href","/EBusiness/html/front/HomePage.html?productId="+
                            data.result[0].productId);
                    }else{
                        $("#proInfo").attr("href","/EBusiness/html/front/HomePage.html?productId="+
                            data.result[0].productId+"&account="+_this.judgeLog());
                    }

                //    加载作者信息
                    var param = {
                        userAccount:$("#author").attr("author"),
                    };
                    _this.getAutorInfo(param);
                }else{
                    var htmlOut = "<li style='border: none;font-size: 22px;text-align: center'><div><strong>"+data.resultMessage+"</strong></div></li>"
                    $("#article").html(htmlOut);
                }
            }
        });
     }

    // 获取作者信息
    getAutorInfo = function (param) {
        $.ajax({
            data: param,
            type: "POST",
            dataType: "JSON",
            url: "/EBusiness/userInfo/getBaseInfo",
            success: function (data) {
                if (data.success && data.result != null ) {
                    var tmpl =  $.templates("#authorInfoTmpl");
                    var htmlOut = tmpl.render(data.result);
                    $("#authorInfo").html(htmlOut);
                }
            }
        });
    };

    getComment = function (param) {
        debugger
        $.ajax({
            data:param,
            type:"POST",
            dataType:"JSON",
            url:ajaxUrl+"/getComment",
            success:function (data) {
                debugger
                if (data.success && data.result!=null && data.result.length>0){
                    var tmpl = $.templates("#commentInfoTmpl");
                    var htmlOut = tmpl.render(data.result);
                    $("#commentInfo").html(htmlOut);

                }else{
                    var htmlOut = "<li style='border: none;font-size: 22px;text-align: center'><div><strong>"+data.resultMessage+"</strong></div></li>"
                    $("#commentInfo").html(htmlOut);
                }
                //判断是否登录，用以方便后续判断用户是否关注作者
                if (!_this.judgeLog()){
                    return
                }else{
                    param = {
                        friendedUserAccount:$("#author").attr("author"),
                        friendingUserAccount:_this.judgeLog(),
                        friendStatus:0,
                    };
                    _this.judgeFocus(param);
                }
            }
        });
    }

    //是否关注
    Focus = function (param) {
        debugger
        $.ajax({
            data: param,
            type: "POST",
            dataType: "JSON",
            url: "/EBusiness/community/Focus",
            success: function (data) {
                debugger
                if (data.success && data.result != null) {
                    if (data.result==0){
                        $("#addFocus").html("已关注");
                        $("#addFocus").attr("focusStatus","0");
                    }else{
                        $("#addFocus").html("关注");
                        $("#addFocus").attr("focusStatus","1");
                    }

                }else{
                    alert("关注用户失败")
                }
            }
        })
    };

    //评论
    addComment = function (param) {
        $.ajax({
            data: param,
            type: "POST",
            dataType: "JSON",
            url: ajaxUrl+"/addComment",
            success: function (data) {
                debugger
                if (data.success && data.result != null&&data.result>0) {
                    alert("评论成功");
                    var titleParam = {
                        articleId: _this.getQueryVariable("article"),
                    };
                    _this.getComment(titleParam)
                }else{
                    alert("评论失败")
                }
            }
        })
    };

    //判断是否已经关注作者
    judgeFocus = function (param) {
        debugger
        $.ajax({
            data: param,
            type: "POST",
            dataType: "JSON",
            url: "/EBusiness/userInfo/getFriend",
            success: function (data) {
                debugger
                if (data.success && data.result != null&&data.result.length>0) {
                //    已经关注
                    $("#addFocus").html("已关注");
                    $("#addFocus").attr("focusStatus","0");
                }else{
                    $("#addFocus").html("关注")
                    $("#addFocus").attr("focusStatus","1");
                }
            }
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
