
package com.skywell.ws.product;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for bankCard complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="bankCard">
 *   &lt;complexContent>
 *     &lt;extension base="{http://cb.ukrpay.net/common/ws/product}bankProduct">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bankCard")
public class BankCard
    extends BankProduct
{


}
