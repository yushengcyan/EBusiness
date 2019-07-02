/**
 * Created by ZLL on 2019/4/16.
 */
var Ajax = {
    //ajaxģ��
    init: function (obj) {
        //��ʼ������
        var objAdapter = {
            url: '',
            method: 'get',
            data: {},
            success: function () {
            },
            complete: function () {
            },
            error: function (s) {
                alert('status:' + s + 'error!');
            },
            async: true
        }
        //ͨ��ʹ��JS����ַ������IE������ڶ���Ĭ�ϻ�ȡ���������
        objAdapter.url = obj.url + '?rand=' + Math.random();
        objAdapter.method = obj.method || objAdapter.method;
        objAdapter.data = Ajax.params(obj.data) || Ajax.params(objAdapter.data);
        objAdapter.async = obj.async || objAdapter.async;
        objAdapter.complete = obj.complete || objAdapter.complete;
        objAdapter.success = obj.success || objAdapter.success;
        objAdapter.error = obj.error || objAdapter.error;
        return objAdapter;
    },
    //����XMLHttpRequest����
    createXHR: function () {
        if (window.XMLHttpRequest) { //IE7+��Firefox��Opera��Chrome ��Safari
            return new XMLHttpRequest();
        } else if (window.ActiveXObject) { //IE6 ������
            var versions = ['MSXML2.XMLHttp', 'Microsoft.XMLHTTP'];
            for (var i = 0, len = versions.length; i < len; i++) {
                try {
                    return new ActiveXObject(version[i]);
                    break;
                } catch (e) {
                    //����
                }
            }
        } else {
            throw new Error('�������֧��XHR����');
        }
    },
    params: function (data) {
        var arr = [];
        for (var i in data) {
            //�����ַ����β������������ʹ��encodeURIComponent()���б��봦��
            arr.push(encodeURIComponent(i) + '=' + encodeURIComponent(data[i]));
        }
        return arr.join('&');
    },
    callback: function (obj, xhr) {
        if (xhr.status == 200) { //�ж�http�Ľ����Ƿ�ɹ���200��ʾ�ɹ�
            obj.success(xhr.responseText); //�ص����ݲ���
        } else {
            alert('��ȡ���ݴ��󣡴�����ţ�' + xhr.status + '��������Ϣ��' + xhr.statusText);
        }
    },
    ajax: function (obj) {
        if (obj.method === 'post') {
            Ajax.post(obj);
        } else {
            Ajax.get(obj);
        }
    },
    //post����
    post: function (obj) {
        var xhr = Ajax.createXHR(); //����XHR����
        var opt = Ajax.init(obj);
        opt.method = 'post';
        if (opt.async === true) { //true��ʾ�첽��false��ʾͬ��
            //ʹ���첽���õ�ʱ����Ҫ����readystatechange �¼�
            xhr.onreadystatechange = function () {
                if (xhr.readyState == 4) { //�ж϶����״̬�Ƿ񽻻����
                    Ajax.callback(opt, xhr); //�ص�
                }
            };
        }
        //��ʹ��XHR����ʱ�������ȵ���open()������
        //������������������������(get��post)�������URL�ͱ�ʾ�Ƿ��첽��
        xhr.open(opt.method, opt.url, opt.async);
        //post��ʽ��Ҫ�Լ�����http������ͷ����ģ�±��ύ��
        //����open����֮��send����֮ǰ��
        xhr.setRequestHeader('Content-Type', 'application/x-www-form-urlencoded');
        xhr.send(opt.data); //post��ʽ�����ݷ���send()������
        if (opt.async === false) { //ͬ��
            Ajax.callback(obj, xhr); //�ص�
        }
    },
    //get����
    get: function (obj) {
        var xhr = Ajax.createXHR(); //����XHR����
        var opt = Ajax.init(obj);
        if (opt.async === true) { //true��ʾ�첽��false��ʾͬ��
            //ʹ���첽���õ�ʱ����Ҫ����readystatechange �¼�
            xhr.onreadystatechange = function () {
                if (xhr.readyState == 4) { //�ж϶����״̬�Ƿ񽻻����
                    Ajax.callback(obj, xhr); //�ص�
                }
            };
        }
        //����GET���������ݼӵ�url����
        opt.url += opt.url.indexOf('?') == -1 ? '?' + opt.data : '&' + opt.data;
        //��ʹ��XHR����ʱ�������ȵ���open()������
        //������������������������(get��post)�������URL�ͱ�ʾ�Ƿ��첽��
        xhr.open(opt.method, opt.url, opt.async);
        xhr.send(null); //get��ʽ����null
        if (opt.async === false) { //ͬ��
            Ajax.callback(obj, xhr); //�ص�
        }
    }
};