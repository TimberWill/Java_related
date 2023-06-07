package com.oop.demoProject;

/**
 * 作者：whl
 * 日期：2023-06-07 15:05
 * 描述：启动类
 */
public class Application {
    public static void main(String[] args) {
        Person person = new Person();
    }
}
/*
public static void main(String[] args) {
        //类是抽象的，需要实例化类
        //类实例化后，会返回一个自己的对象
        //student对象就是一个Student类的具体实例！
        //同一个类下面可以产生不同的对象
        Student student = new Student();
        //默认值打印
        System.out.println(student.name);//null
        System.out.println(student.age);//0

        student.study();
    }
 */