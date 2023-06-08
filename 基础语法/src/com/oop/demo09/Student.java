package com.oop.demo09;

/**
 * 作者：whl
 * 日期：2023-06-08 11:02
 * 描述：继承
 */
//派生类
public class Student extends Person {
    @Override
    public void run() {
        System.out.println("son run");
    }

    public void eat(){
        System.out.println("son eat");
    }
}
