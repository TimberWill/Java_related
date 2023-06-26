package com.systemcla.string;


/**
 * 作者：whl
 * 日期：2023-06-26 16:21
 * 描述：字符串的替换
 */
public class Demo05 {
    public static void main(String[] args) {
        String str = new String("TimberWillTimber");
        String newStr1 = str.replaceFirst("Timber", "***");
        String newStr2 = str.replaceAll("Timber", "***");
        System.out.println(newStr1);
        System.out.println(newStr2);
    }
}
