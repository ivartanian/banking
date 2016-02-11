
package api.servapi;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for servListRp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="servListRp">
 *   &lt;complexContent>
 *     &lt;extension base="{http://cb.ukrpay.net/common/ws}resultRp">
 *       &lt;sequence>
 *         &lt;element name="list" type="{http://cb.ukrpay.net/common/ws/serv}servShort" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "servListRp", propOrder = {
    "list"
})
public class ServListRp
    extends ResultRp
{

    @XmlElement(nillable = true)
    protected List<ServShort> list;

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
     * {@link ServShort }
     * 
     * 
     */
    public List<ServShort> getList() {
        if (list == null) {
            list = new ArrayList<ServShort>();
        }
        return this.list;
    }

}
