$(function () {
    debugger
    $.ajax({
        url:"/EBusiness/BackStage/getUserCount",
        dateType:"JSON",
        success:function (date) {
            debugger
            $("#userCount").html(date.result);
            alert("kk");
        },
        error:function () {
            alert("调用失败")
        }
    })
})