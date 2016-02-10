
package src;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "BaseWebService", targetNamespace = "http://cb.ukrpay.net/common/ws")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface BaseWebService {


    /**
     * 
     * @param reqBase
     * @return
     *     returns src.LangListRp
     */
    @WebMethod
    @WebResult(targetNamespace = "http://cb.ukrpay.net/common/ws/core")
    @RequestWrapper(localName = "getLangList", targetNamespace = "http://cb.ukrpay.net/common/ws/core", className = "src.GetLangList")
    @ResponseWrapper(localName = "getLangListResponse", targetNamespace = "http://cb.ukrpay.net/common/ws/core", className = "src.GetLangListResponse")
    public LangListRp getLangList(
        @WebParam(name = "reqBase", targetNamespace = "http://cb.ukrpay.net/common/ws/core")
        ReqBase reqBase);

    /**
     * 
     * @param reqBase
     * @return
     *     returns src.CurrencyListRp
     */
    @WebMethod
    @WebResult(targetNamespace = "http://cb.ukrpay.net/common/ws/core")
    @RequestWrapper(localName = "getCurrencyList", targetNamespace = "http://cb.ukrpay.net/common/ws/core", className = "src.GetCurrencyList")
    @ResponseWrapper(localName = "getCurrencyListResponse", targetNamespace = "http://cb.ukrpay.net/common/ws/core", className = "src.GetCurrencyListResponse")
    public CurrencyListRp getCurrencyList(
        @WebParam(name = "reqBase", targetNamespace = "http://cb.ukrpay.net/common/ws/core")
        ReqBase reqBase);

    /**
     * 
     * @param reqBase
     * @return
     *     returns src.CurrencyListRp
     */
    @WebMethod
    @WebResult(targetNamespace = "http://cb.ukrpay.net/common/ws/core")
    @RequestWrapper(localName = "getCurrencyAllList", targetNamespace = "http://cb.ukrpay.net/common/ws/core", className = "src.GetCurrencyAllList")
    @ResponseWrapper(localName = "getCurrencyAllListResponse", targetNamespace = "http://cb.ukrpay.net/common/ws/core", className = "src.GetCurrencyAllListResponse")
    public CurrencyListRp getCurrencyAllList(
        @WebParam(name = "reqBase", targetNamespace = "http://cb.ukrpay.net/common/ws/core")
        ReqBase reqBase);

    /**
     * 
     * @param fltCurrencyId
     * @param reqBase
     * @param fltCurrencyType
     * @param fltExchType
     * @return
     *     returns src.ExchRateListRp
     */
    @WebMethod
    @WebResult(targetNamespace = "http://cb.ukrpay.net/common/ws/core")
    @RequestWrapper(localName = "getExchRateList", targetNamespace = "http://cb.ukrpay.net/common/ws/core", className = "src.GetExchRateList")
    @ResponseWrapper(localName = "getExchRateListResponse", targetNamespace = "http://cb.ukrpay.net/common/ws/core", className = "src.GetExchRateListResponse")
    public ExchRateListRp getExchRateList(
        @WebParam(name = "reqBase", targetNamespace = "http://cb.ukrpay.net/common/ws/core")
        ReqBase reqBase,
        @WebParam(name = "fltExchType", targetNamespace = "http://cb.ukrpay.net/common/ws/core")
        String fltExchType,
        @WebParam(name = "fltCurrencyType", targetNamespace = "http://cb.ukrpay.net/common/ws/core")
        String fltCurrencyType,
        @WebParam(name = "fltCurrencyId", targetNamespace = "http://cb.ukrpay.net/common/ws/core")
        int fltCurrencyId);

    /**
     * 
     * @param reqBase
     * @return
     *     returns src.NewsListRp
     */
    @WebMethod
    @WebResult(targetNamespace = "http://cb.ukrpay.net/common/ws/core")
    @RequestWrapper(localName = "getNewsList", targetNamespace = "http://cb.ukrpay.net/common/ws/core", className = "src.GetNewsList")
    @ResponseWrapper(localName = "getNewsListResponse", targetNamespace = "http://cb.ukrpay.net/common/ws/core", className = "src.GetNewsListResponse")
    public NewsListRp getNewsList(
        @WebParam(name = "reqBase", targetNamespace = "http://cb.ukrpay.net/common/ws/core")
        ReqBase reqBase);

}
