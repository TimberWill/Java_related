package com.test;

/**
 * 作者：whl
 * 日期：2023-09-26 15:26
 * 描述：线程的实现方法一，继承thread类
 */
public class Test01 {
    public static void main(String[] args) {
        //3. new子类对象。
        MyThread myThread = new MyThread();
        //4. 该对象调用start()方法，执行线程。
        myThread.start();
    }
}
//1. 创建一个继承于Thread类的子类。
class MyThread extends Thread{
    //2. 重写该子类中的run方法（也就是将该子类线程的操作声明在run()中）。
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("收入+" + i);
        }
    }
}