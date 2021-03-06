
package com.skywell.banking.api.ws;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import com.skywell.banking.api.ws.user.CheckUserVar;
import com.skywell.banking.api.ws.user.CreateUserRp;
import com.skywell.banking.api.ws.user.SessionRp;
import com.skywell.banking.api.ws.user.UserPassCfgRp;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "UserWebService", targetNamespace = "http://cb.ukrpay.net/common/ws")
@XmlSeeAlso({
        com.skywell.banking.api.ws.ObjectFactory.class,
        com.skywell.banking.api.ws.user.ObjectFactory.class
})
public interface UserWebService {

    String USER_ENDPOINT_ADDRESS = "http://10.1.15.19:7001/backend/common/userapi/";

    /**
     * 
     * @param reqBase
     * @param hashPassword
     * @param login
     * @return
     *     returns com.skywell.banking.api.ws.user.SessionRp
     */
    @WebMethod
    @WebResult(targetNamespace = "http://cb.ukrpay.net/common/ws/user")
    @RequestWrapper(localName = "authenticate", targetNamespace = "http://cb.ukrpay.net/common/ws/user", className = "com.skywell.banking.api.ws.user.Authenticate")
    @ResponseWrapper(localName = "authenticateResponse", targetNamespace = "http://cb.ukrpay.net/common/ws/user", className = "com.skywell.banking.api.ws.user.AuthenticateResponse")
    public SessionRp authenticate(
        @WebParam(name = "reqBase", targetNamespace = "http://cb.ukrpay.net/common/ws/user")
        ReqBase reqBase,
        @WebParam(name = "login", targetNamespace = "http://cb.ukrpay.net/common/ws/user")
        String login,
        @WebParam(name = "hashPassword", targetNamespace = "http://cb.ukrpay.net/common/ws/user")
        String hashPassword);

    /**
     * 
     * @param reqBase
     * @return
     *     returns com.skywell.banking.api.ws.user.SessionRp
     */
    @WebMethod
    @WebResult(targetNamespace = "http://cb.ukrpay.net/common/ws/user")
    @RequestWrapper(localName = "checkSession", targetNamespace = "http://cb.ukrpay.net/common/ws/user", className = "com.skywell.banking.api.ws.user.CheckSession")
    @ResponseWrapper(localName = "checkSessionResponse", targetNamespace = "http://cb.ukrpay.net/common/ws/user", className = "com.skywell.banking.api.ws.user.CheckSessionResponse")
    public SessionRp checkSession(
        @WebParam(name = "reqBase", targetNamespace = "http://cb.ukrpay.net/common/ws/user")
        ReqBase reqBase);

    /**
     * 
     * @param reqBase
     * @return
     *     returns com.skywell.banking.api.ws.ResultRp
     */
    @WebMethod
    @WebResult(targetNamespace = "http://cb.ukrpay.net/common/ws/user")
    @RequestWrapper(localName = "logout", targetNamespace = "http://cb.ukrpay.net/common/ws/user", className = "com.skywell.banking.api.ws.user.Logout")
    @ResponseWrapper(localName = "logoutResponse", targetNamespace = "http://cb.ukrpay.net/common/ws/user", className = "com.skywell.banking.api.ws.user.LogoutResponse")
    public ResultRp logout(
        @WebParam(name = "reqBase", targetNamespace = "http://cb.ukrpay.net/common/ws/user")
        ReqBase reqBase);

    /**
     * 
     * @param reqBase
     * @param otpReqId
     * @param otpPass
     * @return
     *     returns com.skywell.banking.api.ws.user.SessionRp
     */
    @WebMethod
    @WebResult(targetNamespace = "http://cb.ukrpay.net/common/ws/user")
    @RequestWrapper(localName = "checkAuthOtp", targetNamespace = "http://cb.ukrpay.net/common/ws/user", className = "com.skywell.banking.api.ws.user.CheckAuthOtp")
    @ResponseWrapper(localName = "checkAuthOtpResponse", targetNamespace = "http://cb.ukrpay.net/common/ws/user", className = "com.skywell.banking.api.ws.user.CheckAuthOtpResponse")
    public SessionRp checkAuthOtp(
        @WebParam(name = "reqBase", targetNamespace = "http://cb.ukrpay.net/common/ws/user")
        ReqBase reqBase,
        @WebParam(name = "otpReqId", targetNamespace = "http://cb.ukrpay.net/common/ws/user")
        String otpReqId,
        @WebParam(name = "otpPass", targetNamespace = "http://cb.ukrpay.net/common/ws/user")
        String otpPass);

    /**
     * 
     * @param code
     * @param reqBase
     * @param login
     * @return
     *     returns com.skywell.banking.api.ws.user.SessionRp
     */
    @WebMethod
    @WebResult(targetNamespace = "http://cb.ukrpay.net/common/ws/user")
    @RequestWrapper(localName = "checkAccessCode", targetNamespace = "http://cb.ukrpay.net/common/ws/user", className = "com.skywell.banking.api.ws.user.CheckAccessCode")
    @ResponseWrapper(localName = "checkAccessCodeResponse", targetNamespace = "http://cb.ukrpay.net/common/ws/user", className = "com.skywell.banking.api.ws.user.CheckAccessCodeResponse")
    public SessionRp checkAccessCode(
        @WebParam(name = "reqBase", targetNamespace = "http://cb.ukrpay.net/common/ws/user")
        ReqBase reqBase,
        @WebParam(name = "login", targetNamespace = "http://cb.ukrpay.net/common/ws/user")
        String login,
        @WebParam(name = "code", targetNamespace = "http://cb.ukrpay.net/common/ws/user")
        String code);

