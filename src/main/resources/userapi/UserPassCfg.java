
package userapi;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for userPassCfg complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="userPassCfg">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="lengthMin" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="lengthMax" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="checkHistory" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="qualityMin" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "userPassCfg", propOrder = {
    "lengthMin",
    "lengthMax",
    "checkHistory",
    "qualityMin"
})
public class UserPassCfg {

    protected int lengthMin;
    protected int lengthMax;
    @XmlElement(nillable = true)
    protected List<String> checkHistory;
    protected int qualityMin;

    /**
     * Gets the value of the lengthMin property.
     * 
     */
    public int getLengthMin() {
        return lengthMin;
    }

    /**
     * Sets the value of the lengthMin property.
     * 
     */
    public void setLengthMin(int value) {
        this.lengthMin = value;
    }

    /**
     * Gets the value of the lengthMax property.
     * 
     */
    public int getLengthMax() {
        return lengthMax;
    }

    /**
     * Sets the value of the lengthMax property.
     * 
     */
    public void setLengthMax(int value) {
        this.lengthMax = value;
    }

    /**
     * Gets the value of the checkHistory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the checkHistory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCheckHistory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCheckHistory() {
        if (checkHistory == null) {
            checkHistory = new ArrayList<String>();
        }
        return this.checkHistory;
    }

    /**
     * Gets the value of the qualityMin property.
     * 
     */
    public int getQualityMin() {
        return qualityMin;
    }

    /**
     * Sets the value of the qualityMin property.
     * 
     */
    public void setQualityMin(int value) {
        this.qualityMin = value;
    }

}
