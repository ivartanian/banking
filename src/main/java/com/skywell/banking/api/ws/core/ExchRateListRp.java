
package com.skywell.banking.api.ws.core;

import com.skywell.banking.api.ws.ResultRp;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for exchRateListRp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="exchRateListRp">
 *   &lt;complexContent>
 *     &lt;extension base="{http://cb.ukrpay.net/common/ws}resultRp">
 *       &lt;sequence>
 *         &lt;element name="mainCurrencyId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="mainCurrencyAlias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="list" type="{http://cb.ukrpay.net/common/ws/core}exchTypeRp" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "exchRateListRp", propOrder = {
    "mainCurrencyId",
    "mainCurrencyAlias",
    "list"
})
public class ExchRateListRp
    extends ResultRp
{

    protected int mainCurrencyId;
    protected String mainCurrencyAlias;
    @XmlElement(nillable = true)
    protected List<ExchTypeRp> list;

    /**
     * Gets the value of the mainCurrencyId property.
     * 
     */
    public int getMainCurrencyId() {
        return mainCurrencyId;
    }

    /**
     * Sets the value of the mainCurrencyId property.
     * 
     */
    public void setMainCurrencyId(int value) {
        this.mainCurrencyId = value;
    }

    /**
     * Gets the value of the mainCurrencyAlias property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMainCurrencyAlias() {
        return mainCurrencyAlias;
    }

    /**
     * Sets the value of the mainCurrencyAlias property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMainCurrencyAlias(String value) {
        this.mainCurrencyAlias = value;
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
     * {@link ExchTypeRp }
     * 
     * 
     */
    public List<ExchTypeRp> getList() {
        if (list == null) {
            list = new ArrayList<ExchTypeRp>();
        }
        return this.list;
    }

}
