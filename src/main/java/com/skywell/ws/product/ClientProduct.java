
package com.skywell.ws.product;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for clientProduct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="clientProduct">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="typeId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="typeAlias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bankProductId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="currencyId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="currencyAlias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="balance" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="syncBalance" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "clientProduct", propOrder = {
    "id",
    "typeId",
    "typeAlias",
    "bankProductId",
    "currencyId",
    "currencyAlias",
    "name",
    "balance",
    "syncBalance"
})
@XmlSeeAlso({
    ClientAccount.class,
    ClientCard.class,
    ClientDeposit.class,
    ClientLoan.class
})
public class ClientProduct {

    protected long id;
    protected int typeId;
    protected String typeAlias;
    protected int bankProductId;
    protected int currencyId;
    protected String currencyAlias;
    protected String name;
    protected long balance;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar syncBalance;

    /**
     * Gets the value of the id property.
     * 
     */
    public long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(long value) {
        this.id = value;
    }

    /**
     * Gets the value of the typeId property.
     * 
     */
    public int getTypeId() {
        return typeId;
    }

    /**
     * Sets the value of the typeId property.
     * 
     */
    public void setTypeId(int value) {
        this.typeId = value;
    }

    /**
     * Gets the value of the typeAlias property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeAlias() {
        return typeAlias;
    }

    /**
     * Sets the value of the typeAlias property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeAlias(String value) {
        this.typeAlias = value;
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
     * Gets the value of the currencyAlias property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyAlias() {
        return currencyAlias;
    }

    /**
     * Sets the value of the currencyAlias property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyAlias(String value) {
        this.currencyAlias = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the balance property.
     * 
     */
    public long getBalance() {
        return balance;
    }

    /**
     * Sets the value of the balance property.
     * 
     */
    public void setBalance(long value) {
        this.balance = value;
    }

    /**
     * Gets the value of the syncBalance property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSyncBalance() {
        return syncBalance;
    }

    /**
     * Sets the value of the syncBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSyncBalance(XMLGregorianCalendar value) {
        this.syncBalance = value;
    }

}
