
package com.skywell.banking.api.ws;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import com.skywell.banking.api.ws.product.AlgListRp;
import com.skywell.banking.api.ws.product.ClientFullProductRp;
import com.skywell.banking.api.ws.product.ClientProductListRp;
import com.skywell.banking.api.ws.product.ClientTransListRp;
import com.skywell.banking.api.ws.product.OperListRp;
import com.skywell.banking.api.ws.product.OperRp;
import com.skywell.banking.api.ws.product.OperVar;
import com.skywell.banking.api.ws.product.PayProductListRp;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ProductWebService", targetNamespace = "http://cb.ukrpay.net/common/ws")
@XmlSeeAlso({
    com.skywell.banking.api.ws.ObjectFactory.class,
        com.skywell.banking.api.ws.product.ObjectFactory.class,
        com.skywell.banking.api.ws.user.ObjectFactory.class
})
public interface ProductWebService {


    /**
     * 
     * @param reqBase
     * @return
     *     returns com.skywell.banking.api.ws.product.ClientProductListRp
     */
    @WebMethod
    @WebResult(targetNamespace = "http://cb.ukrpay.net/common/ws/product")
    @RequestWrapper(localName = "getClientProductList", targetNamespace = "http://cb.ukrpay.net/common/ws/product", className = "com.skywell.banking.api.ws.product.GetClientProductList")
    @ResponseWrapper(localName = "getClientProductListResponse", targetNamespace = "http://cb.ukrpay.net/common/ws/product", className = "com.skywell.banking.api.ws.product.GetClientProductListResponse")
    public ClientProductListRp getClientProductList(
        @WebParam(name = "reqBase", targetNamespace = "http://cb.ukrpay.net/common/ws/product")
        ReqBase reqBase);

    /**
     * 
     * @param clientProductId
     * @param reqBase
     * @return
     *     returns com.skywell.banking.api.ws.product.ClientFullProductRp
     */
    @WebMethod
    @WebResult(targetNamespace = "http://cb.ukrpay.net/common/ws/product")
    @RequestWrapper(localName = "getClientFullProduct", targetNamespace = "http://cb.ukrpay.net/common/ws/product", className = "com.skywell.banking.api.ws.product.GetClientFullProduct")
    @ResponseWrapper(localName = "getClientFullProductResponse", targetNamespace = "http://cb.ukrpay.net/common/ws/product", className = "com.skywell.banking.api.ws.product.GetClientFullProductResponse")
    public ClientFullProductRp getClientFullProduct(
        @WebParam(name = "reqBase", targetNamespace = "http://cb.ukrpay.net/common/ws/product")
        ReqBase reqBase,
        @WebParam(name = "clientProductId", targetNamespace = "http://cb.ukrpay.net/common/ws/product")
        long clientProductId);

    /**
     * 
     * @param fltCurrencyId
     * @param fltAmountMin
     * @param reqBase
     * @param fltOperType
     * @param fltBankProductId
     * @return
     *     returns com.skywell.banking.api.ws.product.PayProductListRp
     */
    @WebMethod
    @WebResult(targetNamespace = "http://cb.ukrpay.net/common/ws/product")
    @RequestWrapper(localName = "getPayProductList", targetNamespace = "http://cb.ukrpay.net/common/ws/product", className = "com.skywell.banking.api.ws.product.GetPayProductList")
    @ResponseWrapper(localName = "getPayProductListResponse", targetNamespace = "http://cb.ukrpay.net/common/ws/product", className = "com.skywell.banking.api.ws.product.GetPayProductListResponse")
    public PayProductListRp getPayProductList(
        @WebParam(name = "reqBase", targetNamespace = "http://cb.ukrpay.net/common/ws/product")
        ReqBase reqBase,
        @WebParam(name = "fltOperType", targetNamespace = "http://cb.ukrpay.net/common/ws/product")
        String fltOperType,
        @WebParam(name = "fltBankProductId", targetNamespace = "http://cb.ukrpay.net/common/ws/product")
        int fltBankProductId,
        @WebParam(name = "fltCurrencyId", targetNamespace = "http://cb.ukrpay.net/common/ws/product")
        int fltCurrencyId,
        @WebParam(name = "fltAmountMin", targetNamespace = "http://cb.ukrpay.net/common/ws/product")
        long fltAmountMin);

