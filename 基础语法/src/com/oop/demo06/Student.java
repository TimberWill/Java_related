package com.oop.demo06;

/**
 * 作者：whl
 * 日期：2023-06-08 11:02
 * 描述：继承
 */
//派生类
public class Student extends Person {
    private String name = "whl";
    public void test(String name){
        System.out.println(name);//wyf
        System.out.println(this.name);//whl
        System.out.println(super.name);//human
    }
}
