package com.collections.list;

import java.util.LinkedList;

/**
 * 作者：whl
 * 日期：2023-06-29 23:21
 * 描述：LinkedList中特有的方法
 */
public class Demo04 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.addFirst(1);//头插
        list.addFirst(2);
        list.addLast(3);//尾插
        System.out.println(list);
        System.out.println(list.getLast());//获得尾节点（方法1）为null时会报错
        System.out.println(list.getFirst());//获得头节点（方法1）为null时会报错
        System.out.println(list.peekLast());//获得尾节点（方法2）为null时返回null
        System.out.println(list.peekLast());//获得头节点（方法2）为null时返回null

        System.out.println(list.removeLast());//删除尾节点（方法1）为null时会报错
        System.out.println(list.removeFirst());//删除头节点（方法1）为null时会报错
        System.out.println(list.pollLast());//删除尾节点（方法2）为null时返回null
        System.out.println(list.pollFirst());//删除头节点（方法2）为null时返回null
    }
}
