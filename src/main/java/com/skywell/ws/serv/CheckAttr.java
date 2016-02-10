
package com.skywell.ws.serv;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for checkAttr complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="checkAttr">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="attrType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hint" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valueDef" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tmpls" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="flReadOnly" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="flNotNull" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="flHidden" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="flInfo" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "checkAttr", propOrder = {
    "id",
    "attrType",
    "name",
    "hint",
    "valueDef",
    "tmpls",
    "flReadOnly",
    "flNotNull",
    "flHidden",
    "flInfo"
})
public class CheckAttr {

    @XmlElement(required = true)
    protected String id;
    @XmlElement(required = true)
    protected String attrType;
    protected String name;
    protected String hint;
    protected String valueDef;
    protected String tmpls;
    protected boolean flReadOnly;
    protected boolean flNotNull;
    protected boolean flHidden;
    protected boolean flInfo;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the attrType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttrType() {
        return attrType;
    }

    /**
     * Sets the value of the attrType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttrType(String value) {
        this.attrType = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the hint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHint() {
        return hint;
    }

    /**
     * Sets the value of the hint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHint(String value) {
        this.hint = value;
    }

    /**
     * Gets the value of the valueDef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValueDef() {
        return valueDef;
    }

    /**
     * Sets the value of the valueDef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValueDef(String value) {
        this.valueDef = value;
    }

    /**
     * Gets the value of the tmpls property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTmpls() {
        return tmpls;
    }

    /**
     * Sets the value of the tmpls property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTmpls(String value) {
        this.tmpls = value;
    }

    /**
     * Gets the value of the flReadOnly property.
     * 
     */
    public boolean isFlReadOnly() {
        return flReadOnly;
    }

    /**
     * Sets the value of the flReadOnly property.
     * 
     */
    public void setFlReadOnly(boolean value) {
        this.flReadOnly = value;
    }

    /**
     * Gets the value of the flNotNull property.
     * 
     */
    public boolean isFlNotNull() {
        return flNotNull;
    }

    /**
     * Sets the value of the flNotNull property.
     * 
     */
    public void setFlNotNull(boolean value) {
        this.flNotNull = value;
    }

    /**
     * Gets the value of the flHidden property.
     * 
     */
    public boolean isFlHidden() {
        return flHidden;
    }

    /**
     * Sets the value of the flHidden property.
     * 
     */
    public void setFlHidden(boolean value) {
        this.flHidden = value;
    }

    /**
     * Gets the value of the flInfo property.
     * 
     */
    public boolean isFlInfo() {
        return flInfo;
    }

    /**
     * Sets the value of the flInfo property.
     * 
     */
    public void setFlInfo(boolean value) {
        this.flInfo = value;
    }

}
