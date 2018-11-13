package com.test.effective.treaty8;

/**
 * Created by zhuran on 2018/11/13 0013
 */
public class ColorPointEnd {
    private final String color;
    private final Point point;


    public ColorPointEnd(String color, Point point) {
        this.color = color;
        this.point = point;
    }

    public Point asPoint(){
        return point;
    }

    @Override
    public boolean equals(Object obj){
        if(!(obj instanceof ColorPointEnd)) return false;
        ColorPointEnd p = (ColorPointEnd)obj;
        return p.point.equals(point) && p.color.equals(color);
    }
}
