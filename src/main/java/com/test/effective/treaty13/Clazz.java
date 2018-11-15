package com.test.effective.treaty13;

import java.util.Objects;

/**
 * Created by zhuran on 2018/11/14 0014
 * 类的设计:
 * 1.类和成员的可访问性最小化
 * 2.在公用类中使用访问方法而非公有域
 * 3.使可变性最小化(不可变对象只拥有一种状态,不可变对象中不允许有可以改变对象状态的方法)
 */
public final class Clazz {
    private final double re;
    private final double rm;

    private Clazz(double re, double rm) {
        this.re = re;
        this.rm = rm;
    }

    public static Clazz valueOf(double re,double rm){
        return new Clazz(re,rm);
    }

    private double realPart() {
        return re;
    }

    private double imaginaryPart() {
        return rm;
    }

    public Clazz add(Clazz c) {
        return new Clazz(re + c.re, rm + c.rm);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Clazz clazz = (Clazz) o;
        return Double.compare(clazz.re, re) == 0 &&
                Double.compare(clazz.rm, rm) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(re, rm);
    }

    @Override
    public String toString() {
        return "Clazz{" +
                "re=" + re +
                ", rm=" + rm +
                '}';
    }
}
