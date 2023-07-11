package com.collections.iterator;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 作者：whl
 * 日期：2023-07-11 17:08
 * 描述：迭代器 iterator
 */
public class Demo01 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        //使用迭代器进行集合的遍历
        //1. 获得迭代器对象
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){//2. 判断当前是否有下一个元素：hashNext()判断是否有下一个
            System.out.println(iterator.next());//3. 直接获得下一个元素

        }
    }
}
