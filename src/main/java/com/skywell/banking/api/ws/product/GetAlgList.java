
package com.skywell.banking.api.ws.product;

import com.skywell.banking.api.ws.ReqBase;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getAlgList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getAlgList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="reqBase" type="{http://cb.ukrpay.net/common/ws}reqBase"/>
 *         &lt;element name="operType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="currencyId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="fltSendBankProductId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="fltSendClientProductId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="fltResvBankProductId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="fltResvClientProductId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="fltSpec" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "getAlgList", propOrder = {
    "reqBase",
    "operType",
    "currencyId",
    "fltSendBankProductId",
    "fltSendClientProductId",
    "fltResvBankProductId",
    "fltResvClientProductId",
    "fltSpec",
    "fltAmountMin"
})
public class GetAlgList {

    @XmlElement(required = true)
    protected ReqBase reqBase;
    @XmlElement(required = true)
    protected String operType;
    protected int currencyId;
    protected int fltSendBankProductId;
    protected long fltSendClientProductId;
    protected int fltResvBankProductId;
    protected long fltResvClientProductId;
    protected String fltSpec;
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
     * Gets the value of the operType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperType() {
        return operType;
    }

    /**
     * Sets the value of the operType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperType(String value) {
        this.operType = value;
    }

    /**
     * Gets the value of the currencyId property.
     * 
     */
    public int getCurrencyId() {
        return currencyId;
    }

    /**
     * Sets the value of the currencyId property.
     * 
     */
    public void setCurrencyId(int value) {
        this.currencyId = value;
    }

    /**
     * Gets the value of the fltSendBankProductId property.
     * 
     */
    public int getFltSendBankProductId() {
        return fltSendBankProductId;
    }

    /**
     * Sets the value of the fltSendBankProductId property.
     * 
     */
    public void setFltSendBankProductId(int value) {
        this.fltSendBankProductId = value;
    }

    /**
     * Gets the value of the fltSendClientProductId property.
     * 
     */
    public long getFltSendClientProductId() {
        return fltSendClientProductId;
    }

    /**
     * Sets the value of the fltSendClientProductId property.
     * 
     */
    public void setFltSendClientProductId(long value) {
        this.fltSendClientProductId = value;
    }

    /**
     * Gets the value of the fltResvBankProductId property.
     * 
     */
    public int getFltResvBankProductId() {
        return fltResvBankProductId;
    }

    /**
     * Sets the value of the fltResvBankProductId property.
     * 
     */
    public void setFltResvBankProductId(int value) {
        this.fltResvBankProductId = value;
    }

    /**
     * Gets the value of the fltResvClientProductId property.
     * 
     */
    public long getFltResvClientProductId() {
        return fltResvClientProductId;
    }

    /**
     * Sets the value of the fltResvClientProductId property.
     * 
     */
    public void setFltResvClientProductId(long value) {
        this.fltResvClientProductId = value;
    }

    /**
     * Gets the value of the fltSpec property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFltSpec() {
        return fltSpec;
    }

    /**
     * Sets the value of the fltSpec property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFltSpec(String value) {
        this.fltSpec = value;
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
