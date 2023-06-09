package com.exception;

/**
 * 作者：whl
 * 日期：2023-06-09 10:43
 * 描述：
 */
public class Test {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;

        try {
            //监控区域
            System.out.println(a/b);
        }catch (ArithmeticException e){
            //捕获异常
            System.out.println("程序出现异常，变量b不能被a整除");
        }finally {
            //处理善后工作
            System.out.println("finally");
        }
    }
}
