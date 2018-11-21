package com.test.effective.treaty17;

import java.util.Arrays;
import java.util.EmptyStackException;

/**
 * Created by zhuran on 2018/11/12 0012
 * 优先使用泛型,改写了之前的Stack转换成泛型
 */
public class Stack<E> {
//    将E[]修改为Object[]
//    private E[] elements;
    private Object[] elements;
    private int size = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;
//    数组是具体化的所以E[]报错
//    public Stack() {
//        elements = new E[DEFAULT_INITIAL_CAPACITY];
//    }

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

    public void push(E e) {
        ensureCapacity();
        elements[size++] = e;
    }

    public E pop() {
        if (size == 0) {
            throw new EmptyStackException();
        }
        //return elements[--size]
        @SuppressWarnings("unchecked")
        E result = (E) elements[--size];
        elements[size] = null;
        return result;
    }
}
