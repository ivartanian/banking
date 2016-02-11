package com.skywell.banking.api.core;

import com.skywell.banking.api.ws.ReqBase;
import com.skywell.banking.api.ws.UserWebService;
import com.skywell.banking.api.ws.UserWebService_Service;
import com.skywell.banking.api.ws.user.SessionRp;

import java.util.Map;

import javax.xml.bind.DatatypeConverter;

public class TestWS {
    public static void main(String argc[]) {
        try {
            UserWebService_Service webService_Service = null;
            UserWebService webService = null;
            webService_Service = new UserWebService_Service();
            webService = webService_Service.getUserWebServiceSOAPHttpPort();
            javax.xml.ws.BindingProvider bp = (javax.xml.ws.BindingProvider) webService;
            Map<String, Object> rc = bp.getRequestContext();
            rc.put(javax.xml.ws.BindingProvider.ENDPOINT_ADDRESS_PROPERTY,
                    "http://localhost:9999/backend/common/api.userapi/");
            // rc.put(javax.xml.ws.BindingProvider.ENDPOINT_ADDRESS_PROPERTY,
            // "http://localhost:7001/backend/common/userapi/");
            rc.put("com.sun.xml.internal.ws.connect.timeout", 40000);
            rc.put("com.sun.xml.internal.ws.request.timeout", 40000);

            ReqBase reqBase = new ReqBase();
            reqBase.setFs("ib");
            SessionRp rp = webService.authenticate(reqBase, "123456789",
                    DatatypeConverter.printBase64Binary(Core.cryptoPasswordCreateObj("123456789", "123456")));
            System.out.println("errCode: " + rp.getErrCode());
            System.out.println("errMsg: " + rp.getErrMsg());
            System.out.println("result: " + rp.getResult().getSid());

            reqBase.setSid(rp.getResult().getSid());
            rp = webService.checkAuthOtp(reqBase, rp.getResult().getState().getOtpReq().getReqId(), "1");
            System.out.println("errCode: " + rp.getErrCode());
            System.out.println("errMsg: " + rp.getErrMsg());
            System.out.println("result: " + rp.getResult().getSid());
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
