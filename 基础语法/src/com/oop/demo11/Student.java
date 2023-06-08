package com.oop.demo11;

/**
 * 作者：whl
 * 日期：2023-06-08 18:45
 * 描述：static关键字
 */
public class Student {
    private static int age;
    private double score;

    public static void main(String[] args) {
        Student s1 = new Student();

        System.out.println(Student.age);
        System.out.println(s1.age);
        System.out.println(s1.score);
    }
}
