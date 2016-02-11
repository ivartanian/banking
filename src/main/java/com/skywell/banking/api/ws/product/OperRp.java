
package com.skywell.banking.api.ws.product;

import com.skywell.banking.api.ws.ResultRp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for operRp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="operRp">
 *   &lt;complexContent>
 *     &lt;extension base="{http://cb.ukrpay.net/common/ws}resultRp">
 *       &lt;sequence>
 *         &lt;element name="result" type="{http://cb.ukrpay.net/common/ws/product}oper" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "operRp", propOrder = {
    "result"
})
public class OperRp
    extends ResultRp
{

    protected Oper result;

    /**
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link Oper }
     *     
     */
    public Oper getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link Oper }
     *     
     */
    public void setResult(Oper value) {
        this.result = value;
    }

}
