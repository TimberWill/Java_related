package com.test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 作者：whl
 * 日期：2023-09-27 11:25
 * 描述：线程的实现方式，使用线程池
 */
public class ThreadPool {
    public static void main(String[] args) {
        //3. 创建线程池（服务）
        ExecutorService service = Executors.newFixedThreadPool(10);
        //4. 将Runnable或Callable接口实现类的对象，作为参数传递，调用线程池的execute方法，执行某个线程
        service.execute(new MyThread04());
        service.execute(new MyThread04());
        service.execute(new MyThread04());

        service.execute(new MyThread05());
        service.execute(new MyThread05());
        service.execute(new MyThread05());
        //5. 关闭连接
        service.shutdownNow();
    }

}
//1. 创建Runnable或Callable接口的实现类
class MyThread04 implements Runnable{
    //2. 实现run或call方法
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0){
                System.out.println( Thread.currentThread().getName() + ":" + i);
            }
        }
    }
}

class MyThread05 implements Runnable{
    //2. 实现run或call方法
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 1){
                System.out.println( Thread.currentThread().getName() + ":" + i);
            }
        }
    }
}
