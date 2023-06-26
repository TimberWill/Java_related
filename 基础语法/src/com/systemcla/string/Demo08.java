package com.systemcla.string;

/**
 * 作者：whl
 * 日期：2023-06-26 18:36
 * 描述：字符串的拼接
 */
public class Demo08 {
    public static void main(String[] args) {
        String s1 = "ok";
        String s2 = "hello";
        System.out.println(s1 + s2);//方法1
        System.out.println(s1.concat(s2));//方法2
        System.out.println(s1.concat(s2).concat(s1));
    }
}
