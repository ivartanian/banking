package com.skywell.banking.config;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import javax.xml.datatype.XMLGregorianCalendar;
import java.io.IOException;
import java.time.format.DateTimeFormatter;

/**
 * Created by viv on 16.02.2016.
 */
public class CustomJsonSerializer extends JsonSerializer<XMLGregorianCalendar> {
    @Override
    public void serialize(XMLGregorianCalendar date, JsonGenerator generator,
                          SerializerProvider provider) throws IOException {
        long dateLong = date.toGregorianCalendar().getTimeInMillis();
        generator.writeNumber(dateLong);
    }
}
