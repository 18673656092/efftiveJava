package com.test.effective.treaty9.run;

import com.test.effective.treaty9.PhoneNumber;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by zhuran on 2018/11/13 0013
 * 覆盖equals一定要覆盖hashCode
 */
public class Test {
    public static void main(String[] args) {
        Map<PhoneNumber,String> map = new HashMap<>();
        map.put(new PhoneNumber(113,111,112),"JY");
        //由于重写equals后没有重写hashCOde方法导致为NULL
        System.out.println(map.get(new PhoneNumber(113,111,112)));
    }
}