    /**
     * 
     * @param hashNewPassword
     * @param reqBase
     * @param hashCurrentPassword
     * @param login
     * @return
     *     returns com.skywell.banking.api.ws.user.SessionRp
     */
    @WebMethod
    @WebResult(targetNamespace = "http://cb.ukrpay.net/common/ws/user")
    @RequestWrapper(localName = "changePass", targetNamespace = "http://cb.ukrpay.net/common/ws/user", className = "com.skywell.banking.api.ws.user.ChangePass")
    @ResponseWrapper(localName = "changePassResponse", targetNamespace = "http://cb.ukrpay.net/common/ws/user", className = "com.skywell.banking.api.ws.user.ChangePassResponse")
    public SessionRp changePass(
        @WebParam(name = "reqBase", targetNamespace = "http://cb.ukrpay.net/common/ws/user")
        ReqBase reqBase,
        @WebParam(name = "login", targetNamespace = "http://cb.ukrpay.net/common/ws/user")
        String login,
        @WebParam(name = "hashCurrentPassword", targetNamespace = "http://cb.ukrpay.net/common/ws/user")
        String hashCurrentPassword,
        @WebParam(name = "hashNewPassword", targetNamespace = "http://cb.ukrpay.net/common/ws/user")
        String hashNewPassword);

    /**
     * 
     * @param hashNewPassword
     * @param reqBase
     * @param login
     * @return
     *     returns com.skywell.banking.api.ws.user.SessionRp
     */
    @WebMethod
    @WebResult(targetNamespace = "http://cb.ukrpay.net/common/ws/user")
    @RequestWrapper(localName = "restorePass", targetNamespace = "http://cb.ukrpay.net/common/ws/user", className = "com.skywell.banking.api.ws.user.RestorePass")
    @ResponseWrapper(localName = "restorePassResponse", targetNamespace = "http://cb.ukrpay.net/common/ws/user", className = "com.skywell.banking.api.ws.user.RestorePassResponse")
    public SessionRp restorePass(
        @WebParam(name = "reqBase", targetNamespace = "http://cb.ukrpay.net/common/ws/user")
        ReqBase reqBase,
        @WebParam(name = "login", targetNamespace = "http://cb.ukrpay.net/common/ws/user")
        String login,
        @WebParam(name = "hashNewPassword", targetNamespace = "http://cb.ukrpay.net/common/ws/user")
        String hashNewPassword);

    /**
     * 
     * @param reqBase
     * @return
     *     returns com.skywell.banking.api.ws.user.UserPassCfgRp
     */
    @WebMethod
    @WebResult(targetNamespace = "http://cb.ukrpay.net/common/ws/user")
    @RequestWrapper(localName = "getPassCfg", targetNamespace = "http://cb.ukrpay.net/common/ws/user", className = "com.skywell.banking.api.ws.user.GetPassCfg")
    @ResponseWrapper(localName = "getPassCfgResponse", targetNamespace = "http://cb.ukrpay.net/common/ws/user", className = "com.skywell.banking.api.ws.user.GetPassCfgResponse")
    public UserPassCfgRp getPassCfg(
        @WebParam(name = "reqBase", targetNamespace = "http://cb.ukrpay.net/common/ws/user")
        ReqBase reqBase);

    /**
     * 
     * @param listCheckUserVar
     * @param reqBase
     * @param hashPassword
     * @param login
     * @return
     *     returns com.skywell.banking.api.ws.user.CreateUserRp
     */
    @WebMethod
    @WebResult(targetNamespace = "http://cb.ukrpay.net/common/ws/user")
    @RequestWrapper(localName = "createUserPrepare", targetNamespace = "http://cb.ukrpay.net/common/ws/user", className = "com.skywell.banking.api.ws.user.CreateUserPrepare")
    @ResponseWrapper(localName = "createUserPrepareResponse", targetNamespace = "http://cb.ukrpay.net/common/ws/user", className = "com.skywell.banking.api.ws.user.CreateUserPrepareResponse")
    public CreateUserRp createUserPrepare(
        @WebParam(name = "reqBase", targetNamespace = "http://cb.ukrpay.net/common/ws/user")
        ReqBase reqBase,
        @WebParam(name = "listCheckUserVar", targetNamespace = "http://cb.ukrpay.net/common/ws/user")
        List<CheckUserVar> listCheckUserVar,
        @WebParam(name = "login", targetNamespace = "http://cb.ukrpay.net/common/ws/user")
        String login,
        @WebParam(name = "hashPassword", targetNamespace = "http://cb.ukrpay.net/common/ws/user")
        String hashPassword);

    /**
     * 
     * @param reqBase
     * @param otpReqId
     * @param otpPass
     * @return
     *     returns com.skywell.banking.api.ws.user.CreateUserRp
     */
    @WebMethod
    @WebResult(targetNamespace = "http://cb.ukrpay.net/common/ws/user")
    @RequestWrapper(localName = "createUserOtp", targetNamespace = "http://cb.ukrpay.net/common/ws/user", className = "com.skywell.banking.api.ws.user.CreateUserOtp")
    @ResponseWrapper(localName = "createUserOtpResponse", targetNamespace = "http://cb.ukrpay.net/common/ws/user", className = "com.skywell.banking.api.ws.user.CreateUserOtpResponse")
    public CreateUserRp createUserOtp(
        @WebParam(name = "reqBase", targetNamespace = "http://cb.ukrpay.net/common/ws/user")
        ReqBase reqBase,
        @WebParam(name = "otpReqId", targetNamespace = "http://cb.ukrpay.net/common/ws/user")
        String otpReqId,
        @WebParam(name = "otpPass", targetNamespace = "http://cb.ukrpay.net/common/ws/user")
        String otpPass);

}
