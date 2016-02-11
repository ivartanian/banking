
package com.skywell.banking.api.ws.product;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for clientFullDeposit complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="clientFullDeposit">
 *   &lt;complexContent>
 *     &lt;extension base="{http://cb.ukrpay.net/common/ws/product}clientFullProduct">
 *       &lt;sequence>
 *         &lt;element name="depoPeriodValue" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="depoPeriodType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="interestPeriodType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="capitalizationPeriodType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="allowReplenishment" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="allowWithdraw" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="allowWithdrawPartial" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="startAmount" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="paidAmount" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="interestPaidAmount" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="interestNotPaidAmount" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="penaltyRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="depoPeriodClose" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "clientFullDeposit", propOrder = {
    "depoPeriodValue",
    "depoPeriodType",
    "rate",
    "interestPeriodType",
    "capitalizationPeriodType",
    "allowReplenishment",
    "allowWithdraw",
    "allowWithdrawPartial",
    "startAmount",
    "paidAmount",
    "interestPaidAmount",
    "interestNotPaidAmount",
    "penaltyRate",
    "depoPeriodClose"
})
public class ClientFullDeposit
    extends ClientFullProduct
{

    protected int depoPeriodValue;
    protected String depoPeriodType;
    protected String rate;
    protected String interestPeriodType;
    protected String capitalizationPeriodType;
    protected boolean allowReplenishment;
    protected boolean allowWithdraw;
    protected boolean allowWithdrawPartial;
    protected long startAmount;
    protected long paidAmount;
    protected long interestPaidAmount;
    protected long interestNotPaidAmount;
    protected String penaltyRate;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar depoPeriodClose;

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
     * Gets the value of the allowWithdraw property.
     * 
     */
    public boolean isAllowWithdraw() {
        return allowWithdraw;
    }

    /**
     * Sets the value of the allowWithdraw property.
     * 
     */
    public void setAllowWithdraw(boolean value) {
        this.allowWithdraw = value;
    }

    /**
     * Gets the value of the allowWithdrawPartial property.
     * 
     */
    public boolean isAllowWithdrawPartial() {
        return allowWithdrawPartial;
    }

    /**
     * Sets the value of the allowWithdrawPartial property.
     * 
     */
    public void setAllowWithdrawPartial(boolean value) {
        this.allowWithdrawPartial = value;
    }

    /**
     * Gets the value of the startAmount property.
     * 
     */
    public long getStartAmount() {
        return startAmount;
    }

    /**
     * Sets the value of the startAmount property.
     * 
     */
    public void setStartAmount(long value) {
        this.startAmount = value;
    }

    /**
     * Gets the value of the paidAmount property.
     * 
     */
    public long getPaidAmount() {
        return paidAmount;
    }

    /**
     * Sets the value of the paidAmount property.
     * 
     */
    public void setPaidAmount(long value) {
        this.paidAmount = value;
    }

    /**
     * Gets the value of the interestPaidAmount property.
     * 
     */
    public long getInterestPaidAmount() {
        return interestPaidAmount;
    }

    /**
     * Sets the value of the interestPaidAmount property.
     * 
     */
    public void setInterestPaidAmount(long value) {
        this.interestPaidAmount = value;
    }

    /**
     * Gets the value of the interestNotPaidAmount property.
     * 
     */
    public long getInterestNotPaidAmount() {
        return interestNotPaidAmount;
    }

    /**
     * Sets the value of the interestNotPaidAmount property.
     * 
     */
    public void setInterestNotPaidAmount(long value) {
        this.interestNotPaidAmount = value;
    }

    /**
     * Gets the value of the penaltyRate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPenaltyRate() {
        return penaltyRate;
    }

    /**
     * Sets the value of the penaltyRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPenaltyRate(String value) {
        this.penaltyRate = value;
    }

    /**
     * Gets the value of the depoPeriodClose property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDepoPeriodClose() {
        return depoPeriodClose;
    }

    /**
     * Sets the value of the depoPeriodClose property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDepoPeriodClose(XMLGregorianCalendar value) {
        this.depoPeriodClose = value;
    }

}
