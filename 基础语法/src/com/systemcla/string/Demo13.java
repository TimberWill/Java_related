package com.systemcla.string;

/**
 * 作者：whl
 * 日期：2023-06-28 14:45
 * 描述：StringBuilder的扩容机制
 */
public class Demo13 {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("haha");
        System.out.println("底层数组长度：" + builder.capacity());//创建后为4+16
        for (int i = 0; i < 16; i++) {
            builder.append("a");
        }
        System.out.println("底层数组长度：" + builder.capacity());//未超过容量20
        builder.append("a");
        System.out.println("底层数组长度：" + builder.capacity());//超过容量，进行扩容：20*2+2 = 42
        for (int i = 0; i < 21; i++) {
            builder.append("a");
        }
        System.out.println("底层数组长度：" + builder.capacity());//未超过容量42
        builder.append("a");
        System.out.println("底层数组长度：" + builder.capacity());//超过容量，进行扩容: 42*2+2 = 86
    }
}
