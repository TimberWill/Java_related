package com.systemcla.packaging;

/**
 * 作者：whl
 * 日期：2023-06-14 14:57
 * 描述：面试题
 */
public class InterviewTest {
    public static void main(String[] args) {
        int a = 10;
        Integer b = 10;
        System.out.println(a == b);//true 自动拆箱，b拆箱成基本类型
        System.out.println(b.equals(a));//true 自动装箱，a装箱成引用类型(比较值)

        Integer a2 = new Integer(10);
        Integer b2 = new Integer(10);
        System.out.println(a2 == b2);//false
        System.out.println(a2.equals(b2));//true 比较值

        Integer a3 = 10;
        Integer b3 = 10;
        System.out.println(a3 == b3);//true 没用new，拿到的10的缓存地址值一样
        System.out.println(a3.equals(b3));//true

        Integer a4 = 200;
        Integer b4 = 200;
        System.out.println(a4 == b4);//false 有new
        System.out.println(a4.equals(b4));//true
    }
}
