package com.systemcla.string;

import java.util.Scanner;

/**
 * 作者：whl
 * 日期：2023-06-26 16:40
 * 描述：恶意字符替换
 */
public class Demo06 {
    public static void main(String[] args) {
        System.out.println("请输入：");
        Scanner scanner = new Scanner(System.in);
        String next = scanner.next();//用户输入的内容
        boolean b = next.contains("大傻逼");
        if (b){
            String s = next.replaceAll("大傻逼", "小可爱");
            System.out.println(s);
        }else {
            System.out.println(next);
        }
    }
}
