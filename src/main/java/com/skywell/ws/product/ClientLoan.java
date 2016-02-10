
package com.skywell.ws.product;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for clientLoan complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="clientLoan">
 *   &lt;complexContent>
 *     &lt;extension base="{http://cb.ukrpay.net/common/ws/product}clientProduct">
 *       &lt;sequence>
 *         &lt;element name="nextPaymentDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="nextPaymentAmount" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "clientLoan", propOrder = {
    "nextPaymentDate",
    "nextPaymentAmount"
})
public class ClientLoan
    extends ClientProduct
{

    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar nextPaymentDate;
    protected long nextPaymentAmount;

    /**
     * Gets the value of the nextPaymentDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNextPaymentDate() {
        return nextPaymentDate;
    }

    /**
     * Sets the value of the nextPaymentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNextPaymentDate(XMLGregorianCalendar value) {
        this.nextPaymentDate = value;
    }

    /**
     * Gets the value of the nextPaymentAmount property.
     * 
     */
    public long getNextPaymentAmount() {
        return nextPaymentAmount;
    }

    /**
     * Sets the value of the nextPaymentAmount property.
     * 
     */
    public void setNextPaymentAmount(long value) {
        this.nextPaymentAmount = value;
    }

}
