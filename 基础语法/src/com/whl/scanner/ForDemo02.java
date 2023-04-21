package com.whl.scanner;

/**
 * 作者：whl
 * 日期：2023-04-21 19:19
 * 描述：用while或for循环输出1-1000之间能被5整除的数，并且每行输出3个
 */
public class ForDemo02 {
    public static void main(String[] args) {
        int count = 0;//计数器

        for (int i = 0; i <= 1000; i++) {
            if (i % 5 == 0){
                count++;
                System.out.print(i + "\t");
                if (count % 3 == 0){
                    System.out.print("\n");
                }
            }
        }
    }
}
