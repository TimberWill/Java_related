package com.collections.set;

import java.util.HashSet;

/**
 * 作者：whl
 * 日期：2023-06-30 10:08
 * 描述：
 */
public class Demo01 {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        //添加
        hashSet.add("A");
        hashSet.add("E");
        hashSet.add("C");
        hashSet.add("D");
        hashSet.add("B");
        System.out.println(hashSet);
        hashSet.add("C");
        System.out.println(hashSet);
        //删除
        hashSet.remove("D");
        System.out.println(hashSet);
        //大小
        System.out.println(hashSet.size());
        //清空
        hashSet.clear();
        System.out.println(hashSet);
        //addAll
        HashSet<String> subSet = new HashSet<>();
        subSet.add("u");
        subSet.add("w");
        subSet.add("v");
        hashSet.addAll(subSet);
        System.out.println(hashSet);
    }
}
