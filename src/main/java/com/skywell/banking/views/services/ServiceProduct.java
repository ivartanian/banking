package com.skywell.banking.views.services;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.skywell.banking.annotations.validations.UserSid;
import com.skywell.banking.api.ws.product.OperVar;
import com.skywell.banking.api.ws.serv.AttrValue;
import com.skywell.banking.views.BaseRequest;

import java.io.Serializable;
import java.util.List;

/**
 * Created by viv on 12.02.2016.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ServiceProduct implements Serializable{

    @UserSid
    protected BaseRequest baseRequest;
    protected List<AttrValue> attrList;

    public BaseRequest getBaseRequest() {
        return baseRequest;
    }

    public void setBaseRequest(BaseRequest baseRequest) {
        this.baseRequest = baseRequest;
    }

    public List<AttrValue> getAttrList() {
        return attrList;
    }

    public void setAttrList(List<AttrValue> attrList) {
        this.attrList = attrList;
    }
}
