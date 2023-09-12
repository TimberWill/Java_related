package com.thread.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 作者：whl
 * 日期：2023-09-12 14:23
 * 描述：测试lock锁
 */
public class TestLock {
    public static void main(String[] args) {
        TestLock2 testLock2 = new TestLock2();
        new Thread(testLock2).start();
        new Thread(testLock2).start();
        new Thread(testLock2).start();
    }
}
class TestLock2 implements Runnable{
    //加入可重入锁，私有的
    private final Lock lock = new ReentrantLock();
    int ticketNum = 10;

    @Override
    public void run() {
        while (true){
            try {
                //加锁
                lock.lock();
                if (ticketNum > 0){
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(ticketNum--);
                }else {
                    break;
                }
            }finally {
                //解锁
                lock.unlock();
            }
        }

    }
}
