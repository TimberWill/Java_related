package com.whl.base;

/**
 * 作者：whl
 * 日期：2023-04-20 17:39
 * 描述：
 */
public class Demo7 {
    //两种写法均可
    //修饰符，不存在先后顺序
    final static double PI = 3.14;
    static final double P2 = 3.14;

    public static void main(String[] args) {
        System.out.println(PI);
        System.out.println(P2);
    }
}
