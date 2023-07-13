package com.io.iostream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 作者：whl
 * 日期：2023-07-13 16:31
 * 描述：只传地址，不new file
 */
public class Demo05 {
    public static void main(String[] args) throws IOException {
        //2. 创建字节输入输出流对象
        FileInputStream inputStream = new FileInputStream("D:\\WHL\\a.txt");
        FileOutputStream outputStream = new FileOutputStream("D:\\WHL\\b.txt",true);//内容追加

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
