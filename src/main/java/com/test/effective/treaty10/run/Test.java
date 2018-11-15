package com.test.effective.treaty10.run;

import com.test.effective.treaty10.Animal;

/**
 * Created by zhuran on 2018/11/14 0014
 * 始终要覆盖toString,让它的返回值包含所有信息，提供一种编程式的访问捷径
 */
public class Test {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.setAge(1);
        animal.setName("dog");
        System.out.println(animal);
    }
}
