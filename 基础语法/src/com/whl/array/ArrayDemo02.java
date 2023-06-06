package com.whl.array;

/**
 * 作者：whl
 * 日期：2023-06-05 19:14
 * 描述：
 */
public class ArrayDemo02 {
    public static void main(String[] args) {
        //静态初始化：创建+赋值
        int[] a = {1,2,3,4,5,6};
        System.out.println(a[0]);

        //动态初始化：包含默认初始化
        int[] ints = new int[10];
        ints[0] = 3;
        System.out.println(ints[0]);
        System.out.println(ints[1]);//默认初始化值为0
        System.out.println(ints[2]);//默认初始化值为0
        System.out.println(ints[3]);//默认初始化值为0
        System.out.println(ints[4]);//默认初始化值为0

    }
}
