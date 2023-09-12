package com.thread.syn;

/**
 * 作者：whl
 * 日期：2023-09-12 9:48
 * 描述：不安全的买票
 */
public class UnsafeByTicket {
    public static void main(String[] args) {
        ByTicket byTicket = new ByTicket();
        new Thread(byTicket, "苦逼的我").start();
        new Thread(byTicket, "牛逼的你们").start();
        new Thread(byTicket, "可恶的黄牛党").start();
    }
}
class ByTicket implements Runnable{
    private int ticketNum = 5000;//票的总数
    private boolean flag = true;//终止的标志位
    @Override
    public void run() {
        //买票
        while (flag){
            try {
                buy();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    //加入同步锁synchronized，锁的是this
    private synchronized void buy() throws InterruptedException {
        //判断是否有票
        if (ticketNum <= 0){
            flag = false;
            return;
        }
        //模拟延时
        Thread.sleep(100);
        //买票
        System.out.println(Thread.currentThread().getName() + "买到了第" + ticketNum-- + "张票");
    }
}


