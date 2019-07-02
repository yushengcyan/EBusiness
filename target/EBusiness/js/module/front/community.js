define('module/front/community',function (require,exports,module) {
    var $ = require('jquery');
    require('util/jsviews/jsrender');
    require('util/jsviews/jsviews');

    var ajaxUrl = "/EBusiness/community";
    var _this;

    //初始化方法
    var Init = function () {
        _this = this;

        //如果已经登录，则跳转页面后面加参数
        _this.judgeLog()
        var account = _this.getQueryVariable("account");
        if(account!=null||account!=''){
            $("#userCenter").attr("href",'/EBusiness/html/front/UserCenter.html?account='+account);
            $("#homePage").attr("href",'/EBusiness/html/front/HomePage.html?account='+account);
            $("#communityCenter").attr("href",'/EBusiness/html/front/Community.html?account='+account)
        }else{
            $("#userCenter").attr("href",'/EBusiness/html/front/UserCenter.html');
            $("#homePage").attr("href",'/EBusiness/html/front/HomePage.html');
            $("#communityCenter").attr("href",'/EBusiness/html/front/Community.html');
        }

    //    初始加载文章类型
        _this.getType(null);
    //    初始化加载文章 加载第一个文章类型的
        var typeParam = {
            articleTypeId:'1004',
        };
        _this.getArticle(typeParam);

        //点赞(取消点赞)
        $(document).on('click','.likeUp',function () {
            if (!_this.judgeLog()){
                return;
            }
            var account = _this.judgeLog();
            var upStatus;
            //1为未点赞，0 为点赞，
            if ($(this).attr("value")==1){
                $(this).attr("value","0");
                $(this).css({
                    "color":"#FF69B4"
                });
                upStatus=0;

            }else{
                $(this).attr("value","1");
                $(this).css({
                    "color":"#333"
                });
                upStatus=1;
            }
            param={
                articleId:$(this).attr("articleId"),
                userAccount:account,
                articleUpStatus:upStatus,
            };
            _this.editUp(param);
        });

    //    选择类别
        $(document).on('click','.typeClick',function (){
            param = {
                articleTypeId:$(this).attr("typeId"),
            };
            _this.getArticle(param);
        });

    //    收藏
        $(document).on('click','.collect',function (){
            if (!judgeLog()){
                return
            }
            var account = judgeLog();
            param = {
                collectionType:2,
                userAccount:account,
                collectedAccout:$(this).attr("articleId"),
                collectionExt:$(this).parent().prev().children(":first").html(),
                collectionRemark:$(this).parent().prev().children(":first").html(),
            };
            _this.addCollect(param);
        });
    //    查看文章详情
        $(document).on('click','.liClick',function () {
            debugger
            var account = _this.judgeLog();
            var url;
            if (!account){
                url = "/EBusiness/html/front/articleDetail.html?article="+$(this).attr("articleId");
            }else{
                url = "/EBusiness/html/front/articleDetail.html?article="+$(this).attr("articleId")
                +"&account="+account;
            }
            // window.location.href="/EBusiness/html/front/articleDetail.html?article="+$(this).attr("articleId")
            //     +"&account="+account;
            window.open(url)
        });
    //    搜索内容
        $(document).on('click','#searchPro',function () {

            param = {
                articleTitle:$("#searchContent").val(),
            }
            _this.getArticle(param);
        });
    //    评论 动态生成一个悬浮框
        $(document).on('click','.comment',function () {
            //获取当前点击按钮位置
            $("#commentFloat").css("left",$(this).offset().left+50);
            $("#commentFloat").css("top",$(this).offset().top+35);
            $("#commentFloat").show();
            //将文章id属性传给评论按钮
            var tid = $(this).attr("articleId");
            $("#addComment").attr("articleId",tid);
            $("#addComment").attr("author",$(this).attr("author"));
            // _this.getArticle(param);
        });
    //    取消评论
        $(document).on('click','.cancel',function () {
            $("#commentFloat").hide();
            $("#articleFloat").hide();
        });
        //发布评论
        $(document).on('click','#addComment',function () {

            //获取当前点击按钮位置
            if (!account){
                alert("抱歉，您还未登录，不能进行评论")
                return
            }
            param = {
                articleId:$(this).attr("articleId"),
                authorAccount:$(this).attr("author"),
                userAccount:account,
                articleCommentContent:$("#commentcontent").val(),
            }
            _this.addComment(param);
        });

    //    弹出发布文章弹窗
        $(document).on('click','#showRelease',function (){
            if(!account){
                alert("抱歉，您还未登录哦");
                return
            }
            $("#articleFloat").show();
        })
    //    发布文章时搜索商品
        $(document).on('click','#search',function (){
            param = {
                commodityName:$("#searchKey").val(),
            }
            _this.getProduct(param);
        });
        $(document).on('change','#searchKey',function (){
            debugger
            param = {
                commodityName:$("#searchKey").val(),
            }
            _this.getProduct(param);
        });

        //    发表文章
        $(document).on('click','#addArticle',function () {
            var content = $("#releaseContent").val();
            if(content==""||content==null){
                alert("您还未写入任何内容哦");
                return
            }
            param = {
                userAccount:account,
                articleTitle:$("#releaseTitle").val(),
                articleComtent:$("#releaseContent").val(),
                articleTypeId:$("#articleType option:selected").val(),
                productId:$("#productId option:selected").val(),
            }
            _this.addArticle(param);
        });


    };

    getType = function (param) {
        $.ajax({
            data:param,
            type:"POST",
            dataType:"JSON",
            url:ajaxUrl+"/getType",
            success:function (data) {
                if (data.success && data.result!=null && data.result.length>0){
                    var tmpl = $.templates("#typeTmpl");
                    var htmlOut = tmpl.render(data.result);
                    $("#type").html(htmlOut);
                //    将文章类型渲染到发布文章中
                    var temp = $.templates("#articleTypeTmpl");
                    var result = temp.render(data.result);
                    $("#articleType").append(result);
                }
            }
        });
    };

    getArticle = function (param) {
        $.ajax({
            data:param,
            type:"POST",
            dataType:"JSON",
            url:ajaxUrl+"/getArticle",
            success:function (data) {
                if (data.success && data.result!=null && data.result.length>0){
                    var tmpl = $.templates("#articleTmpl");
                    var htmlOut = tmpl.render(data.result);
                    $("#article").html(htmlOut);
                }else{
                    var htmlOut = "<li style='border: none;font-size: 22px;text-align: center'><div><strong>"+data.resultMessage+"</strong></div></li>"
                    $("#article").html(htmlOut);
                }
            }
        });
    };

    editUp = function (param) {
        $.ajax({
            data:param,
            type:"POST",
            dataType:"JSON",
            url:ajaxUrl+"/likeUp",
            success:function (data) {
                if (data.success && data.result!=null &&data.result !=-1){
                    $(this).attr("value",data.result);
                }
            }
        });
    };

    addCollect = function (param) {
        $.ajax({
            data:param,
            type:"POST",
            dataType:"JSON",
            url:ajaxUrl+"/addCollect",
            success:function (data) {
                alert(data.resultMessage);
            }
        });
    };

    addComment = function (param) {
        $.ajax({
            data: param,
            type: "POST",
            dataType: "JSON",
            url: ajaxUrl+"/addComment",
            success: function (data) {

                if (data.success && data.result != null&&data.result>0) {
                    alert("评论成功");
                    $("#commentFloat").hide();
                }else{
                    alert("评论失败,请重新评论")
                }
            }
        })
    };

    getProduct = function (param) {
        $.ajax({
            data: param,
            type: "POST",
            dataType: "JSON",
            url: "/EBusiness/shop/getProduct",
            success: function (data) {
                debugger
                if (data.success && data.result!=null && data.result.length>0){
                    var tmpl = $.templates("#productIdTmpl");
                    var htmlOut = tmpl.render(data.result);
                    $("#productId").append(htmlOut)
                }
            }
        });
    };

    addArticle = function (param) {
        debugger
        $.ajax({
            data: param,
            type: "POST",
            dataType: "JSON",
            url: ajaxUrl+"/addArticle",
            success: function (data) {
                debugger
                if (data.success && data.result != null&&data.result>0) {
                    alert("发表成功");
                    $("#articleFloat").hide();
                    //发布成功后将弹窗内容值清空
                    $("#releaseTitle").val("");
                    $("#releaseContent").val();
                    $("#searchKey").val();
                    var typeParam = {
                        articleTypeId:'1004',
                    };
                    _this.getArticle(typeParam);

                }else{
                    alert("发布失败，请重试")
                }
            },
            error:function () {
                alert("调用失败")
            }
        })
    }


    //判断用户是否登录
    judgeLog = function () {
        var role = _this.getQueryVariable("account");
        //未登录
        if (!role){
            alert("对不起，您还未登录哦！");
            return(false);
        }else{
            return(role);
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

    exports.Init = Init();
})