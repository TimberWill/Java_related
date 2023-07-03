package com.collections.set;

import java.util.Comparator;

/**
 * 作者：whl
 * 日期：2023-07-03 20:03
 * 描述：外部比较器
 */
public class MyCompa implements Comparator<Teacher> {
    @Override
    public int compare(Teacher o1, Teacher o2) {
        return o1.getAge() - o2.getAge();
    }
}
