package com.jin.ex01.pyrmont;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/**
 * @Authror lijin
 * @Date 2019/5/28 18:50
 */
public class Demo {
    public static void main(String[] args) throws Exception {

        File file=new File("E:\\tmp\\test.txt");
        InputStream is=new FileInputStream(file);
        System.out.println(is.available());
        is.close();

    }
}
