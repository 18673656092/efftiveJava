package com.test.effective.treaty8.run;

import com.test.effective.treaty8.ColorPointEnd;
import com.test.effective.treaty8.Point;

/**
 * Created by zhuran on 2018/11/13 0013
 * equals传递性:A=B,B=C,那么A=C
 */
public class Test2 {
    public static void main(String[] args) {
        Point point = new Point(1,1);
        ColorPointEnd rp = new ColorPointEnd("RED",point);
        ColorPointEnd bp = new ColorPointEnd("BLUE",point);
        System.out.println(point.equals(rp));
        System.out.println(rp.equals(point));
        System.out.println(rp.equals(bp));
    }
}
