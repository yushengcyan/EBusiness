define('module/front/register',function (require,exports,module) {
    var $ = require('jquery');
    require('util/MD5/md5');

    var ajaxUrl = "/EBusiness/userInfo"
    var _this;
    var Init = function () {
        _this = this;
        //注册事件
        $(document).on('click','#register',function () {
            if($("#pwd").val() != $("#pwdC").val()){
                $("#tips").html("两次账号密码不一样");
                $("#tips").show();
                return
            }else {
                param = {
                    userAccount:$("#name").val(),
                    userPhoneNum:$("#phone").val(),
                    userPassword:md5($("#pwd").val()),
                };
                _this.register(param);
            }
        });

        $(document).on('change','#pwd,#pwdC,#phone,#name',function () {
            $("#tips").html("");
        })
    //    判断手机号是否已经被注册
        $(document).on('change','#phone',function () {
            param = {
                userPhoneNum:$("#phone").val(),
            };
            _this.isExist(param);
        });
        //判断账号是否已经被注册
        $(document).on('change','#name',function () {
            param = {
                userAccount:$("#name").val(),
            };
            _this.isExist(param);
        });
    };
    register = function (param) {
        $.ajax({
            data:param,
            type:"POST",
            dataType:"JSON",
            async:false,
            url:ajaxUrl+"/addUser",
            success:function (data) {
                if (typeof (data) != 'undefined' && data.success){
                    alert("注册成功,即将进入登录页面");
                    window.location.href="/EBusiness/html/front/logIn.html"
                }else {
                    alert("注册失败")
                }
            },
            error:function () {
                alert("调用失败")
            }
        });
    };

    isExist = function (param) {
        $.ajax({
            data:param,
            type:"POST",
            dataType:"JSON",
            async:false,
            url:ajaxUrl+"/getBaseInfo",
            success:function (data) {
                if (typeof (data) != 'undefined' && data.success){
                    $("#tips").html("手机号或账号已被注册")
                }else {

                }
            },
            error:function () {
                alert("调用失败")
            }
        });
    }

    exports.Init = Init();
})