
package userapi;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for createUserPrepare complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="createUserPrepare">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="reqBase" type="{http://cb.ukrpay.net/common/ws}reqBase"/>
 *         &lt;element name="listCheckUserVar" type="{http://cb.ukrpay.net/common/ws/user}checkUserVar" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="login" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hashPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createUserPrepare", propOrder = {
    "reqBase",
    "listCheckUserVar",
    "login",
    "hashPassword"
})
public class CreateUserPrepare {

    @XmlElement(required = true)
    protected ReqBase reqBase;
    @XmlElement(nillable = true)
    protected List<CheckUserVar> listCheckUserVar;
    protected String login;
    protected String hashPassword;

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
     * Gets the value of the listCheckUserVar property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listCheckUserVar property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListCheckUserVar().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CheckUserVar }
     * 
     * 
     */
    public List<CheckUserVar> getListCheckUserVar() {
        if (listCheckUserVar == null) {
            listCheckUserVar = new ArrayList<CheckUserVar>();
        }
        return this.listCheckUserVar;
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
     * Gets the value of the hashPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHashPassword() {
        return hashPassword;
    }

    /**
     * Sets the value of the hashPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHashPassword(String value) {
        this.hashPassword = value;
    }

}
