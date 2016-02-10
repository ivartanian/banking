
package com.skywell.ws.user;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the net.ukrpay.cb.common.ws.user package. 
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

    private final static QName _ChangePassResponse_QNAME = new QName("http://cb.ukrpay.net/common/ws/user", "changePassResponse");
    private final static QName _RestorePass_QNAME = new QName("http://cb.ukrpay.net/common/ws/user", "restorePass");
    private final static QName _Logout_QNAME = new QName("http://cb.ukrpay.net/common/ws/user", "logout");
    private final static QName _ChangePass_QNAME = new QName("http://cb.ukrpay.net/common/ws/user", "changePass");
    private final static QName _CreateUserPrepare_QNAME = new QName("http://cb.ukrpay.net/common/ws/user", "createUserPrepare");
    private final static QName _CreateUserPrepareResponse_QNAME = new QName("http://cb.ukrpay.net/common/ws/user", "createUserPrepareResponse");
    private final static QName _CheckAccessCode_QNAME = new QName("http://cb.ukrpay.net/common/ws/user", "checkAccessCode");
    private final static QName _CheckSessionResponse_QNAME = new QName("http://cb.ukrpay.net/common/ws/user", "checkSessionResponse");
    private final static QName _CheckAccessCodeResponse_QNAME = new QName("http://cb.ukrpay.net/common/ws/user", "checkAccessCodeResponse");
    private final static QName _AuthenticateResponse_QNAME = new QName("http://cb.ukrpay.net/common/ws/user", "authenticateResponse");
    private final static QName _CheckSession_QNAME = new QName("http://cb.ukrpay.net/common/ws/user", "checkSession");
    private final static QName _GetPassCfg_QNAME = new QName("http://cb.ukrpay.net/common/ws/user", "getPassCfg");
    private final static QName _RestorePassResponse_QNAME = new QName("http://cb.ukrpay.net/common/ws/user", "restorePassResponse");
    private final static QName _CreateUserOtpResponse_QNAME = new QName("http://cb.ukrpay.net/common/ws/user", "createUserOtpResponse");
    private final static QName _Authenticate_QNAME = new QName("http://cb.ukrpay.net/common/ws/user", "authenticate");
    private final static QName _LogoutResponse_QNAME = new QName("http://cb.ukrpay.net/common/ws/user", "logoutResponse");
    private final static QName _GetPassCfgResponse_QNAME = new QName("http://cb.ukrpay.net/common/ws/user", "getPassCfgResponse");
    private final static QName _CreateUserOtp_QNAME = new QName("http://cb.ukrpay.net/common/ws/user", "createUserOtp");
    private final static QName _CheckAuthOtp_QNAME = new QName("http://cb.ukrpay.net/common/ws/user", "checkAuthOtp");
    private final static QName _CheckAuthOtpResponse_QNAME = new QName("http://cb.ukrpay.net/common/ws/user", "checkAuthOtpResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: net.ukrpay.cb.common.ws.user
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CheckAuthOtp }
     * 
     */
    public CheckAuthOtp createCheckAuthOtp() {
        return new CheckAuthOtp();
    }

    /**
     * Create an instance of {@link CheckAuthOtpResponse }
     * 
     */
    public CheckAuthOtpResponse createCheckAuthOtpResponse() {
        return new CheckAuthOtpResponse();
    }

    /**
     * Create an instance of {@link Authenticate }
     * 
     */
    public Authenticate createAuthenticate() {
        return new Authenticate();
    }

    /**
     * Create an instance of {@link LogoutResponse }
     * 
     */
    public LogoutResponse createLogoutResponse() {
        return new LogoutResponse();
    }

    /**
     * Create an instance of {@link RestorePassResponse }
     * 
     */
    public RestorePassResponse createRestorePassResponse() {
        return new RestorePassResponse();
    }

    /**
     * Create an instance of {@link CreateUserOtp }
     * 
     */
    public CreateUserOtp createCreateUserOtp() {
        return new CreateUserOtp();
    }

    /**
     * Create an instance of {@link CreateUserPrepare }
     * 
     */
    public CreateUserPrepare createCreateUserPrepare() {
        return new CreateUserPrepare();
    }

    /**
     * Create an instance of {@link AuthenticateResponse }
     * 
     */
    public AuthenticateResponse createAuthenticateResponse() {
        return new AuthenticateResponse();
    }

    /**
     * Create an instance of {@link CreateUserPrepareResponse }
     * 
     */
    public CreateUserPrepareResponse createCreateUserPrepareResponse() {
        return new CreateUserPrepareResponse();
    }

    /**
     * Create an instance of {@link CreateUserOtpResponse }
     * 
     */
    public CreateUserOtpResponse createCreateUserOtpResponse() {
        return new CreateUserOtpResponse();
    }

    /**
     * Create an instance of {@link ChangePass }
     * 
     */
    public ChangePass createChangePass() {
        return new ChangePass();
    }

    /**
     * Create an instance of {@link GetPassCfg }
     * 
     */
    public GetPassCfg createGetPassCfg() {
        return new GetPassCfg();
    }

    /**
     * Create an instance of {@link Logout }
     * 
     */
    public Logout createLogout() {
        return new Logout();
    }

    /**
     * Create an instance of {@link GetPassCfgResponse }
     * 
     */
    public GetPassCfgResponse createGetPassCfgResponse() {
        return new GetPassCfgResponse();
    }

    /**
     * Create an instance of {@link RestorePass }
     * 
     */
    public RestorePass createRestorePass() {
        return new RestorePass();
    }

    /**
     * Create an instance of {@link CheckAccessCodeResponse }
     * 
     */
    public CheckAccessCodeResponse createCheckAccessCodeResponse() {
        return new CheckAccessCodeResponse();
    }

    /**
     * Create an instance of {@link CheckSession }
     * 
     */
    public CheckSession createCheckSession() {
        return new CheckSession();
    }

    /**
     * Create an instance of {@link ChangePassResponse }
     * 
     */
    public ChangePassResponse createChangePassResponse() {
        return new ChangePassResponse();
    }

    /**
     * Create an instance of {@link CheckAccessCode }
     * 
     */
    public CheckAccessCode createCheckAccessCode() {
        return new CheckAccessCode();
    }

    /**
     * Create an instance of {@link CheckSessionResponse }
     * 
     */
    public CheckSessionResponse createCheckSessionResponse() {
        return new CheckSessionResponse();
    }

    /**
     * Create an instance of {@link UserPassCfg }
     * 
     */
    public UserPassCfg createUserPassCfg() {
        return new UserPassCfg();
    }

    /**
     * Create an instance of {@link Session }
     * 
     */
    public Session createSession() {
        return new Session();
    }

    /**
     * Create an instance of {@link UserOtpSms }
     * 
     */
    public UserOtpSms createUserOtpSms() {
        return new UserOtpSms();
    }

    /**
     * Create an instance of {@link SessionRp }
     * 
     */
    public SessionRp createSessionRp() {
        return new SessionRp();
    }

    /**
     * Create an instance of {@link PinCfg }
     * 
     */
    public PinCfg createPinCfg() {
        return new PinCfg();
    }

    /**
     * Create an instance of {@link UserOtp }
     * 
     */
    public UserOtp createUserOtp() {
        return new UserOtp();
    }

    /**
     * Create an instance of {@link CreateUserRp }
     * 
     */
    public CreateUserRp createCreateUserRp() {
        return new CreateUserRp();
    }

    /**
     * Create an instance of {@link CheckUserVar }
     * 
     */
    public CheckUserVar createCheckUserVar() {
        return new CheckUserVar();
    }

    /**
     * Create an instance of {@link OtpReq }
     * 
     */
    public OtpReq createOtpReq() {
        return new OtpReq();
    }

    /**
     * Create an instance of {@link SessionState }
     * 
     */
    public SessionState createSessionState() {
        return new SessionState();
    }

    /**
     * Create an instance of {@link UserPassCfgRp }
     * 
     */
    public UserPassCfgRp createUserPassCfgRp() {
        return new UserPassCfgRp();
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangePassResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cb.ukrpay.net/common/ws/user", name = "changePassResponse")
    public JAXBElement<ChangePassResponse> createChangePassResponse(ChangePassResponse value) {
        return new JAXBElement<ChangePassResponse>(_ChangePassResponse_QNAME, ChangePassResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RestorePass }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cb.ukrpay.net/common/ws/user", name = "restorePass")
    public JAXBElement<RestorePass> createRestorePass(RestorePass value) {
        return new JAXBElement<RestorePass>(_RestorePass_QNAME, RestorePass.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Logout }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cb.ukrpay.net/common/ws/user", name = "logout")
    public JAXBElement<Logout> createLogout(Logout value) {
        return new JAXBElement<Logout>(_Logout_QNAME, Logout.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangePass }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cb.ukrpay.net/common/ws/user", name = "changePass")
    public JAXBElement<ChangePass> createChangePass(ChangePass value) {
        return new JAXBElement<ChangePass>(_ChangePass_QNAME, ChangePass.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateUserPrepare }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cb.ukrpay.net/common/ws/user", name = "createUserPrepare")
    public JAXBElement<CreateUserPrepare> createCreateUserPrepare(CreateUserPrepare value) {
        return new JAXBElement<CreateUserPrepare>(_CreateUserPrepare_QNAME, CreateUserPrepare.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateUserPrepareResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cb.ukrpay.net/common/ws/user", name = "createUserPrepareResponse")
    public JAXBElement<CreateUserPrepareResponse> createCreateUserPrepareResponse(CreateUserPrepareResponse value) {
        return new JAXBElement<CreateUserPrepareResponse>(_CreateUserPrepareResponse_QNAME, CreateUserPrepareResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckAccessCode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cb.ukrpay.net/common/ws/user", name = "checkAccessCode")
    public JAXBElement<CheckAccessCode> createCheckAccessCode(CheckAccessCode value) {
        return new JAXBElement<CheckAccessCode>(_CheckAccessCode_QNAME, CheckAccessCode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckSessionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cb.ukrpay.net/common/ws/user", name = "checkSessionResponse")
    public JAXBElement<CheckSessionResponse> createCheckSessionResponse(CheckSessionResponse value) {
        return new JAXBElement<CheckSessionResponse>(_CheckSessionResponse_QNAME, CheckSessionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckAccessCodeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cb.ukrpay.net/common/ws/user", name = "checkAccessCodeResponse")
    public JAXBElement<CheckAccessCodeResponse> createCheckAccessCodeResponse(CheckAccessCodeResponse value) {
        return new JAXBElement<CheckAccessCodeResponse>(_CheckAccessCodeResponse_QNAME, CheckAccessCodeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthenticateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cb.ukrpay.net/common/ws/user", name = "authenticateResponse")
    public JAXBElement<AuthenticateResponse> createAuthenticateResponse(AuthenticateResponse value) {
        return new JAXBElement<AuthenticateResponse>(_AuthenticateResponse_QNAME, AuthenticateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckSession }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cb.ukrpay.net/common/ws/user", name = "checkSession")
    public JAXBElement<CheckSession> createCheckSession(CheckSession value) {
        return new JAXBElement<CheckSession>(_CheckSession_QNAME, CheckSession.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPassCfg }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cb.ukrpay.net/common/ws/user", name = "getPassCfg")
    public JAXBElement<GetPassCfg> createGetPassCfg(GetPassCfg value) {
        return new JAXBElement<GetPassCfg>(_GetPassCfg_QNAME, GetPassCfg.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RestorePassResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cb.ukrpay.net/common/ws/user", name = "restorePassResponse")
    public JAXBElement<RestorePassResponse> createRestorePassResponse(RestorePassResponse value) {
        return new JAXBElement<RestorePassResponse>(_RestorePassResponse_QNAME, RestorePassResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateUserOtpResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cb.ukrpay.net/common/ws/user", name = "createUserOtpResponse")
    public JAXBElement<CreateUserOtpResponse> createCreateUserOtpResponse(CreateUserOtpResponse value) {
        return new JAXBElement<CreateUserOtpResponse>(_CreateUserOtpResponse_QNAME, CreateUserOtpResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Authenticate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cb.ukrpay.net/common/ws/user", name = "authenticate")
    public JAXBElement<Authenticate> createAuthenticate(Authenticate value) {
        return new JAXBElement<Authenticate>(_Authenticate_QNAME, Authenticate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LogoutResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cb.ukrpay.net/common/ws/user", name = "logoutResponse")
    public JAXBElement<LogoutResponse> createLogoutResponse(LogoutResponse value) {
        return new JAXBElement<LogoutResponse>(_LogoutResponse_QNAME, LogoutResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPassCfgResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cb.ukrpay.net/common/ws/user", name = "getPassCfgResponse")
    public JAXBElement<GetPassCfgResponse> createGetPassCfgResponse(GetPassCfgResponse value) {
        return new JAXBElement<GetPassCfgResponse>(_GetPassCfgResponse_QNAME, GetPassCfgResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateUserOtp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cb.ukrpay.net/common/ws/user", name = "createUserOtp")
    public JAXBElement<CreateUserOtp> createCreateUserOtp(CreateUserOtp value) {
        return new JAXBElement<CreateUserOtp>(_CreateUserOtp_QNAME, CreateUserOtp.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckAuthOtp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cb.ukrpay.net/common/ws/user", name = "checkAuthOtp")
    public JAXBElement<CheckAuthOtp> createCheckAuthOtp(CheckAuthOtp value) {
        return new JAXBElement<CheckAuthOtp>(_CheckAuthOtp_QNAME, CheckAuthOtp.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckAuthOtpResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cb.ukrpay.net/common/ws/user", name = "checkAuthOtpResponse")
    public JAXBElement<CheckAuthOtpResponse> createCheckAuthOtpResponse(CheckAuthOtpResponse value) {
        return new JAXBElement<CheckAuthOtpResponse>(_CheckAuthOtpResponse_QNAME, CheckAuthOtpResponse.class, null, value);
    }

}
