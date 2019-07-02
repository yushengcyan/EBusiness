define('module/backStage/Manager',function (require,exports,module) {
    //引入依赖
    var $ = require('jquery');

    require('util/jsviews/jsrender');
    require('util/jsviews/jsviews');
    require('util/MD5/md5.js');

    var ajaxurl = '/EBusiness/BackStage';
    var _this;

    //初始化方法
    var Init = function () {
        _this = this;

        _this.getAdminInfo();
        _this.getRole();
        //搜索点击事件
        $(document).on('click','#search',function () {
            param = {
                adminAccount:$("#searchAdmin").val(),
                adminLevel:$("#adminLevel option:selected").val(),
            }
            _this.getAdminInfo(param);
        })
        //删除点击事件
        $(document).on('click','.btnDel',function () {
            param = {
                adminAccount:$(this).attr("adminAccount"),
            };
            _this.delAdmin(param);
        });
        //新增事件
        $(document).on('click','#addAdmin',function () {
            param = {
                adminAccount:$("#searchAdmin").val(),
                adminPassword:md5($("#password").val()),
                adminLevel:$("#adminLevel option:selected").val(),
            };
            _this.addAdmin(param);
        });
        //取消点击事件
        $(document).on('click','.cancle',function () {
            $("#password").val("");
            $("#searchAdmin").val("");
            $("#adminLevel option:selected").val("");
            //编辑弹窗隐藏
            $("#editAdmin").hide();
        });
        //编辑事件
        $(document).on('click','.btnEdit',function () {
            param = {
                adminAccount:$(this).attr("adminAccount"),
            };
            _this.editSearch(param);
        });
        //编辑保存
        $(document).on('click','#editSava',function () {
            param = {
                adminAccount:$("#editAccount").val(),
                adminPassword:$("#editPassword").val(),
                adminLevel:$("#editLevel option:selected").val(),
            };
            _this.editSave(param);
        })
    };

    getAdminInfo = function (param) {
        $.ajax({
            type:"POST",
            data:param,
            dataType:"JSON",
            url:ajaxurl+"/listAdmin",
            success:function (data) {
                var template = $.templates("#ManagerListTmpl");
                var htmlOut = template.render(data.result);
                $("#ManagerList").html(htmlOut);
            },
            error:function () {
                alert("调用失败");
            }
        })
    }
    delAdmin = function (param) {
        $.ajax({
            data:param,
            type:"POST",
            dataType:"JSON",
            url:ajaxurl+"/delAdmin",
            success:function (data) {
                if (data.success && typeof (data)!='undefined'){
                    alert("删除成功");
                    $("#search").click();
                }
            },
            error:function () {
                alert("删除失败");
            }
        });
    };
    addAdmin = function (param) {
        $.ajax({
            data:param,
            type:"POST",
            dataType:"JSON",
            url:ajaxurl+"/addAdmin",
            success:function (data) {
                debugger
                if (data.success && typeof (data)!='undefined'){
                    alert("新增成功");
                    $("#search").click();
                }else{
                    alert(data.resultMessage);
                }
            },
            error:function () {
                alert("调用失败");
            }
        });
    }

    //获取角色权限
    getRole = function (param) {
        $.ajax({
            data:param,
            type:"POST",
            dataType:"JSON",
            url:ajaxurl+"/getRole",
            success:function (data) {
                if (data.success && typeof (data)!='undefined'){
                    var template = $.templates("#adminRoleTmpl");
                    var htmlOut = template.render(data.result);
                    $("#adminRole").html(htmlOut);
                }else{
                    alert("无角色权限关系");
                }
            },
            error:function () {
                alert("查询失败");
            }
        });
    }

    editSearch = function (param) {
        $("#editAdmin").show();
        $.ajax({
            type:"POST",
            data:param,
            dataType:"JSON",
            url:ajaxurl+"/listAdmin",
            success:function (data) {
                var template = $.templates("#editTmpl");
                var htmlOut = template.render(data.result);
                $("#editAdmin").html(htmlOut);
            },
            error:function () {
                alert("调用失败");
            }
        })

    };
    editSave = function (param) {
        debugger
        $.ajax({
            data:param,
            type:"POST",
            dataType:"JSON",
            url:ajaxurl+"/editAdmin",
            success:function (data) {
                debugger
                if (data.success && typeof (data)!='undefined'){
                    alert("修改成功");
                    $("#editAdmin").hide();
                    $("#search").click();
                }
            },
            error:function () {
                alert("修改失败");
            }
        });
    }
    //对外暴露接口
    exports.Init = Init();

})