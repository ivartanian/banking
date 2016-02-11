
package com.skywell.banking.api.ws.product;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for bankDeposit complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="bankDeposit">
 *   &lt;complexContent>
 *     &lt;extension base="{http://cb.ukrpay.net/common/ws/product}bankProduct">
 *       &lt;sequence>
 *         &lt;element name="allowSysOpen" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="allowSysReplenishment" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="allowSysClose" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="infoShort" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="infoFull" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bankDepositPeriod" type="{http://cb.ukrpay.net/common/ws/product}bankDepositPeriod" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bankDeposit", propOrder = {
    "allowSysOpen",
    "allowSysReplenishment",
    "allowSysClose",
    "infoShort",
    "infoFull",
    "bankDepositPeriod"
})
public class BankDeposit
    extends BankProduct
{

    protected boolean allowSysOpen;
    protected boolean allowSysReplenishment;
    protected boolean allowSysClose;
    protected String infoShort;
    protected String infoFull;
    @XmlElement(nillable = true)
    protected List<BankDepositPeriod> bankDepositPeriod;

    /**
     * Gets the value of the allowSysOpen property.
     * 
     */
    public boolean isAllowSysOpen() {
        return allowSysOpen;
    }

    /**
     * Sets the value of the allowSysOpen property.
     * 
     */
    public void setAllowSysOpen(boolean value) {
        this.allowSysOpen = value;
    }

    /**
     * Gets the value of the allowSysReplenishment property.
     * 
     */
    public boolean isAllowSysReplenishment() {
        return allowSysReplenishment;
    }

    /**
     * Sets the value of the allowSysReplenishment property.
     * 
     */
    public void setAllowSysReplenishment(boolean value) {
        this.allowSysReplenishment = value;
    }

    /**
     * Gets the value of the allowSysClose property.
     * 
     */
    public boolean isAllowSysClose() {
        return allowSysClose;
    }

    /**
     * Sets the value of the allowSysClose property.
     * 
     */
    public void setAllowSysClose(boolean value) {
        this.allowSysClose = value;
    }

    /**
     * Gets the value of the infoShort property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInfoShort() {
        return infoShort;
    }

    /**
     * Sets the value of the infoShort property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInfoShort(String value) {
        this.infoShort = value;
    }

    /**
     * Gets the value of the infoFull property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInfoFull() {
        return infoFull;
    }

    /**
     * Sets the value of the infoFull property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInfoFull(String value) {
        this.infoFull = value;
    }

    /**
     * Gets the value of the bankDepositPeriod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bankDepositPeriod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBankDepositPeriod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BankDepositPeriod }
     * 
     * 
     */
    public List<BankDepositPeriod> getBankDepositPeriod() {
        if (bankDepositPeriod == null) {
            bankDepositPeriod = new ArrayList<BankDepositPeriod>();
        }
        return this.bankDepositPeriod;
    }

}
