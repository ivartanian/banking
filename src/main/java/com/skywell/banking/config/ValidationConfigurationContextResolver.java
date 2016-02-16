package com.skywell.banking.config;

import org.glassfish.jersey.server.validation.ValidationConfig;

import javax.ws.rs.container.ResourceContext;
import javax.ws.rs.core.Context;
import javax.ws.rs.ext.ContextResolver;
import javax.ws.rs.ext.Provider;

/**
 * Created by viv on 16.02.2016.
 */
@Provider
public class ValidationConfigurationContextResolver implements ContextResolver<ValidationConfig> {

    @Context
    private ResourceContext resourceContext;

    @Override
    public ValidationConfig getContext(final Class<?> type) {
        final ValidationConfig config = new ValidationConfig();
        config.messageInterpolator(resourceContext.getResource(LocaleAwareMessageInterpolator.class));
        return config;
    }

}