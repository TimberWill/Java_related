package com.exception;


/**
 * 作者：whl
 * 日期：2023-06-09 11:11
 * 描述：
 */
public class Demo02 {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;
        try {
            System.out.println(a/b);
        } catch (Exception e) {
            e.printStackTrace();//打印错误的栈信息
        } finally {
        }
    }
}
