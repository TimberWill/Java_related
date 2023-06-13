package com.systemcla.object;


/**
 * 作者：whl
 * 日期：2023-06-13 13:15
 * 描述：常用类-object
 */
public class Demo01 extends Object {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        System.out.println(a==b);//true

        String str = "abc";
        String str2 = "abc";
        System.out.println(str == str2);//true
        System.out.println(str.equals(str2));//true

        String str23 = new String("abc");
        String str22 = new String("abc");
        System.out.println(str23 == str22);//false
        System.out.println(str23.equals(str22));//true
    }
}
