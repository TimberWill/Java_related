package com.whl.scanner;

/**
 * 作者：whl
 * 日期：2023-04-21 19:25
 * 描述：九九乘法表
 */
public class ForDemo03 {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + "x" + j + "=" + (i*j) +"\t");
            }
            System.out.println();
        }
    }
}
