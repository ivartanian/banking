package com.skywell.banking.views;

import org.apache.log4j.Logger;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * Created by viv on 12.02.2016.
 */
public class BaseRequest implements Serializable{

    @NotNull(message = "Not be nulll")
    protected String fs;

    @NotNull(message = "Not be nulll")
    protected String sid;

    protected String language;

    protected String sessionFrom;

    public BaseRequest() {
    }

    public BaseRequest(String fs, String sid, String language, String sessionFrom) {
        this.fs = fs;
        this.sid = sid;
        this.language = language;
        this.sessionFrom = sessionFrom;
    }

    public String getFs() {
        return fs;
    }

    public void setFs(String fs) {
        this.fs = fs;
    }

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
