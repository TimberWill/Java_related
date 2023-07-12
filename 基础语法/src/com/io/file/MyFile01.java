package com.io.file;

import java.io.File;

/**
 * 作者：whl
 * 日期：2023-07-12 10:17
 * 描述：File类
 */
public class MyFile01 {
    public static void main(String[] args) {
        //创建file对象，指向a.txt文件（注意，不能创建文件，只能指向一个创建好了的文件）
        File file1 = new File("D:\\a.txt");
        //创建file对象，指向WHL文件夹（目录）
        File file2 = new File("D:\\WHL");

        //写法2：也可以分开写(父目录+子目录)
        File file3 = new File("D:\\WHL", "b.txt");
        //写法3
        File file4 = new File(new File("D:\\WHL"), "b.txt");
        //写法4
        File file5 = new File(file2, "b.txt");

        System.out.println(file1);
        System.out.println(file2);
        System.out.println(file3);
        System.out.println(file4);
        System.out.println(file5);
    }
}
