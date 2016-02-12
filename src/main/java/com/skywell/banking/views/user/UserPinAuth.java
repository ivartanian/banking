package com.skywell.banking.views.user;

import com.skywell.banking.views.BaseReq;

import javax.validation.constraints.NotNull;

/**
 * Created by viv on 12.02.2016.
 */
public class UserPinAuth extends BaseReq {

    @NotNull
    private String pinCode;

    public String getPinCode() {
        return pinCode;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }

}
