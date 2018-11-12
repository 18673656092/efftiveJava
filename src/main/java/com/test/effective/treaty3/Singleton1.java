package com.test.effective.treaty3;

/**
 * Created by zhuran on 2018/11/12 0012
 */
public class Singleton1 {

    private static Singleton1 instance = new Singleton1();

    private Singleton1(){}

    public static Singleton1 getInstance(){
        return instance;
    }
}
