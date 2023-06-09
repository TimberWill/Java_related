package com.oop.demo14;

/**
 * 作者：whl
 * 日期：2023-06-08 19:55
 * 描述：
 */
public class Application {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.getNumber();
    }
}
