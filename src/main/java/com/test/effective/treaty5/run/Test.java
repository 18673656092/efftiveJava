package com.test.effective.treaty5.run;

/**
 * Created by zhuran on 2018/11/12 0012
 * 避免创建不必要的对象
 */
public class Test {
    public static void main(String[] args) {
        //...PersonStatic调用isBabyBoomer运行过程中Calendar,TimeZone,Date均只实例化一次
    }
}
