package com.exception;

/**
 * 作者：whl
 * 日期：2023-06-09 11:24
 * 描述：
 */
public class Demo03 {

    public static void main(String[] args) {
        try {
            new Demo03().test(1,0);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        } finally {
        }
    }

    public void test(int a, int b)throws ArithmeticException{
        if (b == 0){
            throw new ArithmeticException();
        }
        System.out.println(a/b);
    }
}