    /**
     * 
     * @param fltResvClientProductId
     * @param fltAmountMin
     * @param fltSendBankProductId
     * @param reqBase
     * @param fltSpec
     * @param operType
     * @param currencyId
     * @param fltResvBankProductId
     * @param fltSendClientProductId
     * @return
     *     returns com.skywell.banking.api.ws.product.AlgListRp
     */
    @WebMethod
    @WebResult(targetNamespace = "http://cb.ukrpay.net/common/ws/product")
    @RequestWrapper(localName = "getAlgList", targetNamespace = "http://cb.ukrpay.net/common/ws/product", className = "com.skywell.banking.api.ws.product.GetAlgList")
    @ResponseWrapper(localName = "getAlgListResponse", targetNamespace = "http://cb.ukrpay.net/common/ws/product", className = "com.skywell.banking.api.ws.product.GetAlgListResponse")
    public AlgListRp getAlgList(
        @WebParam(name = "reqBase", targetNamespace = "http://cb.ukrpay.net/common/ws/product")
        ReqBase reqBase,
        @WebParam(name = "operType", targetNamespace = "http://cb.ukrpay.net/common/ws/product")
        String operType,
        @WebParam(name = "currencyId", targetNamespace = "http://cb.ukrpay.net/common/ws/product")
        int currencyId,
        @WebParam(name = "fltSendBankProductId", targetNamespace = "http://cb.ukrpay.net/common/ws/product")
        int fltSendBankProductId,
        @WebParam(name = "fltSendClientProductId", targetNamespace = "http://cb.ukrpay.net/common/ws/product")
        long fltSendClientProductId,
        @WebParam(name = "fltResvBankProductId", targetNamespace = "http://cb.ukrpay.net/common/ws/product")
        int fltResvBankProductId,
        @WebParam(name = "fltResvClientProductId", targetNamespace = "http://cb.ukrpay.net/common/ws/product")
        long fltResvClientProductId,
        @WebParam(name = "fltSpec", targetNamespace = "http://cb.ukrpay.net/common/ws/product")
        String fltSpec,
        @WebParam(name = "fltAmountMin", targetNamespace = "http://cb.ukrpay.net/common/ws/product")
        long fltAmountMin);

    /**
     * 
     * @param clientProductId
     * @param reqBase
     * @return
     *     returns com.skywell.banking.api.ws.product.ClientTransListRp
     */
    @WebMethod
    @WebResult(targetNamespace = "http://cb.ukrpay.net/common/ws/product")
    @RequestWrapper(localName = "getStatementMini", targetNamespace = "http://cb.ukrpay.net/common/ws/product", className = "com.skywell.banking.api.ws.product.GetStatementMini")
    @ResponseWrapper(localName = "getStatementMiniResponse", targetNamespace = "http://cb.ukrpay.net/common/ws/product", className = "com.skywell.banking.api.ws.product.GetStatementMiniResponse")
    public ClientTransListRp getStatementMini(
        @WebParam(name = "reqBase", targetNamespace = "http://cb.ukrpay.net/common/ws/product")
        ReqBase reqBase,
        @WebParam(name = "clientProductId", targetNamespace = "http://cb.ukrpay.net/common/ws/product")
        long clientProductId);

    /**
     * 
     * @param reqBase
     * @param otpReqId
     * @param otpPass
     * @return
     *     returns com.skywell.banking.api.ws.product.OperRp
     */
    @WebMethod
    @WebResult(targetNamespace = "http://cb.ukrpay.net/common/ws/product")
    @RequestWrapper(localName = "checkOperOtp", targetNamespace = "http://cb.ukrpay.net/common/ws/product", className = "com.skywell.banking.api.ws.product.CheckOperOtp")
    @ResponseWrapper(localName = "checkOperOtpResponse", targetNamespace = "http://cb.ukrpay.net/common/ws/product", className = "com.skywell.banking.api.ws.product.CheckOperOtpResponse")
    public OperRp checkOperOtp(
        @WebParam(name = "reqBase", targetNamespace = "http://cb.ukrpay.net/common/ws/product")
        ReqBase reqBase,
        @WebParam(name = "otpReqId", targetNamespace = "http://cb.ukrpay.net/common/ws/product")
        String otpReqId,
        @WebParam(name = "otpPass", targetNamespace = "http://cb.ukrpay.net/common/ws/product")
        String otpPass);

