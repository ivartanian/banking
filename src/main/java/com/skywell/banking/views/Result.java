package com.skywell.banking.views;

import java.io.Serializable;

/**
 * @author abohaichuk
 */
public class Result implements Serializable {

    protected int errCode;

    protected String errMsg;

    protected Object payload;

    public int getErrCode() {
        return errCode;
    }

    public void setErrCode(int errCode) {
        this.errCode = errCode;
    }

    public String getErrMsg() {
        return errMsg;
    }

    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }

    public Object getPayload() {
        return payload;
    }

    public void setPayload(Object payload) {
        this.payload = payload;
    }
}
