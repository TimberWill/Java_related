package com.thread.highLevel;

/**
 * 作者：whl
 * 日期：2023-09-12 15:01
 * 描述：生产者消费者问题
 */
public class TestPC {
    public static void main(String[] args) {
        SynContainer synContainer = new SynContainer();
        new Producer(synContainer).start();
        new Consumer(synContainer).start();

    }
}
//生产者
class Producer extends Thread{
    SynContainer container;
    public Producer(SynContainer container){
        this.container = container;
    }

    //生产
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            try {
                container.push(new Chicken(i));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("生产者生产了：第" + i + "只鸡");
        }

    }
}
//消费者
class Consumer extends Thread{
    SynContainer container;
    public Consumer(SynContainer container){
        this.container = container;
    }

    //消费
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            try {
                System.out.println("消费者消费了：id为" + container.pop().id + "的鸡");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

//产品
class Chicken{
    int id;//产品编号
    //构造方法
    public Chicken(int id) {
        this.id = id;
    }
}

//容器，缓冲区
class SynContainer{
    //定义容器大小
    Chicken[] chickens = new Chicken[10];
    //容器计数器
    int count = 0;

    //生产者放入产品
    public synchronized void push(Chicken chicken) throws InterruptedException {
        //容器满了
        if (count == chickens.length){
            //通知消费者消费，生产者等待
            this.wait();
        }
        //容器没有满，生产者放入
        chickens[count] = chicken;
        count++;
        //通知消费者消费
        this.notifyAll();
    }

    //消费者取出产品
    public synchronized Chicken pop() throws InterruptedException {
        //容器为0
        if (chickens.length == 0){
            //等待生产者生产
            this.wait();
        }

        //否则消费
        count--;
        Chicken c = chickens[count];
        //吃完了，通知生产者生产
        this.notifyAll();
        return c;

    }

}