package com.test.effective.treaty3;

/**
 * Created by zhuran on 2018/11/12 0012
 */
public class Singleton2 {
    private static Singleton2 instance;
    private static final Object lock = new Object();

    private Singleton2() {
    }

    public static Singleton2 getInstance() {
        if (instance == null) {
            synchronized (lock) {
                if (instance == null) {
                    instance = new Singleton2();
                }
            }
        }
        return instance;
    }
}
