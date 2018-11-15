package com.test.effective.treaty14.run;

import com.test.effective.treaty14.InstrumentedForwardingSet;
import com.test.effective.treaty14.InstrumentedHashSet;

import java.util.Arrays;
import java.util.HashSet;

/**
 * Created by zhuran on 2018/11/15 0015
 * 继承是实现代码重用的手段，但是如果跨包边界的继承可能会出现不安全的现象，子类依赖于超类的特性实现，超类的实现随着版本可能会出现变动
 */
public class Test {
    public static void main(String[] args) {
        InstrumentedHashSet<String> instrumentedHashSet = new InstrumentedHashSet<>();
        instrumentedHashSet.addAll(Arrays.asList("A","B","C"));
        //期望count=3 实际count=6
        System.out.println(instrumentedHashSet.getAddCount());
        
        InstrumentedForwardingSet<String> instrumentedForwardingSet = new InstrumentedForwardingSet<>(new HashSet<>());
        instrumentedForwardingSet.addAll(Arrays.asList("A","B","C"));
        System.out.println(instrumentedForwardingSet.getAddCount());
    }
}
