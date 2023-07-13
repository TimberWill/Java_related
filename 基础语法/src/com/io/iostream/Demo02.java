package com.io.iostream;

import java.io.*;

/**
 * 作者：whl
 * 日期：2023-07-13 11:17
 * 描述：升级版
 */
public class Demo02 {
    public static void main(String[] args) throws IOException {
        //1. 创建file对象，指向指定的文件
        File file1 = new File("D:\\WHL\\a.txt");
        File file2 = new File("D:\\WHL\\b.txt");

        //2. 创建字节输入输出流对象
        FileInputStream inputStream = new FileInputStream(file1);
        FileOutputStream outputStream = new FileOutputStream(file2);

        //3.使用byte数组进行存储
        byte[] bytes = new byte[1024];
        int read = inputStream.read(bytes);//读到的是内容的长度，为了避免存入不必要的空格，读的时候，设置下标

        while (read != -1){
            outputStream.write(bytes,0,read);
            read = inputStream.read(bytes);
        }

        //6. 关闭流（先开的后关）
        outputStream.close();
        inputStream.close();
    }


}
