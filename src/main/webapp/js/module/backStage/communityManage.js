define('module/backStage/communityManage',function (require,exports,module) {
    //引入依赖
    debugger
    var $ = require('jquery');

    require('util/jsviews/jsrender');
    require('util/jsviews/jsviews');

    var ajaxurl = '/EBusiness/BackStage';
    var _this;

    //初始化方法
    var Init = function () {
        _this = this;
        param = {
            articleTypeId: 1004
        }
        _this.getArticle(param)
    }

    getArticle = function (param) {
        $.ajax({
            data: param,
            type: "POST",
            dataType: "JSON",
            url: "/EBusiness/community/getArticle",
            success: function (data) {
                debugger
                var tmpl = $.templates("#articleTmpl");
                var htmlOut = tmpl.render(data.result);
                $("#article").html(htmlOut);
            }
        });
    };


    exports.Init = Init();

});