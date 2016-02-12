package com.skywell.banking.views.errors;

/**
 * Created by viv on 12.02.2016.
 */
public class Error {

    private String msq;

    public Error() {
    }

    public Error(String msq) {
        this.msq = msq;
    }

    public String getMsq() {
        return msq;
    }

    public void setMsq(String msq) {
        this.msq = msq;
    }
}
