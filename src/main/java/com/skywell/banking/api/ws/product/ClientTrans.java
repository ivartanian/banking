
package com.skywell.banking.api.ws.product;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for clientTrans complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="clientTrans">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="clientId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="clientProductId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="clientProductName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="createDt" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="execDt" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="transName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="termName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transAmount" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="transCurrencyId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="transCurrencyAlias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="productAmount" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="productCurrencyId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="productCurrencyAlias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "clientTrans", propOrder = {
    "id",
    "clientId",
    "clientProductId",
    "clientProductName",
    "createDt",
    "execDt",
    "transName",
    "termName",
    "transAmount",
    "transCurrencyId",
    "transCurrencyAlias",
    "productAmount",
    "productCurrencyId",
    "productCurrencyAlias"
})
public class ClientTrans {

    protected String id;
    protected long clientId;
    protected long clientProductId;
    protected String clientProductName;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createDt;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar execDt;
    protected String transName;
    protected String termName;
    protected long transAmount;
    protected int transCurrencyId;
    protected String transCurrencyAlias;
    protected long productAmount;
    protected int productCurrencyId;
    protected String productCurrencyAlias;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the clientId property.
     * 
     */
    public long getClientId() {
        return clientId;
    }

    /**
     * Sets the value of the clientId property.
     * 
     */
    public void setClientId(long value) {
        this.clientId = value;
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

    /**
     * Gets the value of the clientProductName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientProductName() {
        return clientProductName;
    }

    /**
     * Sets the value of the clientProductName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientProductName(String value) {
        this.clientProductName = value;
    }

    /**
     * Gets the value of the createDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreateDt() {
        return createDt;
    }

    /**
     * Sets the value of the createDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreateDt(XMLGregorianCalendar value) {
        this.createDt = value;
    }

    /**
     * Gets the value of the execDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExecDt() {
        return execDt;
    }

    /**
     * Sets the value of the execDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExecDt(XMLGregorianCalendar value) {
        this.execDt = value;
    }

    /**
     * Gets the value of the transName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransName() {
        return transName;
    }

    /**
     * Sets the value of the transName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransName(String value) {
        this.transName = value;
    }

    /**
     * Gets the value of the termName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTermName() {
        return termName;
    }

    /**
     * Sets the value of the termName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTermName(String value) {
        this.termName = value;
    }

    /**
     * Gets the value of the transAmount property.
     * 
     */
    public long getTransAmount() {
        return transAmount;
    }

    /**
     * Sets the value of the transAmount property.
     * 
     */
    public void setTransAmount(long value) {
        this.transAmount = value;
    }

    /**
     * Gets the value of the transCurrencyId property.
     * 
     */
    public int getTransCurrencyId() {
        return transCurrencyId;
    }

    /**
     * Sets the value of the transCurrencyId property.
     * 
     */
    public void setTransCurrencyId(int value) {
        this.transCurrencyId = value;
    }

    /**
     * Gets the value of the transCurrencyAlias property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransCurrencyAlias() {
        return transCurrencyAlias;
    }

    /**
     * Sets the value of the transCurrencyAlias property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransCurrencyAlias(String value) {
        this.transCurrencyAlias = value;
    }

    /**
     * Gets the value of the productAmount property.
     * 
     */
    public long getProductAmount() {
        return productAmount;
    }

    /**
     * Sets the value of the productAmount property.
     * 
     */
    public void setProductAmount(long value) {
        this.productAmount = value;
    }

    /**
     * Gets the value of the productCurrencyId property.
     * 
     */
    public int getProductCurrencyId() {
        return productCurrencyId;
    }

    /**
     * Sets the value of the productCurrencyId property.
     * 
     */
    public void setProductCurrencyId(int value) {
        this.productCurrencyId = value;
    }

    /**
     * Gets the value of the productCurrencyAlias property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductCurrencyAlias() {
        return productCurrencyAlias;
    }

    /**
     * Sets the value of the productCurrencyAlias property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductCurrencyAlias(String value) {
        this.productCurrencyAlias = value;
    }

}
