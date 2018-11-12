package com.test.effective.treaty4.run;

import com.test.effective.treaty4.UtilityClass;

/**
 * Created by zhuran on 2018/11/12 0012
 * 通过私有构造器强化类不可实例化能力
 */
public class Test {
    public static void main(String[] args) {
        UtilityClass.getInstance();
    }
}
