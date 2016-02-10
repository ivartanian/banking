package com.skywell.core;

import java.util.HashMap;

public class LoObject extends HashMap<String, Object> {
    private static final long serialVersionUID = 23041973;

    public LoObject() {
        super();
    }

    public LoObject(String langId, Object value) {
        super();
        if (langId != null && value != null)
            super.put(langId, value);
    }

    private Object getObject1(String langId, String langDefId) {
        Object res = super.get(langId);
        if (res != null) {
            return res;
        } else if (langDefId != null && (!langId.equals(langDefId))) {
            return super.get(langDefId);
        } else {
            return null;
        }
    }

    public Object getObject(String langId, String langDefId) {
        if (isEmpty()) {
            return null;
        } else if (langId == null) {
            return langDefId == null ? null : super.get(langDefId);
        } else {
            return getObject1(langId, langDefId);
        }
    }

    public String getString(String langId, String langDefId) {
        Object res = getObject(langId, langDefId);
        if (res == null)
            return null;
        else
            return res.toString();
    }

    public void setObject(String langId, Object value) {
        if (langId != null) {
            if (value == null)
                super.remove(langId);
            else
                super.put(langId, value);
        }
    }
}
