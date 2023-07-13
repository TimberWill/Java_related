package com.io.iostream;

import java.io.*;

/**
 * 作者：whl
 * 日期：2023-07-13 21:08
 * 描述：字符缓冲流
 */
public class Demo11 {
    public static void main(String[] args) throws IOException {
        //1. 创建字符流
        FileReader reader = new FileReader("D:\\WHL\\a.txt");
        FileWriter writer = new FileWriter("D:\\WHL\\b.txt");

        //2. 创建缓冲流
        BufferedReader bufferedReader = new BufferedReader(reader);
        BufferedWriter bufferedWriter = new BufferedWriter(writer);

        //3. 读写操作
        char[] chars = new char[1024];

        int read = bufferedReader.read(chars);
        while (read != -1){
            bufferedWriter.write(chars,0,read);
            read = bufferedReader.read(chars);

        }

        //4. 关闭流
        bufferedWriter.close();
        bufferedReader.close();


    }

}
