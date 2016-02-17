package com.skywell.banking.config;

import com.fasterxml.jackson.jaxrs.json.JacksonJaxbJsonProvider;
import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;
import com.skywell.banking.filters.CharsetResponseFilter;
import org.eclipse.persistence.jaxb.rs.MOXyJsonProvider;
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
        register(JacksonJsonProvider.class);
        property(ServerProperties.MOXY_JSON_FEATURE_DISABLE, "true");
//        register(MOXyJsonProvider.class);
//        register(JacksonJaxbJsonProvider.class);
//        register(JacksonFeature.class);
//        property(ServerProperties.BV_SEND_ERROR_IN_RESPONSE, "true");

        // Enable Tracing support.
//        property(ServerProperties.TRACING, "ALL");

    }
}
