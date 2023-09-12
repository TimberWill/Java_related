package com.thread.highLevel;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 作者：whl
 * 日期：2023-09-12 16:54
 * 描述：线程池练习
 */
public class ThreadPool {
    public static void main(String[] args) {
        //1. 创建服务，创建线程池
        ExecutorService service = Executors.newFixedThreadPool(10);//参数为线程池大小

        service.execute(new MyThread());
        service.execute(new MyThread());
        service.execute(new MyThread());
        service.execute(new MyThread());

        //2. 关闭连接
        service.shutdownNow();
    }

}
class MyThread implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
