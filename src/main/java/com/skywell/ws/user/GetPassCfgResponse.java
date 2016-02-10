
package com.skywell.ws.user;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getPassCfgResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getPassCfgResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://cb.ukrpay.net/common/ws/user}userPassCfgRp"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getPassCfgResponse", propOrder = {
    "_return"
})
public class GetPassCfgResponse {

    @XmlElement(name = "return", required = true)
    protected UserPassCfgRp _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link UserPassCfgRp }
     *     
     */
    public UserPassCfgRp getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserPassCfgRp }
     *     
     */
    public void setReturn(UserPassCfgRp value) {
        this._return = value;
    }

}
