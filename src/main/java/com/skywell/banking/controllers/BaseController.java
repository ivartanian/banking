package com.skywell.banking.controllers;

import com.skywell.banking.api.ws.ReqBase;
import com.skywell.banking.views.BaseRequest;
import org.apache.log4j.Logger;

import javax.annotation.PostConstruct;
import javax.servlet.ServletContext;
import javax.ws.rs.core.Context;

/**
 * Created by viv on 12.02.2016.
 */
public abstract class BaseController {

    private static final Logger LOG = Logger.getLogger(BaseController.class);

    @Context
    protected ServletContext context;

    protected String fs;

    protected ReqBase prepareApiReqBase(BaseRequest baseUserAuth) {
        LOG.info("Prepare api request");
        ReqBase reqBase = new ReqBase();
        reqBase.setFs(fs);
        if (baseUserAuth != null){
            if (baseUserAuth.getFs() != null && !baseUserAuth.getFs().isEmpty()){
                reqBase.setFs(baseUserAuth.getFs());
            }
            reqBase.setLang(baseUserAuth.getLanguage());
            reqBase.setSid(baseUserAuth.getSid());
            reqBase.setSessionFrom(baseUserAuth.getSessionFrom());
        }
        LOG.info("Prepared api request");
        return reqBase;
    }

    @PostConstruct
    protected void postConstruct(){
        fs = context.getInitParameter("ReqBase.fs");
    }
}
