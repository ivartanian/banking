package com.skywell.banking.views.user;

import com.skywell.banking.annotations.validations.NotEmptyNull;
import com.skywell.banking.views.BaseRequest;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;

/**
 * Created by viv on 12.02.2016.
 */
public class UserPinCheckAuth extends BaseRequest {

    @NotEmptyNull(field = "login")
    protected String login;

    @NotEmptyNull(field = "pin")
    private String pin;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }
}
