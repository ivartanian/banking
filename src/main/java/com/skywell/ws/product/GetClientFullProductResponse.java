
package com.skywell.ws.product;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getClientFullProductResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getClientFullProductResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://cb.ukrpay.net/common/ws/product}clientFullProductRp"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getClientFullProductResponse", propOrder = {
    "_return"
})
public class GetClientFullProductResponse {

    @XmlElement(name = "return", required = true)
    protected ClientFullProductRp _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link ClientFullProductRp }
     *     
     */
    public ClientFullProductRp getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClientFullProductRp }
     *     
     */
    public void setReturn(ClientFullProductRp value) {
        this._return = value;
    }

}
