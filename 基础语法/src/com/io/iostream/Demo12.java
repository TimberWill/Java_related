package com.io.iostream;

import java.io.*;

/**
 * 作者：whl
 * 日期：2023-07-13 21:15
 * 描述：一行一行的读
 */
public class Demo12 {
    public static void main(String[] args) throws IOException {
        //1. 创建字符流
        FileReader reader = new FileReader("D:\\WHL\\a.txt");
        FileWriter writer = new FileWriter("D:\\WHL\\b.txt");

        //2. 创建缓冲流
        BufferedReader bufferedReader = new BufferedReader(reader);
        BufferedWriter bufferedWriter = new BufferedWriter(writer);

        //3. 读写操作
        //按照行进行读，如果当前的内容不为空，则继续读
        String line = bufferedReader.readLine();
        while (line != null){
            bufferedWriter.write(line);
            bufferedWriter.newLine();
            line = bufferedReader.readLine();
        }

        //4. 关闭流
        bufferedWriter.close();
        bufferedReader.close();


    }
}
