package com.thread;

/**
 * 作者：whl
 * 日期：2023-07-18 11:18
 * 描述：runnable接口
 */
public class ThreadTest03 implements Runnable{


    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("run：" + i);
        }
    }

    public static void main(String[] args) {
        ThreadTest03 threadTest03 = new ThreadTest03();
        Thread thread = new Thread(threadTest03);
        thread.start();

        for (int i = 0; i < 20; i++) {
            System.out.println("main：" + i);
        }

    }
}
