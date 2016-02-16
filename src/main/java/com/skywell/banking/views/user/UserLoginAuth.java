package com.skywell.banking.views.user;

import com.skywell.banking.views.BaseRequest;

import javax.validation.constraints.NotNull;

/**
 * Created by viv on 12.02.2016.
 */
public class UserLoginAuth extends BaseRequest {

    @NotNull(message = "{NotNull.UserLoginAuth.login}")
    protected String login;

    @NotNull(message = "{NotNull.UserLoginAuth.password}")
    protected String password;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
