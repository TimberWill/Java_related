package com.whl.scanner;

import java.util.Scanner;

/**
 * 作者：whl
 * 日期：2023-04-20 20:33
 * 描述：例题（输入多个数字，并求其总和与平均数，每输入一个数字用回车确认，通过输入非数字来结束输入并执行结果）
 */
public class Demo04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int m = 0;//数量
        double sum = 0;//总和
        System.out.println("请输入数字：");
        while (scanner.hasNextDouble()){
            double v = scanner.nextDouble();
            m++;
            sum+=v;
        }
        System.out.println("总共的数字个数为："+ m);
        System.out.println("平均值为："+ (sum/m));

        scanner.close();
    }
}
