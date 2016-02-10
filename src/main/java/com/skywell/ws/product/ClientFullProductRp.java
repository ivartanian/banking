
package com.skywell.ws.product;

import com.skywell.ws.ResultRp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for clientFullProductRp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="clientFullProductRp">
 *   &lt;complexContent>
 *     &lt;extension base="{http://cb.ukrpay.net/common/ws}resultRp">
 *       &lt;sequence>
 *         &lt;element name="result" type="{http://cb.ukrpay.net/common/ws/product}clientFullProduct" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "clientFullProductRp", propOrder = {
    "result"
})
public class ClientFullProductRp
    extends ResultRp
{

    protected ClientFullProduct result;

    /**
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link ClientFullProduct }
     *     
     */
    public ClientFullProduct getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClientFullProduct }
     *     
     */
    public void setResult(ClientFullProduct value) {
        this.result = value;
    }

}
