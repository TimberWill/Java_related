package com.collections.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

/**
 * 作者：whl
 * 日期：2023-07-11 14:50
 * 描述：map
 */
public class Demo02 {
    public static void main(String[] args) {

        HashMap<Integer, String> hashMap = new HashMap<>();//底层是hash表
        TreeMap<Integer, String> treeMap = new TreeMap<>();//底层是红黑树
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();//底层是hash表、链表

        //添加元素
        hashMap.put(1,"ok");
        hashMap.put(2,"yes");
        hashMap.put(3,"no");
        hashMap.put(4,"en");
        hashMap.put(5,"hi");
        hashMap.put(6,"ing");
        //根据key获取value
        String s = hashMap.get(1);
        System.out.println(s);

        //移除
        //方法1. 根据map的key进行元素的移除 (若元素不存在，返回的是null，否则返回移除对象的value)
        String remove = hashMap.remove(1);
        System.out.println(hashMap);
        //方法2. 根据map的key、value同时进行移除，返回的是boolean类型的值
        boolean remove1 = hashMap.remove(2, "yes");
        System.out.println(hashMap);

        //替换，对元素进行替换
        hashMap.replace(6, "哈哈");
        System.out.println(hashMap);

        //清空，key和value都清空
        hashMap.clear();
        System.out.println(hashMap);
    }

}
