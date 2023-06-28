package com.systemcla.string;

/**
 * 作者：whl
 * 日期：2023-06-28 14:45
 * 描述：StringBuilder的扩容机制
 */
public class Demo14 {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("haha");
        System.out.println("底层数组长度：" + builder.capacity());//创建后为4+16=20
        for (int i = 0; i < 50; i++) {
            builder.append("a");//42,86
        }
        System.out.println("底层数组长度：" + builder.capacity());//

    }
}
