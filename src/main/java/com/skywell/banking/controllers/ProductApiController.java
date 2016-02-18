package com.skywell.banking.controllers;

import com.skywell.banking.annotations.validations.NotEmptyNull;
import com.skywell.banking.api.ws.ProductWebService;
import com.skywell.banking.api.ws.ProductWebService_Service;
import com.skywell.banking.api.ws.ReqBase;
import com.skywell.banking.api.ws.product.ClientFullProductRp;
import com.skywell.banking.api.ws.product.ClientProductListRp;
import com.skywell.banking.api.ws.product.ClientTransListRp;
import com.skywell.banking.api.ws.product.OperRp;
import com.skywell.banking.views.BaseRequest;
import com.skywell.banking.views.product.BaseProduct;
import com.skywell.banking.views.product.CheckOperOtp;
import com.skywell.banking.views.product.ClientProduct;
import com.skywell.banking.views.product.LocalCardProduct;
import org.apache.log4j.Logger;

import javax.validation.Valid;
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
    public Response getClientProductList(@NotEmptyNull(field = "sid") @QueryParam("sid") String sid,
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
    public Response getClientProduct(@NotEmptyNull(field = "sid") @QueryParam("sid") String sid,
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
    public Response getClientTransactions(@NotEmptyNull(field = "sid") @QueryParam("sid") String sid,
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
    @Path(value = "/products/{productId}/operations/sendclientproduct")
    public Response createOperSendClientProduct(@Valid ClientProduct productReq, @PathParam("productId") long productId) {

        ProductWebService productWebService = getProductWebService();

        LOG.info("Prepare request");
        ReqBase reqBase = prepareApiReqBase(productReq.getBaseRequest());

        LOG.info("Sending request...");
        OperRp operSendClientProduct = productWebService.createOperSendClientProduct(reqBase, productId,
                productReq.getOperAmount(), productReq.getOperCurrencyId(), productReq.getNote(), productReq.getVarList(), productReq.getResvClientProductId());

        LOG.info("Check result");
        //TODO: Handle result

        return Response.ok(operSendClientProduct).build();

    }

    @POST
    @Path(value = "/products/{productId}/operations/sendlocalcard")
    public Response createOperSendLocalCard(@Valid LocalCardProduct productReq, @PathParam("productId") long productId) {

        ProductWebService productWebService = getProductWebService();

        LOG.info("Prepare request");
        ReqBase reqBase = prepareApiReqBase(productReq.getBaseRequest());

        LOG.info("Sending request...");
        OperRp operSendClientProduct = productWebService.createOperSendLocalCard(reqBase, productId,
                productReq.getOperAmount(), productReq.getOperCurrencyId(), productReq.getNote(), productReq.getVarList(), productReq.getResvLocalCard());

        LOG.info("Check result");
        //TODO: Handle result

        return Response.ok(operSendClientProduct).build();

    }

    @POST
    @Path(value = "/products/{productId}/operations/createoperpayserv")
    public Response createOperPayServ(@Valid BaseProduct productReq,
                                      @PathParam("productId") long productId) {

        ProductWebService productWebService = getProductWebService();

        LOG.info("Prepare request");
        ReqBase reqBase = prepareApiReqBase(productReq.getBaseRequest());

        LOG.info("Sending request...");
        OperRp operPayServ = productWebService.createOperPayServ(reqBase, productId,
                productReq.getOperAmount(), productReq.getOperCurrencyId(), productReq.getNote(), productReq.getVarList());

        LOG.info("Check result");
        //TODO: Handle result

        return Response.ok(operPayServ).build();

    }

    @POST
    @Path(value = "/products/operations/checkOperOtp")
    public Response checkOperOtp(@Valid CheckOperOtp checkOperProduct) {

        ProductWebService productWebService = getProductWebService();

        LOG.info("Prepare request");
        ReqBase reqBase = prepareApiReqBase(checkOperProduct.getBaseRequest());

        LOG.info("Sending request...");
        OperRp operSendClientProduct = productWebService.checkOperOtp(reqBase, checkOperProduct.getOtpReqId(), checkOperProduct.getOtpPass());

        LOG.info("Check result");
        //TODO: Handle result

        return Response.ok(operSendClientProduct).build();

    }

    private ProductWebService getProductWebService() {
        LOG.info("Prepare product web-service");

        ProductWebService_Service productWebService_service = new ProductWebService_Service();
        ProductWebService productWebServiceSOAPHttpPort = productWebService_service.getProductWebServiceSOAPHttpPort();

        LOG.info("Product web-service ready");
        return productWebServiceSOAPHttpPort;
    }

}
