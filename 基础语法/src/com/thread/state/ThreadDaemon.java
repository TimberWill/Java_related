package com.thread.state;

/**
 * 作者：whl
 * 日期：2023-09-12 9:09
 * 描述：守护线程
 */
public class ThreadDaemon {
    public static void main(String[] args) {
        God god = new God();
        You you = new You();

        Thread thread = new Thread(god);
        thread.setDaemon(true);//默认为false，也就是用户线程，这里设置true，即为守护线程
        thread.start();

        new Thread(you).start();
    }
}

//上帝
class God implements Runnable{

    @Override
    public void run() {
        while (true){
            System.out.println("上帝守护着你");
        }
    }
}

//你(人活不过三万天)
class You implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 36500; i++) {
            System.out.println("你好好活着！");
        }
        System.out.println("good bye !");
    }
}