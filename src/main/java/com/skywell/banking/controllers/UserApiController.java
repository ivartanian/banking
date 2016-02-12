package com.skywell.banking.controllers;

import com.skywell.banking.api.core.Core;
import com.skywell.banking.api.ws.ReqBase;
import com.skywell.banking.api.ws.UserWebService;
import com.skywell.banking.api.ws.UserWebService_Service;
import com.skywell.banking.api.ws.user.SessionRp;
import com.skywell.banking.views.Result;
import com.skywell.banking.views.errors.Error;
import com.skywell.banking.views.user.UserLoginAuth;
import org.apache.log4j.Logger;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import javax.xml.bind.DatatypeConverter;
import java.util.*;

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
    public Response authenticate(UserLoginAuth userLoginAuth) {

        List<Error> errorMessages = validate(userLoginAuth);

        if (!errorMessages.isEmpty()){
            LOG.info("Validated failure");
            Result result = prepareResult(Response.Status.BAD_REQUEST.getStatusCode(), Response.Status.BAD_REQUEST.getReasonPhrase(), errorMessages);
            return Response.status(Response.Status.BAD_REQUEST).entity(result).build();
        }
        LOG.info("Validated successful");

        UserWebService userWebService = getUserWebService();

        LOG.info("Prepare request");
        ReqBase reqBase = prepareReqBase(userLoginAuth);

        LOG.info("Generate crypto login/password...");
        byte[] bytes = Core.cryptoPasswordCreateObj(userLoginAuth.getLogin(), userLoginAuth.getPassword());
        String base64Binary = DatatypeConverter.printBase64Binary(bytes);
        LOG.info("Generated crypto login/password");

        LOG.info("Authenticate...");
        SessionRp sessionRp = userWebService.authenticate(reqBase, userLoginAuth.getLogin(), base64Binary);

        LOG.info("Check result authenticate");
        //TODO: Handle result

//        return Response.ok(prepareResult(sessionRp.getErrCode(), sessionRp.getErrMsg(), sessionRp)).build();
        return Response.ok(sessionRp).build();

    }

    @POST
    @Path(value = "/authenticate/smscheck")
    public Response checkAuthOtp(UserLoginAuth userLoginAuth) {

        List<Error> errorMessages = validate(userLoginAuth);

        if (!errorMessages.isEmpty()){
            LOG.info("Validated failure");
            Result result = prepareResult(Response.Status.BAD_REQUEST.getStatusCode(), Response.Status.BAD_REQUEST.getReasonPhrase(), errorMessages);
            return Response.status(Response.Status.BAD_REQUEST).entity(result).build();
        }
        LOG.info("Validated successful");

        UserWebService userWebService = getUserWebService();

        LOG.info("Prepare request");
        ReqBase reqBase = prepareReqBase(userLoginAuth);

        LOG.info("Authenticate...");
        reqBase.setSid(userLoginAuth.getSid());
        SessionRp sessionRp = userWebService.checkAuthOtp(reqBase, userLoginAuth.getReqId(), userLoginAuth.getSmsPass());

        LOG.info("Check result authenticate");
        //TODO: Handle result

//        return Response.ok(prepareResult(sessionRp.getErrCode(), sessionRp.getErrMsg(), sessionRp)).build();
        return Response.ok(sessionRp).build();

    }

//    @POST
//    @Path(value = "/authenticate/changepass")
//    public Response changePass(UserChangePassword userChangePassword) {
//
//        List<Error> errorMessages = validate(userChangePassword);
//
//        if (!errorMessages.isEmpty()){
//            LOG.info("Validated failure");
//            Result result = prepareResult(Response.Status.BAD_REQUEST.getStatusCode(), Response.Status.BAD_REQUEST.getReasonPhrase(), errorMessages);
//            return Response.status(Response.Status.BAD_REQUEST).entity(result).build();
//        }
//        LOG.info("Validated successful");
//
//        UserWebService userWebService = getUserWebService();
//
//        LOG.info("Prepare request");
//        ReqBase reqBase = prepareReqBase(userChangePassword);
//
//        LOG.info("Generate crypto password and new password");
//        byte[] passwordBytes = Core.cryptoPasswordCreateObj(userChangePassword.getLogin(), userChangePassword.getPassword());
//        String passwordBase64Binary = DatatypeConverter.printBase64Binary(passwordBytes);
//        byte[] newPasswordBytes = Core.cryptoPasswordCreateObj(userChangePassword.getLogin(), userChangePassword.getNewPassword());
//        String newPasswordBase64Binary = DatatypeConverter.printBase64Binary(newPasswordBytes);
//        LOG.info("Generated crypto password and new password");
//
//        LOG.info("Authenticate...");
//        reqBase.setSid(userChangePassword.getSid());
//        SessionRp sessionRp = userWebService.changePass(reqBase, userChangePassword.getLogin(), passwordBase64Binary, newPasswordBase64Binary);
//
//        LOG.info("Check result authenticate");
//        //TODO: Handle result
//
//        return Response.ok(prepareResult(sessionRp.getErrCode(), sessionRp.getErrMsg(), sessionRp)).build();
//
//    }

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
