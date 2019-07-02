define('module/front/logIn',function (require,exports,module) {
    var $ = require('jquery');
    require('util/MD5/md5.js');

    var _this;
    var ajaxUrl = "/EBusiness/userLog";

    var Init = function () {
        _this = this;
        //登录点击事件
        $(document).on('click','#logIn',function () {
            $(".tip").html();
            if ($('#name').val() == '' || $('#pwd').val() == '') {
                $("#tip").html("账号或密码不能为空");
                $('#tip').show();
                return
            } else {
                //对密码加密处理
                var data = {
                    userAccount: $('#name').val(),
                    userPassword: md5($('#pwd').val())
                };
                _this.logIn(data)
            }
        });
    //    弹出忘记密码框
        $(document).on('click','#forgetPwd',function () {
            $(".logBlock").hide();
            $(".remBlock").css({display:"block"});
        });
    //    找回密码事件
        $(document).on('click','#remAccount',function () {
            $(".tip").html();
            if ($("#raccount").val()==""){
                $(".tip").html("账号不能为空");
                return
            }
            if ($("#phone").val()==""){
                $(".tip").html("手机号不能为空");
                return
            }
            if ($("#rpwd").val() != $("#rcpwd").val()){
                $(".tip").html("密码不一致")
                return
            }
            param = {
                userAccount:$("#raccount").val(),
                userPhoneNum:$("#phone").val(),
                userPassword:md5($("#rpwd").val()),
            }
            _this.rememberPwd(param);
        });
    //    取消事件
        $(document).on('click','.cancel',function () {
            $("#raccount").val("");
            $("#phone").val("");
            $("#rpwd").val("");
            $("#rcpwd").val("");
        });
    };

    logIn = function (param) {
        $.ajax({
            async: false,
            type: "POST",
            url:ajaxUrl+"/logIn",
            data: param,
            success: function (data) {
                if(typeof (data) != 'undefined'){
                    debugger
                    if (data.success){
                        debugger
                        //登录成功返回上层页面 若没有上层页面或上层页面为注册页，则返回首页
                        // if(document.referrer=="" ||
                        //     document.referrer=='/EBusiness/html/front/register.html' ||
                        //     document.referrer==window.location.href||
                        //     document.referrer=='/EBusiness/html/front/register.html'){
                        //     window.location.href= "/EBusiness/html/front/HomePage.html?account="+data.result.userAccount;
                        // }else{
                        //     // alert(window.location.href=document.referrer)
                        //     window.location.href=document.referrer+"?account="+param.userAccount;
                        //
                        // }
                        //     window.location.href=document.referrer+"?account="+param.userAccount;
                            window.location.href= "/EBusiness/html/front/HomePage.html?account="+data.result.userAccount;


                    }else{
                        $(".tip").html(data.resultMessage);
                        $('.tip').show();
                    }
                }
            },
            error:function () {
                alert("调用失败")
            },
        });
        return false;
    };

    rememberPwd = function (param) {
        $.ajax({
            type: "POST",
            data: param,
            dataType:"JSON",
            url:ajaxUrl+"/forgetPwd",
            success: function (data) {
                if (data.success && data.result>0){
                    alert("更改成功")
                    $(".remBlock").hide();
                    $(".logBlock").css({display:"block"});
                }else{
                    $(".tip").html(data.resultMessage);
                }
            },
            error:function () {
                alert("调用失败")
            }
        })
    }

    exports.Init = Init();
})