package com.skywell.banking.views;

import org.apache.log4j.Logger;

import javax.validation.constraints.NotNull;

/**
 * Created by viv on 12.02.2016.
 */
public class BaseReq {

    private String sid;

    protected String language;

    protected String sessionFrom;

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getSessionFrom() {
        return sessionFrom;
    }

    public void setSessionFrom(String sessionFrom) {
        this.sessionFrom = sessionFrom;
    }
}
