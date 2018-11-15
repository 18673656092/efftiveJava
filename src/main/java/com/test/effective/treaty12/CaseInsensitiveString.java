package com.test.effective.treaty12;

/**
 * Created by zhuran on 2018/11/14 0014
 */
public class CaseInsensitiveString implements Comparable<CaseInsensitiveString>{

    private String s;

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    @Override
    public int compareTo(CaseInsensitiveString o) {
        return String.CASE_INSENSITIVE_ORDER.compare(s,o.s);
    }
}
