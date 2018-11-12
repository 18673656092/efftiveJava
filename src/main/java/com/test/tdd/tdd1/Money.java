package com.test.tdd.tdd1;

import java.util.Objects;

/**
 * Created by zhuran on 2018/11/8 0008
 */
public class Money {

    private int amount;

    private String currency;

    private Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    static Money money(int amount,String currency){
        return new Money(amount,currency);
    }

    private String currency() {
        return currency;
    }

    Money times(int mutiplier) {
        return new Money(amount * mutiplier, currency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Money money = (Money) o;
        return amount == money.amount && currency().equals(money.currency);
    }

}