    /**
     * 
     * @param reqBase
     * @return
     *     returns com.skywell.banking.api.ws.product.OperListRp
     */
    @WebMethod
    @WebResult(targetNamespace = "http://cb.ukrpay.net/common/ws/product")
    @RequestWrapper(localName = "getOperList", targetNamespace = "http://cb.ukrpay.net/common/ws/product", className = "com.skywell.banking.api.ws.product.GetOperList")
    @ResponseWrapper(localName = "getOperListResponse", targetNamespace = "http://cb.ukrpay.net/common/ws/product", className = "com.skywell.banking.api.ws.product.GetOperListResponse")
    public OperListRp getOperList(
        @WebParam(name = "reqBase", targetNamespace = "http://cb.ukrpay.net/common/ws/product")
        ReqBase reqBase);

    /**
     * 
     * @param reqBase
     * @param operId
     * @return
     *     returns com.skywell.banking.api.ws.product.OperRp
     */
    @WebMethod
    @WebResult(targetNamespace = "http://cb.ukrpay.net/common/ws/product")
    @RequestWrapper(localName = "getOperFull", targetNamespace = "http://cb.ukrpay.net/common/ws/product", className = "com.skywell.banking.api.ws.product.GetOperFull")
    @ResponseWrapper(localName = "getOperFullResponse", targetNamespace = "http://cb.ukrpay.net/common/ws/product", className = "com.skywell.banking.api.ws.product.GetOperFullResponse")
    public OperRp getOperFull(
        @WebParam(name = "reqBase", targetNamespace = "http://cb.ukrpay.net/common/ws/product")
        ReqBase reqBase,
        @WebParam(name = "operId", targetNamespace = "http://cb.ukrpay.net/common/ws/product")
        long operId);

    /**
     * 
     * @param note
     * @param operAmount
     * @param clientProductId
     * @param varList
     * @param operCurrencyId
     * @param reqBase
     * @param resvClientProductId
     * @return
     *     returns com.skywell.banking.api.ws.product.OperRp
     */
    @WebMethod
    @WebResult(targetNamespace = "http://cb.ukrpay.net/common/ws/product")
    @RequestWrapper(localName = "createOperSendClientProduct", targetNamespace = "http://cb.ukrpay.net/common/ws/product", className = "com.skywell.banking.api.ws.product.CreateOperSendClientProduct")
    @ResponseWrapper(localName = "createOperSendClientProductResponse", targetNamespace = "http://cb.ukrpay.net/common/ws/product", className = "com.skywell.banking.api.ws.product.CreateOperSendClientProductResponse")
    public OperRp createOperSendClientProduct(
        @WebParam(name = "reqBase", targetNamespace = "http://cb.ukrpay.net/common/ws/product")
        ReqBase reqBase,
        @WebParam(name = "clientProductId", targetNamespace = "http://cb.ukrpay.net/common/ws/product")
        long clientProductId,
        @WebParam(name = "operAmount", targetNamespace = "http://cb.ukrpay.net/common/ws/product")
        long operAmount,
        @WebParam(name = "operCurrencyId", targetNamespace = "http://cb.ukrpay.net/common/ws/product")
        int operCurrencyId,
        @WebParam(name = "note", targetNamespace = "http://cb.ukrpay.net/common/ws/product")
        String note,
        @WebParam(name = "varList", targetNamespace = "http://cb.ukrpay.net/common/ws/product")
        List<OperVar> varList,
        @WebParam(name = "resvClientProductId", targetNamespace = "http://cb.ukrpay.net/common/ws/product")
        long resvClientProductId);

