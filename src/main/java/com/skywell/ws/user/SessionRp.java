
package com.skywell.ws.user;

import com.skywell.ws.ResultRp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sessionRp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sessionRp">
 *   &lt;complexContent>
 *     &lt;extension base="{http://cb.ukrpay.net/common/ws}resultRp">
 *       &lt;sequence>
 *         &lt;element name="result" type="{http://cb.ukrpay.net/common/ws/user}session" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sessionRp", propOrder = {
    "result"
})
public class SessionRp
    extends ResultRp
{

    protected Session result;

    /**
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link Session }
     *     
     */
    public Session getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link Session }
     *     
     */
    public void setResult(Session value) {
        this.result = value;
    }

}
