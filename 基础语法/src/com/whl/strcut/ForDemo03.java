package com.whl.strcut;

/**
 * 作者：whl
 * 日期：2023-04-21 20:04
 * 描述：打印等边三角形(1,3,5,7,9)
 *     *|
 *    **|*
 *   ***|**
 *  ****|***
 * *****|****
 */
public class ForDemo03 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >i ; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