    /**
     * 
     * @param note
     * @param operAmount
     * @param clientProductId
     * @param varList
     * @param operCurrencyId
     * @param reqBase
     * @param resvLocalAcc
     * @return
     *     returns com.skywell.banking.api.ws.product.OperRp
     */
    @WebMethod
    @WebResult(targetNamespace = "http://cb.ukrpay.net/common/ws/product")
    @RequestWrapper(localName = "createOperSendLocalAcc", targetNamespace = "http://cb.ukrpay.net/common/ws/product", className = "com.skywell.banking.api.ws.product.CreateOperSendLocalAcc")
    @ResponseWrapper(localName = "createOperSendLocalAccResponse", targetNamespace = "http://cb.ukrpay.net/common/ws/product", className = "com.skywell.banking.api.ws.product.CreateOperSendLocalAccResponse")
    public OperRp createOperSendLocalAcc(
        @WebParam(name = "reqBase", targetNamespace = "http://cb.ukrpay.net/common/ws/product")
        ReqBase reqBase,
        @WebParam(name = "clientProductId", targetNamespace = "http://cb.ukrpay.net/common/ws/product")
        long clientProductId,
        @WebParam(name = "operAmount", targetNamespace = "http://cb.ukrpay.net/common/ws/product")
        long operAmount,
        @WebParam(name = "operCurrencyId", targetNamespace = "http://cb.ukrpay.net/common/ws/product")
        int operCurrencyId,
        @WebParam(name = "note", targetNamespace = "http://cb.ukrpay.net/common/ws/product")
        String note,
        @WebParam(name = "varList", targetNamespace = "http://cb.ukrpay.net/common/ws/product")
        List<OperVar> varList,
        @WebParam(name = "resvLocalAcc", targetNamespace = "http://cb.ukrpay.net/common/ws/product")
        String resvLocalAcc);

    /**
     * 
     * @param note
     * @param operAmount
     * @param clientProductId
     * @param varList
     * @param operCurrencyId
     * @param reqBase
     * @param resvLocalCard
     * @return
     *     returns com.skywell.banking.api.ws.product.OperRp
     */
    @WebMethod
    @WebResult(targetNamespace = "http://cb.ukrpay.net/common/ws/product")
    @RequestWrapper(localName = "createOperSendLocalCard", targetNamespace = "http://cb.ukrpay.net/common/ws/product", className = "com.skywell.banking.api.ws.product.CreateOperSendLocalCard")
    @ResponseWrapper(localName = "createOperSendLocalCardResponse", targetNamespace = "http://cb.ukrpay.net/common/ws/product", className = "com.skywell.banking.api.ws.product.CreateOperSendLocalCardResponse")
    public OperRp createOperSendLocalCard(
        @WebParam(name = "reqBase", targetNamespace = "http://cb.ukrpay.net/common/ws/product")
        ReqBase reqBase,
        @WebParam(name = "clientProductId", targetNamespace = "http://cb.ukrpay.net/common/ws/product")
        long clientProductId,
        @WebParam(name = "operAmount", targetNamespace = "http://cb.ukrpay.net/common/ws/product")
        long operAmount,
        @WebParam(name = "operCurrencyId", targetNamespace = "http://cb.ukrpay.net/common/ws/product")
        int operCurrencyId,
        @WebParam(name = "note", targetNamespace = "http://cb.ukrpay.net/common/ws/product")
        String note,
        @WebParam(name = "varList", targetNamespace = "http://cb.ukrpay.net/common/ws/product")
        List<OperVar> varList,
        @WebParam(name = "resvLocalCard", targetNamespace = "http://cb.ukrpay.net/common/ws/product")
        String resvLocalCard);

