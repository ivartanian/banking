package com.skywell.banking.handlers.exeptions;

import com.skywell.banking.views.errors.Error;

import javax.validation.ConstraintViolationException;
import javax.validation.ValidationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

/**
 * Created by viv on 15.02.2016.
 */
@Provider
public class CustomValidationException implements ExceptionMapper<ConstraintViolationException> {

    @Override
    public Response toResponse(ConstraintViolationException exception) {
        return Response.status(Response.Status.BAD_REQUEST).entity(new Error("Error validation")).type(MediaType.APPLICATION_JSON).build();
    }

}
