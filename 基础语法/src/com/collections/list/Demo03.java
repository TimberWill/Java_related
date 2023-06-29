package com.collections.list;

import java.util.ArrayList;
import java.util.List;

/**
 * 作者：whl
 * 日期：2023-06-29 18:33
 * 描述：集合中的集合遍历
 */
public class Demo03 {
    public static void main(String[] args) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> sublist1 = new ArrayList<>();
        List<Integer> sublist2 = new ArrayList<>();
        sublist1.add(1);
        sublist1.add(2);
        sublist1.add(3);
        sublist2.add(3);
        sublist2.add(2);
        sublist2.add(1);
        list.add(sublist1);
        list.add(sublist2);

        for (int i = 0; i < list.size(); i++) {
            List<Integer> list1 = list.get(i);
            for (Integer integer : list1) {
                System.out.print(integer + " ");
            }
        }
    }
}
