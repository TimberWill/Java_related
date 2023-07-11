package com.collections.map;

import java.util.HashMap;
import java.util.TreeMap;

/**
 * 作者：whl
 * 日期：2023-07-11 15:42
 * 描述：hashmap保存情况
 */
public class Demo03 {
    public static void main(String[] args) {
        System.out.println("-------------hashmap的保存情况------------");
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1,"hello");
        hashMap.put(1,"world");
        System.out.println(hashMap);
        hashMap.put(null,"kkv");
        hashMap.put(null,"ok");
        System.out.println(hashMap);
        System.out.println("-------------treemap的保存情况------------");
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1,"ok");
        treeMap.put(1,"ko");
        System.out.println(treeMap);
        treeMap.put(null,"hello");//会报错


    }
}
