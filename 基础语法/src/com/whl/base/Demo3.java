package com.whl.base;

/**
 * 作者：whl
 * 日期：2023-03-31 10:41
 * 描述：
 */
public class Demo3 {
    public static void main(String[] args) {
        //整数扩展：  进制   二进制0b  八进制0  十进制  十六进制0x
        //分别输出不同进制的10
        int a = 10;
        int b = 010;//八进制10
        int c = 0x10;//十六进制10

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println("=========================================");

        //--------------------------------------------------------------
        //浮点数扩展
        //一个神奇的事情
        float i = 0.1F;
        double j = 1.0/10;
        System.out.println(i == j);
        System.out.println("i = "+ i);
        System.out.println("j = "+j);

        float d1 = 2342114434F;
        float d2 = d1 + 1;
        System.out.println(d1 == d2);
        System.out.println("d1 = "+d1);
        System.out.println("d2 = "+d2);
        System.out.println("=============================================");

        char x = 'a';
        char y = '种';
        System.out.println(x);
        System.out.println(y);
        System.out.println((int)x);
        System.out.println((int)y);
        System.out.println("=============================================");

        //转义字符
        //\t 表示制表符
        System.out.println("com.whl.base.Hello\nworld!");
        System.out.println("==============================================");

        String s1 = new String("hello world!");
        String s2 = new String("hello world!");
        System.out.println(s1 == s2);
        String s3 = "hello world!";
        String s4 = "hello world!";
        System.out.println(s3 == s4);

        //布尔值扩展
        boolean flag1 = true;
        if (flag1 == true){
            //新手
        }
        if (flag1){
            //老手
        }
        //两者等价，但是用第二种
    }
}
