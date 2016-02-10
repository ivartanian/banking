
package servapi;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for servInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="servInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="servType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="note" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="logo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="amountMin" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="amountMax" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="checkAttrList" type="{http://cb.ukrpay.net/common/ws/serv}checkAttr" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "servInfo", propOrder = {
    "id",
    "servType",
    "name",
    "note",
    "logo",
    "amountMin",
    "amountMax",
    "checkAttrList"
})
public class ServInfo {

    @XmlElement(required = true)
    protected String id;
    protected String servType;
    protected String name;
    protected String note;
    protected String logo;
    protected long amountMin;
    protected long amountMax;
    @XmlElement(nillable = true)
    protected List<CheckAttr> checkAttrList;

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
     * Gets the value of the servType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServType() {
        return servType;
    }

    /**
     * Sets the value of the servType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServType(String value) {
        this.servType = value;
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
     * Gets the value of the note property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNote() {
        return note;
    }

    /**
     * Sets the value of the note property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNote(String value) {
        this.note = value;
    }

    /**
     * Gets the value of the logo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogo() {
        return logo;
    }

    /**
     * Sets the value of the logo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogo(String value) {
        this.logo = value;
    }

    /**
     * Gets the value of the amountMin property.
     * 
     */
    public long getAmountMin() {
        return amountMin;
    }

    /**
     * Sets the value of the amountMin property.
     * 
     */
    public void setAmountMin(long value) {
        this.amountMin = value;
    }

    /**
     * Gets the value of the amountMax property.
     * 
     */
    public long getAmountMax() {
        return amountMax;
    }

    /**
     * Sets the value of the amountMax property.
     * 
     */
    public void setAmountMax(long value) {
        this.amountMax = value;
    }

    /**
     * Gets the value of the checkAttrList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the checkAttrList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCheckAttrList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CheckAttr }
     * 
     * 
     */
    public List<CheckAttr> getCheckAttrList() {
        if (checkAttrList == null) {
            checkAttrList = new ArrayList<CheckAttr>();
        }
        return this.checkAttrList;
    }

}
