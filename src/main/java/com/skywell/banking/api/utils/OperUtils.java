package com.skywell.banking.api.utils;

public final class OperUtils {
    public static final String OPER_TYPE_DEPOSIT_PREFIX = "deposit";
    public static final String OPER_TYPE_DEPOSIT_OPEN = OPER_TYPE_DEPOSIT_PREFIX + "Open";
    public static final String OPER_TYPE_SEND_PREFIX = "send";
    public static final String OPER_TYPE_SEND_CLIENT_PRODUCT = OPER_TYPE_SEND_PREFIX + "ClientProduct";
    public static final String OPER_TYPE_SEND_LOCAL_ACC = OPER_TYPE_SEND_PREFIX + "LocalAcc";
    public static final String OPER_TYPE_SEND_LOCAL_CARD = OPER_TYPE_SEND_PREFIX + "LocalCard";
    public static final String OPER_TYPE_SEND_COUNTRY_ACC = OPER_TYPE_SEND_PREFIX + "CountryAcc";
    public static final String OPER_TYPE_SEND_COUNTRY_CARD = OPER_TYPE_SEND_PREFIX + "CountryCard";
    public static final String OPER_TYPE_RESV_PREFIX = "resv";
    public static final String OPER_TYPE_RESV_CLIENT_PRODUCT = OPER_TYPE_RESV_PREFIX + "ClientProduct";
    public static final String OPER_TYPE_PAY_PREFIX = "pay";
    public static final String OPER_TYPE_PAY_SERV = OPER_TYPE_PAY_PREFIX + "Serv";
    public static final String OPER_TYPE_STATE_PREFIX = "state";
    public static final String OPER_TYPE_STATE_CHANGE = OPER_TYPE_STATE_PREFIX + "Change";

    public static final int OPER_STATE_CREATE = 1;
    public static final int OPER_STATE_OTP_WAIT = 2;
    public static final int OPER_STATE_EXEC_WAIT = 3;
    public static final int OPER_STATE_EXEC_OK = 4;
    public static final int OPER_STATE_EXEC_ERR = 5;
    public static final int OPER_STATE_ROLLBACK_WAIT = 6;
    public static final int OPER_STATE_ROLLBACK_OK = 7;
    public static final int OPER_STATE_ROLLBACK_ERR = 8;

    private OperUtils() {
    }

}
