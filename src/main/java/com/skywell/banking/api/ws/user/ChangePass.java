
package com.skywell.banking.api.ws.user;

import com.skywell.banking.api.ws.ReqBase;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for changePass complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="changePass">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="reqBase" type="{http://cb.ukrpay.net/common/ws}reqBase"/>
 *         &lt;element name="login" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="hashCurrentPassword" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="hashNewPassword" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "changePass", propOrder = {
    "reqBase",
    "login",
    "hashCurrentPassword",
    "hashNewPassword"
})
public class ChangePass {

    @XmlElement(required = true)
    protected ReqBase reqBase;
    @XmlElement(required = true)
    protected String login;
    @XmlElement(required = true)
    protected String hashCurrentPassword;
    @XmlElement(required = true)
    protected String hashNewPassword;

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
     * Gets the value of the login property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogin() {
        return login;
    }

    /**
     * Sets the value of the login property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogin(String value) {
        this.login = value;
    }

    /**
     * Gets the value of the hashCurrentPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHashCurrentPassword() {
        return hashCurrentPassword;
    }

    /**
     * Sets the value of the hashCurrentPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHashCurrentPassword(String value) {
        this.hashCurrentPassword = value;
    }

    /**
     * Gets the value of the hashNewPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHashNewPassword() {
        return hashNewPassword;
    }

    /**
     * Sets the value of the hashNewPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHashNewPassword(String value) {
        this.hashNewPassword = value;
    }

}
