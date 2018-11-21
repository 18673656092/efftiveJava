package com.test.effective.treaty19.run;

import com.test.effective.treaty19.Stack;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by zhuran on 2018/11/21 0021
 */
public class Test {

    public static void main(String[] args) {
        Stack<Number> numberStack = new Stack<>();
        Iterable<Integer> integers = () -> null;
        /*
           public void pushAll(Iterable<E> iterable){
            for (E e: iterable){
                push(e);
            }
        }*/
        //Integer是Number的子类,从逻辑上是可行的,所以我们需要使用有限制的通配符
        //之后就没有报错了
        /*
           public void pushAll(Iterable<? extends E> iterable){
            for (E e: iterable){
                push(e);
            }
        }*/
        numberStack.pushAll(integers);
    }

}
