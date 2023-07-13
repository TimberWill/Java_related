package com.io.iostream;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 作者：whl
 * 日期：2023-07-13 18:54
 * 描述：字符流，再增加字符数组
 */
public class Demo08 {
    public static void main(String[] args) throws IOException {
        //使用字符类进行文件读取
        FileReader reader = new FileReader("D:\\WHL\\a.txt");
        FileWriter writer = new FileWriter("D:\\WHL\\b.txt");

        char[] chars = new char[1024];
        int read = reader.read(chars);

        while (read != -1){
            writer.write(chars,0,read);
            read = reader.read(chars);
        }

        //关闭流
        reader.close();
        writer.close();

    }
}
