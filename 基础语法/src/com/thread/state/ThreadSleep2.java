package com.thread.state;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 作者：whl
 * 日期：2023-09-11 14:19
 * 描述：打印系统时间
 */
public class ThreadSleep2 {
    public static void main(String[] args) {
        //系统的当前时间
        Date startTime = new Date(System.currentTimeMillis());

        while (true){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(new SimpleDateFormat("HH:mm:ss").format(startTime));
            //更新系统时间
            startTime = new Date(System.currentTimeMillis());
        }

    }

}
