package com.whl.scanner;

import java.util.Scanner;

/**
 * 作者：whl
 * 日期：2023-04-20 20:15
 * 描述：scanner的其他方法
 */
public class Demo03 {
    public static void main(String[] args) {
        //nextInt() 输入整数
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入整数：");
        if (scanner.hasNextInt()){
            int i = scanner.nextInt();
            System.out.println("整数数据："+ i);
        }else {
            System.out.println("输入的不是整数");
        }

        //nextFloat输出小数
        System.out.println("请输入小数：");
        if (scanner.hasNextFloat()){
            float f = scanner.nextFloat();
            System.out.println("小数数据："+ f);
        }else {
            System.out.println("输入的不是小数");
        }

        scanner.close();
    }
}
