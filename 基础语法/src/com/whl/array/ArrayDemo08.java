package com.whl.array;

import java.util.Arrays;

/**
 * 作者：whl
 * 日期：2023-06-06 15:43
 * 描述：冒泡排序
 */
public class ArrayDemo08 {
    public static void main(String[] args) {
        int[] a = {1,5,3,7,8,2};
        bubbleSort(a);
        System.out.println(Arrays.toString(a));
    }
    public static void bubbleSort(int[] array){
        //升序为例
        //外层循环：n个数需要n-1次
        int temp ;
        int count = 0;//排序进行的次数
        for (int i = 0; i < array.length-1; i++) {
            //内存循环：当前数值与后一位数值作比较
            boolean flag = false;
            for (int j = 0; j < array.length-1-i; j++) {
                if (array[j] > array[j+1]){
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    flag = true;
                }
            }
            count++;
            if (flag == false){
                break;
            }
        }
        System.out.println(count);
    }
}
