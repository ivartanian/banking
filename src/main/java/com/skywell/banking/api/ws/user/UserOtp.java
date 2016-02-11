
package com.skywell.banking.api.ws.user;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for userOtp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="userOtp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="typeId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="typeAlias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cfgValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "userOtp", propOrder = {
    "id",
    "typeId",
    "typeAlias",
    "cfgValue"
})
@XmlSeeAlso({
    UserOtpSms.class
})
public class UserOtp {

    protected long id;
    protected int typeId;
    protected String typeAlias;
    protected String cfgValue;

    /**
     * Gets the value of the id property.
     * 
     */
    public long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(long value) {
        this.id = value;
    }

    /**
     * Gets the value of the typeId property.
     * 
     */
    public int getTypeId() {
        return typeId;
    }

    /**
     * Sets the value of the typeId property.
     * 
     */
    public void setTypeId(int value) {
        this.typeId = value;
    }

    /**
     * Gets the value of the typeAlias property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeAlias() {
        return typeAlias;
    }

    /**
     * Sets the value of the typeAlias property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeAlias(String value) {
        this.typeAlias = value;
    }

    /**
     * Gets the value of the cfgValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCfgValue() {
        return cfgValue;
    }

    /**
     * Sets the value of the cfgValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCfgValue(String value) {
        this.cfgValue = value;
    }

}
