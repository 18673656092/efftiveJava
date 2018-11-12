package com.test.effective.treaty6;

import java.util.Arrays;
import java.util.EmptyStackException;

/**
 * Created by zhuran on 2018/11/12 0012
 * 消除过期的对象引用，避免内存泄漏
 */
public class Stack {
    private Object[] elements;
    private int size = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    public Stack() {
        elements = new Object[DEFAULT_INITIAL_CAPACITY];
    }

    private void ensureCapacity() {
        if (elements.length == size) {
            if (elements.length < Integer.MAX_VALUE / 2 - 1) {
                elements = Arrays.copyOf(elements, 2 * size + 1);
            } else {
                elements = Arrays.copyOf(elements, Integer.MAX_VALUE);
            }
        }
    }

    public void push(Object e) {
        ensureCapacity();
        elements[size++] = e;
    }

    public Object pop() {
        if (size == 0) {
            throw new EmptyStackException();
        }
        return elements[--size];
    }

    /*
    * public Object pop(){
    *   if(size == 0){
    *       throw new EmptyStackException();
    *   }
    *   Object result = elements[--size];
    *   elements[size] = null //回收
    *   return result;
    * }
    * */
}
