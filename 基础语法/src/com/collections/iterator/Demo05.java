package com.collections.iterator;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 作者：whl
 * 日期：2023-07-11 18:46
 * 描述：集合类-复制
 */
public class Demo05 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        Collections.addAll(list1,2,5,3,77,8,34,51,96);
        Collections.addAll(list2,21,67);
        //集合的复制
        Collections.copy(list1,list2);//将list2中的元素复制到list1中（前提：list1.size() >= list2.size()）
        System.out.println(list1);

    }
}
