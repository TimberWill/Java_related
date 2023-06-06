package com.whl.array;


import java.util.Arrays;

/**
 * 作者：whl
 * 日期：2023-06-06 15:10
 * 描述：Array类
 */
public class ArrayDemo07 {
    public static void main(String[] args) {
        int[] a = {4,5,6,1,2,3};
        System.out.println(Arrays.toString(a));//打印数组元素
        //这种工具类也可以自己写，但是不建议重复造轮子，可以了解原理
        printArray(a);
        Arrays.sort(a);//数组排序
        System.out.println(Arrays.toString(a));
        //数组填充
        Arrays.fill(a, 2,3,0);
        System.out.println(Arrays.toString(a));
    }
    //自己写打印方法
    public static void printArray(int[] array){
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if (i == array.length-1){
                System.out.print(array[i]);
            }else {
                System.out.print(array[i]+", ");
            }
        }
        System.out.print("]");
    }
}
