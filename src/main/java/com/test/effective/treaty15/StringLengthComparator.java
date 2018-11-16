package com.test.effective.treaty15;

/**
 * Created by zhuran on 2018/11/16 0016
 */
public class StringLengthComparator implements Comparator<String>{
    @Override
    public int compare(String t1, String t2) {
        return t1.length() - t2.length();
    }
}
