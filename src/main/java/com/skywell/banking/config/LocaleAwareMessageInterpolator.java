package com.skywell.banking.config;

import org.hibernate.validator.messageinterpolation.ResourceBundleMessageInterpolator;

import javax.ws.rs.ext.Provider;
import java.util.Locale;

/**
 * Created by viv on 16.02.2016.
 */
@Provider
public class LocaleAwareMessageInterpolator extends ResourceBundleMessageInterpolator {

    private Locale defaultLocale = Locale.getDefault();

    public void setDefaultLocale(Locale defaultLocale) {
        this.defaultLocale = defaultLocale;
    }

    @Override
    public String interpolate(final String messageTemplate, final Context context) {
        return interpolate(messageTemplate, context, defaultLocale);
    }

    @Override
    public String interpolate(final String messageTemplate, final Context context, final Locale locale) {
        return super.interpolate(messageTemplate, context, locale);
    }
}