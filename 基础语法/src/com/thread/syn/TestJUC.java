package com.thread.syn;

import java.util.concurrent.CopyOnWriteArrayList;

/**
 * 作者：whl
 * 日期：2023-09-12 12:12
 * 描述：测试JUC，安全类型的集合
 */
public class TestJUC {
    public static void main(String[] args) {
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
        for (int i = 0; i < 10000; i++) {
            new Thread(() ->{
               list.add(Thread.currentThread().getName());
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
