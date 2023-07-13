package com.io.iostream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 作者：whl
 * 日期：2023-07-13 18:23
 * 描述：字符流
 */
public class Demo07 {
    public static void main(String[] args) throws IOException {
        //使用字符类进行文件读取
        FileReader reader = new FileReader("D:\\WHL\\a.txt");
        FileWriter writer = new FileWriter("D:\\WHL\\b.txt");

        int read = reader.read();

        while (read != -1){
            writer.write(read);
            read = reader.read();
        }

        //关闭流
        reader.close();
        writer.close();
    }

}
