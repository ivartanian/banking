package com.skywell.banking.controllers;

import com.skywell.banking.api.ws.ProductWebService;
import com.skywell.banking.api.ws.ProductWebService_Service;
import com.skywell.banking.api.ws.ReqBase;
import com.skywell.banking.api.ws.product.ClientFullProductRp;
import com.skywell.banking.api.ws.product.ClientProductListRp;
import com.skywell.banking.api.ws.product.ClientTransListRp;
import com.skywell.banking.views.BaseRequest;
import org.apache.log4j.Logger;

import javax.validation.constraints.NotNull;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;

/**
 * Created by uartan on 09.02.2016.
 */
@Path(value = "/productapi")
@Consumes("application/json")
@Produces("application/json")
public class ProductApiController extends BaseController {

    private static final Logger LOG = Logger.getLogger(UserApiController.class);

    @GET
    @Path(value = "/products")
    public Response getClientProductList(@NotNull(message = "{NotEmpty.BaseRequest.sid}") @QueryParam("sid") String sid,
                                         @QueryParam("language") String language,
                                         @QueryParam("sessionFrom") String sessionFrom) {

        BaseRequest baseRequest = new BaseRequest(fs, sid, language, sessionFrom);

        ProductWebService productWebService = getProductWebService();

        ReqBase reqBase = prepareApiReqBase(baseRequest);

        LOG.info("Sending request...");
        ClientProductListRp clientProductList = productWebService.getClientProductList(reqBase);

        LOG.info("Check result");
        //TODO: Handle result

        return Response.ok(clientProductList).build();

    }

    @GET
    @Path(value = "/products/{productId}")
    public Response getClientProduct(@NotNull(message = "{NotEmpty.BaseRequest.sid}") @QueryParam("sid") String sid,
                                     @QueryParam("language") String language,
                                     @QueryParam("sessionFrom") String sessionFrom,
                                     @PathParam("productId") long productId) {

        BaseRequest baseRequest = new BaseRequest(fs, sid, language, sessionFrom);

        ProductWebService productWebService = getProductWebService();

        ReqBase reqBase = prepareApiReqBase(baseRequest);

        LOG.info("Sending request...");
        ClientFullProductRp clientFullProduct = productWebService.getClientFullProduct(reqBase, productId);

        LOG.info("Check result");
        //TODO: Handle result

        return Response.ok(clientFullProduct).build();

    }

    @GET
    @Path(value = "/products/{productId}/transactions")
    public Response getClientTransactions(@NotNull(message = "{NotEmpty.BaseRequest.sid}") @QueryParam("sid") String sid,
                                          @QueryParam("language") String language,
                                          @QueryParam("sessionFrom") String sessionFrom,
                                          @PathParam("productId") long productId) {

        BaseRequest baseRequest = new BaseRequest(fs, sid, language, sessionFrom);

        ProductWebService productWebService = getProductWebService();

        LOG.info("Prepare request");
        ReqBase reqBase = prepareApiReqBase(baseRequest);

        LOG.info("Sending request...");
        ClientTransListRp statementMini = productWebService.getStatementMini(reqBase, productId);

        LOG.info("Check result");
        //TODO: Handle result

        return Response.ok(statementMini).build();

    }

    @POST
    @Path(value = "/products")
    public Response getTempClientProductList(BaseRequest productReq) {

        ProductWebService productWebService = getProductWebService();

        LOG.info("Prepare request");
        ReqBase reqBase = prepareApiReqBase(productReq);

        LOG.info("Sending request...");
        ClientProductListRp clientProductList = productWebService.getClientProductList(reqBase);

        LOG.info("Check result");
        //TODO: Handle result

        return Response.ok(clientProductList).build();

    }

    @POST
    @Path(value = "/products/{productId}")
    public Response getClientProductList(BaseRequest productReq, @PathParam("productId") long productId) {

        ProductWebService productWebService = getProductWebService();

        LOG.info("Prepare request");
        ReqBase reqBase = prepareApiReqBase(productReq);

        LOG.info("Sending request...");
        ClientFullProductRp clientFullProduct = productWebService.getClientFullProduct(reqBase, productId);

        LOG.info("Check result");
        //TODO: Handle result

        return Response.ok(clientFullProduct).build();

    }

    @POST
    @Path(value = "/products/{productId}/transactions")
    public Response getClientTransactions(BaseRequest productReq, @PathParam("productId") long productId) {

        ProductWebService productWebService = getProductWebService();

        LOG.info("Prepare request");
        ReqBase reqBase = prepareApiReqBase(productReq);

        LOG.info("Sending request...");
        ClientTransListRp statementMini = productWebService.getStatementMini(reqBase, productId);

        LOG.info("Check result");
        //TODO: Handle result

        return Response.ok(statementMini).build();

    }

    private ProductWebService getProductWebService() {
        LOG.info("Prepare product web-service");

        ProductWebService_Service productWebService_service = new ProductWebService_Service();
        ProductWebService productWebServiceSOAPHttpPort = productWebService_service.getProductWebServiceSOAPHttpPort();

        LOG.info("Product web-service ready");
        return productWebServiceSOAPHttpPort;
    }

}
