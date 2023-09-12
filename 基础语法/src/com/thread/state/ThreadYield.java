package com.thread.state;

/**
 * 作者：whl
 * 日期：2023-09-11 15:02
 * 描述：线程礼让
 */
public class ThreadYield {
    public static void main(String[] args) {
        MyYeild myYeild = new MyYeild();

        new Thread(myYeild,"a").start();
        new Thread(myYeild,"b").start();
    }
}

class MyYeild implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "线程开始执行");
        Thread.yield();//线程礼让
        System.out.println(Thread.currentThread().getName() + "线程停止执行");
    }
}