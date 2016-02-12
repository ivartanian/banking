package com.skywell.banking.views.user;

import javax.validation.constraints.NotNull;

/**
 * Created by viv on 12.02.2016.
 */
public class UserChangePassword {

    @NotNull
    private String newPassword;

    public String getNewPassword() {
        return newPassword;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }
}
