
package src;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for exchTypeRp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="exchTypeRp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="exchType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dateStart" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dateEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="list" type="{http://cb.ukrpay.net/common/ws/core}exchRate" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "exchTypeRp", propOrder = {
    "exchType",
    "dateStart",
    "dateEnd",
    "list"
})
public class ExchTypeRp {

    @XmlElement(required = true)
    protected String exchType;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateStart;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateEnd;
    @XmlElement(nillable = true)
    protected List<ExchRate> list;

    /**
     * Gets the value of the exchType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExchType() {
        return exchType;
    }

    /**
     * Sets the value of the exchType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExchType(String value) {
        this.exchType = value;
    }

    /**
     * Gets the value of the dateStart property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateStart() {
        return dateStart;
    }

    /**
     * Sets the value of the dateStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateStart(XMLGregorianCalendar value) {
        this.dateStart = value;
    }

    /**
     * Gets the value of the dateEnd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateEnd() {
        return dateEnd;
    }

    /**
     * Sets the value of the dateEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateEnd(XMLGregorianCalendar value) {
        this.dateEnd = value;
    }

    /**
     * Gets the value of the list property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the list property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExchRate }
     * 
     * 
     */
    public List<ExchRate> getList() {
        if (list == null) {
            list = new ArrayList<ExchRate>();
        }
        return this.list;
    }

}
