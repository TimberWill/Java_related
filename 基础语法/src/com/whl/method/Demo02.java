package com.whl.method;

/**
 * 作者：whl
 * 日期：2023-06-07 12:09
 * 描述：可变参数
 */
public class Demo02 {
    public static void main(String[] args) {
        printI(1,2,3,4,5,6,7);
        printJ(1,2,3,4,5,6,7);
    }
    public static void printI(int...i){
        System.out.println(i);
    }
    public static void printJ(int...i){
        System.out.println(i[0]);
    }
}
