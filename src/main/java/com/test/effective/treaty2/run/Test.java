package com.test.effective.treaty2.run;

import com.test.effective.treaty2.build.NutritionFacts;

/**
 * Created by zhuran on 2018/11/12 0012
 * 遇到多个构造器参数时要考虑用构建器
 */
public class Test {
    public static void main(String[] args) {
        NutritionFacts nutritionFacts = new NutritionFacts.Builder(240,8).calories(1).carbohydrate(1).fat(1).sodium(1).build();
        System.out.println(nutritionFacts);
    }
}
