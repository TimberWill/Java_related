package com.oop.demo09;

/**
 * 作者：whl
 * 日期：2023-06-08 11:27
 * 描述：多态
 */
public class Application {
    public static void main(String[] args) {
        Student s1 = new Student();
        Person s2 = new Student();//父类的引用指向子类；都是学生，但是表现出多种状态
        Object s3 = new Student();

        s1.run();
        s2.run();

        s1.eat();
        ((Student) s2).eat();
    }
}
