/**
 * Created by ZLL on 2019/4/16.
 */

define('module/backStage/logInBack',function (require,exports,module) {
    var $ = require('jquery');
    //引入MD5.js
    require('util/MD5/md5.js');

    var _this;
    var Init = function () {
        _this = this;
        $(document).on('click','#submit',function () {
            if ($('#username').val() == '' || $('#password').val() == '') {
                var s = $("#tip").val();
                $('#tip').show();
                alert("帐号或密码不能为空")
                return
            } else {
                //对密码加密处理
                var data = {
                    adminAccount: $('#username').val(),
                    adminPassword: md5($('#password').val())
                };
                _this.logIn(data)
            }
        });
    };
    logIn = function (data) {
        $.ajax({
            async: false,
            type: "POST",
            url:'/EBusiness/BackStage/logIn',
            data: data,
            success: function (data) {

                if(typeof (data) != 'undefined'){
                    if (data.success){
                        //登录成功进行页面的跳转
                        window.location.href="/EBusiness/html/backStage/backStage.html"
                    }else{
                        alert(data.resultMessage);
                        $("#tip").val=date.resultMessage;
                        $('#tip').show();
                    }
                }
            },
            error:function () {
                alert("调用失败")
            },
        })
    }

    exports.Init = Init();
})
