package com.systemcla.string;

/**
 * 作者：whl
 * 日期：2023-06-28 15:55
 * 描述：String面试题
 */
public class InterviewTest2 {
    public static void main(String[] args) {
        String s0 = "5";
        String s1 = "52";
        String s2 = "5" + "2";
        String s3 = "5" + 2;
        String s4 = s0 + 2;//new了

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1 == s4);
    }
}
