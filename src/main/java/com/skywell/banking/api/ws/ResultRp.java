
package com.skywell.banking.api.ws;

import com.skywell.banking.api.ws.core.CurrencyListRp;
import com.skywell.banking.api.ws.core.ExchRateListRp;
import com.skywell.banking.api.ws.core.LangListRp;
import com.skywell.banking.api.ws.core.NewsListRp;
import com.skywell.banking.api.ws.product.*;
import com.skywell.banking.api.ws.serv.CategoryListRp;
import com.skywell.banking.api.ws.serv.ServInfoRp;
import com.skywell.banking.api.ws.serv.ServListRp;
import com.skywell.banking.api.ws.serv.ServOperRp;
import com.skywell.banking.api.ws.user.CreateUserRp;
import com.skywell.banking.api.ws.user.SessionRp;
import com.skywell.banking.api.ws.user.UserPassCfgRp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for resultRp complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="resultRp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="errCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="errMsg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resultRp", propOrder = { "errCode", "errMsg" })
@XmlSeeAlso({ LangListRp.class, CurrencyListRp.class,
        ExchRateListRp.class, NewsListRp.class,
        SessionRp.class, UserPassCfgRp.class,
        CreateUserRp.class, PayProductListRp.class,
        ClientFullProductRp.class, OperListRp.class,
        OperRp.class, ClientProductListRp.class,
        ClientTransListRp.class, AlgListRp.class,
        BankDepositListRp.class, ServListRp.class,
        ServOperRp.class, ServInfoRp.class,
        CategoryListRp.class })
public class ResultRp {

    protected int errCode;
    protected String errMsg;

    /**
     * Gets the value of the errCode property.
     * 
     */
    public int getErrCode() {
        return errCode;
    }

    /**
     * Sets the value of the errCode property.
     * 
     */
    public void setErrCode(int value) {
        this.errCode = value;
    }

    /**
     * Gets the value of the errMsg property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getErrMsg() {
        return errMsg;
    }

    /**
     * Sets the value of the errMsg property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setErrMsg(String value) {
        this.errMsg = value;
    }

}
