package com.whl.method;

/**
 * 作者：whl
 * 日期：2023-06-07 13:28
 * 描述：递归
 */
public class Demo03 {
    //5!为例
    public static void main(String[] args) {
        System.out.println(f(5));
    }
    public static int f(int i){
        if (i == 1){
            return 1;
        }else {
            return i*f(i-1);
        }
    }
}
