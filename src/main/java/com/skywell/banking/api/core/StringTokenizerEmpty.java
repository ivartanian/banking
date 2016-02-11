package com.skywell.banking.api.core;

import java.util.ArrayList;
import java.util.List;

public class StringTokenizerEmpty {
    private List<String> list;
    private int pos;

    public StringTokenizerEmpty(String str, String d) {
        list = new ArrayList<String>();
        pos = 0;
        if (str != null && str.length() > 0 && d != null && d.length() > 0) {
            int f = str.indexOf(d);
            while (f >= 0) {
                if (f == 0)
                    list.add("");
                else
                    list.add(str.substring(0, f));
                if (str.length() > f + d.length())
                    str = str.substring(f + d.length(), str.length());
                else {
                    str = "";
                    break;
                }
                f = str.indexOf(d);
            }
            list.add(str);
        }
    }

    public int countTokens() {
        return list.size() - pos;
    }

    public String nextToken() {
        if (pos < list.size())
            pos++;
        else
            return null;
        String s = list.get(pos - 1);
        return s.length() == 0 ? null : s;
    }

    public String[] toArray() {
        String mValues[] = new String[countTokens()];
        for (int i = 0; i < mValues.length; i++) {
            mValues[i] = nextToken();
        }
        return mValues;
    }

}
