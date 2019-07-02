/**
 * Created by ZLL on 2019/4/20.
 */

//未生效配置文件，因为加载顺序问题，无法优先加载该js再加载script中的js
(function () {
    debugger
    seajs.config({
        //配置基础路径
        base:'/EBusiness/js/',
        //配置别名（用一个变量名来表示文件，可以解决文件路径过深的问题，实现了路径映射）
        alias:{
            'jquery':'util/jquery/1.9.1/jquery',
        },
        //也可以用实际路径
        paths:{
            'js':'http://localhost:8085/EBusiness/js/'
        },
        charset:'utf-8',
        //预加载
        preload: [
            window.$ || window.jQuery ? '' :'jquery'
        ],
    })
});