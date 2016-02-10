
package com.skywell.ws.product;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.skywell.ws.user.OtpReq;


/**
 * <p>Java class for oper complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="oper">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="operType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="clientId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="clientProductId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="clientProductName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bankProductId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="bankProductName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bankProductTypeId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="bankProductTypeAlias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="operCreate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="operExec" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="operRollback" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="extrnId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="operStateId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="operStateNote" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="note" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="operAmount" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="operCurrencyId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="operCurrencyAlias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="interestAmount" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="interestCurrencyId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="interestCurrencyAlias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="varList" type="{http://cb.ukrpay.net/common/ws/product}operVar" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="otpReq" type="{http://cb.ukrpay.net/common/ws/user}otpReq" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "oper", propOrder = {
    "id",
    "operType",
    "clientId",
    "clientProductId",
    "clientProductName",
    "bankProductId",
    "bankProductName",
    "bankProductTypeId",
    "bankProductTypeAlias",
    "operCreate",
    "operExec",
    "operRollback",
    "extrnId",
    "operStateId",
    "operStateNote",
    "name",
    "note",
    "operAmount",
    "operCurrencyId",
    "operCurrencyAlias",
    "interestAmount",
    "interestCurrencyId",
    "interestCurrencyAlias",
    "varList",
    "otpReq"
})
public class Oper {

    protected long id;
    protected String operType;
    protected long clientId;
    protected long clientProductId;
    protected String clientProductName;
    protected int bankProductId;
    protected String bankProductName;
    protected int bankProductTypeId;
    protected String bankProductTypeAlias;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar operCreate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar operExec;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar operRollback;
    protected String extrnId;
    protected int operStateId;
    protected String operStateNote;
    protected String name;
    protected String note;
    protected long operAmount;
    protected int operCurrencyId;
    protected String operCurrencyAlias;
    protected long interestAmount;
    protected int interestCurrencyId;
    protected String interestCurrencyAlias;
    @XmlElement(nillable = true)
    protected List<OperVar> varList;
    protected OtpReq otpReq;

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
     * Gets the value of the operType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperType() {
        return operType;
    }

    /**
     * Sets the value of the operType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperType(String value) {
        this.operType = value;
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
     * Gets the value of the bankProductName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankProductName() {
        return bankProductName;
    }

    /**
     * Sets the value of the bankProductName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankProductName(String value) {
        this.bankProductName = value;
    }

    /**
     * Gets the value of the bankProductTypeId property.
     * 
     */
    public int getBankProductTypeId() {
        return bankProductTypeId;
    }

    /**
     * Sets the value of the bankProductTypeId property.
     * 
     */
    public void setBankProductTypeId(int value) {
        this.bankProductTypeId = value;
    }

    /**
     * Gets the value of the bankProductTypeAlias property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankProductTypeAlias() {
        return bankProductTypeAlias;
    }

    /**
     * Sets the value of the bankProductTypeAlias property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankProductTypeAlias(String value) {
        this.bankProductTypeAlias = value;
    }

    /**
     * Gets the value of the operCreate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOperCreate() {
        return operCreate;
    }

    /**
     * Sets the value of the operCreate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOperCreate(XMLGregorianCalendar value) {
        this.operCreate = value;
    }

    /**
     * Gets the value of the operExec property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOperExec() {
        return operExec;
    }

    /**
     * Sets the value of the operExec property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOperExec(XMLGregorianCalendar value) {
        this.operExec = value;
    }

    /**
     * Gets the value of the operRollback property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOperRollback() {
        return operRollback;
    }

    /**
     * Sets the value of the operRollback property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOperRollback(XMLGregorianCalendar value) {
        this.operRollback = value;
    }

    /**
     * Gets the value of the extrnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtrnId() {
        return extrnId;
    }

    /**
     * Sets the value of the extrnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtrnId(String value) {
        this.extrnId = value;
    }

    /**
     * Gets the value of the operStateId property.
     * 
     */
    public int getOperStateId() {
        return operStateId;
    }

    /**
     * Sets the value of the operStateId property.
     * 
     */
    public void setOperStateId(int value) {
        this.operStateId = value;
    }

    /**
     * Gets the value of the operStateNote property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperStateNote() {
        return operStateNote;
    }

    /**
     * Sets the value of the operStateNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperStateNote(String value) {
        this.operStateNote = value;
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
     * Gets the value of the note property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNote() {
        return note;
    }

    /**
     * Sets the value of the note property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNote(String value) {
        this.note = value;
    }

    /**
     * Gets the value of the operAmount property.
     * 
     */
    public long getOperAmount() {
        return operAmount;
    }

    /**
     * Sets the value of the operAmount property.
     * 
     */
    public void setOperAmount(long value) {
        this.operAmount = value;
    }

    /**
     * Gets the value of the operCurrencyId property.
     * 
     */
    public int getOperCurrencyId() {
        return operCurrencyId;
    }

    /**
     * Sets the value of the operCurrencyId property.
     * 
     */
    public void setOperCurrencyId(int value) {
        this.operCurrencyId = value;
    }

    /**
     * Gets the value of the operCurrencyAlias property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperCurrencyAlias() {
        return operCurrencyAlias;
    }

    /**
     * Sets the value of the operCurrencyAlias property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperCurrencyAlias(String value) {
        this.operCurrencyAlias = value;
    }

    /**
     * Gets the value of the interestAmount property.
     * 
     */
    public long getInterestAmount() {
        return interestAmount;
    }

    /**
     * Sets the value of the interestAmount property.
     * 
     */
    public void setInterestAmount(long value) {
        this.interestAmount = value;
    }

    /**
     * Gets the value of the interestCurrencyId property.
     * 
     */
    public int getInterestCurrencyId() {
        return interestCurrencyId;
    }

    /**
     * Sets the value of the interestCurrencyId property.
     * 
     */
    public void setInterestCurrencyId(int value) {
        this.interestCurrencyId = value;
    }

    /**
     * Gets the value of the interestCurrencyAlias property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterestCurrencyAlias() {
        return interestCurrencyAlias;
    }

    /**
     * Sets the value of the interestCurrencyAlias property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterestCurrencyAlias(String value) {
        this.interestCurrencyAlias = value;
    }

    /**
     * Gets the value of the varList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the varList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVarList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OperVar }
     * 
     * 
     */
    public List<OperVar> getVarList() {
        if (varList == null) {
            varList = new ArrayList<OperVar>();
        }
        return this.varList;
    }

    /**
     * Gets the value of the otpReq property.
     * 
     * @return
     *     possible object is
     *     {@link OtpReq }
     *     
     */
    public OtpReq getOtpReq() {
        return otpReq;
    }

    /**
     * Sets the value of the otpReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtpReq }
     *     
     */
    public void setOtpReq(OtpReq value) {
        this.otpReq = value;
    }

}
