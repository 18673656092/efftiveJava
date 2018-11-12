package com.test.effective.treaty8.run;

import com.test.effective.treaty8.Equeals1;

import javax.validation.constraints.Max;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhuran on 2018/11/12 0012
 * equeals对称性:由于String的equals和Equals1的equals并不对称,会出现奇怪的情况
 */
public class Test1 {
    public static void main(String[] args) {
        Equeals1 e = new Equeals1("Polish");
        String s = "polish";
        //true
        System.out.println(e.equals(s));
        //false
        System.out.println(s.equals(e));
        List<Equeals1> list = new ArrayList<>();
        list.add(e);
        //false
        System.out.println(list.contains(s));
    }
}
