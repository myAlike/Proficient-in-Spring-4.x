package com.smart._03resource;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.springframework.core.io.*;


public class _01FileSourceExample {

    public static void main(String[] args) {
        try {
            String filePath = "F:/2、书籍/java/spring全家桶/精通Spring 4.x  企业应用开发实战/Proficient-in-Spring-4.x/chapter4/src/main/resources/conf/file1.txt";
            //使用系统文件路径方式加载文件
            WritableResource res1 = new PathResource(filePath);
            //使用类路径加载文件
            Resource res2 = new ClassPathResource("conf/file1.txt");
            //使用WritableResoutce接口读取资源文件
            OutputStream stream1 = res1.getOutputStream();
            stream1.write("欢迎光临\n小春论坛".getBytes());
            stream1.close();
            //使用Resource接口读取资源文件
            InputStream ins1 = res1.getInputStream();
            InputStream ins2 = res2.getInputStream();

            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            int i;
            while ((i = ins1.read()) != -1) {
                baos.write(i);
            }
            System.out.println(baos.toString());

            System.out.println("res1:" + res1.getFilename());
            System.out.println("res2:" + res2.getFilename());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
