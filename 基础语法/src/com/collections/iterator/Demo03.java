package com.collections.iterator;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 作者：whl
 * 日期：2023-07-11 17:58
 * 描述：集合的工具类
 */
public class Demo03 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        //快速在集合中添加元素
        Collections.addAll(list,101,2,32,24,5,61,17,100);
        System.out.println(list);

        //排序
        Collections.sort(list);//默认内部比较器
        System.out.println(list);

        //二分查找
        System.out.println("-----------二分查找------------");
        int i = Collections.binarySearch(list, 3);
        int j = Collections.binarySearch(list, 2);
        int k = Collections.binarySearch(list, 101);
        System.out.println(i);
        System.out.println(j);
        System.out.println(k);

        //获得集合中的最大值、最小值
        Integer min = Collections.min(list);
        Integer max = Collections.max(list);
        System.out.println(max);
        System.out.println(min);
    }

}
