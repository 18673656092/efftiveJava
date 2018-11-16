package com.test.effective.treaty15.run;

import com.test.effective.treaty15.Host;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by zhuran on 2018/11/16 0016
 * 接口优先于抽象类,定义接口中的方法一定要谨慎,一旦很多类都实现了该接口再去变动以及来不及
 * 一旦提供出一个公用的接口，最好使用抽象类提供骨架实现
 * 一般，接口是定义多个实现的类型的最佳途径，但是如果演变的容易性比灵活以及功能更重要时采用抽象类
 * 另外我们一般采用函数对象表示策略，我们声明一个接口表示该策略，并且为每个具体策略声明一个实现该接口的具体策略类
 * 如果策略只需要使用一次，我们采用匿名类来声明并且实例化使用，如果需要多次使用，最好的方案，被实现为私有的静态成员类
 * 并且通过公有的静态fianl域被导出
 */
public class Test {
    public static void main(String[] args) {
        String[] strings = {"p","pick","pi","pic"};
        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });
        for(String s:strings){
            System.out.print(s + " ");
        }
        Arrays.sort(strings, Host.STRING_LENGTH_COMPARATORDESC);
        for(String s:strings){
            System.out.print(s + " ");
        }
        Arrays.sort(strings,Host.STRING_LENGTH_COMPARATOR);
        for(String s:strings){
            System.out.print(s + " ");
        }
    }
}
