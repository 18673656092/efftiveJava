package com.test.effective.treaty5;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 * Created by zhuran on 2018/11/12 0012
 */
public class PersonStatic {
    private final Date birthDate;
    private static final Date BOOMEND;
    private static final Date BOOMSTART;

    static {
        Calendar gmtCal = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        gmtCal.set(1946, Calendar.JANUARY, 1, 0, 0, 0);
        BOOMSTART = gmtCal.getTime();
        gmtCal.set(1965, Calendar.JANUARY, 1, 0, 0, 0);
        BOOMEND = gmtCal.getTime();
    }

    public PersonStatic(Date birthDate) {
        this.birthDate = birthDate;
    }

    public boolean isBabyBoomer() {
        return birthDate.compareTo(BOOMSTART) > 0 && birthDate.compareTo(BOOMEND) < 0;
    }
}
