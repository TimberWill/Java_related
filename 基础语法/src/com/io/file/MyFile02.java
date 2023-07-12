package com.io.file;

import java.io.File;

/**
 * 作者：whl
 * 日期：2023-07-12 10:52
 * 描述：
 */
public class MyFile02 {

    public static void main(String[] args) {
        File file = new File("D:\\WHL\\b.txt");

        System.out.println(file.getName());//获得文件名称
        System.out.println(file.getPath());//获得文件路径，File
        System.out.println(file.getAbsoluteFile());//获得绝对路径，从盘符开始，返回值是File
        System.out.println(file.getAbsolutePath());//获得绝对路径，从盘符开始，返回值是String
        System.out.println(file.getParent());//获得上级的文件夹，返回值是String
        System.out.println(file.getParentFile());//获得上级的文件夹，返回值是File
        System.out.println(file.isFile());//判断File，是否是文件
        System.out.println(file.isDirectory());//判断File，是否是目录
        System.out.println(file.length());//代表内容的大小（单位是字节）

        System.out.println("-----------------了解即可-----------------");
        System.out.println(file.isHidden());//是否隐藏
        System.out.println(file.canRead());//是否可读
        System.out.println(file.canExecute());//是否可执行
        System.out.println(file.canWrite());//是否可写

    }
}
