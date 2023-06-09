package com.oop.demo14;

/**
 * 作者：whl
 * 日期：2023-06-08 19:52
 * 描述：内部类
 */
public class Outer {
    private static int number = 10;
    public void outer(){
        System.out.println("外部类的方法");
    }

    public class Inner{
        public  void getNumber(){
            System.out.println("number = "+number);
        }
    }
}
