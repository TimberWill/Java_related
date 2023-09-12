package com.thread.state;

/**
 * 作者：whl
 * 日期：2023-09-11 13:30
 * 描述：停止线程
 */
public class ThreadStop implements Runnable{
    //1. 设置标志位
    private boolean flag = true;
    //2. 设置一个公开的方法转换标志位
    public void stop(){
        this.flag = false;
    }

    public static void main(String[] args) {
        ThreadStop threadStop = new ThreadStop();
        new Thread(threadStop).start();

        for (int i = 0; i < 1000; i++) {
            //外部标志位
            System.out.println("main线程" + i);

            if (i == 900){
                //3. 调用自定义的stop方法，让线程停止
                threadStop.stop();
                System.out.println("线程该停止了");
            }
        }
    }

    @Override
    public void run() {
        int i = 0;
        while (flag){
            System.out.println("run...Thread" + i++);
        }
    }
}
