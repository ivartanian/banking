
package com.skywell.ws.product;

import com.skywell.ws.ReqBase;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getPayProductList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getPayProductList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="reqBase" type="{http://cb.ukrpay.net/common/ws}reqBase"/>
 *         &lt;element name="fltOperType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fltBankProductId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="fltCurrencyId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="fltAmountMin" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getPayProductList", propOrder = {
    "reqBase",
    "fltOperType",
    "fltBankProductId",
    "fltCurrencyId",
    "fltAmountMin"
})
public class GetPayProductList {

    @XmlElement(required = true)
    protected ReqBase reqBase;
    protected String fltOperType;
    protected int fltBankProductId;
    protected int fltCurrencyId;
    protected long fltAmountMin;

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
     * Gets the value of the fltOperType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFltOperType() {
        return fltOperType;
    }

    /**
     * Sets the value of the fltOperType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFltOperType(String value) {
        this.fltOperType = value;
    }

    /**
     * Gets the value of the fltBankProductId property.
     * 
     */
    public int getFltBankProductId() {
        return fltBankProductId;
    }

    /**
     * Sets the value of the fltBankProductId property.
     * 
     */
    public void setFltBankProductId(int value) {
        this.fltBankProductId = value;
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

    /**
     * Gets the value of the fltAmountMin property.
     * 
     */
    public long getFltAmountMin() {
        return fltAmountMin;
    }

    /**
     * Sets the value of the fltAmountMin property.
     * 
     */
    public void setFltAmountMin(long value) {
        this.fltAmountMin = value;
    }

}
