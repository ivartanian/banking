package com.skywell.banking.views.user;

import com.skywell.banking.views.BaseRequest;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;

/**
 * Created by viv on 12.02.2016.
 */
public class UserSmsCheckAuth extends BaseRequest {

    @NotNull(message = "{NotNull.UserSmsCheckAuth.reqId}")
    @NotEmpty(message = "{NotEmpty.UserSmsCheckAuth.reqId}")
    private String reqId;

    @NotNull(message = "{NotNull.UserSmsCheckAuth.smsPass}")
    @NotEmpty(message = "{NotEmpty.UserSmsCheckAuth.smsPass}")
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
