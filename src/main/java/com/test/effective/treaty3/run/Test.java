package com.test.effective.treaty3.run;

import com.test.effective.treaty3.Singleton1;
import com.test.effective.treaty3.Singleton2;
import com.test.effective.treaty3.Singleton3;


/**
 * Created by zhuran on 2018/11/12 0012
 * 用私有构造器或者枚举类型强化单例模式
 */
public class Test {
    public static void main(String[] args) {
        Singleton1 s1 = Singleton1.getInstance();
        Singleton1 s2 = Singleton1.getInstance();
        Singleton2 s3 = Singleton2.getInstance();
        Singleton2 s4 = Singleton2.getInstance();
        Singleton3 s5 = Singleton3.getInstance();
        Singleton3 s6 = Singleton3.getInstance();
        System.out.println(s1==s2);
        System.out.println(s3==s4);
        System.out.println(s5==s6);
    }
}
