
package com.skywell.ws.core;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the net.ukrpay.cb.common.ws.core package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetExchRateListResponse_QNAME = new QName("http://cb.ukrpay.net/common/ws/core", "getExchRateListResponse");
    private final static QName _GetLangListResponse_QNAME = new QName("http://cb.ukrpay.net/common/ws/core", "getLangListResponse");
    private final static QName _GetCurrencyAllListResponse_QNAME = new QName("http://cb.ukrpay.net/common/ws/core", "getCurrencyAllListResponse");
    private final static QName _GetLangList_QNAME = new QName("http://cb.ukrpay.net/common/ws/core", "getLangList");
    private final static QName _GetCurrencyListResponse_QNAME = new QName("http://cb.ukrpay.net/common/ws/core", "getCurrencyListResponse");
    private final static QName _GetCurrencyAllList_QNAME = new QName("http://cb.ukrpay.net/common/ws/core", "getCurrencyAllList");
    private final static QName _GetNewsList_QNAME = new QName("http://cb.ukrpay.net/common/ws/core", "getNewsList");
    private final static QName _GetExchRateList_QNAME = new QName("http://cb.ukrpay.net/common/ws/core", "getExchRateList");
    private final static QName _GetCurrencyList_QNAME = new QName("http://cb.ukrpay.net/common/ws/core", "getCurrencyList");
    private final static QName _GetNewsListResponse_QNAME = new QName("http://cb.ukrpay.net/common/ws/core", "getNewsListResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: net.ukrpay.cb.common.ws.core
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetExchRateListResponse }
     * 
     */
    public GetExchRateListResponse createGetExchRateListResponse() {
        return new GetExchRateListResponse();
    }

    /**
     * Create an instance of {@link GetLangListResponse }
     * 
     */
    public GetLangListResponse createGetLangListResponse() {
        return new GetLangListResponse();
    }

    /**
     * Create an instance of {@link GetCurrencyAllListResponse }
     * 
     */
    public GetCurrencyAllListResponse createGetCurrencyAllListResponse() {
        return new GetCurrencyAllListResponse();
    }

    /**
     * Create an instance of {@link GetLangList }
     * 
     */
    public GetLangList createGetLangList() {
        return new GetLangList();
    }

    /**
     * Create an instance of {@link GetCurrencyListResponse }
     * 
     */
    public GetCurrencyListResponse createGetCurrencyListResponse() {
        return new GetCurrencyListResponse();
    }

    /**
     * Create an instance of {@link GetCurrencyAllList }
     * 
     */
    public GetCurrencyAllList createGetCurrencyAllList() {
        return new GetCurrencyAllList();
    }

    /**
     * Create an instance of {@link GetNewsList }
     * 
     */
    public GetNewsList createGetNewsList() {
        return new GetNewsList();
    }

    /**
     * Create an instance of {@link GetExchRateList }
     * 
     */
    public GetExchRateList createGetExchRateList() {
        return new GetExchRateList();
    }

    /**
     * Create an instance of {@link GetCurrencyList }
     * 
     */
    public GetCurrencyList createGetCurrencyList() {
        return new GetCurrencyList();
    }

    /**
     * Create an instance of {@link GetNewsListResponse }
     * 
     */
    public GetNewsListResponse createGetNewsListResponse() {
        return new GetNewsListResponse();
    }

    /**
     * Create an instance of {@link News }
     * 
     */
    public News createNews() {
        return new News();
    }

    /**
     * Create an instance of {@link CurrencyListRp }
     * 
     */
    public CurrencyListRp createCurrencyListRp() {
        return new CurrencyListRp();
    }

    /**
     * Create an instance of {@link ExchRate }
     * 
     */
    public ExchRate createExchRate() {
        return new ExchRate();
    }

    /**
     * Create an instance of {@link ExchTypeRp }
     * 
     */
    public ExchTypeRp createExchTypeRp() {
        return new ExchTypeRp();
    }

    /**
     * Create an instance of {@link LangListRp }
     * 
     */
    public LangListRp createLangListRp() {
        return new LangListRp();
    }

    /**
     * Create an instance of {@link ExchRateListRp }
     * 
     */
    public ExchRateListRp createExchRateListRp() {
        return new ExchRateListRp();
    }

    /**
     * Create an instance of {@link Currency }
     * 
     */
    public Currency createCurrency() {
        return new Currency();
    }

    /**
     * Create an instance of {@link NewsListRp }
     * 
     */
    public NewsListRp createNewsListRp() {
        return new NewsListRp();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetExchRateListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cb.ukrpay.net/common/ws/core", name = "getExchRateListResponse")
    public JAXBElement<GetExchRateListResponse> createGetExchRateListResponse(GetExchRateListResponse value) {
        return new JAXBElement<GetExchRateListResponse>(_GetExchRateListResponse_QNAME, GetExchRateListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLangListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cb.ukrpay.net/common/ws/core", name = "getLangListResponse")
    public JAXBElement<GetLangListResponse> createGetLangListResponse(GetLangListResponse value) {
        return new JAXBElement<GetLangListResponse>(_GetLangListResponse_QNAME, GetLangListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCurrencyAllListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cb.ukrpay.net/common/ws/core", name = "getCurrencyAllListResponse")
    public JAXBElement<GetCurrencyAllListResponse> createGetCurrencyAllListResponse(GetCurrencyAllListResponse value) {
        return new JAXBElement<GetCurrencyAllListResponse>(_GetCurrencyAllListResponse_QNAME, GetCurrencyAllListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLangList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cb.ukrpay.net/common/ws/core", name = "getLangList")
    public JAXBElement<GetLangList> createGetLangList(GetLangList value) {
        return new JAXBElement<GetLangList>(_GetLangList_QNAME, GetLangList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCurrencyListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cb.ukrpay.net/common/ws/core", name = "getCurrencyListResponse")
    public JAXBElement<GetCurrencyListResponse> createGetCurrencyListResponse(GetCurrencyListResponse value) {
        return new JAXBElement<GetCurrencyListResponse>(_GetCurrencyListResponse_QNAME, GetCurrencyListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCurrencyAllList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cb.ukrpay.net/common/ws/core", name = "getCurrencyAllList")
    public JAXBElement<GetCurrencyAllList> createGetCurrencyAllList(GetCurrencyAllList value) {
        return new JAXBElement<GetCurrencyAllList>(_GetCurrencyAllList_QNAME, GetCurrencyAllList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNewsList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cb.ukrpay.net/common/ws/core", name = "getNewsList")
    public JAXBElement<GetNewsList> createGetNewsList(GetNewsList value) {
        return new JAXBElement<GetNewsList>(_GetNewsList_QNAME, GetNewsList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetExchRateList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cb.ukrpay.net/common/ws/core", name = "getExchRateList")
    public JAXBElement<GetExchRateList> createGetExchRateList(GetExchRateList value) {
        return new JAXBElement<GetExchRateList>(_GetExchRateList_QNAME, GetExchRateList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCurrencyList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cb.ukrpay.net/common/ws/core", name = "getCurrencyList")
    public JAXBElement<GetCurrencyList> createGetCurrencyList(GetCurrencyList value) {
        return new JAXBElement<GetCurrencyList>(_GetCurrencyList_QNAME, GetCurrencyList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNewsListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cb.ukrpay.net/common/ws/core", name = "getNewsListResponse")
    public JAXBElement<GetNewsListResponse> createGetNewsListResponse(GetNewsListResponse value) {
        return new JAXBElement<GetNewsListResponse>(_GetNewsListResponse_QNAME, GetNewsListResponse.class, null, value);
    }

}
