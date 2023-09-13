package com.annotation;

import java.util.ArrayList;

/**
 * 作者：whl
 * 日期：2023-09-13 9:07
 * 描述：注解
 */
public class TestDemo01 extends Object{

    //@Override 代表重写的注解
    @Override
    public String toString() {
        return "TestDemo01{}";
    }

    //定义为废弃的方法
    @Deprecated
    public static void test(){
        System.out.println("Deprecated");
    }

    //镇压警告，比如此处的list没被调用，但是也不会显示警告
    @SuppressWarnings("all")
    public void test02(){
        ArrayList<String> list = new ArrayList<>();
    }

    public static void main(String[] args) {
        test();
    }
}
