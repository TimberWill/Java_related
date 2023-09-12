package com.thread.highLevel;

/**
 * 作者：whl
 * 日期：2023-09-12 16:06
 * 描述：信号法
 */
public class TestPC2 {
    public static void main(String[] args) {
        Show show = new Show();
        new Actor(show).start();
        new Watcher(show).start();
    }
}

//演员和观众的共同对象——show
//演员——表演节目
class Actor extends Thread{
    Show show;
    public Actor(Show show){
        this.show = show;
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            if (i % 2 == 0){
                try {
                    this.show.act("心动的信号");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }else {
                try {
                    this.show.act("披荆斩棘的哥哥");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

//观众——观看节目
class Watcher extends Thread{
    Show show;
    public  Watcher(Show show){
        this.show = show;
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            if (i % 2 == 0){
                try {
                    this.show.watch();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }else {
                try {
                    this.show.watch();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

//节目
//1. 演员表演，观众等待 T
//2. 观众观看，演员等待 F
class Show{
    String content;//表演的内容
    boolean flag = true;//标志位

    //表演
    public synchronized void act(String content) throws InterruptedException {
        if (!flag){
            this.wait();
        }
        System.out.println("演员表演了：" + content);
        //通知观众观看
        this.notifyAll();
        this.content = content;
        this.flag = !this.flag;
    }

    //观看
    public synchronized void watch() throws InterruptedException {
        if (flag){
            this.wait();
        }
        System.out.println("观众观看了：" + content);
        //通知演员表演
        this.notifyAll();
        this.flag = ! this.flag;
    }
}