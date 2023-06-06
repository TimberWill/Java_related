package com.whl.array;

/**
 * 作者：whl
 * 日期：2023-06-06 11:44
 * 描述：
 */
public class ArrayDemo03 {
    public static void main(String[] args) {
        //1. 打印所有元素
        int[] array = {6,7,8,9,10,1,2,3,4,5};
        for (int i = 0; i < array.length; i++) {
            System.out.println("array["+i+"]:"+array[i]);
        }
        //2. 计算所有元素的和
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("array的元素和为："+sum);
        //3. 查找最大元素
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            //下标从1开始减少一次循环
            if (array[i]>max){
                max = array[i];
            }
        }
        System.out.println("array中最大的元素为：" + max);
    }
}
