
package src;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for exchRate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="exchRate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="currencyId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="currencyAlias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="exchBase" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="exchRateBuy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="exchRateSell" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "exchRate", propOrder = {
    "currencyId",
    "currencyAlias",
    "exchBase",
    "exchRateBuy",
    "exchRateSell"
})
public class ExchRate {

    protected int currencyId;
    protected String currencyAlias;
    protected int exchBase;
    protected String exchRateBuy;
    protected String exchRateSell;

    /**
     * Gets the value of the currencyId property.
     * 
     */
    public int getCurrencyId() {
        return currencyId;
    }

    /**
     * Sets the value of the currencyId property.
     * 
     */
    public void setCurrencyId(int value) {
        this.currencyId = value;
    }

    /**
     * Gets the value of the currencyAlias property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyAlias() {
        return currencyAlias;
    }

    /**
     * Sets the value of the currencyAlias property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyAlias(String value) {
        this.currencyAlias = value;
    }

    /**
     * Gets the value of the exchBase property.
     * 
     */
    public int getExchBase() {
        return exchBase;
    }

    /**
     * Sets the value of the exchBase property.
     * 
     */
    public void setExchBase(int value) {
        this.exchBase = value;
    }

    /**
     * Gets the value of the exchRateBuy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExchRateBuy() {
        return exchRateBuy;
    }

    /**
     * Sets the value of the exchRateBuy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExchRateBuy(String value) {
        this.exchRateBuy = value;
    }

    /**
     * Gets the value of the exchRateSell property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExchRateSell() {
        return exchRateSell;
    }

    /**
     * Sets the value of the exchRateSell property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExchRateSell(String value) {
        this.exchRateSell = value;
    }

}
