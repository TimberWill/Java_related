package com.thread;

/**
 * 作者：whl
 * 日期：2023-07-17 10:08
 * 描述：
 */
public class ThreadTest01 extends Thread{
    public static void main(String[] args) {
        ThreadTest01 demo01 = new ThreadTest01();
        demo01.start();

        for (int i = 0; i < 1000; i++) {
            System.out.println("我是主方法：" + i);
        }
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("我是子线程：" + i);
        }
    }
}
