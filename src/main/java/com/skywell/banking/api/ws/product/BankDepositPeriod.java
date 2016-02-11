
package com.skywell.banking.api.ws.product;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for bankDepositPeriod complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="bankDepositPeriod">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="depoPeriodValue" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="depoPeriodType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="interestPeriodType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="capitalizationPeriodType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="allowReplenishment" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="openAmountMin" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="openAmountMax" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bankDepositPeriod", propOrder = {
    "id",
    "depoPeriodValue",
    "depoPeriodType",
    "rate",
    "interestPeriodType",
    "capitalizationPeriodType",
    "allowReplenishment",
    "openAmountMin",
    "openAmountMax"
})
public class BankDepositPeriod {

    protected int id;
    protected int depoPeriodValue;
    protected String depoPeriodType;
    protected String rate;
    protected String interestPeriodType;
    protected String capitalizationPeriodType;
    protected boolean allowReplenishment;
    protected long openAmountMin;
    protected long openAmountMax;

    /**
     * Gets the value of the id property.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Gets the value of the depoPeriodValue property.
     * 
     */
    public int getDepoPeriodValue() {
        return depoPeriodValue;
    }

    /**
     * Sets the value of the depoPeriodValue property.
     * 
     */
    public void setDepoPeriodValue(int value) {
        this.depoPeriodValue = value;
    }

    /**
     * Gets the value of the depoPeriodType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepoPeriodType() {
        return depoPeriodType;
    }

    /**
     * Sets the value of the depoPeriodType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepoPeriodType(String value) {
        this.depoPeriodType = value;
    }

    /**
     * Gets the value of the rate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRate() {
        return rate;
    }

    /**
     * Sets the value of the rate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRate(String value) {
        this.rate = value;
    }

    /**
     * Gets the value of the interestPeriodType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterestPeriodType() {
        return interestPeriodType;
    }

    /**
     * Sets the value of the interestPeriodType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterestPeriodType(String value) {
        this.interestPeriodType = value;
    }

    /**
     * Gets the value of the capitalizationPeriodType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCapitalizationPeriodType() {
        return capitalizationPeriodType;
    }

    /**
     * Sets the value of the capitalizationPeriodType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCapitalizationPeriodType(String value) {
        this.capitalizationPeriodType = value;
    }

    /**
     * Gets the value of the allowReplenishment property.
     * 
     */
    public boolean isAllowReplenishment() {
        return allowReplenishment;
    }

    /**
     * Sets the value of the allowReplenishment property.
     * 
     */
    public void setAllowReplenishment(boolean value) {
        this.allowReplenishment = value;
    }

    /**
     * Gets the value of the openAmountMin property.
     * 
     */
    public long getOpenAmountMin() {
        return openAmountMin;
    }

    /**
     * Sets the value of the openAmountMin property.
     * 
     */
    public void setOpenAmountMin(long value) {
        this.openAmountMin = value;
    }

    /**
     * Gets the value of the openAmountMax property.
     * 
     */
    public long getOpenAmountMax() {
        return openAmountMax;
    }

    /**
     * Sets the value of the openAmountMax property.
     * 
     */
    public void setOpenAmountMax(long value) {
        this.openAmountMax = value;
    }

}
