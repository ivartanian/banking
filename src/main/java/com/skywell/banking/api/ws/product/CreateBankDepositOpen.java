
package com.skywell.banking.api.ws.product;

import com.skywell.banking.api.ws.ReqBase;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for createBankDepositOpen complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="createBankDepositOpen">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="reqBase" type="{http://cb.ukrpay.net/common/ws}reqBase"/>
 *         &lt;element name="bankProductId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="bankDepositPeriodId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="operAmount" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="operCurrencyId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="clientProductId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createBankDepositOpen", propOrder = {
    "reqBase",
    "bankProductId",
    "bankDepositPeriodId",
    "operAmount",
    "operCurrencyId",
    "clientProductId"
})
public class CreateBankDepositOpen {

    @XmlElement(required = true)
    protected ReqBase reqBase;
    protected int bankProductId;
    protected int bankDepositPeriodId;
    protected long operAmount;
    protected int operCurrencyId;
    protected long clientProductId;

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
     * Gets the value of the bankProductId property.
     * 
     */
    public int getBankProductId() {
        return bankProductId;
    }

    /**
     * Sets the value of the bankProductId property.
     * 
     */
    public void setBankProductId(int value) {
        this.bankProductId = value;
    }

    /**
     * Gets the value of the bankDepositPeriodId property.
     * 
     */
    public int getBankDepositPeriodId() {
        return bankDepositPeriodId;
    }

    /**
     * Sets the value of the bankDepositPeriodId property.
     * 
     */
    public void setBankDepositPeriodId(int value) {
        this.bankDepositPeriodId = value;
    }

    /**
     * Gets the value of the operAmount property.
     * 
     */
    public long getOperAmount() {
        return operAmount;
    }

    /**
     * Sets the value of the operAmount property.
     * 
     */
    public void setOperAmount(long value) {
        this.operAmount = value;
    }

    /**
     * Gets the value of the operCurrencyId property.
     * 
     */
    public int getOperCurrencyId() {
        return operCurrencyId;
    }

    /**
     * Sets the value of the operCurrencyId property.
     * 
     */
    public void setOperCurrencyId(int value) {
        this.operCurrencyId = value;
    }

    /**
     * Gets the value of the clientProductId property.
     * 
     */
    public long getClientProductId() {
        return clientProductId;
    }

    /**
     * Sets the value of the clientProductId property.
     * 
     */
    public void setClientProductId(long value) {
        this.clientProductId = value;
    }

}
