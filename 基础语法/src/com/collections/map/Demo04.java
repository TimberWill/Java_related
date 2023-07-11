package com.collections.map;

import java.util.HashMap;

/**
 * 作者：whl
 * 日期：2023-07-11 16:04
 * 描述：错误写法示例
 */
public class Demo04 {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = null;
        hashMap.put(1,"one");//会出现空指针异常
        System.out.println(hashMap);

    }
}
