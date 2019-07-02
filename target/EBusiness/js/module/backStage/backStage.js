/**
 * Created by ZLL on 2019/4/20.
 */
define('module/backStage/backStage',function (require,exports,module) {
    //通过require引入依赖
    var $  = require('jquery');
    //引入渲染jsrender.js
    require('util/jsviews/jsrender');
    require('util/jsviews/jsviews');

    var ajaxUrl = '/EBusiness';

    //初始化页面加载
    var backStage = function () {
    };

    //查询人数方法
    var getUserCount = function () {
        $.ajax({
            url:ajaxUrl+"/BackStage/getUserCount",
            dateType:"JSON",
            success:function (date) {
                $("#userCount").html(date.result);
            },
            error:function () {
                alert("调用失败")
            }
        })
    };

    //获取交易总额
    var getTradeMoney = function () {
        $.ajax({
            url:ajaxUrl+"/BackStage/getTradeMoney",
            dateType:"JSON",
            success:function (date) {
                $("#tradeMoney").html("$"+date.result);
            },
            error:function () {
                alert("调用失败")
            }
        })
    }
    //获取交易数量
    var getTradeCount = function () {
        $.ajax({
            url:ajaxUrl+"/BackStage/getTradeCount",
            dateType:"JSON",
            success:function (date) {
                $("#tradeCount").html(date.result);
            },
            error:function () {
                alert("调用失败")
            }
        })
    }
    //获取社区分享文章总数
    var getPostCount = function () {
        $.ajax({
            url:ajaxUrl+"/BackStage/getArticleCount",
            dateType:"JSON",
            success:function (date) {
                $("#articleCount").html(date.result);
            },
            error:function () {
                alert("调用失败")
            }
        })
    }

    // exports.backStage = backStage;
    //对外暴露接口  会在调用该接口时运行方法
    exports.getUserCount = getUserCount;
    exports.getTradeCount = getTradeCount;
    exports.getTradeMoney = getTradeMoney;
    exports.getPostCount = getPostCount;
    //这样写会在加载这个模块js时就运行该方法
    exports.backStage = backStage();
    // module.exports = backStage;
});