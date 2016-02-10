
package com.skywell.ws.serv;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getServInfoResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getServInfoResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://cb.ukrpay.net/common/ws/serv}servInfoRp"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getServInfoResponse", propOrder = {
    "_return"
})
public class GetServInfoResponse {

    @XmlElement(name = "return", required = true)
    protected ServInfoRp _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link ServInfoRp }
     *     
     */
    public ServInfoRp getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServInfoRp }
     *     
     */
    public void setReturn(ServInfoRp value) {
        this._return = value;
    }

}
