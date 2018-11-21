package com.test.effective.treaty18;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by zhuran on 2018/11/21 0021、
 * 优先考虑泛型方法
 */
public class Test {
    //这个方法存在两个警告，因为存在类型不安全的现象
    public static Set union(Set s1,Set s2){
        Set result = new HashSet(s1);
        result.addAll(s2);
        return result;
    }
    //使用泛型方法后，警告消失
    public static <E> Set<E> union2(Set<E> s1,Set<E> s2){
        Set<E> result = new HashSet<>(s1);
        result.addAll(s2);
        return result;
    }

    public static void main(String[] args) {
        Set<String> guys = new HashSet<>(Arrays.asList("Tom","Dick"));
        Set<Integer> stooges = new HashSet<>(Arrays.asList(1,2));
        System.out.println(Test.union(guys,stooges));
//        泛型方法类在编译阶段就验证出类型不安全
//        System.out.println(Test.union2(guys,stooges));
    }
}
