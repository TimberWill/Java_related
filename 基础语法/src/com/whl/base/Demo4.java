package com.whl.base;

/**
 * 作者：whl
 * 日期：2023-03-31 13:56
 * 描述：
 */
public class Demo4 {
    public static void main(String[] args) {
        //注意内存一处问题
        int i = 128;
        byte b = (byte)i;

        System.out.println(i);
        System.out.println(b);
    }
}
