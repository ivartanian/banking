
package com.skywell.ws.serv;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getServListResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getServListResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://cb.ukrpay.net/common/ws/serv}servListRp"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getServListResponse", propOrder = {
    "_return"
})
public class GetServListResponse {

    @XmlElement(name = "return", required = true)
    protected ServListRp _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link ServListRp }
     *     
     */
    public ServListRp getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServListRp }
     *     
     */
    public void setReturn(ServListRp value) {
        this._return = value;
    }

}
