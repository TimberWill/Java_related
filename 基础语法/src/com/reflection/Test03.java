package com.reflection;

import java.lang.annotation.ElementType;

/**
 * 作者：whl
 * 日期：2023-09-13 13:43
 * 描述：不同类型的Class
 */
public class Test03 {
    public static void main(String[] args) {
        Class c1 = Object.class;//类
        Class c2 = Comparable.class;//接口
        Class c3 = String[].class;//一维数组
        Class c4 = int[][].class;//二维数组
        Class c5 = Override.class;//注解
        Class c6 = ElementType.class;//枚举类型
        Class c7 = Integer.class;//基本类型
        Class c8 = void.class;//void
        Class c9 = Class.class;//Class

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println(c5);
        System.out.println(c6);
        System.out.println(c7);
        System.out.println(c8);
        System.out.println(c9);

        //两个长度不一样的数组，只要类型一样，底层的class的hashcode依旧是一样的
        //也就是说：只要元素类型和维度一样，就是同一个class
        int[] a = new int[10];
        int[] b = new int[100];
        System.out.println(a.getClass().hashCode());
        System.out.println(b.getClass().hashCode());

    }
}
