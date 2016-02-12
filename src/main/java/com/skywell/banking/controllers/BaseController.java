package com.skywell.banking.controllers;

import com.skywell.banking.api.ws.ReqBase;
import com.skywell.banking.views.Result;
import com.skywell.banking.views.errors.Error;
import com.skywell.banking.views.BaseReq;
import org.apache.log4j.Logger;

import javax.annotation.PostConstruct;
import javax.servlet.ServletContext;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.ws.rs.core.Context;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by viv on 12.02.2016.
 */
public abstract class BaseController {

    private static final Logger LOG = Logger.getLogger(BaseController.class);

    @Context
    protected ServletContext context;

    protected Validator defaultValidator;

    public Result prepareResult(int errCode, String errMsg, Object payload) {
        Result result = new Result();
        result.setErrCode(errCode);
        result.setErrMsg(errMsg);
        result.setPayload(payload);
        return result;
    }

    protected ReqBase prepareReqBase(BaseReq baseUserAuth) {
        String fs = context.getInitParameter("ReqBase.fs");
        ReqBase reqBase = new ReqBase();
        reqBase.setFs(fs);
        if (baseUserAuth != null){
            reqBase.setLang(baseUserAuth.getLanguage());
            reqBase.setSid(baseUserAuth.getSid());
            reqBase.setSessionFrom(baseUserAuth.getSessionFrom());
        }
        return reqBase;
    }

    //TODO: validation
    protected List<Error> validate(BaseReq userLoginAuth) {
        LOG.info("Validation data...");
        List<Error> errorMessages = new ArrayList<>();
//        Set<ConstraintViolation<BaseUserAuth>> violations = defaultValidator.validate(userLoginAuth);
//        if (!violations.isEmpty()) {
//            for(ConstraintViolation<BaseUserAuth> violation : violations) {
//                errorMessages.add(new Error(violation.getMessage()));
//            }
//        }
        return errorMessages;
    }

    @PostConstruct
    protected void postConstruct(){
        this.defaultValidator = Validation.buildDefaultValidatorFactory().getValidator();
    }
}
