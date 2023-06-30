package com.collections.list;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 作者：whl
 * 日期：2023-06-30 9:54
 * 描述：双端队列
 */
public class Demo07 {
    public static void main(String[] args) {
        Deque<String> deque = new LinkedList<>();
        //从头部插入
        deque.offerFirst("A");
        //从尾部插入
        deque.offerLast("B");
        System.out.println(deque);

        //从头部删除
        deque.pollFirst();
        System.out.println(deque);
        //从尾部删除
        deque.pollLast();
        System.out.println(deque);
    }

}
