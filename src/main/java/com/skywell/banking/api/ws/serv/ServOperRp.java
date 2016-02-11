
package com.skywell.banking.api.ws.serv;

import com.skywell.banking.api.ws.ResultRp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for servOperRp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="servOperRp">
 *   &lt;complexContent>
 *     &lt;extension base="{http://cb.ukrpay.net/common/ws}resultRp">
 *       &lt;sequence>
 *         &lt;element name="result" type="{http://cb.ukrpay.net/common/ws/serv}servOper" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "servOperRp", propOrder = {
    "result"
})
public class ServOperRp
    extends ResultRp
{

    protected ServOper result;

    /**
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link ServOper }
     *     
     */
    public ServOper getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServOper }
     *     
     */
    public void setResult(ServOper value) {
        this.result = value;
    }

}
