package com.whl.array;

/**
 * 作者：whl
 * 日期：2023-06-06 14:21
 * 描述：三维数组
 */
public class ArrayDemo06 {
    public static void main(String[] args) {
        int[][][] a = {{{1,2,3},{4,5,6}},{{7,8,9},{10,11,12}}};
        printArray(a);
    }
    //打印方法
    public static void printArray(int[][][] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    System.out.print(array[i][j][k]+" ");
                }
            }
        }
    }
}
