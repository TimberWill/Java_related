package com.exception.demo04;

/**
 * 作者：whl
 * 日期：2023-06-09 14:33
 * 描述：
 */
public class Test {
    static void test(int a) throws MyException {
        System.out.println("传递的参数为：" + a);
        if (a > 10){
            throw new MyException(a);
        }
        System.out.println("ok");
    }

    public static void main(String[] args) {
        try {
            test(11);
        } catch (MyException e) {
            System.out.println("my exception is " + e);
        } finally {
        }
    }
}
