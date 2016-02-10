
package src;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for news complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="news">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="body" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="newsType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="imgUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="intrnUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="extrnUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dateStart" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "news", propOrder = {
    "title",
    "body",
    "newsType",
    "imgUrl",
    "intrnUrl",
    "extrnUrl",
    "dateStart"
})
public class News {

    protected String title;
    protected String body;
    protected String newsType;
    protected String imgUrl;
    protected String intrnUrl;
    protected String extrnUrl;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateStart;

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the body property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBody() {
        return body;
    }

    /**
     * Sets the value of the body property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBody(String value) {
        this.body = value;
    }

    /**
     * Gets the value of the newsType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewsType() {
        return newsType;
    }

    /**
     * Sets the value of the newsType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewsType(String value) {
        this.newsType = value;
    }

    /**
     * Gets the value of the imgUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImgUrl() {
        return imgUrl;
    }

    /**
     * Sets the value of the imgUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImgUrl(String value) {
        this.imgUrl = value;
    }

    /**
     * Gets the value of the intrnUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntrnUrl() {
        return intrnUrl;
    }

    /**
     * Sets the value of the intrnUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntrnUrl(String value) {
        this.intrnUrl = value;
    }

    /**
     * Gets the value of the extrnUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtrnUrl() {
        return extrnUrl;
    }

    /**
     * Sets the value of the extrnUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtrnUrl(String value) {
        this.extrnUrl = value;
    }

    /**
     * Gets the value of the dateStart property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateStart() {
        return dateStart;
    }

    /**
     * Sets the value of the dateStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateStart(XMLGregorianCalendar value) {
        this.dateStart = value;
    }

}
