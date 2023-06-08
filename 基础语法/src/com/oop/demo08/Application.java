package com.oop.demo08;

/**
 * 作者：whl
 * 日期：2023-06-08 15:04
 * 描述：
 */
public class Application {
    public static void main(String[] args) {
        //方法的调用，只和左边的类型有关
        A a = new A();
        a.test();//A的静态方法

        //父类的引用指向了子类
        B b = new A();
        b.test();//B的静态方法
    }
}
