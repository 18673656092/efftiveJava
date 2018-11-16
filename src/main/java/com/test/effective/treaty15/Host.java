package com.test.effective.treaty15;

import java.io.Serializable;
import java.util.Comparator;

/**
 * Created by zhuran on 2018/11/16 0016
 *
 */
public class Host {

    private static class StrLenCmp implements Comparator<String>,Serializable{
        @Override
        public int compare(String o1, String o2) {
            return o1.length() - o2.length();
        }
    }

    private static class StrLenCmpDesc implements Comparator<String>,Serializable{
        @Override
        public int compare(String o1, String o2) {
            return o2.length() - o1.length();
        }
    }

    public static final Comparator<String> STRING_LENGTH_COMPARATOR = new StrLenCmp();

    public static final Comparator<String> STRING_LENGTH_COMPARATORDESC = new StrLenCmpDesc();

}
