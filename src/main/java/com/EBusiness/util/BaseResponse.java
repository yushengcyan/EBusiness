package com.EBusiness.util;

import java.io.Serializable;

//封装响应给前台的数据
public class BaseResponse<T> implements Serializable {

    private static final long serialVersionUID = 1L;
    private boolean success;
    private String resultCode;
    private String resultMessage;
    private Object info = "";
    private T result = null;

    public BaseResponse() {
    }

    public BaseResponse(boolean success, String resultCode, String resultMessage) {
        this.success = success;
        this.resultCode = resultCode;
        this.resultMessage = resultMessage;
    }

    public BaseResponse(boolean success, String resultCode, String resultMessage, Object info) {
        this.success = success;
        this.resultCode = resultCode;
        this.resultMessage = resultMessage;
        this.info = info;
    }

    public BaseResponse(boolean success, String resultCode, String resultMessage, Object info, T result) {
        this.success = success;
        this.resultCode = resultCode;
        this.resultMessage = resultMessage;
        this.info = info;
        this.result = result;
    }

    public T getResult() {
        return this.result;
    }

    public void setResult(T result) {
        this.result = result;
    }

    public boolean isSuccess() {
        return this.success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getResultCode() {
        return this.resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    public String getResultMessage() {
        return this.resultMessage;
    }

    public void setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
    }

    public Object getInfo() {
        return this.info;
    }

    public void setInfo(Object info) {
        this.info = info;
    }

}
