define("app/common/ai-paging/ai.simplePagination", ["jquery","simplePagination/jquery.simplePagination","jquery-i18n/1.2.2/jquery.i18n.properties.min"], function(require, exports, module){
	 var AjaxController=require('app/common/ai-ajax/1.0.0/index');
	//实例化AJAX控制处理对象
	 var ajaxController = new AjaxController();
	require("simplePagination/jquery.simplePagination");
    require('jquery-i18n/1.2.2/jquery.i18n.properties.min');

	
/*!
 * jQuery runner pagination plugin v1.0.0
 * based on jquery.pagController.js  jquery.twbsPagination.js
 * Copyright 2014, Asiainfo
 * Released under Apache 2.0 license
 * http://apache.org/licenses/LICENSE-2.0.html
 */
(function ($, window, document, undefined) {

    'use strict';

    var old = $.fn.runnerPagination;

    // PROTOTYPE AND CONSTRUCTOR

    var RunnerPagination = function (element, options) {
        this.$element = $(element);
        this.options = options ? options:{};
        this.setup();
        return this;
    };

    RunnerPagination.prototype = {
        constructor: RunnerPagination,

        setup: function () {
            var _this = this;
            $.i18n.properties({//加载资浏览器语言对应的资源文件
                name: "commonRes", //资源文件名称，可以是数组
                path: _i18n_res, //资源文件路径
                mode: 'both',
                language: 'zh_CN',
                cache: true,
                checkAvailableLanguages: true,
                async: true,
                callback:function () {
                    _this.destroy();
                    _this.loadData(1);
                }
            });
        },
        
        destroy: function () {
            this.$element.empty();
            this.$element.removeData('twbs-pagination');
            this.$element.unbind('page');
            return this;
        },
        isArray: function(obj) {
        	return Object.prototype.toString.call(obj) === '[object Array]';
        },
        loadData: function(currentPage) {
        	var _this = this;
        	var opt = _this.options;
        	this.showLoadingMessage();
        	var renderId = opt.renderId;
        	if(renderId){
        		$("#"+renderId).html("");

        	}
        	var data = opt.data?opt.data:{};
        	var currentPageSize = opt.pageSize?opt.pageSize:10;
        	var _pagesize={name:"pageSize",value: currentPageSize};
    		var _pageno={name:"pageNo",value: currentPage};
        	if(_this.isArray(data)){
        		//如果参数是数组
        		data.push(_pagesize);
        		data.push(_pageno);
        	}
        	else{     
        		//如果参数是对象
        		data.pageSize = currentPageSize;
        		data.pageNo = currentPage;        		
        	}
        	ajaxController.ajax({
        		url: opt.url,
 	 			method: opt.method,
 	 			dataType: opt.dataType,
 	            showWait: opt.showWait,
 	            data: data,
 	            //message: opt.message,
 	            processing: false,
 	            success: function (resp) {
 	            	_this.hiddenLoadingMessage();
 	            	//var d = (resp && resp.result)?resp.result:{};
 	            	var d = resp;
 	            	if(d && d.result){
 	            		_this.hiddenNotResultMessage();
 	            		opt.render && opt.render.call(_this,d.result);
 	            	}else{
 	            		_this.showNotResultMessage();
 	            	}
 	                opt.callback && opt.callback.call(_this,d);
 	                var pager = d.result?d.result:{};
	                //var totalPages=d.pageCount?d.pageCount:1;
	                if(pager.pageCount>0){
	                	_this.setupTwbsPagination(pager.pageCount);
	                }
 	            },
 	            failure:function(){
 	            	_this.hiddenLoadingMessage();
 	            },
 	            error:function(){
 	        	   _this.hiddenLoadingMessage();
 	            }
        	});
        	
        	if(_this.isArray(data)){
         		//如果参数是数组，则移除最后连个对象（pageSize、pageNo）
	           		data.pop();//移除pageSize
	           		data.pop();//移除pageNo
	        }
        },
        
        /**
         * 显示加载信息
         */
        showLoadingMessage:function(){
        	var messageId = this.options.messageId;
        	if(messageId){
        		document.getElementById(messageId).innerHTML = "<li class='dialog-icon-loading'></li>";
        		document.getElementById(messageId).className = "not-query pt-20 pb-20";
        	}
//        	this.$element.addClass("not-query pt-20 pb-20");
//        	this.$element.removeClass("pagination");
//        	this.$element.get(0).innerHTML = "<li class='dialog-icon-loading'></li>";
        },
        
        /**
         * 隐藏加载信息
         */
        hiddenLoadingMessage:function(){
        	var messageId = this.options.messageId;
        	if(messageId){
        		document.getElementById(messageId).innerHTML = "";
        		document.getElementById(messageId).className = "";
        	}
        	
//        	this.$element.addClass("pagination");
//        	this.$element.removeClass("not-query pt-20 pb-20");
//        	this.$element.get(0).innerHTML = "";
        },
        /**
         * 显示无返回信息
         */
        showNotResultMessage:function(){
        	this.$element.removeClass("pagination");
        	var imageType = this.options.resultImageType;
        	var messageId = this.options.messageId;
        	if(messageId){
	        	if(imageType == "1"){
	        		document.getElementById(messageId).innerHTML = "<li class='dialog-icon-notquery-1'></li><li>"+$.i18n.prop('com.ajax.req.fail.empty')+"</li>";
	            	document.getElementById(messageId).className = "query-product-msgimage not-query";
	
	//        		this.$element.addClass("query-product-msgimage not-query");
	//            	this.$element.get(0).innerHTML = "<li class='dialog-icon-notquery-1'></li><li>抱歉没有找到相关商品，更换搜索词试一试吧！</li>";
	        	}else{
	        		document.getElementById(messageId).innerHTML = "<li class='dialog-icon-notquery'></li><li>"+$.i18n.prop('com.ajax.req.fail.empty')+"</li>";
	            	document.getElementById(messageId).className = "not-query pt-20 pb-20";
	        		
	//        		this.$element.addClass("not-query pt-20 pb-20");
	//            	this.$element.get(0).innerHTML = "<li class='dialog-icon-notquery'></li><li>抱歉没有查询到相关数据</li>";
	        	}
        	}
        },
        
        /**
         * 隐藏无返回信息
         */
        hiddenNotResultMessage: function(){
        	this.$element.addClass("pagination");
        	var imageType = this.options.resultImageType;
        	var messageId = this.options.messageId;
        	if(messageId){
	        	document.getElementById(this.options.messageId).innerHTML = "";
	        	document.getElementById(this.options.messageId).className = "";
        	}
        	
//        	if(imageType == "1"){
//        		this.$element.reremoveClass("query-product-msgimage not-query");
//            	this.$element.get(0).innerHTML = "";
//        	}else{
//        		this.$element.removeClass("not-query pt-20 pb-20");
//            	this.$element.get(0).innerHTML = "";
//        	}
        },
        
        setupTwbsPagination: function(totalPages){
        	var _this = this;
        	var opt = _this.options;
        	if(this._tp){
        		return;
        	}
			var _tp = this.$element.pagination({
				displayedPages: opt.visiblePages,
				pages:totalPages,
				currentPage:opt.startPage,
				prevText:"<",
				nextText:">",
                numPrev:$.i18n.prop('com.page.to.label'),
                numAfter:$.i18n.prop('com.page.page.label'),
                numBtn:$.i18n.prop('com.page.go.label'),
                // hrefTextPrefix:"",
				cssStyle:'compact-theme',
                numCheck:function(pageNum){//检查输入页码是否符合要求,返回true或false
                	var checkRet = true;
					if(window.console){
                		console.log("num check:"+pageNum);
                	}
                	var errMsg = $.i18n.prop('com.page.num.error',totalPages);
                	//不是整数，数字小于1，数字大于最大页数
					if(!(/^(\+|-)?\d+$/.test( pageNum )) || pageNum<1 || pageNum >totalPages){
						alert(errMsg);
                        checkRet = false;
					}
                	return checkRet;
                },
				onPageClick: function (pageNo, event) {
					_this.loadData(pageNo);
				}
			});
        	this._tp= _tp;
        }

    };

    // PLUGIN DEFINITION

    $.fn.runnerPagination = function (option) {
        var args = Array.prototype.slice.call(arguments, 1);
        var methodReturn;
        var $this = $(this);
        var options = typeof option === 'object' && option;
        var data = new RunnerPagination(this, options) ;
        if (typeof option === 'string') methodReturn = data[ option ].apply(data, args);
        return ( methodReturn === undefined ) ? $this : methodReturn;
    };

    $.fn.runnerPagination.defaults = {
    };

    $.fn.runnerPagination.Constructor = RunnerPagination;

    $.fn.runnerPagination.noConflict = function () {
        $.fn.runnerPagination = old;
        return this;
    };

})(jQuery, window, document);




});