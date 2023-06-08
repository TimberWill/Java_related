package com.oop.demo07;

/**
 * 作者：whl
 * 日期：2023-06-08 11:02
 * 描述：继承
 */
//派生类
public class Student extends Person {
    private String name = "whl";

    public Student(){
        //super();//隐式的,可以不写
        System.out.println("student无参被执行了");
    }
}
