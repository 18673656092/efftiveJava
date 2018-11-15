package com.test.effective.treaty14;

import java.util.Collection;
import java.util.Set;

/**
 * Created by zhuran on 2018/11/15 0015
 */
public class InstrumentedForwardingSet<E> extends ForwadingSet<E>{

    private int addCount = 0;

    public InstrumentedForwardingSet(Set<E> set) {
        super(set);
    }

    @Override
    public boolean add(E e) {
        addCount++;
        return super.add(e);
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        addCount += c.size();
        return super.addAll(c);
    }

    public int getAddCount() {
        return addCount;
    }
}
