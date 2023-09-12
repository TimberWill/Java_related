package com.thread.state;

/**
 * 作者：whl
 * 日期：2023-09-11 18:58
 * 描述：线程优先级
 */
public class ThreadPriority {
    public static void main(String[] args) {
        MyPriority myPriority = new MyPriority();
        Thread t1 = new Thread(myPriority);
        Thread t2 = new Thread(myPriority);
        Thread t3 = new Thread(myPriority);

        //先设置优先级再启动
        t1.start();
        System.out.println(t1.getPriority());

        t2.setPriority(2);
        t2.start();
        System.out.println(t2.getPriority());

        t3.setPriority(8);
        t3.start();
        System.out.println(t3.getPriority());

    }

}
class MyPriority implements Runnable{
    //打印线程的名字和优先级
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "-->" + Thread.currentThread().getPriority());
    }
}