package com.webserver.core;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 */


public class WebServer {
    private ServerSocket serverSocket;
    public WebServer() {
        try {
            System.out.println("start");
            serverSocket = new ServerSocket(8088);
            System.out.println("successful");

        } catch (IOException e) {
            e.printStackTrace();
        }
    };
    public void start() {
        try {
            System.out.println("等待客户端连接...");
            Socket socket = serverSocket.accept();
            System.out.println("一个客户端连接了!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        WebServer server = new WebServer();
        server.start();
    }
}

