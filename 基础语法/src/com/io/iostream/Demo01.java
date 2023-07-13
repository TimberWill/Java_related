package com.io.iostream;

import java.io.*;

/**
 * 作者：whl
 * 日期：2023-07-13 10:32
 * 描述：使用字节流完成文件内容的复制
 */
public class Demo01 {

    public static void main(String[] args) throws IOException {
        //1. 创建file对象，指向指定的文件
        File file1 = new File("D:\\WHL\\a.txt");
        File file2 = new File("D:\\WHL\\b.txt");

        //2. 创建字节输入输出流对象
        FileInputStream inputStream = new FileInputStream(file1);
        FileOutputStream outputStream = new FileOutputStream(file2);

        //3. 读到的内容
        int read = inputStream.read();//【读的是ASCII码】

        //4. 读完后，read为-1
        while (!(read == -1)){
            //5. 写入读到的内容
            outputStream.write(read);

            //写完再进行读取，否则会陷入死循环
            read = inputStream.read();
        }

        //6. 关闭流（先开的后关）
        outputStream.close();
        inputStream.close();
        //另外，file不是流，不用关，也关不了
    }
}
