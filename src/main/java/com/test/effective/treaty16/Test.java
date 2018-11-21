package com.test.effective.treaty16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by zhuran on 2018/11/19 0019
 * 不要在新代码中使用原生类型,譬如使用List<String>而不使用List
 * 消除非受检警告,慎用SuppressWarnings("unchecked"),除非有证据证明代码一定是没问题的
 * 列表优先于数组
 *
 */
public class Test {
    public static void main(String[] args) {
        Object[] objects = new Long[1];
        objects[0] = "I am string";
        //列表在编译时期就会报错，而数组是具体化的必须到运行时才进行元素类型约束的检查
//        List<Object> objectList = new ArrayList<Long>();
//        objectList.add("I am string");
        //泛型数组是非法的
        /*
        *假设是合法的，我们将List<String>[]放入到一个Object数组中是合法的
        *将integerList保存到Object数组是合法的。这样我们就成功把一个Interage
        *放入到String中去了，所以泛型数组不可以合法。
        */
//        List<String>[] lists = new List<String>[1];
//        List<Integer> integerList = Arrays.asList(1);
//        Object[] objects1 = lists; //数组协变具体化
//        objects1[0] = integerList;  //列表非协变擦除式
//        String s = lists[0].get(0);
    }
}
