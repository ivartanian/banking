package com.skywell.banking.controllers;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.skywell.banking.annotations.validations.UserSid;
import com.skywell.banking.api.core.Core;
import com.skywell.banking.api.ws.ReqBase;
import com.skywell.banking.api.ws.UserWebService;
import com.skywell.banking.api.ws.UserWebService_Service;
import com.skywell.banking.api.ws.user.Session;
import com.skywell.banking.api.ws.user.SessionRp;
import com.skywell.banking.views.user.UserLoginAuth;
import com.skywell.banking.views.user.UserPinCheckAuth;
import com.skywell.banking.views.user.UserSmsCheckAuth;
import com.sun.org.apache.xerces.internal.jaxp.datatype.XMLGregorianCalendarImpl;
import org.apache.log4j.Logger;

import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.xml.bind.DatatypeConverter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by uartan on 09.02.2016.
 */
@Path(value = "/userapi")
@Consumes("application/json")
@Produces("application/json")
public class UserApiController extends BaseController{

    private static final Logger LOG = Logger.getLogger(UserApiController.class);

    @POST
    @Path(value = "/authenticate")
    public Response authenticate(@Valid UserLoginAuth userLoginAuth) {

        UserWebService userWebService = getUserWebService();

        ReqBase reqBase = prepareApiReqBase(userLoginAuth);

        LOG.info("Generate crypto login/password...");
        byte[] bytes = Core.cryptoPasswordCreateObj(userLoginAuth.getLogin(), userLoginAuth.getPassword());
        String base64Binary = DatatypeConverter.printBase64Binary(bytes);
        LOG.info("Generated crypto login/password");

        LOG.info("Authenticate...");
        SessionRp sessionRp = userWebService.authenticate(reqBase, userLoginAuth.getLogin(), base64Binary);

        LOG.info("Check result authenticate");
        //TODO: Handle result

        return Response.ok(sessionRp).build();

    }

    @POST
    @Path(value = "/authenticate/smscheck")
    public Response checkAuthOtp(@Valid @UserSid UserSmsCheckAuth userSmsCheckAuth) {

        UserWebService userWebService = getUserWebService();

        ReqBase reqBase = prepareApiReqBase(userSmsCheckAuth);

        LOG.info("Authenticate...");
        reqBase.setSid(userSmsCheckAuth.getSid());
        SessionRp sessionRp = userWebService.checkAuthOtp(reqBase, userSmsCheckAuth.getReqId(), userSmsCheckAuth.getSmsPass());

        LOG.info("Check result authenticate");
        //TODO: Handle result

        return Response.ok(sessionRp).build();

    }

    @POST
    @Path(value = "/authenticate/pincheck")
    public Response checkAuthOtpPinCheck(UserPinCheckAuth userPinCheckAuth) {

        UserWebService userWebService = getUserWebService();

        ReqBase reqBase = prepareApiReqBase(userPinCheckAuth);

        LOG.info("Generate crypto login/pin...");
        byte[] bytes = Core.cryptoPasswordCreateObj(userPinCheckAuth.getLogin(), userPinCheckAuth.getPin());
        String base64Binary = DatatypeConverter.printBase64Binary(bytes);
        LOG.info("Generated crypto login/pin");

        LOG.info("Authenticate...");
        SessionRp sessionRp = userWebService.authenticate(reqBase, userPinCheckAuth.getLogin(), "pin:" + base64Binary);

        LOG.info("Check result authenticate");
        //TODO: Handle result

        return Response.ok(sessionRp).build();

    }

    private UserWebService getUserWebService() {
        LOG.info("Prepare user web-service");

        UserWebService_Service servWebService_service = new UserWebService_Service();
        UserWebService userWebServiceSOAPHttpPort = servWebService_service.getUserWebServiceSOAPHttpPort();

//        javax.xml.ws.BindingProvider bp = (javax.xml.ws.BindingProvider) userWebServiceSOAPHttpPort;
//        Map<String, Object> rc = bp.getRequestContext();
//        rc.put(javax.xml.ws.BindingProvider.ENDPOINT_ADDRESS_PROPERTY, UserWebService.USER_ENDPOINT_ADDRESS);
//        rc.put("com.sun.xml.internal.ws.connect.timeout", 40000);
//        rc.put("com.sun.xml.internal.ws.request.timeout", 40000);

        LOG.info("User web-service ready");
        return userWebServiceSOAPHttpPort;
    }

}
