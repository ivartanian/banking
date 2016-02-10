
package com.skywell.ws.product;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for algTarifRec complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="algTarifRec">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="amountFrom" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="amountTo" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="tarifFix" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="tarifPrc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tarifMin" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="tarifMax" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="currencyId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="currencyAlias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "algTarifRec", propOrder = {
    "amountFrom",
    "amountTo",
    "tarifFix",
    "tarifPrc",
    "tarifMin",
    "tarifMax",
    "currencyId",
    "currencyAlias"
})
public class AlgTarifRec {

    protected long amountFrom;
    protected long amountTo;
    protected long tarifFix;
    protected String tarifPrc;
    protected long tarifMin;
    protected long tarifMax;
    protected int currencyId;
    protected String currencyAlias;

    /**
     * Gets the value of the amountFrom property.
     * 
     */
    public long getAmountFrom() {
        return amountFrom;
    }

    /**
     * Sets the value of the amountFrom property.
     * 
     */
    public void setAmountFrom(long value) {
        this.amountFrom = value;
    }

    /**
     * Gets the value of the amountTo property.
     * 
     */
    public long getAmountTo() {
        return amountTo;
    }

    /**
     * Sets the value of the amountTo property.
     * 
     */
    public void setAmountTo(long value) {
        this.amountTo = value;
    }

    /**
     * Gets the value of the tarifFix property.
     * 
     */
    public long getTarifFix() {
        return tarifFix;
    }

    /**
     * Sets the value of the tarifFix property.
     * 
     */
    public void setTarifFix(long value) {
        this.tarifFix = value;
    }

    /**
     * Gets the value of the tarifPrc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTarifPrc() {
        return tarifPrc;
    }

    /**
     * Sets the value of the tarifPrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTarifPrc(String value) {
        this.tarifPrc = value;
    }

    /**
     * Gets the value of the tarifMin property.
     * 
     */
    public long getTarifMin() {
        return tarifMin;
    }

    /**
     * Sets the value of the tarifMin property.
     * 
     */
    public void setTarifMin(long value) {
        this.tarifMin = value;
    }

    /**
     * Gets the value of the tarifMax property.
     * 
     */
    public long getTarifMax() {
        return tarifMax;
    }

    /**
     * Sets the value of the tarifMax property.
     * 
     */
    public void setTarifMax(long value) {
        this.tarifMax = value;
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

}
