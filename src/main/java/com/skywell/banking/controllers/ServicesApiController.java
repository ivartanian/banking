package com.skywell.banking.controllers;

import com.skywell.banking.annotations.validations.NotEmptyNull;
import com.skywell.banking.api.ws.*;
import com.skywell.banking.api.ws.serv.CategoryListRp;
import com.skywell.banking.api.ws.serv.ServInfoRp;
import com.skywell.banking.api.ws.serv.ServOperRp;
import com.skywell.banking.views.BaseRequest;
import com.skywell.banking.views.product.CheckOperOtp;
import com.skywell.banking.views.services.ServiceProduct;
import org.apache.log4j.Logger;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;

/**
 * Created by uartan on 09.02.2016.
 */
@Path(value = "/servapi")
@Consumes("application/json")
@Produces("application/json")
public class ServicesApiController extends BaseController {

    private static final Logger LOG = Logger.getLogger(ServicesApiController.class);

    @GET
    @Path(value = "/categories")
    public Response getCategoryListByParentId(@NotEmptyNull(field = "sid") @QueryParam("sid") String sid,
                                              @QueryParam("language") String language,
                                              @QueryParam("sessionFrom") String sessionFrom,
                                              @NotEmptyNull(field = "parentId") @QueryParam("parentId") Integer parentId) {

        BaseRequest baseRequest = new BaseRequest(fs, sid, language, sessionFrom);

        ServWebService servicesWebService = getServicesWebService();

        ReqBase reqBase = prepareApiReqBase(baseRequest);

        LOG.info("Sending request...");
        CategoryListRp categoryList = servicesWebService.getCategoryList(reqBase, parentId);

        LOG.info("Check result");
        //TODO: Handle result

        return Response.ok(categoryList).build();

    }

    @GET
    @Path(value = "/categories/{categoryId}")
    public Response getCategoryListById(@NotEmptyNull(field = "sid") @QueryParam("sid") String sid,
                                        @QueryParam("language") String language,
                                        @QueryParam("sessionFrom") String sessionFrom,
                                        @PathParam("categoryId") int categoryId) {

        BaseRequest baseRequest = new BaseRequest(fs, sid, language, sessionFrom);

        ServWebService servicesWebService = getServicesWebService();

        ReqBase reqBase = prepareApiReqBase(baseRequest);

        LOG.info("Sending request...");
        CategoryListRp servList = servicesWebService.getServList(reqBase, categoryId);

        LOG.info("Check result");
        //TODO: Handle result

        return Response.ok(servList).build();

    }

    @GET
    @Path(value = "/services/{serviceId}")
    public Response getServInfo(@NotEmptyNull(field = "sid") @QueryParam("sid") String sid,
                                        @QueryParam("language") String language,
                                        @QueryParam("sessionFrom") String sessionFrom,
                                        @PathParam("serviceId") String serviceId) {

        BaseRequest baseRequest = new BaseRequest(fs, sid, language, sessionFrom);

        ServWebService servicesWebService = getServicesWebService();

        ReqBase reqBase = prepareApiReqBase(baseRequest);

        LOG.info("Sending request...");
        ServInfoRp servInfo = servicesWebService.getServInfo(reqBase, serviceId);

        LOG.info("Check result");
        //TODO: Handle result

        return Response.ok(servInfo).build();

    }

    @POST
    @Path(value = "/services/{serviceId}") //TODO: may be another path
    public Response checkBalance(@Valid ServiceProduct serviceProduct,
                                @PathParam("serviceId") String serviceId) {

        ServWebService servicesWebService = getServicesWebService();

        ReqBase reqBase = prepareApiReqBase(serviceProduct.getBaseRequest());

        LOG.info("Sending request...");
        ServOperRp servOperRp = servicesWebService.checkBalance(reqBase, serviceId, serviceProduct.getAttrList());

        LOG.info("Check result");
        //TODO: Handle result

        return Response.ok(servOperRp).build();

    }

    private ServWebService getServicesWebService() {
        LOG.info("Prepare services web-service");

        ServWebService_Service servWebService_service = new ServWebService_Service();
        ServWebService servWebServiceSOAPHttpPort = servWebService_service.getServWebServiceSOAPHttpPort();

        LOG.info("Services web-service ready");
        return servWebServiceSOAPHttpPort;
    }
}
