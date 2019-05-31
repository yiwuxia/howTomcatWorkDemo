package com.jin.ex01.pyrmont;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Authror lijin
 * @Date 2019/5/28 18:50
 * 监听端口
 * 获取请求路径
 * 根据请求路径返回信息
 *
 */
public class HttpServer {

    public static  final String WEB_ROOOT=
            System.getProperty("user.dir")+ File.separator+"webroot";
    public static  final String shutdown_command="/SHUTDOWN";
    private  boolean shutdown=false;

    public static void main(String[] args) {
        HttpServer server=new HttpServer();
        server.await();
    }

    private void await() {

        ServerSocket serverSocket=null;
        int port=8080;
        try {
            serverSocket=new ServerSocket(port);
            while (!shutdown){
                Socket socket=null;
                InputStream input=null;
                OutputStream output=null;
                System.out.println("我在等待连接");
                socket=serverSocket.accept();
                System.out.println("收到请求");
                input=socket.getInputStream();
                Request request=new Request(input);
                System.out.println("解析完毕");
                socket.getOutputStream().write(55);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
