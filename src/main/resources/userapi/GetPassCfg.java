
package userapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getPassCfg complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getPassCfg">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="reqBase" type="{http://cb.ukrpay.net/common/ws}reqBase"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getPassCfg", propOrder = {
    "reqBase"
})
public class GetPassCfg {

    @XmlElement(required = true)
    protected ReqBase reqBase;

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

}