    /**
     * 
     * @param note
     * @param operAmount
     * @param resvCountryClientCode
     * @param clientProductId
     * @param varList
     * @param operCurrencyId
     * @param reqBase
     * @param resvCountryAcc
     * @param resvCountryClientName
     * @param resvCountryBankCode
     * @return
     *     returns com.skywell.banking.api.ws.product.OperRp
     */
    @WebMethod
    @WebResult(targetNamespace = "http://cb.ukrpay.net/common/ws/product")
    @RequestWrapper(localName = "createOperSendCountryAcc", targetNamespace = "http://cb.ukrpay.net/common/ws/product", className = "com.skywell.banking.api.ws.product.CreateOperSendCountryAcc")
    @ResponseWrapper(localName = "createOperSendCountryAccResponse", targetNamespace = "http://cb.ukrpay.net/common/ws/product", className = "com.skywell.banking.api.ws.product.CreateOperSendCountryAccResponse")
    public OperRp createOperSendCountryAcc(
        @WebParam(name = "reqBase", targetNamespace = "http://cb.ukrpay.net/common/ws/product")
        ReqBase reqBase,
        @WebParam(name = "clientProductId", targetNamespace = "http://cb.ukrpay.net/common/ws/product")
        long clientProductId,
        @WebParam(name = "operAmount", targetNamespace = "http://cb.ukrpay.net/common/ws/product")
        long operAmount,
        @WebParam(name = "operCurrencyId", targetNamespace = "http://cb.ukrpay.net/common/ws/product")
        int operCurrencyId,
        @WebParam(name = "note", targetNamespace = "http://cb.ukrpay.net/common/ws/product")
        String note,
        @WebParam(name = "varList", targetNamespace = "http://cb.ukrpay.net/common/ws/product")
        List<OperVar> varList,
        @WebParam(name = "resvCountryBankCode", targetNamespace = "http://cb.ukrpay.net/common/ws/product")
        String resvCountryBankCode,
        @WebParam(name = "resvCountryClientCode", targetNamespace = "http://cb.ukrpay.net/common/ws/product")
        String resvCountryClientCode,
        @WebParam(name = "resvCountryClientName", targetNamespace = "http://cb.ukrpay.net/common/ws/product")
        String resvCountryClientName,
        @WebParam(name = "resvCountryAcc", targetNamespace = "http://cb.ukrpay.net/common/ws/product")
        String resvCountryAcc);

    /**
     * 
     * @param note
     * @param operAmount
     * @param resvCountryCard
     * @param clientProductId
     * @param varList
     * @param operCurrencyId
     * @param reqBase
     * @return
     *     returns com.skywell.banking.api.ws.product.OperRp
     */
    @WebMethod
    @WebResult(targetNamespace = "http://cb.ukrpay.net/common/ws/product")
    @RequestWrapper(localName = "createOperSendCountryCard", targetNamespace = "http://cb.ukrpay.net/common/ws/product", className = "com.skywell.banking.api.ws.product.CreateOperSendCountryCard")
    @ResponseWrapper(localName = "createOperSendCountryCardResponse", targetNamespace = "http://cb.ukrpay.net/common/ws/product", className = "com.skywell.banking.api.ws.product.CreateOperSendCountryCardResponse")
    public OperRp createOperSendCountryCard(
        @WebParam(name = "reqBase", targetNamespace = "http://cb.ukrpay.net/common/ws/product")
        ReqBase reqBase,
        @WebParam(name = "clientProductId", targetNamespace = "http://cb.ukrpay.net/common/ws/product")
        long clientProductId,
        @WebParam(name = "operAmount", targetNamespace = "http://cb.ukrpay.net/common/ws/product")
        long operAmount,
        @WebParam(name = "operCurrencyId", targetNamespace = "http://cb.ukrpay.net/common/ws/product")
        int operCurrencyId,
        @WebParam(name = "note", targetNamespace = "http://cb.ukrpay.net/common/ws/product")
        String note,
        @WebParam(name = "varList", targetNamespace = "http://cb.ukrpay.net/common/ws/product")
        List<OperVar> varList,
        @WebParam(name = "resvCountryCard", targetNamespace = "http://cb.ukrpay.net/common/ws/product")
        String resvCountryCard);

