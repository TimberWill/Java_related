package com.whl.scanner;

import java.util.Scanner;

/**
 * 作者：whl
 * 日期：2023-04-20 19:57
 * 描述：scanner对象
 */
public class Demo01 {
    public static void main(String[] args) {
        //创建一个扫描器对象，用于接收键盘数据
        Scanner scanner = new Scanner(System.in);

        System.out.println("使用next方式接收：");
        //判断用户有没有输入字符串
        if (scanner.hasNext()){
            //使用next方式接收
            String next = scanner.next();
            System.out.println("输出的内容为：" + next);
        }

        //注意：用完scanner要关闭，节约资源
        scanner.close();
    }
}
