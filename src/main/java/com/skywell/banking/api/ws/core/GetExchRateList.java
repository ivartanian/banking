
package com.skywell.banking.api.ws.core;

import com.skywell.banking.api.ws.ReqBase;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getExchRateList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getExchRateList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="reqBase" type="{http://cb.ukrpay.net/common/ws}reqBase" minOccurs="0"/>
 *         &lt;element name="fltExchType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fltCurrencyType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fltCurrencyId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getExchRateList", propOrder = {
    "reqBase",
    "fltExchType",
    "fltCurrencyType",
    "fltCurrencyId"
})
public class GetExchRateList {

    protected ReqBase reqBase;
    protected String fltExchType;
    protected String fltCurrencyType;
    protected int fltCurrencyId;

    /**
     * Gets the value of the reqBase property.
     * 
     * @return
     *     possible object is
     *     {@link ReqBase }
     *     
     */
    public ReqBase getReqBase() {
        return reqBase;
    }

    /**
     * Sets the value of the reqBase property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReqBase }
     *     
     */
    public void setReqBase(ReqBase value) {
        this.reqBase = value;
    }

    /**
     * Gets the value of the fltExchType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFltExchType() {
        return fltExchType;
    }

    /**
     * Sets the value of the fltExchType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFltExchType(String value) {
        this.fltExchType = value;
    }

    /**
     * Gets the value of the fltCurrencyType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFltCurrencyType() {
        return fltCurrencyType;
    }

    /**
     * Sets the value of the fltCurrencyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFltCurrencyType(String value) {
        this.fltCurrencyType = value;
    }

    /**
     * Gets the value of the fltCurrencyId property.
     * 
     */
    public int getFltCurrencyId() {
        return fltCurrencyId;
    }

    /**
     * Sets the value of the fltCurrencyId property.
     * 
     */
    public void setFltCurrencyId(int value) {
        this.fltCurrencyId = value;
    }

}
