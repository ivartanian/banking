package com.skywell.banking.handlers.exeptions;

import org.glassfish.jersey.server.validation.internal.ValidationHelper;

import javax.validation.ConstraintViolationException;
import javax.ws.rs.core.*;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;
import java.util.ArrayList;

/**
 * Created by viv on 15.02.2016.
 */
@Provider
public class CustomValidationException implements ExceptionMapper<ConstraintViolationException> {

    @Context
    private Configuration config;
    @Context
    private javax.inject.Provider<Request> request;

    @Override
    public Response toResponse(ConstraintViolationException exception) {
        return Response.status(Response.Status.BAD_REQUEST)
                .entity(new ArrayList<>(ValidationHelper.constraintViolationToValidationErrors(exception)))
                .type(MediaType.APPLICATION_JSON).build();
    }

}
