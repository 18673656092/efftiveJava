package com.test.tdd.tdd1;

import org.junit.Test;

import java.util.Scanner;

import static org.junit.Assert.*;

/**
 * Created by zhuran on 2018/11/8 0008
 */
public class DollarTest {

    @Test
    public void MoneyTest(){
        assertEquals(Money.money(15, "USD"), Money.money(15, "USD"));
        assertNotEquals(Money.money(10, "CHF"), Money.money(10, "USD"));
    }

}