package com.io.file;

import java.io.File;

/**
 * 作者：whl
 * 日期：2023-07-12 11:30
 * 描述：案例1-输出指定目录下的内容
 */
public class MyFile03 {
    public static void main(String[] args) {
        File file = new File("D:\\WHL");
        File[] files = file.listFiles();
        for (File f : files) {
            if (f.isDirectory()){
                System.out.println(f + "是一个文件夹");
            }else {
                System.out.println(f + "是一个文件");
            }
        }
    }

}
