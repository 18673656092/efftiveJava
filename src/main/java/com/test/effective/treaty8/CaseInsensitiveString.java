package com.test.effective.treaty8;

/**
 * Created by zhuran on 2018/11/12 0012
 */
public class CaseInsensitiveString {
    private final String s;
    public CaseInsensitiveString(String s){
        if(s == null){
            throw new NullPointerException();
        }
        this.s = s;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof CaseInsensitiveString){
            return s.equalsIgnoreCase(((CaseInsensitiveString) obj).s);
        }
        if(obj instanceof String){
            return s.equalsIgnoreCase((String) obj);
        }
        return false;
    }
}
