package com.whl.scanner;

import java.util.Scanner;

/**
 * 作者：whl
 * 日期：2023-04-20 20:06
 * 描述：Scanner nextLine
 */
public class Demo02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("使用nextLine方式接收：");

        if (scanner.hasNextLine()){
            String nextLine  = scanner.nextLine();
            System.out.println("输出的内容为：" + nextLine);
        }

        scanner.close();
    }
}
