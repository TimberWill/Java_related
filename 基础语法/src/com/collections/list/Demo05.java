package com.collections.list;

import java.util.Stack;

/**
 * 作者：whl
 * 日期：2023-06-30 9:30
 * 描述：栈
 */
public class Demo05 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        //入栈
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack);
        //出栈
        System.out.println(stack.pop());
        System.out.println(stack.pop());

    }
}
