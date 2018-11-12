package com.test.effective.treaty4;

/**
 * Created by zhuran on 2018/11/12 0012
 */
public class UtilityClass {

    private UtilityClass(){
        throw new AssertionError();
    }
    public static UtilityClass getInstance(){
        return new UtilityClass();
    }

}
