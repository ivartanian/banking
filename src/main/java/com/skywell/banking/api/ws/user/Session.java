
package com.skywell.banking.api.ws.user;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.skywell.banking.config.CustomJsonSerializer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for session complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="session">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lang" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="expireDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="state" type="{http://cb.ukrpay.net/common/ws/user}sessionState" minOccurs="0"/>
 *         &lt;element name="user" type="{http://cb.ukrpay.net/common/ws/user}user" minOccurs="0"/>
 *         &lt;element name="pinCfg" type="{http://cb.ukrpay.net/common/ws/user}pinCfg" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "session", propOrder = {
    "sid",
    "lang",
    "expireDate",
    "state",
    "user",
    "pinCfg"
})
public class Session {

    protected String sid;
    protected String lang;

    @JsonSerialize(using = CustomJsonSerializer.class)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expireDate;
    protected SessionState state;
    protected User user;
    protected PinCfg pinCfg;

    /**
     * Gets the value of the sid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSid() {
        return sid;
    }

    /**
     * Sets the value of the sid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSid(String value) {
        this.sid = value;
    }

    /**
     * Gets the value of the lang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLang() {
        return lang;
    }

    /**
     * Sets the value of the lang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLang(String value) {
        this.lang = value;
    }

    /**
     * Gets the value of the expireDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpireDate() {
        return expireDate;
    }

    /**
     * Sets the value of the expireDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpireDate(XMLGregorianCalendar value) {
        this.expireDate = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link SessionState }
     *     
     */
    public SessionState getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link SessionState }
     *     
     */
    public void setState(SessionState value) {
        this.state = value;
    }

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
     * Gets the value of the pinCfg property.
     * 
     * @return
     *     possible object is
     *     {@link PinCfg }
     *     
     */
    public PinCfg getPinCfg() {
        return pinCfg;
    }

    /**
     * Sets the value of the pinCfg property.
     * 
     * @param value
     *     allowed object is
     *     {@link PinCfg }
     *     
     */
    public void setPinCfg(PinCfg value) {
        this.pinCfg = value;
    }

}
