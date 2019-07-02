/**
 * Created by ZLL on 2019/4/21.
 */
define('module/backStage/shopMall',function (require,exports,module) {
    //通过require引入依赖

    var $ = require('jquery');
    // jQuery.noConflict();

    //引入渲染jsrender.js
    require('util/jsviews/jsrender');
    require('util/jsviews/jsviews');
    // require('util/jsviews.min');
    // require('util/jsrender.min');


    var ajaxUrl = '/EBusiness';
    var _this;

    var Init = function () {
        _this = this;
        //初次加载页面所需加载方法
        _this.searchProduct();
        _this.searchShop();


        //店铺查找点击事件
        $(document).on('click','#btnSearchShop',function () {
            param = {
                shopAccount:$("#shopAccountSearch").val(),
                shopName:$("#shopNameSearch").val(),
                shopUserAccout:$("#shopUserAccountSearch").val(),
                shopUserName:$("#shopUserAccountSearch").val(),
            }
        _this.searchShop(param);
        });
        //店铺编辑事件
        $(document).on('click','.btnEditS',function () {
            param = {
                shopAccount:$(this).attr("shopAccount"),
            };
            _this.editSearch(param);
        });
        //取消保存事件
        $(document).on('click','.editCancle',function () {
            $("#editShop").hide();
            $("#editProduct").hide();
            $("#addShop").hide();
            $("#addProduct").hide();
        });
        //店铺修改保存事件
        $(document).on('click','#editShopSave',function () {
            param = {
                shopAccount:$("#editSAccount").val(),
                shopName:$("#editSName").val(),
                shopUserName:$("#editUName").val(),
                shopUserAccount:$("#editUAccount").val(),
                shopLevel:$("#editSLevel").val(),
                shopMoney:$("#editSMoney").val(),
                shopNumber:$("#editSNumber").val(),
                shopStatus:$("#editSStatus").val(),
                shopStartTime:$("#editSStartTime").val(),
            };
            _this.saveEditShop(param);
        });
        //新增店铺
        $(document).on('click','#btnAddShop',function () {
            $("#addShop").show();
        });
        $(document).on('click','#addShopSave',function () {
            param = {
                shopName:$("#addSName").val(),
                shopUserName:$("#addUName").val(),
                shopUserAccount:$("#addUAccount").val(),
                shopLevel:$("#addSLevel").val(),
                shopMoney:$("#editSMoney").val(),
                shopNumber:$("#editSNumber").val(),
                shopStatus:$("#addSStatus").val(),
                // shopStartTime:$("#addSStartTime").val(),
            };
            _this.addShop(param);
        })
        //店铺删除事件
        $(document).on('click','.btnDelS',function () {
            param = {
                shopAccount:$(this).attr("shopAccount"),
            };
            _this.delShop();
        });

        //商品查找事件
        $(document).on('click','#btnProSearch',function () {
            param = {
                commodityId:$("#productIdSearch").val(),
                commodityName:$("#productNameSearch").val(),
            };
            _this.searchProduct(param)
        });
        //商品编辑页加载
        $(document).on('click','.btnEdit',function () {
            param = {
                commodityId:$(this).attr("commodityId"),
            };
            _this.editSearchPro(param);
        });
        $(document).on('click','#editProSave',function () {
            param = {
                commodityId:$("#editPId").val(),
                commodityName:$("#editPName").val(),
                commodityTypeId:$("#editPType").val(),
                commodityPrice:$("#editPPrice").val(),
                commodityStatus:$("#editPStatus").val(),
                commodityDesc:$("#editPDesc").val(),
                commoditySize:$("#editPSize").val(),
                commodityColor:$("#editPColor").val(),
            };
            _this.editProduct(param);
        })
        //新增商品弹窗
        $(document).on('click','#btnProAdd',function () {
            $("#addProduct").show();
        })
        //新增商品保存
        $(document).on('click','#addProSave',function () {
            param = {
                commodityName:$("#addPName").val(),
                commodityTypeId:$("#addPType").val(),
                commodityPrice:$("#addPPrice").val(),
                commodityStatus:$("#addPStatus").val(),
                commodityDesc:$("#addPDesc").val(),
                commoditySize:$("#addPSize").val(),
                commodityColor:$("#addPColor").val(),
            }
            _this.addProduct(param);
        })
        //商品删除
        $(document).on('click','.btnDel',function () {
            param = {
                commodityId:$(this).attr("commodityId"),
            };
            _this.delProduct(param);
        })
    };

    //查找店铺
    searchShop = function (param) {
        $.ajax({
            data:param,
            type:"POST",
            dataType:"JSON",
            url:ajaxUrl+"/BackStage/getShopInfo",
            success:function (date) {
                var htmlOut = $("#shopListTmpl").render(date.result);
                $("#shopList").html(htmlOut);

            },
            error:function () {
                alert("失败")
            }
        })
    };

    //编辑页面加载数据
    editSearch = function (param) {
        $("#editShop").show();
        $.ajax({
            type:"POST",
            dataType:"JSON",
            data:param,
            url:ajaxUrl+"/BackStage/getShopInfo",
            success:function (data) {
                var template = $.templates("#editShopTmpl");
                var htmlOut = template.render(data.result);
                $("#editShop").html(htmlOut);
            }
        })
    };
    saveEditShop = function (param) {
        $.ajax({
            data:param,
            type:"POST",
            dataType:"JSON",
            url:ajaxUrl+"/BackStage/editShop",
            success:function (data) {
                if (data.success && typeof (data) != 'undefined'){
                    alert("修改成功")
                }else{
                    alert("修改失败")
                }
                $("#editShop").hide();
                $("#btnSearchShop").click();
            }
        })
    };

    delShop = function (param) {
        $.ajax({
            data: param,
            type: "POST",
            dataType: "JSON",
            url: ajaxUrl + "/BackStage/delShop",
            success: function (data) {
                if (data.success && typeof (data) != 'undefined') {
                    alert("删除成功");
                } else {
                    alert("删除失败");
                }
                $("#btnSearchShop").click();
            }
        })
    };
    addShop = function (param) {

        $.ajax({
            data: param,
            type: "POST",
            dataType: "JSON",
            url: ajaxUrl + "/BackStage/addShopInfo",
            success:function (data) {

                if (data.success && typeof (data) != 'undefined'){
                    alert("新增成功");
                }else{
                    alert("新增失败")
                }
                $("#addShop").hide();
                $("#btnSearchShop").click();
            },
            error:function () {
                alert("调用失败")
            }

        })
    };


    searchProduct = function (param) {
        $.ajax({
            data:param,
            type:"POST",
            dataType:"JSON",
            url:ajaxUrl+"/BackStage/getProductInfo",
            success:function (date) {

                var template = $.templates("#productTmpl");
                var htmlOut = template.render(date.result);
                $("#productList").html(htmlOut);
            },
            error:function () {
                alert("请求失败")
            }
            
        })

    };

    editSearchPro = function (param) {
        $("#editProduct").show();
        $.ajax({
            data:param,
            type:"POST",
            dateType:"JSON",
            url:ajaxUrl+"/BackStage/getProductInfo",
            success:function (data) {
                var template = $.templates("#editProductTmpl");
                var htmlOut = template.render(data.result);
                $("#editProduct").html(htmlOut);
            },
        })
    };

    addProduct = function (param) {
        $.ajax({
            data:param,
            dataType:"JSON",
            type:"POST",
            url:ajaxUrl+"/BackStage/addProduct",
            success:function (data) {
                if(typeof (data) != 'undefined' && data.success){
                    alert("新增成功");
                    $("#addProduct").hide();
                    $("#btnProSearch").click();
                }
            }
        })
    };
    delProduct = function (param) {
        $.ajax({
            data:param,
            dataType:"JSON",
            type:"POST",
            url:ajaxUrl+"/BackStage/delProduct",
            success:function (data) {
                if(typeof (data) != 'undefined' && data.success){
                    alert("删除成功");
                }else{
                    alert("删除失败")
                }
                $("#btnProSearch").click();
            }
        })
    };
    editProduct = function (param) {
        $.ajax({
            data:param,
            dataType:"JSON",
            type:"POST",
            url:ajaxUrl+"/BackStage/editProduct",
            success:function (data) {
                if(typeof (data) != 'undefined' && data.success){
                    alert("修改成功");
                }else{
                    alert("修改失败")
                }
                $("#editProduct").hide();
                $("#btnProSearch").click();
            }
        })
    }
    // var shopInfo = function () {
    //     $.ajax({
    //         type:"POST",
    //         dataType:"JSON",
    //         url:ajaxUrl+"/BackStage/getShopInfo",
    //         success:function (date) {
    //             var template = $.templates("#shopListTmpl");
    //             var htmlOut = template.render(date.result);
    //             $("#shopList").html(htmlOut);
    //             // var htmlOut = $("#shopListTmpl").render(date.result);
    //             // $("#shopList").html(htmlOut);
    //
    //
    //         },
    //         error:function () {
    //             alert("店铺信息失败");
    //         }
    //     })
    // };

    // exports.shopInfo=shopInfo;
    // exports.productInfo = productInfo;

    exports.Init = Init();

});