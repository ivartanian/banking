package com.skywell.banking.api.utils;

public final class ProductUtils {
    public static final String PERIOD_DAY = "D";
    public static final String PERIOD_WEEK = "W";
    public static final String PERIOD_MONTH = "M";
    public static final String PERIOD_QUARTER = "Q";
    public static final String PERIOD_YEAR = "Y";
    public static final String PERIOD_NONE = "N";
    public static final String PERIOD_BEGIN = "B";
    public static final String PERIOD_END = "E";
    private static final String[] SORT_PERIOD = { PERIOD_BEGIN, PERIOD_DAY, PERIOD_WEEK, PERIOD_MONTH, PERIOD_QUARTER,
            PERIOD_YEAR, PERIOD_END, PERIOD_NONE };

    public static final int PRODUCT_TYPE_DEPOSIT = 1;
    public static final String PRODUCT_TYPE_ALIAS_DEPOSIT = "deposit";
    public static final int PRODUCT_TYPE_CARD = 2;
    public static final String PRODUCT_TYPE_ALIAS_CARD = "card";
    public static final int PRODUCT_TYPE_LOAN = 3;
    public static final String PRODUCT_TYPE_ALIAS_LOAN = "loan";
    public static final int PRODUCT_TYPE_ACCOUNT = 4;
    public static final String PRODUCT_TYPE_ALIAS_ACCOUNT = "account";

    private ProductUtils() {

    }

    public static String[] sortPeriod() {
        return SORT_PERIOD;
    }

    public static int periodCompareTo(String value1, String value2) {
        if (value1 == null || value1.length() == 0) {
            if (value2 == null || value2.length() == 0) {
                return 0;
            } else {
                return 1;
            }
        }
        if (value2 == null || value2.length() == 0) {
            return -1;
        } else if (value1.equals(value2)) {
            return 0;
        }
        for (String el : SORT_PERIOD) {
            if (el.equals(value1)) {
                return -1;
            } else if (el.equals(value2)) {
                return 1;
            }
        }
        return value1.compareTo(value2);
    }

}
