package com.collections.set;

import java.util.HashSet;

/**
 * 作者：whl
 * 日期：2023-06-30 10:38
 * 描述：Set的遍历
 */
public class Demo02 {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("A");
        hashSet.add("E");
        hashSet.add("C");
        hashSet.add("D");
        hashSet.add("B");
        //for增强遍历
        for (String s : hashSet) {
            System.out.print(s + " ");
        }
    }

}
