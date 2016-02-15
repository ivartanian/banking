package com.skywell.banking.views.user;

import com.skywell.banking.views.BaseRequest;

/**
 * Created by viv on 12.02.2016.
 */
public class UserLoginAuth extends BaseRequest {

    protected String login;

    protected String password;

    private String reqId;

    private String smsPass;

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
