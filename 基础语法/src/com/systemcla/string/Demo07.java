package com.systemcla.string;

/**
 * 作者：whl
 * 日期：2023-06-26 18:07
 * 描述：去除空格、字符串的比较
 */
public class Demo07 {
    public static void main(String[] args) {
        //去除字符串首尾空格
        String s = new String(" tim   be r   ");
        System.out.println(s.trim());
        //字符串的比较方法
        String str1 = "abc";
        String str2 = "AB";
        System.out.println(str1.compareTo(str2));
        System.out.println(str1.compareToIgnoreCase(str2));
    }
}
