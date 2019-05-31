package com.jin.ex01.pyrmont;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @Authror lijin
 * @Date 2019/5/28 18:50
 */
public class Request {

    private InputStream input;
    private String url;


    public Request(){

    }

    public Request(InputStream input){

    }

    public void parse() throws IOException {
        StringBuilder request=new StringBuilder(2048);
        int i;
        byte[] arr=new byte[input.available()];

    }




}
