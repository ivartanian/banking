package com.skywell.banking.handlers.exeptions;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.skywell.banking.api.core.RspResult;
import com.skywell.banking.api.ws.ResultRp;
import com.skywell.banking.views.CustomResultRp;
import org.apache.log4j.Logger;
import org.glassfish.jersey.server.validation.ValidationError;
import org.glassfish.jersey.server.validation.internal.ValidationHelper;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.validation.ConstraintViolationException;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.MessageBodyWriter;
import javax.ws.rs.ext.Provider;
import javax.ws.rs.ext.Providers;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by viv on 15.02.2016.
 */
@Provider
public class CustomValidationException implements ExceptionMapper<ConstraintViolationException> {

    private static final Logger LOG = Logger.getLogger(CustomValidationException.class);

    @Override
    public Response toResponse(ConstraintViolationException exception) {
        StringBuilder errors = new StringBuilder();
        List<ValidationError> validationErrors = ValidationHelper.constraintViolationToValidationErrors(exception);
        for (ValidationError validationError : validationErrors) {
            errors.append(validationError.getMessage()).append("; ");
        }
        errors.delete(errors.length()-2, errors.length());
        ResultRp resultRp = new ResultRp();
        resultRp.setErrMsg(errors.toString());
        resultRp.setErrCode(RspResult.CODE_REQ_BAD);
        return Response.status(Response.Status.BAD_REQUEST)
                .entity(resultRp)
                .type(MediaType.APPLICATION_JSON).build();
    }

}
