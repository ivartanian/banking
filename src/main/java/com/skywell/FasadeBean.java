package com.skywell;

import com.skywell.core.Core;
import com.skywell.ws.*;
import com.skywell.ws.product.ClientProduct;
import com.skywell.ws.product.ClientProductListRp;
import com.skywell.ws.user.SessionRp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.bind.DatatypeConverter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;

/**
 * Created by uartan on 09.02.2016.
 */
@WebServlet(urlPatterns = "/servlet")
public class FasadeBean extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("!!!!!!!!!!!! Before: new UserWebService_Service()");
        UserWebService_Service servWebService_service = new UserWebService_Service();
        System.out.println("!!!!!!!!!!!! After: new UserWebService_Service()");
        UserWebService userWebServiceSOAPHttpPort = servWebService_service.getUserWebServiceSOAPHttpPort();
        System.out.println("!!!!!!!!!!!! After: servWebService_service.getUserWebServiceSOAPHttpPort()");

        javax.xml.ws.BindingProvider bp = (javax.xml.ws.BindingProvider) userWebServiceSOAPHttpPort;
        Map<String, Object> rc = bp.getRequestContext();
         rc.put(javax.xml.ws.BindingProvider.ENDPOINT_ADDRESS_PROPERTY, "http://10.1.15.19:7001/backend/common/userapi/");
        rc.put("com.sun.xml.internal.ws.connect.timeout", 40000);
        rc.put("com.sun.xml.internal.ws.request.timeout", 40000);

        ReqBase reqBase = new ReqBase();
        reqBase.setFs("ib");
        System.out.println("!!!!!!!!!!!! Before: userWebServiceSOAPHttpPort.authenticate");
//        SessionRp rp = userWebServiceSOAPHttpPort.authenticate(reqBase, "123456789",
//                DatatypeConverter.printBase64Binary(Core.cryptoPasswordCreateObj("123456789", "123456")));
        SessionRp rp = userWebServiceSOAPHttpPort.authenticate(reqBase, "1",
                DatatypeConverter.printBase64Binary(Core.cryptoPasswordCreateObj("1", "1")));

        System.out.println("!!!!!!!!!!!! After: userWebServiceSOAPHttpPort.authenticate");

        System.out.println("!!!!!!!!!!!! SessionRp rp: " + rp);

        try (PrintWriter writer = resp.getWriter()) {

            writer.write("errCode: " + rp.getErrCode() + " errMsg: " + rp.getErrMsg() + " result: " + rp.getResult().getSid());

            reqBase.setSid(rp.getResult().getSid());
            System.out.println("!!!!!!!!!!!! rp.getResult() " + rp.getResult());
            System.out.println("!!!!!!!!!!!! rp.getResult().getState() " + rp.getResult().getState());
            System.out.println("!!!!!!!!!!!! rp.getResult().getState().getOtpReq() " + rp.getResult().getState().getOtpReq());
            System.out.println("!!!!!!!!!!!! rp.getResult().getState().getOtpReq().getReqId() " + rp.getResult().getState().getOtpReq().getReqId());
            System.out.println("!!!!!!!!!!!! Before: userWebServiceSOAPHttpPort.checkAuthOtp");
            rp = userWebServiceSOAPHttpPort.checkAuthOtp(reqBase, rp.getResult().getState().getOtpReq().getReqId(), "1");
            System.out.println("!!!!!!!!!!!! After: userWebServiceSOAPHttpPort.checkAuthOtp");

            writer.write("errCode: " + rp.getErrCode() + " errMsg: " + rp.getErrMsg() + " result: " + rp.getResult().getSid());

            System.out.println("!!!!!!!!!!!! rp.getResult() " + rp.getResult());
            System.out.println("!!!!!!!!!!!! rp.getResult().getState() " + rp.getResult().getState());
            System.out.println("!!!!!!!!!!!! rp.getResult().getState().getOtpReq() " + rp.getResult().getState().getOtpReq());
            System.out.println("!!!!!!!!!!!! rp.getResult().getState().getOtpReq().getReqId() " + rp.getResult().getState().getOtpReq().getReqId());
            System.out.println("!!!!!!!!!!!! rp.getResult().getUser().getName() " + rp.getResult().getUser().getName());
            System.out.println("!!!!!!!!!!!! rp.getResult().getUser().getLogin() " + rp.getResult().getUser().getLogin());
            System.out.println("!!!!!!!!!!!! rp.getResult().getPinCfg().isEnabled() " + rp.getResult().getPinCfg().isEnabled());
            System.out.println("!!!!!!!!!!!! rp.getResult().getExpireDate() " + rp.getResult().getExpireDate().toString());
            System.out.println("!!!!!!!!!!!! Before: userWebServiceSOAPHttpPort.checkAuthOtp");

            writer.flush();
        }

        System.out.println("------------------------------------------------------------------------");

//        System.out.println("!!!!!!!!!!!! Before: new ProductWebService_Service()");
//        ProductWebService_Service productWebService_service = new ProductWebService_Service();
//        System.out.println("!!!!!!!!!!!! After: new ProductWebService_Service()");
//        ProductWebService productWebService = productWebService_service.getProductWebServiceSOAPHttpPort();
//        System.out.println("!!!!!!!!!!!! After: productWebService.getProductWebServiceSOAPHttpPort()");
//
//        ReqBase reqBaseP = new ReqBase();
//        reqBaseP.setFs("ib");
//
//        System.out.println("!!!!!!!!!!!! Before:productWebService.getClientProductList");
//        ClientProductListRp clientProductList = productWebService.getClientProductList(reqBaseP);
//        System.out.println("!!!!!!!!!!!! After: productWebService.getClientProductList");
//
//        System.out.println("!!!!!!!!!!!! SessionRp rp: " + clientProductList);
//
//        List<ClientProduct> list = clientProductList.getList();
//
//        System.out.println("!!!!!!!!!!!! list: " + list);
//
//        list.forEach(clientProduct -> {
//            System.out.println("!!!!!!!!!!!! clientProduct.getName() " + clientProduct.getName());
//            System.out.println("!!!!!!!!!!!! clientProduct.getCurrencyAlias() " + clientProduct.getCurrencyAlias());
//            System.out.println("!!!!!!!!!!!! clientProduct.getTypeAlias() " + clientProduct.getTypeAlias());
//            System.out.println("!!!!!!!!!!!! clientProduct.getBalance() " + clientProduct.getBalance());
//            System.out.println("!!!!!!!!!!!! clientProduct.getBankProductId() " + clientProduct.getBankProductId());
//            System.out.println("!!!!!!!!!!!! clientProduct.getCurrencyId() " + clientProduct.getCurrencyId());
//            System.out.println("!!!!!!!!!!!! clientProduct.getTypeId() " + clientProduct.getTypeId());
//        });

    }
}
