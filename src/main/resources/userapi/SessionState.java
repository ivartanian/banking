
package userapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for sessionState complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sessionState">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="blocked" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="blockedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="passwordChangeRequired" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="otpReq" type="{http://cb.ukrpay.net/common/ws/user}otpReq" minOccurs="0"/>
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
@XmlType(name = "sessionState", propOrder = {
    "blocked",
    "blockedDate",
    "passwordChangeRequired",
    "otpReq",
    "errCounter",
    "errCounterMax"
})
public class SessionState {

    @XmlElement(defaultValue = "false")
    protected boolean blocked;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar blockedDate;
    @XmlElement(defaultValue = "false")
    protected boolean passwordChangeRequired;
    protected OtpReq otpReq;
    protected int errCounter;
    protected int errCounterMax;

    /**
     * Gets the value of the blocked property.
     * 
     */
    public boolean isBlocked() {
        return blocked;
    }

    /**
     * Sets the value of the blocked property.
     * 
     */
    public void setBlocked(boolean value) {
        this.blocked = value;
    }

    /**
     * Gets the value of the blockedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBlockedDate() {
        return blockedDate;
    }

    /**
     * Sets the value of the blockedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBlockedDate(XMLGregorianCalendar value) {
        this.blockedDate = value;
    }

    /**
     * Gets the value of the passwordChangeRequired property.
     * 
     */
    public boolean isPasswordChangeRequired() {
        return passwordChangeRequired;
    }

    /**
     * Sets the value of the passwordChangeRequired property.
     * 
     */
    public void setPasswordChangeRequired(boolean value) {
        this.passwordChangeRequired = value;
    }

    /**
     * Gets the value of the otpReq property.
     * 
     * @return
     *     possible object is
     *     {@link OtpReq }
     *     
     */
    public OtpReq getOtpReq() {
        return otpReq;
    }

    /**
     * Sets the value of the otpReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtpReq }
     *     
     */
    public void setOtpReq(OtpReq value) {
        this.otpReq = value;
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
