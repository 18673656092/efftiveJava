package com.test.effective.treaty19;

import java.util.Arrays;
import java.util.EmptyStackException;

/**
 * Created by zhuran on 2018/11/12 0012
 */
public class Stack<E> {

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

    public void push(E e) {
        ensureCapacity();
        elements[size++] = e;
    }

    public E pop() {
        if (size == 0) {
            throw new EmptyStackException();
        }
        @SuppressWarnings("unchecked")
        E result = (E) elements[--size];
        elements[size] = null;
        return result;
    }

    //我们新增一个方法,让它按照顺序将一系列的元素全部放入到堆栈中
    public void pushAll(Iterable<? extends E> iterable){
        for (E e: iterable){
            push(e);
        }
    }
}
