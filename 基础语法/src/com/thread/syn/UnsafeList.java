package com.thread.syn;

import java.util.ArrayList;

/**
 * 作者：whl
 * 日期：2023-09-12 11:32
 * 描述：不安全的集合
 */
public class UnsafeList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < 10000; i++) {
            new Thread(() -> {
                synchronized (list){
                    list.add(Thread.currentThread().getName());
                }

            }).start();

        }
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(list.size());
    }
}
