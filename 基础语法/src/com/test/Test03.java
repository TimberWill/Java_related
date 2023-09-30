package com.test;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * 作者：whl
 * 日期：2023-09-26 18:53
 * 描述：线程的实现方式，实现Callable接口
 */
public class Test03 {
    public static void main(String[] args) {
        //3. 创建Callable接口实现类的对象；
        MyThread03 myThread03 = new MyThread03();
        //4. 将该对象作为传参，传递到FutureTask的构造器中，创建FutureTask的对象；
        FutureTask futureTask = new FutureTask(myThread03);
        //5. 将FutureTask的对象作为传参，传递到Thread类的构造器中，创建Thread类对象，调用start方法；
        new Thread(futureTask).start();
        //6. 获取Callable中call方法的返回值；
        try {
            Object o = futureTask.get();
            //打印返回值
            System.out.println(o);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
//1. 创建一个实现Callable接口的类；
class MyThread03 implements Callable{
    //2. 实现该类的call方法，也就是将线程的操作逻辑写到run方法中；
    @Override
    public Object call() throws Exception {
        String s = new String("我是线程" + Thread.currentThread().getName());
        return s;
    }
}
