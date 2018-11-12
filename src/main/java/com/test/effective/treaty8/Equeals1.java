package com.test.effective.treaty8;

/**
 * Created by zhuran on 2018/11/12 0012
 */
public class Equeals1 {
    private final String s;
    public Equeals1(String s){
        if(s == null){
            throw new NullPointerException();
        }
        this.s = s;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Equeals1){
            return s.equalsIgnoreCase(((Equeals1) obj).s);
        }
        if(obj instanceof String){
            return s.equalsIgnoreCase((String) obj);
        }
        return false;
    }
}
