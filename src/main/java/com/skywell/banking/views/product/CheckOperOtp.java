package com.skywell.banking.views.product;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.skywell.banking.annotations.validations.NotEmptyNull;
import com.skywell.banking.annotations.validations.UserSid;
import com.skywell.banking.api.ws.product.OperVar;
import com.skywell.banking.views.BaseRequest;

import java.io.Serializable;
import java.util.List;

/**
 * Created by viv on 12.02.2016.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class CheckOperOtp implements Serializable{

    @UserSid
    protected BaseRequest baseRequest;

    @NotEmptyNull(field = "otpReqId")
    protected String otpReqId;

    @NotEmptyNull(field = "otpPass")
    protected String otpPass;

    public BaseRequest getBaseRequest() {
        return baseRequest;
    }

    public void setBaseRequest(BaseRequest baseRequest) {
        this.baseRequest = baseRequest;
    }

    public String getOtpReqId() {
        return otpReqId;
    }

    public void setOtpReqId(String otpReqId) {
        this.otpReqId = otpReqId;
    }

    public String getOtpPass() {
        return otpPass;
    }

    public void setOtpPass(String otpPass) {
        this.otpPass = otpPass;
    }
}
