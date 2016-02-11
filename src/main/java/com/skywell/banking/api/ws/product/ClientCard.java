
package com.skywell.banking.api.ws.product;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for clientCard complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="clientCard">
 *   &lt;complexContent>
 *     &lt;extension base="{http://cb.ukrpay.net/common/ws/product}clientProduct">
 *       &lt;sequence>
 *         &lt;element name="cardNumberMasked" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardExpireDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="cardTypeId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="cardLogo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardKindId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="cardStateId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ownAmount" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "clientCard", propOrder = {
    "cardNumberMasked",
    "cardExpireDate",
    "cardTypeId",
    "cardLogo",
    "cardKindId",
    "cardStateId",
    "ownAmount"
})
public class ClientCard
    extends ClientProduct
{

    protected String cardNumberMasked;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar cardExpireDate;
    protected int cardTypeId;
    protected String cardLogo;
    protected int cardKindId;
    protected int cardStateId;
    protected long ownAmount;

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

}
