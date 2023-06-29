package com.collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 作者：whl
 * 日期：2023-06-29 18:15
 * 描述：
 */
public class Demo02 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(123);
        list.add(456);
        list.add(789);
        //------------for循环遍历---------------
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
        //------------增强for循环遍历---------------
        for (Integer integer : list) {
            System.out.print(integer + " ");
        }

    }

}
