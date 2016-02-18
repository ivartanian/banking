package com.skywell.banking.views.product;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.skywell.banking.annotations.validations.UserSid;
import com.skywell.banking.api.ws.product.OperVar;
import com.skywell.banking.views.BaseRequest;

import java.io.Serializable;
import java.util.List;

/**
 * Created by viv on 12.02.2016.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class BaseProduct implements Serializable{

    @UserSid
    protected BaseRequest baseRequest;
    protected long operAmount;
    protected int operCurrencyId;
    protected String note;
    protected List<OperVar> varList;

    public BaseRequest getBaseRequest() {
        return baseRequest;
    }

    public void setBaseRequest(BaseRequest baseRequest) {
        this.baseRequest = baseRequest;
    }

    public long getOperAmount() {
        return operAmount;
    }

    public void setOperAmount(long operAmount) {
        this.operAmount = operAmount;
    }

    public int getOperCurrencyId() {
        return operCurrencyId;
    }

    public void setOperCurrencyId(int operCurrencyId) {
        this.operCurrencyId = operCurrencyId;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public List<OperVar> getVarList() {
        return varList;
    }

    public void setVarList(List<OperVar> varList) {
        this.varList = varList;
    }

}
