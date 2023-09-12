package com.thread.state;

/**
 * 作者：whl
 * 日期：2023-09-11 15:40
 * 描述：线程插队
 */
public class ThreadJoin implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("线程vip来了"+i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadJoin threadJoin = new ThreadJoin();
        Thread thread = new Thread(threadJoin);
        thread.start();

        //启动主线程
        for (int i = 0; i < 500; i++) {
            if (i == 250){
                thread.join();//插队
            }
            System.out.println("主线程" + i);
        }

    }
}
