package com.skywell.banking.api.core;


import com.skywell.banking.api.ws.ResultRp;

/**
 * @author s.omelyansky
 */
public class RspResult<T> {
    public static final int CODE_OK = 0;
    public static final int CODE_RUNTIME = 1;
    public static final int CODE_NOTFOUND = 2;
    public static final int CODE_REQ_BAD = 3;
    public static final int CODE_DUBLICATE = 4;

    public static final int CODE_USER = 1000;
    public static final int CODE_USER_NOTFOUND = CODE_USER + 1;
    public static final int CODE_USER_BAD_PASSWORD = CODE_USER + 2;
    public static final int CODE_USER_BAD_SESSION = CODE_USER + 3;
    public static final int CODE_USER_OTP_MANY = CODE_USER + 4;
    public static final int CODE_USER_LOGIN_DUBLICATE = CODE_USER + 5;

    public static final int CODE_OTP = 2000;
    public static final int CODE_OTP_NOTFOUND = CODE_OTP + 1;
    public static final int CODE_OTP_EXPIRED = CODE_OTP + 2;
    public static final int CODE_OTP_BAD_VALUE = CODE_OTP + 3;

    public static final int CODE_PRODUCT = 3000;
    public static final int CODE_PRODUCT_AMOUNTBAD = CODE_PRODUCT + 1;
    public static final int CODE_PRODUCT_CURRENCYBAD = CODE_PRODUCT + 2;

    private T result;
    private int errCode;
    private String errMsg;
    private String urlRedirect;

    public RspResult() {
    }

    public RspResult(ResultRp resultRp) {
        if (resultRp != null) {
            errCode = resultRp.getErrCode();
            errMsg = resultRp.getErrMsg();
        }
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }

    public boolean isSuccessful() {
        return errCode == 0 ? true : false;
    }

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

    public void fromException(Throwable e) {
        if (e instanceof FatalException) {
            errCode = ((FatalException) e).getErrCode();
            errMsg = ((FatalException) e).getMessage();
        } else {
            errCode = RspResult.CODE_RUNTIME;
            errMsg = e.getMessage();
        }
    }

    public String getUrlRedirect() {
        return urlRedirect;
    }

    public void setUrlRedirect(String urlRedirect) {
        this.urlRedirect = urlRedirect;
    }

    public static void fromException(ResultRp resultRp, Throwable e) {
        if (e instanceof FatalException) {
            resultRp.setErrCode(((FatalException) e).getErrCode());
            resultRp.setErrMsg(((FatalException) e).getMessage());
        } else {
            resultRp.setErrCode(RspResult.CODE_RUNTIME);
            resultRp.setErrMsg(e.getMessage());
        }
    }

}
