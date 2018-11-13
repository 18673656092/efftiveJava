package com.test.effective.treaty9;

import java.util.Objects;

/**
 * Created by zhuran on 2018/11/13 0013
 */
public class PhoneNumber {
    private final int areaCode;
    private final int prefix;
    private final int lineNumber;

    public PhoneNumber(int areaCode, int prefix, int lineNumber) {
        rangCheck(areaCode, 999, "areaCode");
        rangCheck(prefix, 999, "prefix");
        rangCheck(lineNumber, 9999, "lineNumber");
        this.areaCode = areaCode;
        this.prefix = prefix;
        this.lineNumber = lineNumber;
    }

    private static void rangCheck(int arg, int max, String name) {
        if (arg < 0 || arg > max) try {
            throw new IllegalAccessException();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof PhoneNumber)) return false;
        PhoneNumber pn = (PhoneNumber) o;
        return pn.areaCode == areaCode && pn.lineNumber == lineNumber && pn.prefix == prefix;
    }

    @Override
    public int hashCode() {

        return Objects.hash(areaCode, prefix, lineNumber);
    }
}
