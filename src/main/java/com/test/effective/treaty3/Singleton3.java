package com.test.effective.treaty3;

/**
 * Created by zhuran on 2018/11/12 0012
 */
public enum Singleton3 {
    INSTANCE(10);
    private int value;
    private Singleton3(int value){}
    public static Singleton3 getInstance(){
        return INSTANCE;
    }
    public String toString(){
        return String.valueOf(this.value);
    }
}
