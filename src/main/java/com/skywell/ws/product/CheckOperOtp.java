
package com.skywell.ws.product;

import com.skywell.ws.ReqBase;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for checkOperOtp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="checkOperOtp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="reqBase" type="{http://cb.ukrpay.net/common/ws}reqBase"/>
 *         &lt;element name="otpReqId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="otpPass" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "checkOperOtp", propOrder = {
    "reqBase",
    "otpReqId",
    "otpPass"
})
public class CheckOperOtp {

    @XmlElement(required = true)
    protected ReqBase reqBase;
    @XmlElement(required = true)
    protected String otpReqId;
    @XmlElement(required = true)
    protected String otpPass;

    /**
     * Gets the value of the reqBase property.
     * 
     * @return
     *     possible object is
     *     {@link ReqBase }
     *     
     */
    public ReqBase getReqBase() {
        return reqBase;
    }

    /**
     * Sets the value of the reqBase property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReqBase }
     *     
     */
    public void setReqBase(ReqBase value) {
        this.reqBase = value;
    }

    /**
     * Gets the value of the otpReqId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtpReqId() {
        return otpReqId;
    }

    /**
     * Sets the value of the otpReqId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtpReqId(String value) {
        this.otpReqId = value;
    }

    /**
     * Gets the value of the otpPass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtpPass() {
        return otpPass;
    }

    /**
     * Sets the value of the otpPass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtpPass(String value) {
        this.otpPass = value;
    }

}
