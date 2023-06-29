package com.collections.list;

import java.util.ArrayList;
import java.util.List;

/**
 * 作者：whl
 * 日期：2023-06-29 9:49
 * 描述：list集合常用方法介绍
 */
public class Demo01 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        //添加
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(list);//将list中的全部元素添加到list2中
        System.out.println(list);
        System.out.println(list2);
        //修改
        list.set(2,6);
        System.out.println(list);
        //获得元素
        System.out.println(list.get(2));
        //删除元素
        list.remove(1);//根据下标进行删除
        list.remove(new Integer(1));//根据内容进行删除
        System.out.println(list);
        //集合的长度
        System.out.println("list的长度：" + list.size());
        System.out.println("list2的长度：" + list2.size());
        //根据内容返回数组下标(存在相同元素，优先返回第一次出现的)，不存在返回-1
        System.out.println("list中元素6的下标：" + list.indexOf(6));
        System.out.println("list2中元素6的下标：" + list2.indexOf(6));
        //判断集合中是否包含指定的元素
        System.out.println("list是否包含元素6：" + list.contains(6));
        System.out.println("list2是否包含元素7：" + list2.contains(7));

        //清空内容
        list.removeAll(list);
        list2.clear();
        System.out.println(list);
        System.out.println(list2);
        //判空
        System.out.println(list.isEmpty());
        System.out.println(list2.isEmpty());


    }


}
