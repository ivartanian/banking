package com.skywell;

import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * Created by uartan on 09.02.2016.
 */
@Path("/banking")
public class FasadeBean {
    @POST
    public String sayHello() {
        return "Hello World!";
    }
}
