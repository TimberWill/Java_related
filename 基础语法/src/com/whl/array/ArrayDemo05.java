package com.whl.array;

/**
 * 作者：whl
 * 日期：2023-06-06 14:07
 * 描述：二维数组
 */
public class ArrayDemo05 {
    public static void main(String[] args) {
        //即：4行2列数组
        /*
             1 2    doubleArray[0]
             2 3    doubleArray[1]
             3 4    doubleArray[2]
             4 5    doubleArray[3]
         */
        int[][] doubleArray = {{1,2},{2,3},{3,4},{4,5}};
        //直接打印doubleArray[0]，打印的是地址，可以借助取值方法来输出。
        System.out.println(doubleArray[0]);
        printArray(doubleArray[0]);
        System.out.println(doubleArray[0][0]);
        System.out.println(doubleArray[0][1]);
        //打印长度
        System.out.println(doubleArray.length);
        System.out.println(doubleArray[0].length);
        //打印每一个元素
        for (int i = 0; i < doubleArray.length; i++) {
            for (int j = 0; j < doubleArray[i].length; j++) {
                System.out.print(doubleArray[i][j] + " ");
            }
        }
    }

    //打印数组元素
    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
}
