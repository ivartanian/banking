package com.skywell.banking.controllers;

import com.skywell.banking.api.core.Core;
import com.skywell.banking.api.ws.ReqBase;
import com.skywell.banking.api.ws.UserWebService;
import com.skywell.banking.api.ws.UserWebService_Service;
import com.skywell.banking.api.ws.user.SessionRp;
import org.apache.log4j.Logger;

import javax.servlet.ServletContext;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.xml.bind.DatatypeConverter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

/**
 * Created by uartan on 09.02.2016.
 */
@Path(value = "/userapi")
@Consumes("application/json")
@Produces("application/json")
public class UserApiController {

    private static final Logger LOG = Logger.getLogger(UserApiController.class);

    @Context
    ServletContext context;

    @GET
    @Path(value = "/test")
    public Response getTest() {
        LOG.info("Привет");
        return Response.ok("Привет").build();
    }

    @GET
    public Response sayHello() {

        ArrayList<Object> result = new ArrayList<>();

        UserWebService_Service servWebService_service = new UserWebService_Service();
        UserWebService userWebServiceSOAPHttpPort = servWebService_service.getUserWebServiceSOAPHttpPort();

        javax.xml.ws.BindingProvider bp = (javax.xml.ws.BindingProvider) userWebServiceSOAPHttpPort;
        Map<String, Object> rc = bp.getRequestContext();
        rc.put(javax.xml.ws.BindingProvider.ENDPOINT_ADDRESS_PROPERTY, "http://10.1.15.19:7001/backend/common/userapi/");
        rc.put("com.sun.xml.internal.ws.connect.timeout", 40000);
        rc.put("com.sun.xml.internal.ws.request.timeout", 40000);

        ReqBase reqBase = new ReqBase();
        reqBase.setFs("ib");
//        SessionRp rp = userWebServiceSOAPHttpPort.authenticate(reqBase, "123456789",
//                DatatypeConverter.printBase64Binary(Core.cryptoPasswordCreateObj("123456789", "123456")));
        SessionRp rp = userWebServiceSOAPHttpPort.authenticate(reqBase, "1",
                DatatypeConverter.printBase64Binary(Core.cryptoPasswordCreateObj("1", "1")));

        result.add(rp);

        reqBase.setSid(rp.getResult().getSid());
        rp = userWebServiceSOAPHttpPort.checkAuthOtp(reqBase, rp.getResult().getState().getOtpReq().getReqId(), "1");

        result.add(rp);
        return Response.ok(result).build();
    }

    @POST
    public Response getSession() {
        ReqBase reqBase1 = new ReqBase();
        reqBase1.setFs("1");
        reqBase1.setLang("ru");
        reqBase1.setSid("post");
        ReqBase reqBase2 = new ReqBase();
        reqBase2.setFs("2");
        reqBase2.setLang("ru");
        reqBase2.setSid("post");
        return Response.ok(Arrays.asList(reqBase1, reqBase2)).build();
    }

    @PUT
    public Response setSession() {
        ReqBase reqBase = new ReqBase();
        reqBase.setFs("md");
        reqBase.setLang("en");
        reqBase.setSid("put");
        return Response.ok(reqBase).build();
    }
}
