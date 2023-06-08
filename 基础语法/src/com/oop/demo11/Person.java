package com.oop.demo11;

/**
 * 作者：whl
 * 日期：2023-06-08 18:49
 * 描述：static关键字
 */
public class Person {
    {
        System.out.println("匿名代码块");
    }

    static {
        System.out.println("静态代码块");
    }

    public Person() {
        System.out.println("构造器");
    }

    public static void main(String[] args) {
        Person person = new Person();
        System.out.println("========================");
        Person person2 = new Person();

    }
}
