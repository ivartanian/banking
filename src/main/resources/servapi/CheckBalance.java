
package servapi;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for checkBalance complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="checkBalance">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="reqBase" type="{http://cb.ukrpay.net/common/ws}reqBase"/>
 *         &lt;element name="servId" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "checkBalance", propOrder = {
    "reqBase",
    "servId",
    "attrList"
})
public class CheckBalance {

    @XmlElement(required = true)
    protected ReqBase reqBase;
    @XmlElement(required = true)
    protected String servId;
    @XmlElement(nillable = true)
    protected List<AttrValue> attrList;

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
