package com.thread;

/**
 * 作者：whl
 * 日期：2023-07-18 12:07
 * 描述：模拟龟兔赛跑比赛
 */
public class ThreadTest06 implements Runnable{
    private String winner;

    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            //模拟兔子睡觉
            if (Thread.currentThread().getName().equals("兔子") && (i%10 == 0)){
                //设置兔子每10步睡20毫秒
                try {
                    Thread.sleep(20);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(Thread.currentThread().getName() + "跑了" + i + "步");

            //判断比赛是否结束
            boolean flag = gameOver(i);
            //完成比赛了就不执行
            if (flag){
                break;
            }



        }
    }

    //判断比赛是否结束
    private boolean gameOver(int steps){
        if (winner != null){
            return true;
        }else if (steps >= 100){
            winner = Thread.currentThread().getName();
            System.out.println("winner是" + winner);
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
        ThreadTest06 threadTest06 = new ThreadTest06();

        new Thread(threadTest06,"兔子").start();
        new Thread(threadTest06,"乌龟").start();

    }
}
