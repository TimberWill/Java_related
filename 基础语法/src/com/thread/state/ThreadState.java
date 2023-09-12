package com.thread.state;

/**
 * 作者：whl
 * 日期：2023-09-11 16:22
 * 描述：观测线程状态
 */
public class ThreadState {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(()->{
            for (int i = 0; i < 5; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("-------");
            }
        });
        
        //观察状态
        Thread.State state = thread.getState();
        System.out.println(state);//NEW

        //观察状态
        thread.start();//启动线程
        state = thread.getState();
        System.out.println(state);//RUN

        while (state != Thread.State.TERMINATED){
            Thread.sleep(1000);
            state = thread.getState();//更新线程状态
            System.out.println(state);//输出状态
        }
    }
}
