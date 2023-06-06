package com.whl.array;

/**
 * 作者：whl
 * 日期：2023-06-06 11:51
 * 描述：增强for循环、数组作为方法入参、打印数组元素
 */
public class ArrayDemo04 {
    public static void main(String[] args) {
        int[] arrays = {1,2,3,4,5,6};
        //jdk 1.5以上版本开始有的，省去了数组下标
//        for (int array : arrays) {
//            System.out.println(array);
//        }
//        //数组作为方法的参数
//        printArray(arrays);
        int[] reverse = reverse(arrays);
        printArray(arrays);//打印反转后的
        printArray(reverse);//打印反转后的
    }
    //打印数组元素
    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }

    //反转数组
    public static int[] reverse(int[] array){
        int[] ints = new int[array.length];
        for (int i = 0, j = array.length-1; i < array.length; i++,j--) {
               ints[j] = array[i];
        }
        return ints;
    }
}
