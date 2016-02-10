
package userapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for otpReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="otpReq">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="userOtp" type="{http://cb.ukrpay.net/common/ws/user}userOtp" minOccurs="0"/>
 *         &lt;element name="reqId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reqType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reqInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="otpExpire" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="errCounter" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="errCounterMax" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "otpReq", propOrder = {
    "userOtp",
    "reqId",
    "reqType",
    "reqInfo",
    "otpExpire",
    "errCounter",
    "errCounterMax"
})
public class OtpReq {

    protected UserOtp userOtp;
    protected String reqId;
    protected String reqType;
    protected String reqInfo;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar otpExpire;
    protected int errCounter;
    protected int errCounterMax;

    /**
     * Gets the value of the userOtp property.
     * 
     * @return
     *     possible object is
     *     {@link UserOtp }
     *     
     */
    public UserOtp getUserOtp() {
        return userOtp;
    }

    /**
     * Sets the value of the userOtp property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserOtp }
     *     
     */
    public void setUserOtp(UserOtp value) {
        this.userOtp = value;
    }

    /**
     * Gets the value of the reqId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReqId() {
        return reqId;
    }

    /**
     * Sets the value of the reqId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReqId(String value) {
        this.reqId = value;
    }

    /**
     * Gets the value of the reqType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReqType() {
        return reqType;
    }

    /**
     * Sets the value of the reqType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReqType(String value) {
        this.reqType = value;
    }

    /**
     * Gets the value of the reqInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReqInfo() {
        return reqInfo;
    }

    /**
     * Sets the value of the reqInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReqInfo(String value) {
        this.reqInfo = value;
    }

    /**
     * Gets the value of the otpExpire property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOtpExpire() {
        return otpExpire;
    }

    /**
     * Sets the value of the otpExpire property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOtpExpire(XMLGregorianCalendar value) {
        this.otpExpire = value;
    }

    /**
     * Gets the value of the errCounter property.
     * 
     */
    public int getErrCounter() {
        return errCounter;
    }

    /**
     * Sets the value of the errCounter property.
     * 
     */
    public void setErrCounter(int value) {
        this.errCounter = value;
    }

    /**
     * Gets the value of the errCounterMax property.
     * 
     */
    public int getErrCounterMax() {
        return errCounterMax;
    }

    /**
     * Sets the value of the errCounterMax property.
     * 
     */
    public void setErrCounterMax(int value) {
        this.errCounterMax = value;
    }

}