    /**
     * 
     * @param note
     * @param operAmount
     * @param clientProductId
     * @param varList
     * @param operCurrencyId
     * @param reqBase
     * @param sendClientProductId
     * @return
     *     returns com.skywell.banking.api.ws.product.OperRp
     */
    @WebMethod
    @WebResult(targetNamespace = "http://cb.ukrpay.net/common/ws/product")
    @RequestWrapper(localName = "createOperResvClientProduct", targetNamespace = "http://cb.ukrpay.net/common/ws/product", className = "com.skywell.banking.api.ws.product.CreateOperResvClientProduct")
    @ResponseWrapper(localName = "createOperResvClientProductResponse", targetNamespace = "http://cb.ukrpay.net/common/ws/product", className = "com.skywell.banking.api.ws.product.CreateOperResvClientProductResponse")
    public OperRp createOperResvClientProduct(
        @WebParam(name = "reqBase", targetNamespace = "http://cb.ukrpay.net/common/ws/product")
        ReqBase reqBase,
        @WebParam(name = "clientProductId", targetNamespace = "http://cb.ukrpay.net/common/ws/product")
        long clientProductId,
        @WebParam(name = "operAmount", targetNamespace = "http://cb.ukrpay.net/common/ws/product")
        long operAmount,
        @WebParam(name = "operCurrencyId", targetNamespace = "http://cb.ukrpay.net/common/ws/product")
        int operCurrencyId,
        @WebParam(name = "note", targetNamespace = "http://cb.ukrpay.net/common/ws/product")
        String note,
        @WebParam(name = "varList", targetNamespace = "http://cb.ukrpay.net/common/ws/product")
        List<OperVar> varList,
        @WebParam(name = "sendClientProductId", targetNamespace = "http://cb.ukrpay.net/common/ws/product")
        long sendClientProductId);

    /**
     * 
     * @param note
     * @param operAmount
     * @param clientProductId
     * @param varList
     * @param operCurrencyId
     * @param reqBase
     * @return
     *     returns com.skywell.banking.api.ws.product.OperRp
     */
    @WebMethod
    @WebResult(targetNamespace = "http://cb.ukrpay.net/common/ws/product")
    @RequestWrapper(localName = "createOperPayServ", targetNamespace = "http://cb.ukrpay.net/common/ws/product", className = "com.skywell.banking.api.ws.product.CreateOperPayServ")
    @ResponseWrapper(localName = "createOperPayServResponse", targetNamespace = "http://cb.ukrpay.net/common/ws/product", className = "com.skywell.banking.api.ws.product.CreateOperPayServResponse")
    public OperRp createOperPayServ(
        @WebParam(name = "reqBase", targetNamespace = "http://cb.ukrpay.net/common/ws/product")
        ReqBase reqBase,
        @WebParam(name = "clientProductId", targetNamespace = "http://cb.ukrpay.net/common/ws/product")
        long clientProductId,
        @WebParam(name = "operAmount", targetNamespace = "http://cb.ukrpay.net/common/ws/product")
        long operAmount,
        @WebParam(name = "operCurrencyId", targetNamespace = "http://cb.ukrpay.net/common/ws/product")
        int operCurrencyId,
        @WebParam(name = "note", targetNamespace = "http://cb.ukrpay.net/common/ws/product")
        String note,
        @WebParam(name = "varList", targetNamespace = "http://cb.ukrpay.net/common/ws/product")
        List<OperVar> varList);

    /**
     * 
     * @param note
     * @param clientProductId
     * @param varList
     * @param reqBase
     * @param newState
     * @return
     *     returns com.skywell.banking.api.ws.product.OperRp
     */
    @WebMethod
    @WebResult(targetNamespace = "http://cb.ukrpay.net/common/ws/product")
    @RequestWrapper(localName = "createOperStateChange", targetNamespace = "http://cb.ukrpay.net/common/ws/product", className = "com.skywell.banking.api.ws.product.CreateOperStateChange")
    @ResponseWrapper(localName = "createOperStateChangeResponse", targetNamespace = "http://cb.ukrpay.net/common/ws/product", className = "com.skywell.banking.api.ws.product.CreateOperStateChangeResponse")
    public OperRp createOperStateChange(
        @WebParam(name = "reqBase", targetNamespace = "http://cb.ukrpay.net/common/ws/product")
        ReqBase reqBase,
        @WebParam(name = "clientProductId", targetNamespace = "http://cb.ukrpay.net/common/ws/product")
        long clientProductId,
        @WebParam(name = "newState", targetNamespace = "http://cb.ukrpay.net/common/ws/product")
        String newState,
        @WebParam(name = "note", targetNamespace = "http://cb.ukrpay.net/common/ws/product")
        String note,
        @WebParam(name = "varList", targetNamespace = "http://cb.ukrpay.net/common/ws/product")
        List<OperVar> varList);

}
