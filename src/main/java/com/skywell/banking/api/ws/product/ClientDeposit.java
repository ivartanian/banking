
package com.skywell.banking.api.ws.product;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for clientDeposit complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="clientDeposit">
 *   &lt;complexContent>
 *     &lt;extension base="{http://cb.ukrpay.net/common/ws/product}clientProduct">
 *       &lt;sequence>
 *         &lt;element name="interestNotPaidAmount" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="depoPeriodClose" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "clientDeposit", propOrder = {
    "interestNotPaidAmount",
    "depoPeriodClose"
})
public class ClientDeposit
    extends ClientProduct
{

    protected long interestNotPaidAmount;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar depoPeriodClose;

    /**
     * Gets the value of the interestNotPaidAmount property.
     * 
     */
    public long getInterestNotPaidAmount() {
        return interestNotPaidAmount;
    }

    /**
     * Sets the value of the interestNotPaidAmount property.
     * 
     */
    public void setInterestNotPaidAmount(long value) {
        this.interestNotPaidAmount = value;
    }

    /**
     * Gets the value of the depoPeriodClose property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDepoPeriodClose() {
        return depoPeriodClose;
    }

    /**
     * Sets the value of the depoPeriodClose property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDepoPeriodClose(XMLGregorianCalendar value) {
        this.depoPeriodClose = value;
    }

}
