
package com.skywell.banking.api.ws.user;

import com.skywell.banking.api.ws.ResultRp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for createUserRp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="createUserRp">
 *   &lt;complexContent>
 *     &lt;extension base="{http://cb.ukrpay.net/common/ws}resultRp">
 *       &lt;sequence>
 *         &lt;element name="user" type="{http://cb.ukrpay.net/common/ws/user}user" minOccurs="0"/>
 *         &lt;element name="otpReq" type="{http://cb.ukrpay.net/common/ws/user}otpReq" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createUserRp", propOrder = {
    "user",
    "otpReq"
})
public class CreateUserRp
    extends ResultRp
{

    protected User user;
    protected OtpReq otpReq;

    /**
     * Gets the value of the user property.
     * 
     * @return
     *     possible object is
     *     {@link User }
     *     
     */
    public User getUser() {
        return user;
    }

    /**
     * Sets the value of the user property.
     * 
     * @param value
     *     allowed object is
     *     {@link User }
     *     
     */
    public void setUser(User value) {
        this.user = value;
    }

    /**
     * Gets the value of the otpReq property.
     * 
     * @return
     *     possible object is
     *     {@link OtpReq }
     *     
     */
    public OtpReq getOtpReq() {
        return otpReq;
    }

    /**
     * Sets the value of the otpReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtpReq }
     *     
     */
    public void setOtpReq(OtpReq value) {
        this.otpReq = value;
    }

}
