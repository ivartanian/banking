
package userapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for userPassCfgRp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="userPassCfgRp">
 *   &lt;complexContent>
 *     &lt;extension base="{http://cb.ukrpay.net/common/ws}resultRp">
 *       &lt;sequence>
 *         &lt;element name="result" type="{http://cb.ukrpay.net/common/ws/user}userPassCfg" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "userPassCfgRp", propOrder = {
    "result"
})
public class UserPassCfgRp
    extends ResultRp
{

    protected UserPassCfg result;

    /**
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link UserPassCfg }
     *     
     */
    public UserPassCfg getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserPassCfg }
     *     
     */
    public void setResult(UserPassCfg value) {
        this.result = value;
    }

}
