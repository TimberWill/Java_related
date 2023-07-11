package com.collections.iterator;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 * 作者：whl
 * 日期：2023-07-11 17:36
 * 描述：listIterator
 */
public class Demo02 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        ListIterator<Integer> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
            //注意：若没有前一个for循环，不能直接使用，指针指向第一个元素，前一个元素为空
        }
    }

}
