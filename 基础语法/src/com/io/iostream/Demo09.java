package com.io.iostream;

import java.io.*;

/**
 * 作者：whl
 * 日期：2023-07-13 19:50
 * 描述：字节缓冲流
 */
public class Demo09 {
    public static void main(String[] args) throws IOException {
        //1. 创建字节流对象
        FileInputStream inputStream = new FileInputStream("D:\\WHL\\a.txt");
        FileOutputStream outputStream = new FileOutputStream("D:\\WHL\\b.txt");

        //2. 创建缓冲流对象
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream);

        //3. 读写操作
        //从缓冲去读取一个内容
        int read = bufferedInputStream.read();
        while (read != -1){
            bufferedOutputStream.write(read);
            read = bufferedInputStream.read();
        }
        //4.关闭流
        bufferedOutputStream.close();
        bufferedInputStream.close();

    }

}
