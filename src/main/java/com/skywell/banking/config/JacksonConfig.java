package com.skywell.banking.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.codehaus.jackson.map.SerializationConfig;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.ext.ContextResolver;
import javax.ws.rs.ext.Provider;
import java.text.SimpleDateFormat;

/**
 * Created by viv on 16.02.2016.
 */
@Provider
@Produces(MediaType.APPLICATION_JSON)
public class JacksonConfig implements ContextResolver<ObjectMapper>
{
    private ObjectMapper objectMapper;


    public JacksonConfig() throws Exception
    {
        this.objectMapper = new ObjectMapper();
//        this.objectMapper.setDateFormat(new SimpleDateFormat("dd.MM.yyyy"));
//        this.objectMapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
    }


    public ObjectMapper getContext(Class<?> objectType)
    {
        return objectMapper;
    }
}