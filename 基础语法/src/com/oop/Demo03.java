package com.oop;

/**
 * 作者：whl
 * 日期：2023-06-07 14:49
 * 描述：值传递
 */
public class Demo03 {
    public static void main(String[] args) {
        int a = 1;
        System.out.println("a的值为："+ a);
        change(a);
        System.out.println("a的值为："+ a);
    }
    public static void change(int a){
        a = 10;
    }
}
