
package com.skywell.banking.api.ws.product;

import com.skywell.banking.api.ws.ReqBase;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for createOperSendCountryCard complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="createOperSendCountryCard">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="reqBase" type="{http://cb.ukrpay.net/common/ws}reqBase"/>
 *         &lt;element name="clientProductId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="operAmount" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="operCurrencyId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="note" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="varList" type="{http://cb.ukrpay.net/common/ws/product}operVar" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="resvCountryCard" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createOperSendCountryCard", propOrder = {
    "reqBase",
    "clientProductId",
    "operAmount",
    "operCurrencyId",
    "note",
    "varList",
    "resvCountryCard"
})
public class CreateOperSendCountryCard {

    @XmlElement(required = true)
    protected ReqBase reqBase;
    protected long clientProductId;
    protected long operAmount;
    protected int operCurrencyId;
    protected String note;
    @XmlElement(nillable = true)
    protected List<OperVar> varList;
    @XmlElement(required = true)
    protected String resvCountryCard;

    /**
     * Gets the value of the reqBase property.
     * 
     * @return
     *     possible object is
     *     {@link ReqBase }
     *     
     */
    public ReqBase getReqBase() {
        return reqBase;
    }

    /**
     * Sets the value of the reqBase property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReqBase }
     *     
     */
    public void setReqBase(ReqBase value) {
        this.reqBase = value;
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
     * Gets the value of the resvCountryCard property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResvCountryCard() {
        return resvCountryCard;
    }

    /**
     * Sets the value of the resvCountryCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResvCountryCard(String value) {
        this.resvCountryCard = value;
    }

}
