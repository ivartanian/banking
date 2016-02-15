package com.skywell.banking.config;

import com.skywell.banking.filters.CharsetResponseFilter;
import com.skywell.banking.handlers.exeptions.CustomJsonMappingException;
import org.codehaus.jackson.jaxrs.JacksonJaxbJsonProvider;
import org.codehaus.jackson.jaxrs.JacksonJsonProvider;
import org.glassfish.jersey.filter.LoggingFilter;
import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.ServerProperties;

import javax.ws.rs.ApplicationPath;

/**
 * Created by viv on 15.02.2016.
 */
@ApplicationPath("/")
public class JerseyConfig extends ResourceConfig {
    public JerseyConfig() {
        packages("com.skywell.banking");
        register(CharsetResponseFilter.class);
        register(LoggingFilter.class);
//        register(JacksonJaxbJsonProvider.class);

        // Enable Tracing support.
//        property(ServerProperties.TRACING, "ALL");

    }
}
