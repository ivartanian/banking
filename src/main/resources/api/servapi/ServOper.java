
package api.servapi;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for servOper complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="servOper">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="operId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="servId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="servType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="servName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="amountMin" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="amountMax" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="attrList" type="{http://cb.ukrpay.net/common/ws/serv}attrValue" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "servOper", propOrder = {
    "operId",
    "servId",
    "servType",
    "servName",
    "amountMin",
    "amountMax",
    "attrList"
})
public class ServOper {

    protected long operId;
    @XmlElement(required = true)
    protected String servId;
    protected String servType;
    protected String servName;
    protected long amountMin;
    protected long amountMax;
    @XmlElement(nillable = true)
    protected List<AttrValue> attrList;

    /**
     * Gets the value of the operId property.
     * 
     */
    public long getOperId() {
        return operId;
    }

    /**
     * Sets the value of the operId property.
     * 
     */
    public void setOperId(long value) {
        this.operId = value;
    }

    /**
     * Gets the value of the servId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServId() {
        return servId;
    }

    /**
     * Sets the value of the servId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServId(String value) {
        this.servId = value;
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
     * Gets the value of the servName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServName() {
        return servName;
    }

    /**
     * Sets the value of the servName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServName(String value) {
        this.servName = value;
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
     * Gets the value of the attrList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attrList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttrList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AttrValue }
     * 
     * 
     */
    public List<AttrValue> getAttrList() {
        if (attrList == null) {
            attrList = new ArrayList<AttrValue>();
        }
        return this.attrList;
    }

}
