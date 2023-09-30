package com.test;

/**
 * 作者：whl
 * 日期：2023-09-27 11:47
 * 描述：线程的实现方式，使用匿名类
 */
public class Test05 {
    public static void main(String[] args) {
        new Thread(() ->{
            System.out.println(Thread.currentThread().getName());
        }, "t1").start();

        new Thread(() ->{
            System.out.println(Thread.currentThread().getName());
        }, "t2").start();
    }
}
