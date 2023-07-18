package com.thread;

/**
 * 作者：whl
 * 日期：2023-07-18 11:45
 * 描述：例2-用runnable接口实现抢火车票
 */
public class ThreadTest05 implements Runnable{
    private int ticketNum = 10;

    @Override
    public void run() {
        while (true){
            if (ticketNum <= 0){
                break;
            }else {
                //可以设置延时效果
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println(Thread.currentThread().getName() + "抢到了第" + (ticketNum--) + "张票");
            }
        }
    }

    public static void main(String[] args) {
        ThreadTest05 threadTest05 = new ThreadTest05();
        new Thread(threadTest05,"小明").start();
        new Thread(threadTest05,"小刚").start();
        new Thread(threadTest05,"小兰").start();
    }
}
