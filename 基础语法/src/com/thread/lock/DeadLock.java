package com.thread.lock;

/**
 * 作者：whl
 * 日期：2023-09-12 13:55
 * 描述：死锁——模拟化妆（口红、镜子）
 */
public class DeadLock {
    public static void main(String[] args) {
        Makeup g1 = new Makeup(1, "白雪公主");
        Makeup g2 = new Makeup(0, "灰姑凉");
        g1.start();
        g2.start();
    }
}
//口红
class Lipstick{

}
//镜子
class Mirror{

}
class Makeup extends Thread{
    //唯一的资源，用static
    static Lipstick lipstick = new Lipstick();
    static Mirror mirror = new Mirror();

    int choice;//选择
    String girlName;//不同的实体

    //构造方法
    public Makeup(int choice, String girlName){
        this.choice = choice;
        this.girlName = girlName;

    }

    @Override
    public void run() {
        try {
            makeup();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    //化妆的方法
    private void makeup () throws InterruptedException {
        if (choice == 0){
            synchronized (lipstick){
                System.out.println(this.girlName + "获得口红");
                Thread.sleep(1000);
            }
            synchronized (mirror){
                System.out.println(this.girlName + "获得镜子");
            }
        }else {
            synchronized (mirror){
                System.out.println(this.girlName + "获得镜子");
                Thread.sleep(1000);
            }
            synchronized (lipstick){
                System.out.println(this.girlName + "获得口红");
            }
        }
    }
}