package com.test;

/**
 * 作者：whl
 * 日期：2023-09-26 18:15
 * 描述：线程的实现方法二，实现runnable接口
 */
public class Test02 {
    public static void main(String[] args) {
        //3. 创建实现类的对象。
        MyThread02 myThread02 = new MyThread02();
        //4. 将该对象作为传参传递到Thread类中，并new Thread类的对象。
        Thread t1 = new Thread(myThread02);
        Thread t2 = new Thread(myThread02);
        //5. Thread类的对象调用start()方法。
        t1.start();
        t2.start();
    }
}
//1. 创建一个实现Runnable接口的类。
class MyThread02 implements Runnable{

    //2. 在实现类中实现Runnable的run方法。
    @Override
    public void run() {
        System.out.println("我是线程" + Thread.currentThread().getName());
    }
}