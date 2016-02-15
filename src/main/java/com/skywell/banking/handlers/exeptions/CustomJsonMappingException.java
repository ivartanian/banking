package com.skywell.banking.handlers.exeptions;

import org.glassfish.jersey.server.internal.process.MappableException;
import org.glassfish.jersey.server.validation.internal.ValidationExceptionMapper;

import javax.validation.ValidationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

/**
 * Created by viv on 15.02.2016.
 */
@Provider
public class CustomJsonMappingException implements ExceptionMapper<MappableException> {

    @Override
    public Response toResponse(MappableException exception) {
        return Response.status(Response.Status.BAD_REQUEST).entity(exception.getMessage()).type(MediaType.TEXT_HTML).build();
    }

}
