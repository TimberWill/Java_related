package com.collections.iterator;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 作者：whl
 * 日期：2023-07-11 18:56
 * 描述：集合类-同步集合
 */
public class Demo06 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        Collections.addAll(list1,2,5,3,77,8,34,51,96);

        //线程安全的
        Collections.synchronizedList(list1);//后续该list1就安全了，效率下降了

    }

}
