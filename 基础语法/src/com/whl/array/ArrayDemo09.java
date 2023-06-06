package com.whl.array;

/**
 * 作者：whl
 * 日期：2023-06-06 18:05
 * 描述：
 */
public class ArrayDemo09 {
    public static void main(String[] args) {
        //1. 创建一个二维数组 11*11 ，0：表示没有棋子，1：表示黑棋，2：表示白棋
        int[][] ints = new int[11][11];
        ints[1][2] = 1;
        ints[2][3] = 2;
        //原始二维数组
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints[i].length; j++) {
                System.out.print(ints[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("----------------------------");
        //转换为稀疏数组保存
        //1.获取有效值的个数
        int count = 0;
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                if (ints[i][j] != 0){
                    count++;
                }
            }
        }
        System.out.println("有效值的个数为：" + count);

        //2.创建一个稀疏数组
        int[][] sparseArray = new int[count+1][3];
        sparseArray[0][0] = ints.length;
        sparseArray[0][1] = ints[0].length;
        sparseArray[0][2] = count;
        //3.遍历二维数组，将非零元素存入稀疏数组中
        int num = 0;
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints[i].length; j++) {
                if (ints[i][j] != 0){
                    num++;
                    sparseArray[num][0] = i;
                    sparseArray[num][1] = j;
                    sparseArray[num][2] = ints[i][j];
                }
            }
        }
        //4.输出稀疏数组
        for (int i = 0; i < sparseArray.length; i++) {
            for (int j = 0; j < sparseArray[i].length; j++) {
                System.out.print(sparseArray[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("---------------------------");
        //5.还原稀疏数组
        int[][] reArray = new int[sparseArray[0][0]][sparseArray[0][1]];
        for (int i = 1; i < sparseArray.length; i++) {
            reArray[sparseArray[i][0]][sparseArray[i][1]] = sparseArray[i][2];
        }
        //6.打印还原的数组
        for (int i = 0; i < reArray.length; i++) {
            for (int j = 0; j < reArray[i].length; j++) {
                System.out.print(reArray[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
