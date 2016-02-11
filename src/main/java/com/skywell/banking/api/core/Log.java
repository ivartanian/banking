package com.skywell.banking.api.core;

public final class Log {
    public static final int LEVEL_ERROR = 1000;
    public static final int LEVEL_WARN = 900;
    public static final int LEVEL_INFO = 800;

    private Log() {

    }

    public static String levelToString(int logLevel) {
        switch (logLevel) {
        case LEVEL_ERROR:
            return "ERROR";
        case LEVEL_WARN:
            return "WARN";
        case LEVEL_INFO:
            return "INFO";
        default:
            return "LEV_" + logLevel;
        }
    }
}
