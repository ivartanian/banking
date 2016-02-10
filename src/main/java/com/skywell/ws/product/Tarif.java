
package com.skywell.ws.product;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tarif complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tarif">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="currencyId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="currencyAlias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fixAmount" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="prcAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="minAmount" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="maxAmount" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="koef" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tarifAdded" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tarif", propOrder = {
    "id",
    "name",
    "currencyId",
    "currencyAlias",
    "fixAmount",
    "prcAmount",
    "minAmount",
    "maxAmount",
    "koef",
    "tarifAdded"
})
public class Tarif {

    protected int id;
    protected String name;
    protected int currencyId;
    protected String currencyAlias;
    protected long fixAmount;
    protected String prcAmount;
    protected long minAmount;
    protected long maxAmount;
    protected String koef;
    protected boolean tarifAdded;

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
     * Gets the value of the fixAmount property.
     * 
     */
    public long getFixAmount() {
        return fixAmount;
    }

    /**
     * Sets the value of the fixAmount property.
     * 
     */
    public void setFixAmount(long value) {
        this.fixAmount = value;
    }

    /**
     * Gets the value of the prcAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrcAmount() {
        return prcAmount;
    }

    /**
     * Sets the value of the prcAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrcAmount(String value) {
        this.prcAmount = value;
    }

    /**
     * Gets the value of the minAmount property.
     * 
     */
    public long getMinAmount() {
        return minAmount;
    }

    /**
     * Sets the value of the minAmount property.
     * 
     */
    public void setMinAmount(long value) {
        this.minAmount = value;
    }

    /**
     * Gets the value of the maxAmount property.
     * 
     */
    public long getMaxAmount() {
        return maxAmount;
    }

    /**
     * Sets the value of the maxAmount property.
     * 
     */
    public void setMaxAmount(long value) {
        this.maxAmount = value;
    }

    /**
     * Gets the value of the koef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKoef() {
        return koef;
    }

    /**
     * Sets the value of the koef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKoef(String value) {
        this.koef = value;
    }

    /**
     * Gets the value of the tarifAdded property.
     * 
     */
    public boolean isTarifAdded() {
        return tarifAdded;
    }

    /**
     * Sets the value of the tarifAdded property.
     * 
     */
    public void setTarifAdded(boolean value) {
        this.tarifAdded = value;
    }

}
