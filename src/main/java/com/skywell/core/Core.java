package com.skywell.core;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Arrays;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.XMLGregorianCalendar;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * 
 * @author SOM
 *
 */
public final class Core {
    private static final String MAC_ALG = "HmacMD5";
    private static final String KEY_ALG = "PBEWithMD5AndDES";

    private Core() {

    }

    public static GregorianCalendar dateConvert(LocalDateTime value) {
        if (value == null)
            return null;
        return GregorianCalendar.from(value.atZone(ZoneId.systemDefault()));
    }

    public static LocalDateTime dateConvert(GregorianCalendar value) {
        if (value == null)
            return null;
        return LocalDateTime.ofInstant(value.toInstant(), ZoneId.systemDefault());
    }

    public static String getErrMsg(Throwable err) {
        if (err == null)
            return "";
        String msg = err.getMessage();
        if (msg == null || msg.length() == 0)
            msg = "" + err;
        return msg;
    }

    public static String strTrimOrNull(String value) {
        if (value == null)
            return null;
        String s = value.trim();
        if (s.length() == 0)
            return null;
        else
            return s;
    }

    public static String strNotNull(String value) {
        if (value == null)
            return "";
        else
            return value;
    }

    public static String strMax255(String value) {
        if (value == null || value.length() < 256)
            return value;
        else
            return value.substring(0, 252) + "...";
    }

    public static String strMax2000(String value) {
        if (value == null || value.length() < 2001)
            return value;
        else
            return value.substring(0, 1997) + "...";
    }

    public static String strReplace(String src, String strDel, String strIns) {
        if (src == null)
            return null;
        StringBuffer result = new StringBuffer();
        int startPos = 0;
        int curPos = src.indexOf(strDel, startPos);
        while (curPos != -1) {
            if (curPos - startPos > 0) {
                result.append(src.substring(startPos, curPos));
                result.append(strIns);
            } else {
                result.append(strIns);
            }
            startPos = curPos + strDel.length();
            curPos = src.indexOf(strDel, startPos);
        }
        if (src.length() - startPos > 0)
            result.append(src.substring(startPos, src.length()));
        return result.toString();
    }

    public static byte[] cryptoPasswordCreateMac(String pass) {
        try {
            PBEKeySpec pbeKeySpec = new PBEKeySpec(pass.toCharArray());
            SecretKeyFactory keyFac = SecretKeyFactory.getInstance(KEY_ALG);
            SecretKey pbeKey = keyFac.generateSecret(pbeKeySpec);
            Mac mac = Mac.getInstance(MAC_ALG);
            mac.init(pbeKey);
            return mac.doFinal(pass.getBytes());
        } catch (Exception e) {
            throw new FatalException(e);
        }
    }

    public static byte[] cryptoPasswordCreateObj(String randomdata, String pass) {
        try {
            javax.crypto.spec.PBEKeySpec pbeKeySpec = new javax.crypto.spec.PBEKeySpec(randomdata.toCharArray());
            SecretKeyFactory keyFac = SecretKeyFactory.getInstance(KEY_ALG);
            SecretKey pbeKey = keyFac.generateSecret(pbeKeySpec);
            Mac mac = Mac.getInstance(MAC_ALG);
            mac.init(pbeKey);
            return mac.doFinal(cryptoPasswordCreateMac(pass));
        } catch (Exception e) {
            throw new FatalException(e);
        }
    }

    public static boolean cryptoPasswordVerify(String randomdata, byte[] macdata, byte[] objdata) {
        try {
            PBEKeySpec pbeKeySpec = new PBEKeySpec(randomdata.toCharArray());
            SecretKeyFactory keyFac = SecretKeyFactory.getInstance(KEY_ALG);
            SecretKey pbeKey = keyFac.generateSecret(pbeKeySpec);
            Mac mac = Mac.getInstance(MAC_ALG);
            mac.init(pbeKey);
            byte[] mb = mac.doFinal(macdata);
            return Arrays.equals(mb, objdata);
        } catch (Exception e) {
            throw new FatalException(e);
        }
    }

    public static XMLGregorianCalendar toXMLDate(LocalDateTime dt) {
        if (dt != null) {
            try {
                XMLGregorianCalendar dtrsp = javax.xml.datatype.DatatypeFactory.newInstance().newXMLGregorianCalendar();
                dtrsp.setYear(dt.getYear());
                dtrsp.setMonth(dt.getMonthValue());
                dtrsp.setDay(dt.getDayOfMonth());
                dtrsp.setHour(javax.xml.datatype.DatatypeConstants.FIELD_UNDEFINED);
                dtrsp.setMinute(javax.xml.datatype.DatatypeConstants.FIELD_UNDEFINED);
                dtrsp.setSecond(javax.xml.datatype.DatatypeConstants.FIELD_UNDEFINED);
                dtrsp.setMillisecond(javax.xml.datatype.DatatypeConstants.FIELD_UNDEFINED);
                dtrsp.setTimezone(javax.xml.datatype.DatatypeConstants.FIELD_UNDEFINED);
                dtrsp.setFractionalSecond(null);
                return dtrsp;
            } catch (DatatypeConfigurationException e) {
                throw new FatalException(e);
            }
        } else {
            return null;
        }
    }

    public static XMLGregorianCalendar toXMLDateTime(LocalDateTime dt) {
        if (dt != null) {
            XMLGregorianCalendar dtrsp = toXMLDate(dt);
            dtrsp.setHour(dt.getHour());
            dtrsp.setMinute(dt.getMinute());
            dtrsp.setSecond(dt.getSecond());
            return dtrsp;
        } else {
            return null;
        }
    }

    public static LocalDateTime toLocalDateTime(Date dt) {
        if (dt != null) {
            return LocalDateTime.ofInstant(dt.toInstant(), ZoneId.systemDefault());
        } else {
            return null;
        }
    }

    public static LocalDateTime toJavaDate(XMLGregorianCalendar dt) {
        if (dt != null) {
            return LocalDateTime.of(dt.getYear(), dt.getMonth(), dt.getDay(), 0, 0, 0, 0);
        } else {
            return null;
        }
    }

    public static LocalDateTime toJavaDateTime(XMLGregorianCalendar dt) {
        if (dt != null) {
            return LocalDateTime.of(dt.getYear(), dt.getMonth(), dt.getDay(), dt.getHour(), dt.getMinute(),
                    dt.getSecond(), 0);
        } else {
            return null;
        }
    }

    public static <T> T jsonFromBytes(byte[] value, Class<T> clazz) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            return mapper.readValue(new ByteArrayInputStream(value), clazz);
        } catch (IOException e) {
            throw new FatalException(e);
        }
    }

    public static byte[] jsonToBytes(Object obj) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            mapper.writeValue(out, obj);
            return out.toByteArray();
        } catch (IOException e) {
            throw new FatalException(e);
        }
    }

    public static int compareOnlyDate(Date date1, Date date2) {
        return toLocalDateTime(date1).toLocalDate().compareTo(toLocalDateTime(date2).toLocalDate());
    }

    public static String strCapitalizeFirst(String value) {
        return value.substring(0, 1).toUpperCase() + value.substring(1).toLowerCase();
    }
}
