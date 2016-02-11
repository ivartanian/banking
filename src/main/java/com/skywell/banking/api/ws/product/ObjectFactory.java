
package com.skywell.banking.api.ws.product;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the net.ukrpay.cb.common.ws.product package. 
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

    private final static QName _CreateOperSendLocalAcc_QNAME = new QName("http://cb.ukrpay.net/common/ws/product", "createOperSendLocalAcc");
    private final static QName _CreateOperResvClientProductResponse_QNAME = new QName("http://cb.ukrpay.net/common/ws/product", "createOperResvClientProductResponse");
    private final static QName _GetStatementMiniResponse_QNAME = new QName("http://cb.ukrpay.net/common/ws/product", "getStatementMiniResponse");
    private final static QName _CreateOperPayServResponse_QNAME = new QName("http://cb.ukrpay.net/common/ws/product", "createOperPayServResponse");
    private final static QName _GetOperFullResponse_QNAME = new QName("http://cb.ukrpay.net/common/ws/product", "getOperFullResponse");
    private final static QName _CreateOperSendCountryAccResponse_QNAME = new QName("http://cb.ukrpay.net/common/ws/product", "createOperSendCountryAccResponse");
    private final static QName _GetStatementMini_QNAME = new QName("http://cb.ukrpay.net/common/ws/product", "getStatementMini");
    private final static QName _GetClientFullProduct_QNAME = new QName("http://cb.ukrpay.net/common/ws/product", "getClientFullProduct");
    private final static QName _CreateOperSendClientProductResponse_QNAME = new QName("http://cb.ukrpay.net/common/ws/product", "createOperSendClientProductResponse");
    private final static QName _GetPayProductListResponse_QNAME = new QName("http://cb.ukrpay.net/common/ws/product", "getPayProductListResponse");
    private final static QName _GetClientProductList_QNAME = new QName("http://cb.ukrpay.net/common/ws/product", "getClientProductList");
    private final static QName _GetAlgList_QNAME = new QName("http://cb.ukrpay.net/common/ws/product", "getAlgList");
    private final static QName _CreateOperSendLocalAccResponse_QNAME = new QName("http://cb.ukrpay.net/common/ws/product", "createOperSendLocalAccResponse");
    private final static QName _CreateOperSendCountryCard_QNAME = new QName("http://cb.ukrpay.net/common/ws/product", "createOperSendCountryCard");
    private final static QName _CreateOperResvClientProduct_QNAME = new QName("http://cb.ukrpay.net/common/ws/product", "createOperResvClientProduct");
    private final static QName _GetOperFull_QNAME = new QName("http://cb.ukrpay.net/common/ws/product", "getOperFull");
    private final static QName _CreateOperSendLocalCard_QNAME = new QName("http://cb.ukrpay.net/common/ws/product", "createOperSendLocalCard");
    private final static QName _GetOperList_QNAME = new QName("http://cb.ukrpay.net/common/ws/product", "getOperList");
    private final static QName _CreateOperSendLocalCardResponse_QNAME = new QName("http://cb.ukrpay.net/common/ws/product", "createOperSendLocalCardResponse");
    private final static QName _GetPayProductList_QNAME = new QName("http://cb.ukrpay.net/common/ws/product", "getPayProductList");
    private final static QName _GetClientProductListResponse_QNAME = new QName("http://cb.ukrpay.net/common/ws/product", "getClientProductListResponse");
    private final static QName _GetAlgListResponse_QNAME = new QName("http://cb.ukrpay.net/common/ws/product", "getAlgListResponse");
    private final static QName _CreateOperPayServ_QNAME = new QName("http://cb.ukrpay.net/common/ws/product", "createOperPayServ");
    private final static QName _CreateOperStateChange_QNAME = new QName("http://cb.ukrpay.net/common/ws/product", "createOperStateChange");
    private final static QName _GetOperListResponse_QNAME = new QName("http://cb.ukrpay.net/common/ws/product", "getOperListResponse");
    private final static QName _CreateOperSendCountryCardResponse_QNAME = new QName("http://cb.ukrpay.net/common/ws/product", "createOperSendCountryCardResponse");
    private final static QName _CheckOperOtpResponse_QNAME = new QName("http://cb.ukrpay.net/common/ws/product", "checkOperOtpResponse");
    private final static QName _CreateOperStateChangeResponse_QNAME = new QName("http://cb.ukrpay.net/common/ws/product", "createOperStateChangeResponse");
    private final static QName _GetClientFullProductResponse_QNAME = new QName("http://cb.ukrpay.net/common/ws/product", "getClientFullProductResponse");
    private final static QName _CreateOperSendClientProduct_QNAME = new QName("http://cb.ukrpay.net/common/ws/product", "createOperSendClientProduct");
    private final static QName _CreateOperSendCountryAcc_QNAME = new QName("http://cb.ukrpay.net/common/ws/product", "createOperSendCountryAcc");
    private final static QName _CheckOperOtp_QNAME = new QName("http://cb.ukrpay.net/common/ws/product", "checkOperOtp");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: net.ukrpay.cb.common.ws.product
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetAlgList }
     * 
     */
    public GetAlgList createGetAlgList() {
        return new GetAlgList();
    }

    /**
     * Create an instance of {@link CreateOperSendLocalAccResponse }
     * 
     */
    public CreateOperSendLocalAccResponse createCreateOperSendLocalAccResponse() {
        return new CreateOperSendLocalAccResponse();
    }

    /**
     * Create an instance of {@link CreateOperSendCountryAcc }
     * 
     */
    public CreateOperSendCountryAcc createCreateOperSendCountryAcc() {
        return new CreateOperSendCountryAcc();
    }

    /**
     * Create an instance of {@link GetClientFullProductResponse }
     * 
     */
    public GetClientFullProductResponse createGetClientFullProductResponse() {
        return new GetClientFullProductResponse();
    }

    /**
     * Create an instance of {@link CreateOperSendClientProduct }
     * 
     */
    public CreateOperSendClientProduct createCreateOperSendClientProduct() {
        return new CreateOperSendClientProduct();
    }

    /**
     * Create an instance of {@link CreateOperResvClientProduct }
     * 
     */
    public CreateOperResvClientProduct createCreateOperResvClientProduct() {
        return new CreateOperResvClientProduct();
    }

    /**
     * Create an instance of {@link GetOperFull }
     * 
     */
    public GetOperFull createGetOperFull() {
        return new GetOperFull();
    }

    /**
     * Create an instance of {@link CheckOperOtp }
     * 
     */
    public CheckOperOtp createCheckOperOtp() {
        return new CheckOperOtp();
    }

    /**
     * Create an instance of {@link CreateOperSendCountryCard }
     * 
     */
    public CreateOperSendCountryCard createCreateOperSendCountryCard() {
        return new CreateOperSendCountryCard();
    }

    /**
     * Create an instance of {@link CreateOperSendClientProductResponse }
     * 
     */
    public CreateOperSendClientProductResponse createCreateOperSendClientProductResponse() {
        return new CreateOperSendClientProductResponse();
    }

    /**
     * Create an instance of {@link CreateOperStateChangeResponse }
     * 
     */
    public CreateOperStateChangeResponse createCreateOperStateChangeResponse() {
        return new CreateOperStateChangeResponse();
    }

    /**
     * Create an instance of {@link CheckOperOtpResponse }
     * 
     */
    public CheckOperOtpResponse createCheckOperOtpResponse() {
        return new CheckOperOtpResponse();
    }

    /**
     * Create an instance of {@link GetClientProductList }
     * 
     */
    public GetClientProductList createGetClientProductList() {
        return new GetClientProductList();
    }

    /**
     * Create an instance of {@link CreateOperSendCountryCardResponse }
     * 
     */
    public CreateOperSendCountryCardResponse createCreateOperSendCountryCardResponse() {
        return new CreateOperSendCountryCardResponse();
    }

    /**
     * Create an instance of {@link GetPayProductListResponse }
     * 
     */
    public GetPayProductListResponse createGetPayProductListResponse() {
        return new GetPayProductListResponse();
    }

    /**
     * Create an instance of {@link GetOperFullResponse }
     * 
     */
    public GetOperFullResponse createGetOperFullResponse() {
        return new GetOperFullResponse();
    }

    /**
     * Create an instance of {@link GetPayProductList }
     * 
     */
    public GetPayProductList createGetPayProductList() {
        return new GetPayProductList();
    }

    /**
     * Create an instance of {@link CreateOperPayServResponse }
     * 
     */
    public CreateOperPayServResponse createCreateOperPayServResponse() {
        return new CreateOperPayServResponse();
    }

    /**
     * Create an instance of {@link GetClientFullProduct }
     * 
     */
    public GetClientFullProduct createGetClientFullProduct() {
        return new GetClientFullProduct();
    }

    /**
     * Create an instance of {@link GetOperListResponse }
     * 
     */
    public GetOperListResponse createGetOperListResponse() {
        return new GetOperListResponse();
    }

    /**
     * Create an instance of {@link CreateOperSendCountryAccResponse }
     * 
     */
    public CreateOperSendCountryAccResponse createCreateOperSendCountryAccResponse() {
        return new CreateOperSendCountryAccResponse();
    }

    /**
     * Create an instance of {@link GetStatementMini }
     * 
     */
    public GetStatementMini createGetStatementMini() {
        return new GetStatementMini();
    }

    /**
     * Create an instance of {@link CreateOperStateChange }
     * 
     */
    public CreateOperStateChange createCreateOperStateChange() {
        return new CreateOperStateChange();
    }

    /**
     * Create an instance of {@link GetAlgListResponse }
     * 
     */
    public GetAlgListResponse createGetAlgListResponse() {
        return new GetAlgListResponse();
    }

    /**
     * Create an instance of {@link CreateOperPayServ }
     * 
     */
    public CreateOperPayServ createCreateOperPayServ() {
        return new CreateOperPayServ();
    }

    /**
     * Create an instance of {@link GetClientProductListResponse }
     * 
     */
    public GetClientProductListResponse createGetClientProductListResponse() {
        return new GetClientProductListResponse();
    }

    /**
     * Create an instance of {@link CreateOperResvClientProductResponse }
     * 
     */
    public CreateOperResvClientProductResponse createCreateOperResvClientProductResponse() {
        return new CreateOperResvClientProductResponse();
    }

    /**
     * Create an instance of {@link CreateOperSendLocalAcc }
     * 
     */
    public CreateOperSendLocalAcc createCreateOperSendLocalAcc() {
        return new CreateOperSendLocalAcc();
    }

    /**
     * Create an instance of {@link GetOperList }
     * 
     */
    public GetOperList createGetOperList() {
        return new GetOperList();
    }

    /**
     * Create an instance of {@link CreateOperSendLocalCardResponse }
     * 
     */
    public CreateOperSendLocalCardResponse createCreateOperSendLocalCardResponse() {
        return new CreateOperSendLocalCardResponse();
    }

    /**
     * Create an instance of {@link GetStatementMiniResponse }
     * 
     */
    public GetStatementMiniResponse createGetStatementMiniResponse() {
        return new GetStatementMiniResponse();
    }

    /**
     * Create an instance of {@link CreateOperSendLocalCard }
     * 
     */
    public CreateOperSendLocalCard createCreateOperSendLocalCard() {
        return new CreateOperSendLocalCard();
    }

    /**
     * Create an instance of {@link ClientAccount }
     * 
     */
    public ClientAccount createClientAccount() {
        return new ClientAccount();
    }

    /**
     * Create an instance of {@link AlgListRp }
     * 
     */
    public AlgListRp createAlgListRp() {
        return new AlgListRp();
    }

    /**
     * Create an instance of {@link BankDeposit }
     * 
     */
    public BankDeposit createBankDeposit() {
        return new BankDeposit();
    }

    /**
     * Create an instance of {@link PayProductListRp }
     * 
     */
    public PayProductListRp createPayProductListRp() {
        return new PayProductListRp();
    }

    /**
     * Create an instance of {@link Tarif }
     * 
     */
    public Tarif createTarif() {
        return new Tarif();
    }

    /**
     * Create an instance of {@link ClientTrans }
     * 
     */
    public ClientTrans createClientTrans() {
        return new ClientTrans();
    }

    /**
     * Create an instance of {@link ClientFullDeposit }
     * 
     */
    public ClientFullDeposit createClientFullDeposit() {
        return new ClientFullDeposit();
    }

    /**
     * Create an instance of {@link ClientFullProductRp }
     * 
     */
    public ClientFullProductRp createClientFullProductRp() {
        return new ClientFullProductRp();
    }

    /**
     * Create an instance of {@link Alg }
     * 
     */
    public Alg createAlg() {
        return new Alg();
    }

    /**
     * Create an instance of {@link BankAccount }
     * 
     */
    public BankAccount createBankAccount() {
        return new BankAccount();
    }

    /**
     * Create an instance of {@link AlgTarifRec }
     * 
     */
    public AlgTarifRec createAlgTarifRec() {
        return new AlgTarifRec();
    }

    /**
     * Create an instance of {@link OperListRp }
     * 
     */
    public OperListRp createOperListRp() {
        return new OperListRp();
    }

    /**
     * Create an instance of {@link ClientProduct }
     * 
     */
    public ClientProduct createClientProduct() {
        return new ClientProduct();
    }

    /**
     * Create an instance of {@link BankProduct }
     * 
     */
    public BankProduct createBankProduct() {
        return new BankProduct();
    }

    /**
     * Create an instance of {@link BankCard }
     * 
     */
    public BankCard createBankCard() {
        return new BankCard();
    }

    /**
     * Create an instance of {@link AlgTarif }
     * 
     */
    public AlgTarif createAlgTarif() {
        return new AlgTarif();
    }

    /**
     * Create an instance of {@link OperVar }
     * 
     */
    public OperVar createOperVar() {
        return new OperVar();
    }

    /**
     * Create an instance of {@link ClientCard }
     * 
     */
    public ClientCard createClientCard() {
        return new ClientCard();
    }

    /**
     * Create an instance of {@link ClientFullProduct }
     * 
     */
    public ClientFullProduct createClientFullProduct() {
        return new ClientFullProduct();
    }

    /**
     * Create an instance of {@link ClientFullAccount }
     * 
     */
    public ClientFullAccount createClientFullAccount() {
        return new ClientFullAccount();
    }

    /**
     * Create an instance of {@link BankLoan }
     * 
     */
    public BankLoan createBankLoan() {
        return new BankLoan();
    }

    /**
     * Create an instance of {@link ClientDeposit }
     * 
     */
    public ClientDeposit createClientDeposit() {
        return new ClientDeposit();
    }

    /**
     * Create an instance of {@link PayProduct }
     * 
     */
    public PayProduct createPayProduct() {
        return new PayProduct();
    }

    /**
     * Create an instance of {@link BankDepositPeriod }
     * 
     */
    public BankDepositPeriod createBankDepositPeriod() {
        return new BankDepositPeriod();
    }

    /**
     * Create an instance of {@link ClientLoan }
     * 
     */
    public ClientLoan createClientLoan() {
        return new ClientLoan();
    }

    /**
     * Create an instance of {@link ClientFullLoan }
     * 
     */
    public ClientFullLoan createClientFullLoan() {
        return new ClientFullLoan();
    }

    /**
     * Create an instance of {@link OperRp }
     * 
     */
    public OperRp createOperRp() {
        return new OperRp();
    }

    /**
     * Create an instance of {@link ClientProductListRp }
     * 
     */
    public ClientProductListRp createClientProductListRp() {
        return new ClientProductListRp();
    }

    /**
     * Create an instance of {@link ClientFullCard }
     * 
     */
    public ClientFullCard createClientFullCard() {
        return new ClientFullCard();
    }

    /**
     * Create an instance of {@link ClientTransListRp }
     * 
     */
    public ClientTransListRp createClientTransListRp() {
        return new ClientTransListRp();
    }

    /**
     * Create an instance of {@link Oper }
     * 
     */
    public Oper createOper() {
        return new Oper();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateOperSendLocalAcc }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cb.ukrpay.net/common/ws/product", name = "createOperSendLocalAcc")
    public JAXBElement<CreateOperSendLocalAcc> createCreateOperSendLocalAcc(CreateOperSendLocalAcc value) {
        return new JAXBElement<CreateOperSendLocalAcc>(_CreateOperSendLocalAcc_QNAME, CreateOperSendLocalAcc.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateOperResvClientProductResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cb.ukrpay.net/common/ws/product", name = "createOperResvClientProductResponse")
    public JAXBElement<CreateOperResvClientProductResponse> createCreateOperResvClientProductResponse(CreateOperResvClientProductResponse value) {
        return new JAXBElement<CreateOperResvClientProductResponse>(_CreateOperResvClientProductResponse_QNAME, CreateOperResvClientProductResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStatementMiniResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cb.ukrpay.net/common/ws/product", name = "getStatementMiniResponse")
    public JAXBElement<GetStatementMiniResponse> createGetStatementMiniResponse(GetStatementMiniResponse value) {
        return new JAXBElement<GetStatementMiniResponse>(_GetStatementMiniResponse_QNAME, GetStatementMiniResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateOperPayServResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cb.ukrpay.net/common/ws/product", name = "createOperPayServResponse")
    public JAXBElement<CreateOperPayServResponse> createCreateOperPayServResponse(CreateOperPayServResponse value) {
        return new JAXBElement<CreateOperPayServResponse>(_CreateOperPayServResponse_QNAME, CreateOperPayServResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOperFullResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cb.ukrpay.net/common/ws/product", name = "getOperFullResponse")
    public JAXBElement<GetOperFullResponse> createGetOperFullResponse(GetOperFullResponse value) {
        return new JAXBElement<GetOperFullResponse>(_GetOperFullResponse_QNAME, GetOperFullResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateOperSendCountryAccResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cb.ukrpay.net/common/ws/product", name = "createOperSendCountryAccResponse")
    public JAXBElement<CreateOperSendCountryAccResponse> createCreateOperSendCountryAccResponse(CreateOperSendCountryAccResponse value) {
        return new JAXBElement<CreateOperSendCountryAccResponse>(_CreateOperSendCountryAccResponse_QNAME, CreateOperSendCountryAccResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStatementMini }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cb.ukrpay.net/common/ws/product", name = "getStatementMini")
    public JAXBElement<GetStatementMini> createGetStatementMini(GetStatementMini value) {
        return new JAXBElement<GetStatementMini>(_GetStatementMini_QNAME, GetStatementMini.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetClientFullProduct }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cb.ukrpay.net/common/ws/product", name = "getClientFullProduct")
    public JAXBElement<GetClientFullProduct> createGetClientFullProduct(GetClientFullProduct value) {
        return new JAXBElement<GetClientFullProduct>(_GetClientFullProduct_QNAME, GetClientFullProduct.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateOperSendClientProductResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cb.ukrpay.net/common/ws/product", name = "createOperSendClientProductResponse")
    public JAXBElement<CreateOperSendClientProductResponse> createCreateOperSendClientProductResponse(CreateOperSendClientProductResponse value) {
        return new JAXBElement<CreateOperSendClientProductResponse>(_CreateOperSendClientProductResponse_QNAME, CreateOperSendClientProductResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPayProductListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cb.ukrpay.net/common/ws/product", name = "getPayProductListResponse")
    public JAXBElement<GetPayProductListResponse> createGetPayProductListResponse(GetPayProductListResponse value) {
        return new JAXBElement<GetPayProductListResponse>(_GetPayProductListResponse_QNAME, GetPayProductListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetClientProductList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cb.ukrpay.net/common/ws/product", name = "getClientProductList")
    public JAXBElement<GetClientProductList> createGetClientProductList(GetClientProductList value) {
        return new JAXBElement<GetClientProductList>(_GetClientProductList_QNAME, GetClientProductList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAlgList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cb.ukrpay.net/common/ws/product", name = "getAlgList")
    public JAXBElement<GetAlgList> createGetAlgList(GetAlgList value) {
        return new JAXBElement<GetAlgList>(_GetAlgList_QNAME, GetAlgList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateOperSendLocalAccResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cb.ukrpay.net/common/ws/product", name = "createOperSendLocalAccResponse")
    public JAXBElement<CreateOperSendLocalAccResponse> createCreateOperSendLocalAccResponse(CreateOperSendLocalAccResponse value) {
        return new JAXBElement<CreateOperSendLocalAccResponse>(_CreateOperSendLocalAccResponse_QNAME, CreateOperSendLocalAccResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateOperSendCountryCard }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cb.ukrpay.net/common/ws/product", name = "createOperSendCountryCard")
    public JAXBElement<CreateOperSendCountryCard> createCreateOperSendCountryCard(CreateOperSendCountryCard value) {
        return new JAXBElement<CreateOperSendCountryCard>(_CreateOperSendCountryCard_QNAME, CreateOperSendCountryCard.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateOperResvClientProduct }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cb.ukrpay.net/common/ws/product", name = "createOperResvClientProduct")
    public JAXBElement<CreateOperResvClientProduct> createCreateOperResvClientProduct(CreateOperResvClientProduct value) {
        return new JAXBElement<CreateOperResvClientProduct>(_CreateOperResvClientProduct_QNAME, CreateOperResvClientProduct.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOperFull }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cb.ukrpay.net/common/ws/product", name = "getOperFull")
    public JAXBElement<GetOperFull> createGetOperFull(GetOperFull value) {
        return new JAXBElement<GetOperFull>(_GetOperFull_QNAME, GetOperFull.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateOperSendLocalCard }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cb.ukrpay.net/common/ws/product", name = "createOperSendLocalCard")
    public JAXBElement<CreateOperSendLocalCard> createCreateOperSendLocalCard(CreateOperSendLocalCard value) {
        return new JAXBElement<CreateOperSendLocalCard>(_CreateOperSendLocalCard_QNAME, CreateOperSendLocalCard.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOperList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cb.ukrpay.net/common/ws/product", name = "getOperList")
    public JAXBElement<GetOperList> createGetOperList(GetOperList value) {
        return new JAXBElement<GetOperList>(_GetOperList_QNAME, GetOperList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateOperSendLocalCardResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cb.ukrpay.net/common/ws/product", name = "createOperSendLocalCardResponse")
    public JAXBElement<CreateOperSendLocalCardResponse> createCreateOperSendLocalCardResponse(CreateOperSendLocalCardResponse value) {
        return new JAXBElement<CreateOperSendLocalCardResponse>(_CreateOperSendLocalCardResponse_QNAME, CreateOperSendLocalCardResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPayProductList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cb.ukrpay.net/common/ws/product", name = "getPayProductList")
    public JAXBElement<GetPayProductList> createGetPayProductList(GetPayProductList value) {
        return new JAXBElement<GetPayProductList>(_GetPayProductList_QNAME, GetPayProductList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetClientProductListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cb.ukrpay.net/common/ws/product", name = "getClientProductListResponse")
    public JAXBElement<GetClientProductListResponse> createGetClientProductListResponse(GetClientProductListResponse value) {
        return new JAXBElement<GetClientProductListResponse>(_GetClientProductListResponse_QNAME, GetClientProductListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAlgListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cb.ukrpay.net/common/ws/product", name = "getAlgListResponse")
    public JAXBElement<GetAlgListResponse> createGetAlgListResponse(GetAlgListResponse value) {
        return new JAXBElement<GetAlgListResponse>(_GetAlgListResponse_QNAME, GetAlgListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateOperPayServ }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cb.ukrpay.net/common/ws/product", name = "createOperPayServ")
    public JAXBElement<CreateOperPayServ> createCreateOperPayServ(CreateOperPayServ value) {
        return new JAXBElement<CreateOperPayServ>(_CreateOperPayServ_QNAME, CreateOperPayServ.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateOperStateChange }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cb.ukrpay.net/common/ws/product", name = "createOperStateChange")
    public JAXBElement<CreateOperStateChange> createCreateOperStateChange(CreateOperStateChange value) {
        return new JAXBElement<CreateOperStateChange>(_CreateOperStateChange_QNAME, CreateOperStateChange.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOperListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cb.ukrpay.net/common/ws/product", name = "getOperListResponse")
    public JAXBElement<GetOperListResponse> createGetOperListResponse(GetOperListResponse value) {
        return new JAXBElement<GetOperListResponse>(_GetOperListResponse_QNAME, GetOperListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateOperSendCountryCardResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cb.ukrpay.net/common/ws/product", name = "createOperSendCountryCardResponse")
    public JAXBElement<CreateOperSendCountryCardResponse> createCreateOperSendCountryCardResponse(CreateOperSendCountryCardResponse value) {
        return new JAXBElement<CreateOperSendCountryCardResponse>(_CreateOperSendCountryCardResponse_QNAME, CreateOperSendCountryCardResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckOperOtpResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cb.ukrpay.net/common/ws/product", name = "checkOperOtpResponse")
    public JAXBElement<CheckOperOtpResponse> createCheckOperOtpResponse(CheckOperOtpResponse value) {
        return new JAXBElement<CheckOperOtpResponse>(_CheckOperOtpResponse_QNAME, CheckOperOtpResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateOperStateChangeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cb.ukrpay.net/common/ws/product", name = "createOperStateChangeResponse")
    public JAXBElement<CreateOperStateChangeResponse> createCreateOperStateChangeResponse(CreateOperStateChangeResponse value) {
        return new JAXBElement<CreateOperStateChangeResponse>(_CreateOperStateChangeResponse_QNAME, CreateOperStateChangeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetClientFullProductResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cb.ukrpay.net/common/ws/product", name = "getClientFullProductResponse")
    public JAXBElement<GetClientFullProductResponse> createGetClientFullProductResponse(GetClientFullProductResponse value) {
        return new JAXBElement<GetClientFullProductResponse>(_GetClientFullProductResponse_QNAME, GetClientFullProductResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateOperSendClientProduct }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cb.ukrpay.net/common/ws/product", name = "createOperSendClientProduct")
    public JAXBElement<CreateOperSendClientProduct> createCreateOperSendClientProduct(CreateOperSendClientProduct value) {
        return new JAXBElement<CreateOperSendClientProduct>(_CreateOperSendClientProduct_QNAME, CreateOperSendClientProduct.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateOperSendCountryAcc }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cb.ukrpay.net/common/ws/product", name = "createOperSendCountryAcc")
    public JAXBElement<CreateOperSendCountryAcc> createCreateOperSendCountryAcc(CreateOperSendCountryAcc value) {
        return new JAXBElement<CreateOperSendCountryAcc>(_CreateOperSendCountryAcc_QNAME, CreateOperSendCountryAcc.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckOperOtp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cb.ukrpay.net/common/ws/product", name = "checkOperOtp")
    public JAXBElement<CheckOperOtp> createCheckOperOtp(CheckOperOtp value) {
        return new JAXBElement<CheckOperOtp>(_CheckOperOtp_QNAME, CheckOperOtp.class, null, value);
    }

}
