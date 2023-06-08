package com.oop.demo10;

/**
 * 作者：whl
 * 日期：2023-06-08 11:27
 * 描述：instanceof
 */
public class Application {
    public static void main(String[] args) {
        Object o = new Student();
        //Object > Person > Student
        //Object > Person > Teacher
        //Object > String
        System.out.println(o instanceof Student);
        System.out.println(o instanceof Person);
        System.out.println(o instanceof Object);
        System.out.println(o instanceof Teacher);
        System.out.println(o instanceof String);
        System.out.println("===========================");

        Person person = new Student();
        System.out.println(person instanceof Student);
        System.out.println(person instanceof Person);
        System.out.println(person instanceof Object);
        System.out.println(person instanceof Teacher);
//        System.out.println(person instanceof String);//编译报错
        System.out.println("===========================");

        Student student = new Student();
        System.out.println(student instanceof Student);
        System.out.println(student instanceof Person);
        System.out.println(student instanceof Object);
//        System.out.println(student instanceof Teacher);//编译报错
//        System.out.println(student instanceof String);//编译报错

    }
}
