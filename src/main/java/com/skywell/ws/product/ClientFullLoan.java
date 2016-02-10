
package com.skywell.ws.product;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for clientFullLoan complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="clientFullLoan">
 *   &lt;complexContent>
 *     &lt;extension base="{http://cb.ukrpay.net/common/ws/product}clientFullProduct">
 *       &lt;sequence>
 *         &lt;element name="nextPaymentDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="nextPaymentAmount" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="loanPeriodValue" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="rate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="overdueAmount" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="overdueInterestAmount" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="overdueFeeAmount" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="penaltyAmount" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="startAmount" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="feeAmount" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "clientFullLoan", propOrder = {
    "nextPaymentDate",
    "nextPaymentAmount",
    "loanPeriodValue",
    "rate",
    "overdueAmount",
    "overdueInterestAmount",
    "overdueFeeAmount",
    "penaltyAmount",
    "startAmount",
    "feeAmount"
})
public class ClientFullLoan
    extends ClientFullProduct
{

    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar nextPaymentDate;
    protected long nextPaymentAmount;
    protected int loanPeriodValue;
    protected String rate;
    protected long overdueAmount;
    protected long overdueInterestAmount;
    protected long overdueFeeAmount;
    protected long penaltyAmount;
    protected long startAmount;
    protected long feeAmount;

    /**
     * Gets the value of the nextPaymentDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNextPaymentDate() {
        return nextPaymentDate;
    }

    /**
     * Sets the value of the nextPaymentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNextPaymentDate(XMLGregorianCalendar value) {
        this.nextPaymentDate = value;
    }

    /**
     * Gets the value of the nextPaymentAmount property.
     * 
     */
    public long getNextPaymentAmount() {
        return nextPaymentAmount;
    }

    /**
     * Sets the value of the nextPaymentAmount property.
     * 
     */
    public void setNextPaymentAmount(long value) {
        this.nextPaymentAmount = value;
    }

    /**
     * Gets the value of the loanPeriodValue property.
     * 
     */
    public int getLoanPeriodValue() {
        return loanPeriodValue;
    }

    /**
     * Sets the value of the loanPeriodValue property.
     * 
     */
    public void setLoanPeriodValue(int value) {
        this.loanPeriodValue = value;
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
     * Gets the value of the overdueAmount property.
     * 
     */
    public long getOverdueAmount() {
        return overdueAmount;
    }

    /**
     * Sets the value of the overdueAmount property.
     * 
     */
    public void setOverdueAmount(long value) {
        this.overdueAmount = value;
    }

    /**
     * Gets the value of the overdueInterestAmount property.
     * 
     */
    public long getOverdueInterestAmount() {
        return overdueInterestAmount;
    }

    /**
     * Sets the value of the overdueInterestAmount property.
     * 
     */
    public void setOverdueInterestAmount(long value) {
        this.overdueInterestAmount = value;
    }

    /**
     * Gets the value of the overdueFeeAmount property.
     * 
     */
    public long getOverdueFeeAmount() {
        return overdueFeeAmount;
    }

    /**
     * Sets the value of the overdueFeeAmount property.
     * 
     */
    public void setOverdueFeeAmount(long value) {
        this.overdueFeeAmount = value;
    }

    /**
     * Gets the value of the penaltyAmount property.
     * 
     */
    public long getPenaltyAmount() {
        return penaltyAmount;
    }

    /**
     * Sets the value of the penaltyAmount property.
     * 
     */
    public void setPenaltyAmount(long value) {
        this.penaltyAmount = value;
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
     * Gets the value of the feeAmount property.
     * 
     */
    public long getFeeAmount() {
        return feeAmount;
    }

    /**
     * Sets the value of the feeAmount property.
     * 
     */
    public void setFeeAmount(long value) {
        this.feeAmount = value;
    }

}
