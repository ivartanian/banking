
package com.skywell.banking.api.ws.product;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for payProduct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="payProduct">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="clientProduct" type="{http://cb.ukrpay.net/common/ws/product}clientProduct" minOccurs="0"/>
 *         &lt;element name="tarif" type="{http://cb.ukrpay.net/common/ws/product}tarif" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "payProduct", propOrder = {
    "clientProduct",
    "tarif"
})
public class PayProduct {

    protected ClientProduct clientProduct;
    protected Tarif tarif;

    /**
     * Gets the value of the clientProduct property.
     * 
     * @return
     *     possible object is
     *     {@link ClientProduct }
     *     
     */
    public ClientProduct getClientProduct() {
        return clientProduct;
    }

    /**
     * Sets the value of the clientProduct property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClientProduct }
     *     
     */
    public void setClientProduct(ClientProduct value) {
        this.clientProduct = value;
    }

    /**
     * Gets the value of the tarif property.
     * 
     * @return
     *     possible object is
     *     {@link Tarif }
     *     
     */
    public Tarif getTarif() {
        return tarif;
    }

    /**
     * Sets the value of the tarif property.
     * 
     * @param value
     *     allowed object is
     *     {@link Tarif }
     *     
     */
    public void setTarif(Tarif value) {
        this.tarif = value;
    }

}
