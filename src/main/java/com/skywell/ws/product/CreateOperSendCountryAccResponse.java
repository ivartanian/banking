
package com.skywell.ws.product;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for createOperSendCountryAccResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="createOperSendCountryAccResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://cb.ukrpay.net/common/ws/product}operRp"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createOperSendCountryAccResponse", propOrder = {
    "_return"
})
public class CreateOperSendCountryAccResponse {

    @XmlElement(name = "return", required = true)
    protected OperRp _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link OperRp }
     *     
     */
    public OperRp getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperRp }
     *     
     */
    public void setReturn(OperRp value) {
        this._return = value;
    }

}
