package com.thread.summary;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * 作者：whl
 * 日期：2023-09-12 17:04
 * 描述：回顾线程的创建
 */
public class TestThread {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        new MyThread1().start();
        new Thread(new MyThread2()).start();
        FutureTask<Integer> futureTask = new FutureTask<Integer>(new MyThread3());
        new Thread(futureTask).start();
        Integer integer = futureTask.get();
        System.out.println(integer);
    }

}
//1. 继承Thread类
class MyThread1 extends Thread{
    @Override
    public void run() {
        System.out.println("my thread 1");
    }
}

//2. 实现Runnable接口
class MyThread2 implements Runnable{

    @Override
    public void run() {
        System.out.println("my thread 2");
    }
}

//3. 实现Callable接口
class MyThread3 implements Callable<Integer>{

    @Override
    public Integer call() throws Exception {
        System.out.println("my thread 3");
        return 100;
    }
}