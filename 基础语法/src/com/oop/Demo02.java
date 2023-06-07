package com.oop;

/**
 * 作者：whl
 * 日期：2023-06-07 10:38
 * 描述：
 */
public class Demo02 {
    public static void main(String[] args) {
        //静态方法（含static）：通过类名.方法名来调用
        Student.say();
        //非静态方法（不含static）：需要实例化类，用new关键字
        Teacher teacher = new Teacher();
        teacher.teach();
    }
}
