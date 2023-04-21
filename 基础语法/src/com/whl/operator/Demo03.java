package com.whl.operator;

/**
 * 作者：whl
 * 日期：2023-04-20 18:14
 * 描述：逻辑运算符
 */
public class Demo03 {
    public static void main(String[] args) {
        int c = 4;
        boolean d = (c>5)&&(c++ >1);
        System.out.println("d:" + d);
        System.out.println("c:" + c);
    }
}
