package com.collections.list;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 作者：whl
 * 日期：2023-06-30 9:46
 * 描述：单端队列
 */
public class Demo06 {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        //入队
        queue.offer("A");
        queue.offer("B");
        queue.offer("C");
        System.out.println(queue);
        //出队
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
    }

}
