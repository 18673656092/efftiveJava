package com.test.effective.treaty5;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 * Created by zhuran on 2018/11/12 0012
 */
public class Person {
    private final Date birthDate;
    public Person(Date date){
        birthDate = date;
    }
    public boolean isBabyBoomer(){
        Calendar gmtCal = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        gmtCal.set(1946,Calendar.JANUARY,1,0,0,0);
        Date boomStart = gmtCal.getTime();
        gmtCal.set(1965,Calendar.JANUARY,1,0,0,0);
        Date boomEnd = gmtCal.getTime();
        return birthDate.compareTo(boomStart)>0 && birthDate.compareTo(boomEnd)<0;
    }
}
