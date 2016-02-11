package com.skywell.banking.filters;

import com.sun.jersey.spi.container.ContainerRequest;
import com.sun.jersey.spi.container.ContainerResponse;
import com.sun.jersey.spi.container.ContainerResponseFilter;

import javax.ws.rs.core.MediaType;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by viv on 11.02.2016.
 */
public class CharsetResponseFilter implements ContainerResponseFilter {

    @Override
    public ContainerResponse filter(ContainerRequest requestContext, ContainerResponse responseContext) {

        MediaType type = responseContext.getMediaType();
        if (type != null) {
            if (!type.getParameters().containsKey("charset")) {
                Map<String, String> parametersMap = createParametersMap(type.getParameters());
                parametersMap.put("charset", "utf-8");
                MediaType typeWithCharset = new MediaType(type.getType(), type.getSubtype(), parametersMap);
                responseContext.getHttpHeaders().putSingle("Content-Type", typeWithCharset);
            }
        }
        return responseContext;
    }

    private Map<String, String> createParametersMap(Map<String, String> initialValues) {
        final Map<String, String> map = new HashMap<>();
        if (initialValues != null) {
            for (Map.Entry<String, String> e : initialValues.entrySet()) {
                map.put(e.getKey().toLowerCase(), e.getValue());
            }
        }
        return map;
    }

}