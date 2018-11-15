package com.test.effective.treaty12.run;

import com.test.effective.treaty12.PhoneNumber;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by zhuran on 2018/11/14 0014
 * 如果编写某个值类,具有明显的排序关系,考虑实现CompareTo接口
 */
public class Test {
    public static void main(String[] args) {
        PhoneNumber p = new PhoneNumber(112,111,234);
        PhoneNumber p2 = new PhoneNumber(117,121,234);
        PhoneNumber p3 = new PhoneNumber(112,141,234);
        List<PhoneNumber> list = new ArrayList<>();
        list.add(p);list.add(p2);list.add(p3);
        Collections.sort(list);
        for(PhoneNumber pn:list){
            System.out.println(pn);
        }
    }
}
