package com.skywell.banking.handlers.exeptions;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.skywell.banking.api.core.RspResult;
import com.skywell.banking.api.ws.ResultRp;
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
        ObjectMapper objectMapper = new ObjectMapper();
        List<String> errors = new ArrayList<>();
        List<ValidationError> validationErrors = ValidationHelper.constraintViolationToValidationErrors(exception);
        for (ValidationError validationError : validationErrors) {
            errors.add(validationError.getMessage());
        }
        String msg = null;
        try {
            msg = objectMapper.writeValueAsString(errors);
            LOG.info(msg);
        } catch (JsonProcessingException e) {
            LOG.warn("Could not convert errors to json");
        }
        ResultRp resultRp = new ResultRp();
        resultRp.setErrMsg(msg);
        resultRp.setErrCode(RspResult.CODE_REQ_BAD);
        return Response.status(Response.Status.BAD_REQUEST)
                .entity(resultRp)
                .type(MediaType.APPLICATION_JSON).build();
    }

}
