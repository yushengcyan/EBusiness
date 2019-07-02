define('module/backStage/UserManage',function (require,exports,module) {
    var $ = require('jquery');

    require('util/jsviews/jsrender');
    require('util/jsviews/jsviews');
    require('util/MD5/md5');

    var ajaxUrl = '/EBusiness/BackStage';
    var _this;
    //该变量方便与删除某些东西后重新加载页面时出发点击查看事件
    var account;

    var Init = function () {
        _this = this;
        // //隐藏初始化加载时不显示部分
        // $("#orderManage").hide();
        //初始化加载数据  页面初始化时只加载用户列表，用户收藏、好友、订单等都不加载
        //管理员点击查看用户信息时才加载用户的订单、收藏、订单等信息
        //加载部分用户信息
        _this.getUser();
        //搜索用户
        $(document).on('click','#btnSearchUser',function () {
            param = {
                userAccount:$("#userAccountSearch").val(),
                userName:$("#userNameSearch").val(),
            }
            _this.getUser(param);
        });
        //点击查看用户 加载订单，收藏
        $(document).on('click','.btnGet',function () {
            account = $(this).attr("userAccount");
            param = {
                userAccount:$(this).attr("userAccount"),
            };
            friendParam = {
                friendingUserAccount:$(this).attr("userAccount"),
            };
            //加载订单
            _this.getOrder(param);
            //加载好友列表
            _this.getFriend(friendParam);
            //加载收藏列表
             _this.getFocus(param);
        });
        //订单搜索
        $(document).on('click','#btnOrderSearch',function () {
            param = {
                userOrdeId:$("#productIdSearch").val(),
                userAccount:$("#orderUAccountSearch").val(),
                merchantAccount:$("#orderSAccountSearch").val(),
                commodityName:$("#orderPNameSearch").val(),
            }
            _this.getOrder(param);
        });

        //删除用户
        $(document).on('click','.btnDel',function () {
            param = {
                userAccount: $(this).attr("userAccount"),
            }
            _this.delUser(param);
        });
        //修改用户资料
        $(document).on('click','.btnEdit',function () {
            param = {
                userAccount: $(this).attr("userAccount"),
            };
            _this.editSearch(param);
        });
        $(document).on('click','#editUserSave',function () {
            param = {
                userAccount:$("#editAccount").val(),
                userName:$("#editName").val(),
                userPassword:$("#editPassword").val(),
                userSexy:$("#editSexy").val(),
                userPhoneNum:$("#editPhone").val(),
                userEmail:$("#editEmail").val(),
                userAccountStatus:$("#userStatus").val(),
                userIntegral:$("#editScore").val(),
                userLevelId:$("#editLevel").val(),
            };
            _this.editUserSave(param);
        })

        //新增用户
        $(document).on('click','#btnAddUser',function () {
            $("#addUser").show();
        });
        $(document).on('click','#addSave',function () {
            param = {
                userAccount:$("#addAccount").val(),
                userName:$("#addName").val(),
                userPassword:md5($("#addPassword").val()),
                userSexy:$("#addSexy option:selected").val(),
                // userBirthday:$("#addBirth").val(),
                userPhoneNum:$("#addPhone").val(),
                userEmail:$("#addEmail").val(),
                userIntegral:$("#addScore").val(),
                userLevelId:$("#addLevel").val(),
            };
            _this.addUser(param);
        });

        //取消点击事件
        $(document).on('click','.cancel',function () {
            $("#addUser").hide();
            $("#editUser").hide();
        });
        
        //删除好友
        $(document).on('click','.btnDelFriend',function () {
            paramFriend = {
                friendingUserUccount:$(this).attr("accounting"),
                friendedUserAccount:$(this).attr("accounted"),
            };
            param = {
                userAccount:$(this).attr("accounting"),
            };
            _this.delFriend(paramFriend);
            _this.getFriend(param);
        });
        //删除订单
        $(document).on('click','.btnDelOrder',function () {
            param = {
                userOrdeId:$(this).attr("orderId"),
            };
            _this.delOrder(param);
        })
        //删除收藏
        $(document).on('click','.btnDelCollect',function () {
            param = {
                collectionId:$(this).attr("collectId"),
            };
            _this.delFocus(param);
        })
    }

//    搜索订单
//    搜索用户
    getUser = function (param) {
        $.ajax({
            data:param,
            type:"POST",
            dataType:"JSON",
            url:ajaxUrl+"/getUser",
            success:function (data) {
                if (data.success && typeof (data)!='undefined'){
                    var temp = $.templates("#userListTmpl");
                    var htmlOut = temp.render(data.result);
                    $("#userList").html(htmlOut);
                }
            }
        })
    };
    getOrder = function (param) {
        //改变订单显示样式，使订单列表显示
        $("#orderManage").css({display:"block"});
        $.ajax({
            data:param,
            type:"POST",
            dataType:"JSON",
            url:ajaxUrl+"/getOrder",
            success:function (data) {
                if (data.success && typeof (data)!='undefined'){
                    var temp = $.templates("#orderListTmpl");
                    var htmlOut = temp.render(data.result);
                    $("#orderList").html(htmlOut);
                }
            }
        })
    }
    getFriend = function (param) {
        $.ajax({
            data:param,
            type:"POST",
            dataType:"JSON",
            url:ajaxUrl+"/getFriend",
            success:function (data) {
                if (data.success && typeof (data)!='undefined'&&data.result.length>0){
                    //当没有好友时不显示该模块
                    $("#friendManage").css({display:"block"});
                    var temp = $.templates("#friendListTmpl");
                    var htmlOut = temp.render(data.result);
                    $("#friendList").html(htmlOut);
                }
            },
            error:function () {
                alert("查询失败")
            }
        })
    }
    getFocus = function (param) {
        $.ajax({
            data:param,
            type:"POST",
            dataType:"JSON",
            url:ajaxUrl+"/getCollect",
            success:function (data) {
                if (data.success && typeof (data)!='undefined' && data.result.length>0){
                    //当没有收藏时不显示该模块
                    $("#focusManage").css({display:"block"});
                    var temp = $.templates("#collectListTmpl");
                    var htmlOut = temp.render(data.result);
                    $("#collectList").html(htmlOut);
                }
            }
        })
    }

    editUserSave = function (param) {
        $.ajax({
            data:param,
            type:"POST",
            dataType:"JSON",
            url:ajaxUrl+"/editUser",
            success:function (data) {
                if (data.success && typeof (data)!='undefined'){
                    debugger
                    alert("修改成功");
                    $("#editUser").hide();
                    $("#btnsearchuser").click();
                }else {
                    alert("修改失败")
                }
            }
        })
    }
    delUser = function (param) {
        $.ajax({
            data:param,
            type:"POST",
            dataType:"JSON",
            url:ajaxUrl+"/delUser",
            success:function (data) {
                if (data.success && typeof (data)!='undefined'){
                    alert("删除成功");
                    $("#btnSearchUser").click();
                }
            }
        })
    }
    addUser = function (param) {
        $.ajax({
            data:param,
            type:"POST",
            dataType:"JSON",
            url:ajaxUrl+"/addUser",
            success:function (data) {
                if (data.success && typeof (data)!='undefined'){
                    alert("新增成功");
                    $("#addUser").hide();
                    $("#btnSearchUser").click();
                }else {
                    alert("新增失败")
                }
            },
            error:function () {
                alert("调用失败")
            }
        })
    }

    delFriend = function (param) {
        $.ajax({
            data:param,
            type:"POST",
            dataType:"JSON",
            url:ajaxUrl+"/delFriend",
            success:function (data) {
                if (data.success && typeof (data)!='undefined'){
                    alert("删除成功");
                    var friendParam = {
                        friendingUserAccount:account,
                    };
                    _this.getFriend(friendParam)
                }
            }
        })
    }
    delOrder = function (param) {
        $.ajax({
            data:param,
            type:"POST",
            dataType:"JSON",
            url:ajaxUrl+"/delOrder",
            success:function (data) {
                if (data.success && typeof (data)!='undefined'){
                    debugger
                    alert("删除成功");
                    var param = {
                        userAccount:account,
                    };
                    _this.getOrder(param);
                }else {
                    alert("删除失败")
                }
            }
        })
    }
    delFocus = function (param) {
        $.ajax({
            data:param,
            type:"POST",
            dataType:"JSON",
            url:ajaxUrl+"/delCollect",
            success:function (data) {
                if (data.success && typeof (data)!='undefined'){
                    alert("删除成功");
                    var param = {
                        userAccount:account,
                    };
                    _this.getFocus(param);
                }else {
                    alert("删除失败")
                }
            }
        })
    }

    //编辑弹窗加载数据
    editSearch = function (param) {
        $("#editUser").show();
        $.ajax({
            data:param,
            type:"POST",
            dataType:"JSON",
            url:ajaxUrl+"/getUser",
            success:function (data) {
                if (data.success && typeof (data)!='undefined'){
                    var temp = $.templates("#editUserTmpl");
                    var htmlOut = temp.render(data.result);
                    $("#editUser").html(htmlOut);
                }
            }
        })
    }
    exports.Init = Init();

})