
package com.skywell.banking.api.ws.product;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for clientFullCard complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="clientFullCard">
 *   &lt;complexContent>
 *     &lt;extension base="{http://cb.ukrpay.net/common/ws/product}clientFullProduct">
 *       &lt;sequence>
 *         &lt;element name="cardNumberMasked" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardExpireDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="cardTypeId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="cardLogo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardKindId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="cardStateId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ownAmount" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="creditAmount" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="creditLimit" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="holdAmount" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="cardAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardHolderName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="interestRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="limitDailyAmount" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="limitDailyCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="smsServiceEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "clientFullCard", propOrder = {
    "cardNumberMasked",
    "cardExpireDate",
    "cardTypeId",
    "cardLogo",
    "cardKindId",
    "cardStateId",
    "ownAmount",
    "creditAmount",
    "creditLimit",
    "holdAmount",
    "cardAccount",
    "cardHolderName",
    "interestRate",
    "limitDailyAmount",
    "limitDailyCount",
    "smsServiceEnabled"
})
public class ClientFullCard
    extends ClientFullProduct
{

    protected String cardNumberMasked;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar cardExpireDate;
    protected int cardTypeId;
    protected String cardLogo;
    protected int cardKindId;
    protected int cardStateId;
    protected long ownAmount;
    protected long creditAmount;
    protected long creditLimit;
    protected long holdAmount;
    protected String cardAccount;
    protected String cardHolderName;
    protected String interestRate;
    protected long limitDailyAmount;
    protected int limitDailyCount;
    protected boolean smsServiceEnabled;

    /**
     * Gets the value of the cardNumberMasked property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardNumberMasked() {
        return cardNumberMasked;
    }

    /**
     * Sets the value of the cardNumberMasked property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardNumberMasked(String value) {
        this.cardNumberMasked = value;
    }

    /**
     * Gets the value of the cardExpireDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCardExpireDate() {
        return cardExpireDate;
    }

    /**
     * Sets the value of the cardExpireDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCardExpireDate(XMLGregorianCalendar value) {
        this.cardExpireDate = value;
    }

    /**
     * Gets the value of the cardTypeId property.
     * 
     */
    public int getCardTypeId() {
        return cardTypeId;
    }

    /**
     * Sets the value of the cardTypeId property.
     * 
     */
    public void setCardTypeId(int value) {
        this.cardTypeId = value;
    }

    /**
     * Gets the value of the cardLogo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardLogo() {
        return cardLogo;
    }

    /**
     * Sets the value of the cardLogo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardLogo(String value) {
        this.cardLogo = value;
    }

    /**
     * Gets the value of the cardKindId property.
     * 
     */
    public int getCardKindId() {
        return cardKindId;
    }

    /**
     * Sets the value of the cardKindId property.
     * 
     */
    public void setCardKindId(int value) {
        this.cardKindId = value;
    }

    /**
     * Gets the value of the cardStateId property.
     * 
     */
    public int getCardStateId() {
        return cardStateId;
    }

    /**
     * Sets the value of the cardStateId property.
     * 
     */
    public void setCardStateId(int value) {
        this.cardStateId = value;
    }

    /**
     * Gets the value of the ownAmount property.
     * 
     */
    public long getOwnAmount() {
        return ownAmount;
    }

    /**
     * Sets the value of the ownAmount property.
     * 
     */
    public void setOwnAmount(long value) {
        this.ownAmount = value;
    }

    /**
     * Gets the value of the creditAmount property.
     * 
     */
    public long getCreditAmount() {
        return creditAmount;
    }

    /**
     * Sets the value of the creditAmount property.
     * 
     */
    public void setCreditAmount(long value) {
        this.creditAmount = value;
    }

    /**
     * Gets the value of the creditLimit property.
     * 
     */
    public long getCreditLimit() {
        return creditLimit;
    }

    /**
     * Sets the value of the creditLimit property.
     * 
     */
    public void setCreditLimit(long value) {
        this.creditLimit = value;
    }

    /**
     * Gets the value of the holdAmount property.
     * 
     */
    public long getHoldAmount() {
        return holdAmount;
    }

    /**
     * Sets the value of the holdAmount property.
     * 
     */
    public void setHoldAmount(long value) {
        this.holdAmount = value;
    }

    /**
     * Gets the value of the cardAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardAccount() {
        return cardAccount;
    }

    /**
     * Sets the value of the cardAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardAccount(String value) {
        this.cardAccount = value;
    }

    /**
     * Gets the value of the cardHolderName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardHolderName() {
        return cardHolderName;
    }

    /**
     * Sets the value of the cardHolderName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardHolderName(String value) {
        this.cardHolderName = value;
    }

    /**
     * Gets the value of the interestRate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterestRate() {
        return interestRate;
    }

    /**
     * Sets the value of the interestRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterestRate(String value) {
        this.interestRate = value;
    }

    /**
     * Gets the value of the limitDailyAmount property.
     * 
     */
    public long getLimitDailyAmount() {
        return limitDailyAmount;
    }

    /**
     * Sets the value of the limitDailyAmount property.
     * 
     */
    public void setLimitDailyAmount(long value) {
        this.limitDailyAmount = value;
    }

    /**
     * Gets the value of the limitDailyCount property.
     * 
     */
    public int getLimitDailyCount() {
        return limitDailyCount;
    }

    /**
     * Sets the value of the limitDailyCount property.
     * 
     */
    public void setLimitDailyCount(int value) {
        this.limitDailyCount = value;
    }

    /**
     * Gets the value of the smsServiceEnabled property.
     * 
     */
    public boolean isSmsServiceEnabled() {
        return smsServiceEnabled;
    }

    /**
     * Sets the value of the smsServiceEnabled property.
     * 
     */
    public void setSmsServiceEnabled(boolean value) {
        this.smsServiceEnabled = value;
    }

}
