package com.thread.state;

/**
 * 作者：whl
 * 日期：2023-09-11 13:51
 * 描述：线程休眠——模拟倒计时
 */
public class ThreadSleep {
    public static void main(String[] args) {
        try {
            tenDown();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    //模拟倒计时
    public static void tenDown() throws InterruptedException {
        int num = 10;
        while (true){
            Thread.sleep(1000);
            System.out.println(num--);
            if (num <= 0){
                break;
            }
        }
    }
}
