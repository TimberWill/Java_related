package com.collections.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 作者：whl
 * 日期：2023-07-11 16:09
 * 描述：Map集合的遍历
 */
public class Demo05 {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1,"one");
        hashMap.put(2,"two");
        hashMap.put(3,"three");

        //方法一，通过key来取值
        Set<Integer> keySet = hashMap.keySet();
        for (Integer key : keySet) {
            System.out.println("<" + key + "," + hashMap.get(key) + ">");
        }

        //方式二，仅获取value
        Collection<String> values = hashMap.values();
        for (String value : values) {
            System.out.println(value);
        }

        //方法三，拿到key和value的entry集合
        Set<Map.Entry<Integer, String>> entrySet = hashMap.entrySet();
        for (Map.Entry<Integer, String> entry : entrySet) {
            System.out.println("<" + entry.getKey() + "," + entry.getValue() + ">");

        }
        //直接输出entry
        System.out.println("----------直接输出entry-------------");
        for (Map.Entry<Integer, String> entry : entrySet) {
            System.out.println(entry);//entry代表的是一组key，value的节点
        }
    }
}
