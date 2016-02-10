package com.skywell.core;

public class FatalException extends RuntimeException {
    private static final long serialVersionUID = 23041973;
    private final int errCode;

    public FatalException(Exception e) {
        super(e);
        errCode = 1;
    }

    public FatalException() {
        super();
        errCode = 1;
    }

    public FatalException(String message) {
        super(message);
        errCode = 1;
    }

    public FatalException(int errCode, String message) {
        super(message);
        this.errCode = errCode;
    }

    public FatalException(RspResult<?> rspResult) {
        super(rspResult.getErrMsg());
        this.errCode = rspResult.getErrCode();
    }

    public int getErrCode() {
        return errCode;
    }
}
