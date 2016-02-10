
package servapi;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the servapi package. 
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

    private final static QName _GetCategoryListResponse_QNAME = new QName("http://cb.ukrpay.net/common/ws/serv", "getCategoryListResponse");
    private final static QName _GetCategoryList_QNAME = new QName("http://cb.ukrpay.net/common/ws/serv", "getCategoryList");
    private final static QName _CheckBalanceResponse_QNAME = new QName("http://cb.ukrpay.net/common/ws/serv", "checkBalanceResponse");
    private final static QName _GetServList_QNAME = new QName("http://cb.ukrpay.net/common/ws/serv", "getServList");
    private final static QName _GetServInfo_QNAME = new QName("http://cb.ukrpay.net/common/ws/serv", "getServInfo");
    private final static QName _GetServInfoResponse_QNAME = new QName("http://cb.ukrpay.net/common/ws/serv", "getServInfoResponse");
    private final static QName _CheckBalance_QNAME = new QName("http://cb.ukrpay.net/common/ws/serv", "checkBalance");
    private final static QName _GetServListResponse_QNAME = new QName("http://cb.ukrpay.net/common/ws/serv", "getServListResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: servapi
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetCategoryListResponse }
     * 
     */
    public GetCategoryListResponse createGetCategoryListResponse() {
        return new GetCategoryListResponse();
    }

    /**
     * Create an instance of {@link GetCategoryList }
     * 
     */
    public GetCategoryList createGetCategoryList() {
        return new GetCategoryList();
    }

    /**
     * Create an instance of {@link CheckBalanceResponse }
     * 
     */
    public CheckBalanceResponse createCheckBalanceResponse() {
        return new CheckBalanceResponse();
    }

    /**
     * Create an instance of {@link GetServList }
     * 
     */
    public GetServList createGetServList() {
        return new GetServList();
    }

    /**
     * Create an instance of {@link GetServInfo }
     * 
     */
    public GetServInfo createGetServInfo() {
        return new GetServInfo();
    }

    /**
     * Create an instance of {@link GetServInfoResponse }
     * 
     */
    public GetServInfoResponse createGetServInfoResponse() {
        return new GetServInfoResponse();
    }

    /**
     * Create an instance of {@link CheckBalance }
     * 
     */
    public CheckBalance createCheckBalance() {
        return new CheckBalance();
    }

    /**
     * Create an instance of {@link GetServListResponse }
     * 
     */
    public GetServListResponse createGetServListResponse() {
        return new GetServListResponse();
    }

    /**
     * Create an instance of {@link CheckAttr }
     * 
     */
    public CheckAttr createCheckAttr() {
        return new CheckAttr();
    }

    /**
     * Create an instance of {@link ServInfo }
     * 
     */
    public ServInfo createServInfo() {
        return new ServInfo();
    }

    /**
     * Create an instance of {@link ServListRp }
     * 
     */
    public ServListRp createServListRp() {
        return new ServListRp();
    }

    /**
     * Create an instance of {@link ServOperRp }
     * 
     */
    public ServOperRp createServOperRp() {
        return new ServOperRp();
    }

    /**
     * Create an instance of {@link ServOper }
     * 
     */
    public ServOper createServOper() {
        return new ServOper();
    }

    /**
     * Create an instance of {@link ServInfoRp }
     * 
     */
    public ServInfoRp createServInfoRp() {
        return new ServInfoRp();
    }

    /**
     * Create an instance of {@link CategoryListRp }
     * 
     */
    public CategoryListRp createCategoryListRp() {
        return new CategoryListRp();
    }

    /**
     * Create an instance of {@link AttrValue }
     * 
     */
    public AttrValue createAttrValue() {
        return new AttrValue();
    }

    /**
     * Create an instance of {@link Category }
     * 
     */
    public Category createCategory() {
        return new Category();
    }

    /**
     * Create an instance of {@link ServShort }
     * 
     */
    public ServShort createServShort() {
        return new ServShort();
    }

    /**
     * Create an instance of {@link ResultRp }
     * 
     */
    public ResultRp createResultRp() {
        return new ResultRp();
    }

    /**
     * Create an instance of {@link ReqBase }
     * 
     */
    public ReqBase createReqBase() {
        return new ReqBase();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCategoryListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cb.ukrpay.net/common/ws/serv", name = "getCategoryListResponse")
    public JAXBElement<GetCategoryListResponse> createGetCategoryListResponse(GetCategoryListResponse value) {
        return new JAXBElement<GetCategoryListResponse>(_GetCategoryListResponse_QNAME, GetCategoryListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCategoryList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cb.ukrpay.net/common/ws/serv", name = "getCategoryList")
    public JAXBElement<GetCategoryList> createGetCategoryList(GetCategoryList value) {
        return new JAXBElement<GetCategoryList>(_GetCategoryList_QNAME, GetCategoryList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckBalanceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cb.ukrpay.net/common/ws/serv", name = "checkBalanceResponse")
    public JAXBElement<CheckBalanceResponse> createCheckBalanceResponse(CheckBalanceResponse value) {
        return new JAXBElement<CheckBalanceResponse>(_CheckBalanceResponse_QNAME, CheckBalanceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetServList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cb.ukrpay.net/common/ws/serv", name = "getServList")
    public JAXBElement<GetServList> createGetServList(GetServList value) {
        return new JAXBElement<GetServList>(_GetServList_QNAME, GetServList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetServInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cb.ukrpay.net/common/ws/serv", name = "getServInfo")
    public JAXBElement<GetServInfo> createGetServInfo(GetServInfo value) {
        return new JAXBElement<GetServInfo>(_GetServInfo_QNAME, GetServInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetServInfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cb.ukrpay.net/common/ws/serv", name = "getServInfoResponse")
    public JAXBElement<GetServInfoResponse> createGetServInfoResponse(GetServInfoResponse value) {
        return new JAXBElement<GetServInfoResponse>(_GetServInfoResponse_QNAME, GetServInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckBalance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cb.ukrpay.net/common/ws/serv", name = "checkBalance")
    public JAXBElement<CheckBalance> createCheckBalance(CheckBalance value) {
        return new JAXBElement<CheckBalance>(_CheckBalance_QNAME, CheckBalance.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetServListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cb.ukrpay.net/common/ws/serv", name = "getServListResponse")
    public JAXBElement<GetServListResponse> createGetServListResponse(GetServListResponse value) {
        return new JAXBElement<GetServListResponse>(_GetServListResponse_QNAME, GetServListResponse.class, null, value);
    }

}
