package com.systemcla.string;

import java.util.Scanner;
import java.util.UUID;

/**
 * 作者：whl
 * 日期：2023-06-25 18:00
 * 描述：String类
 */
public class Demo01 {
    public static void main(String[] args) {
        System.out.println("-----------------[1] String 对象的创建----------------");
        String timber1 = new String("timber啊");
        String timber2 = "timber啊";
        String s1 = "";//在内存中开辟空间，但内容为空
        String s2 = null;//在内存中没有开辟空间

        System.out.println("-----------------[2] String 最简单方法----------------");
        System.out.println(timber1.length());//字符串的长度
        System.out.println(timber1.startsWith("ti"));//判断字符串的开头
        System.out.println(timber1.endsWith("啊"));//判断字符串的结尾
        System.out.println(timber1.isEmpty());//判断字符串是否为空
        System.out.println(timber1.toUpperCase());//将字符串大写
        System.out.println(timber1.toLowerCase());//将字符串小写

        System.out.println("-----------------[3] String 常用方法----------------");
        System.out.println(timber1.charAt(2));//取出第x个字符
        System.out.println(timber1.substring(0,6));//表示下标[A,B)的字符串的截取

        System.out.println(timber1.indexOf(98));//ASCII码为98的字符的下标，98对应的是b【不常用】
        System.out.println(timber1.indexOf('b'));//与上面方法等价【常用】
        System.out.println(timber1.indexOf("b"));//与上面方法等价【常用】
        System.out.println(timber1.indexOf("ber"));//不管字符串写多长，只会返回第一个字符的
        System.out.println(timber1.indexOf("br"));//字符不存在，返回-1
        System.out.println(timber1.indexOf("e",2));//返回指定子字符串在此字符串中第一次出现处的索引，从指定的索引开始。
        System.out.println(timber1.lastIndexOf("i"));//返回改字符最后一次出现的下标

        System.out.println("-----------------[4] String 的应用----------------");
        //将图片地址改为xxx.后缀
        System.out.println("请输入图片地址：");
        Scanner scanner = new Scanner(System.in);
        String next = scanner.next();
        int i = next.lastIndexOf(".");
        String substring = next.substring(i);//获取.xxx，图片的后缀名
        String str = UUID.randomUUID().toString();//生成随机字符串，作为图片的名称
        String fileName = str + substring;
        System.out.println(fileName);


    }
}
