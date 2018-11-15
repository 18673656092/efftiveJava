package com.test.effective.treaty13.run;

import com.test.effective.treaty13.Clazz;

/**
 * Created by zhuran on 2018/11/14 0014
 */
public class Test {
    public static void main(String[] args) {
        Clazz clazz = Clazz.valueOf(1.0,2.0);
        Clazz clazz1 = clazz.add(clazz);
        System.out.println(clazz);
        System.out.println(clazz1);
    }
}
