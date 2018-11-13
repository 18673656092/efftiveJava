package com.test.effective.treaty8;

import java.util.Objects;

/**
 * Created by zhuran on 2018/11/13 0013
 * equals传递性
 */
class ColorPoint extends Point {

    private final String color;

    public ColorPoint(int x, int y, String color) {
        super(x, y);
        this.color = color;
    }
    //这里如果继承父类的equals方法就会出现有颜色的点和无颜色的点相同的情况,所以我们重写equals方法
    /*    @Override
        public boolean equals(Object obj){
            if(!(obj instanceof ColorPonit)) return false;
            return super.equals(obj) && ((ColorPonit) obj).color.equals(color);
    }*/
    //以上的equals方法虽然解决了之前的问题，但是针对有色点比较无色点和无色点比较有色点会出现不用情况不满足对称性
    //所以我们需要让混合比较时候忽略颜色信息
    @Override
    public boolean equals(Object obj){
        if(!(obj instanceof Point)) return false;
        if(!(obj instanceof ColorPoint)) return obj.equals(this);
        return super.equals(obj) && ((ColorPoint) obj).color.equals(color);
    }
    //上叙方法虽然解决了对称性问题却失去的传递性,一个蓝色(1,1)点equals无颜色(1,1)点Ture,一个红色(1,1)点equals无颜色(1,1)点Ture
    //但是一个蓝色(1,1)点equals一个红色(1,1)点False
    //虽然没有一种令人满意的办法可以又扩展又增加值组件，我们可以利用复合优先于继承,让Point成为ColorPoint的一个私有域

}

public class Point {
    private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Point)) return false;
        Point p = (Point) obj;
        return p.x == x && p.y == y;
    }

    @Override
    public int hashCode() {

        return Objects.hash(x, y);
    }
}
