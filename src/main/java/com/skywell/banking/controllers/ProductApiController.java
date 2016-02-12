package com.skywell.banking.controllers;

import com.skywell.banking.api.core.Core;
import com.skywell.banking.api.ws.ProductWebService;
import com.skywell.banking.api.ws.ProductWebService_Service;
import com.skywell.banking.api.ws.ReqBase;
import com.skywell.banking.api.ws.product.ClientFullProductRp;
import com.skywell.banking.api.ws.product.ClientProductListRp;
import com.skywell.banking.api.ws.product.ClientTransListRp;
import com.skywell.banking.api.ws.user.SessionRp;
import com.skywell.banking.views.BaseReq;
import com.skywell.banking.views.Result;
import com.skywell.banking.views.errors.Error;
import com.skywell.banking.views.product.ProductReq;
import org.apache.log4j.Logger;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import javax.xml.bind.DatatypeConverter;
import java.util.List;

/**
 * Created by uartan on 09.02.2016.
 */
@Path(value = "/productapi")
@Consumes("application/json")
@Produces("application/json")
public class ProductApiController extends BaseController{

    private static final Logger LOG = Logger.getLogger(UserApiController.class);

    @POST
    @Path(value = "/products")
    public Response getClientProductList(BaseReq productReq) {

        List<Error> errorMessages = validate(productReq);

        if (!errorMessages.isEmpty()){
            LOG.info("Validated failure");
            Result result = prepareResult(Response.Status.BAD_REQUEST.getStatusCode(), Response.Status.BAD_REQUEST.getReasonPhrase(), errorMessages);
            return Response.status(Response.Status.BAD_REQUEST).entity(result).build();
        }
        LOG.info("Validated successful");

        ProductWebService productWebService = getProductWebService();

        LOG.info("Prepare request");
        ReqBase reqBase = prepareReqBase(productReq);

        LOG.info("Sending request...");
        ClientProductListRp clientProductList = productWebService.getClientProductList(reqBase);

        LOG.info("Check result");
        //TODO: Handle result

        return Response.ok(clientProductList).build();

    }

    @POST
    @Path(value = "/products/{productId}")
    public Response getClientProductList(BaseReq productReq, @PathParam("productId") long productId) {

        List<Error> errorMessages = validate(productReq);

        if (!errorMessages.isEmpty()){
            LOG.info("Validated failure");
            Result result = prepareResult(Response.Status.BAD_REQUEST.getStatusCode(), Response.Status.BAD_REQUEST.getReasonPhrase(), errorMessages);
            return Response.status(Response.Status.BAD_REQUEST).entity(result).build();
        }
        LOG.info("Validated successful");

        ProductWebService productWebService = getProductWebService();

        LOG.info("Prepare request");
        ReqBase reqBase = prepareReqBase(productReq);

        LOG.info("Sending request...");
        ClientFullProductRp clientFullProduct = productWebService.getClientFullProduct(reqBase, productId);

        LOG.info("Check result");
        //TODO: Handle result

        return Response.ok(clientFullProduct).build();

    }

    @POST
    @Path(value = "/products/{productId}/transactions")
    public Response getClientTransactions(BaseReq productReq, @PathParam("productId") long productId) {

        List<Error> errorMessages = validate(productReq);

        if (!errorMessages.isEmpty()){
            LOG.info("Validated failure");
            Result result = prepareResult(Response.Status.BAD_REQUEST.getStatusCode(), Response.Status.BAD_REQUEST.getReasonPhrase(), errorMessages);
            return Response.status(Response.Status.BAD_REQUEST).entity(result).build();
        }
        LOG.info("Validated successful");

        ProductWebService productWebService = getProductWebService();

        LOG.info("Prepare request");
        ReqBase reqBase = prepareReqBase(productReq);

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
