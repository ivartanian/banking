package com.skywell.banking.views.user;

import javax.validation.constraints.NotNull;

/**
 * Created by viv on 12.02.2016.
 */
public class UserCheckAuth {

    @NotNull
    private String reqId;

    @NotNull
    private String smsPass;

    public String getReqId() {
        return reqId;
    }

    public void setReqId(String reqId) {
        this.reqId = reqId;
    }

    public String getSmsPass() {
        return smsPass;
    }

    public void setSmsPass(String smsPass) {
        this.smsPass = smsPass;
    }
}
