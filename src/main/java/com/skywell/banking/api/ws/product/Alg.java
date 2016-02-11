
package com.skywell.banking.api.ws.product;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for alg complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="alg">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="operType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sendClientProduct" type="{http://cb.ukrpay.net/common/ws/product}clientProduct" minOccurs="0"/>
 *         &lt;element name="resvClientProduct" type="{http://cb.ukrpay.net/common/ws/product}clientProduct" minOccurs="0"/>
 *         &lt;element name="algTarif" type="{http://cb.ukrpay.net/common/ws/product}algTarif" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "alg", propOrder = {
    "id",
    "operType",
    "sendClientProduct",
    "resvClientProduct",
    "algTarif"
})
public class Alg {

    protected int id;
    @XmlElement(required = true)
    protected String operType;
    protected ClientProduct sendClientProduct;
    protected ClientProduct resvClientProduct;
    protected AlgTarif algTarif;

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
     * Gets the value of the sendClientProduct property.
     * 
     * @return
     *     possible object is
     *     {@link ClientProduct }
     *     
     */
    public ClientProduct getSendClientProduct() {
        return sendClientProduct;
    }

    /**
     * Sets the value of the sendClientProduct property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClientProduct }
     *     
     */
    public void setSendClientProduct(ClientProduct value) {
        this.sendClientProduct = value;
    }

    /**
     * Gets the value of the resvClientProduct property.
     * 
     * @return
     *     possible object is
     *     {@link ClientProduct }
     *     
     */
    public ClientProduct getResvClientProduct() {
        return resvClientProduct;
    }

    /**
     * Sets the value of the resvClientProduct property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClientProduct }
     *     
     */
    public void setResvClientProduct(ClientProduct value) {
        this.resvClientProduct = value;
    }

    /**
     * Gets the value of the algTarif property.
     * 
     * @return
     *     possible object is
     *     {@link AlgTarif }
     *     
     */
    public AlgTarif getAlgTarif() {
        return algTarif;
    }

    /**
     * Sets the value of the algTarif property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlgTarif }
     *     
     */
    public void setAlgTarif(AlgTarif value) {
        this.algTarif = value;
    }

}
