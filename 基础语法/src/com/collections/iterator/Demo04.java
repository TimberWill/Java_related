package com.collections.iterator;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 作者：whl
 * 日期：2023-07-11 18:38
 * 描述：Collections工具类
 */
public class Demo04 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        //快速在集合中添加元素
        Collections.addAll(list,101,2,32,24,5,61,17,100);
        System.out.println(list);

        //fill方法
        Collections.fill(list,null);
        System.out.println(list);
    }
}
