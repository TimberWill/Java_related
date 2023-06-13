package com.systemcla.object;

/**
 * 作者：whl
 * 日期：2023-06-13 15:09
 * 描述：
 */
public class Demo02 {
    public static void main(String[] args) {
        String s1 = "kkv";
        String s2 = "kkv";
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
    }
}
