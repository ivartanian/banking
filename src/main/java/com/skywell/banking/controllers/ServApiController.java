package com.skywell.banking.controllers;

import com.skywell.banking.api.ws.ReqBase;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

/**
 * Created by uartan on 09.02.2016.
 */
@Path(value = "/api/servapi")
public class ServApiController {

    @GET
    @Produces("text/plain")
    public String sayHello() {
        return "Hello World!";
    }

    @POST
    @Consumes("application/json")
    @Produces("application/json")
    public Response getSession(ReqBase reqBase) {
//        ReqBase reqBase = new ReqBase();
        reqBase.setFs("md");
        reqBase.setLang("ru");
        return Response.ok(reqBase).build();
    }

    @PUT
    @Consumes("application/json")
    @Produces("application/json")
    public Response setSession(ReqBase reqBase) {
//        ReqBase reqBase = new ReqBase();
        reqBase.setFs("md");
        reqBase.setLang("ru");
        reqBase.setSid("sid");
        return Response.ok(reqBase).build();
    }
}
