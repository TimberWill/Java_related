package com.io.file;

import java.io.File;

/**
 * 作者：whl
 * 日期：2023-07-12 15:02
 * 描述：重命名
 */
public class MyFile05 {
    public static void main(String[] args) {
        File file = new File("D:\\aa\\bb\\cc\\ok.txt");
        //将指定目录中的文件，重命名为ff.txt
        boolean b = file.renameTo(new File("D:\\aa\\bb\\ok.txt"));
        System.out.println(b);
    }

}
