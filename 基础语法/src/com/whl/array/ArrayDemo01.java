package com.whl.array;


/**
 * 作者：whl
 * 日期：2023-05-30 19:56
 * 描述：
 */
public class ArrayDemo01 {
    public static void main(String[] args) {
        int[] array01;//1. 声明数组
        array01 = new int[10];//2. 创建一个数组
                              //可以存放10个int类型的数字
        int[] array02 = new int[5];//声明和创建合成一句
        int value = 1;//3. 给数组中元素赋值
        int sum = 0;
        for (int i = 0; i < array01.length; i++) {
            array01[i] = value++;
            sum += array01[i];
            System.out.print(array01[i]+"\t");
        }
        System.out.println();
        System.out.println("总和为：" + sum);
        
    }
}
