package com.skywell.banking.handlers.exeptions;

import com.skywell.banking.api.core.RspResult;
import com.skywell.banking.api.ws.ResultRp;
import org.apache.log4j.Logger;
import org.glassfish.jersey.server.validation.ValidationError;
import org.glassfish.jersey.server.validation.internal.ValidationHelper;

import javax.validation.ConstraintViolationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;
import java.util.ArrayList;

/**
 * Created by viv on 15.02.2016.
 */
@Provider
public class CustomValidationException implements ExceptionMapper<ConstraintViolationException> {

    private static final Logger LOG = Logger.getLogger(CustomValidationException.class);

    @Override
    public Response toResponse(ConstraintViolationException exception) {
        LOG.info(ValidationHelper.constraintViolationToValidationErrors(exception));
//        ArrayList<ValidationError> entity = new ArrayList<>(ValidationHelper.constraintViolationToValidationErrors(exception));
        ResultRp entity = new ResultRp();
        entity.setErrCode(RspResult.CODE_REQ_BAD);
        return Response.status(Response.Status.BAD_REQUEST)
                .entity(entity)
                .type(MediaType.APPLICATION_JSON).build();
    }

}
