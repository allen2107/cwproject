package com.company;


import org.eclipse.jetty.server.Server;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Bootstrap {

    private static Properties ServerProps = new Properties();
    private static FileInputStream in;

    public static void main(String[] args) {
        try {
            in = new FileInputStream("config.property");
            ServerProps.load(in);
            int http_port = Integer.parseInt(ServerProps.getProperty("http.port"));
            String tcp_addr = ServerProps.getProperty("tcp.dest.addr");
            String tcp_port = ServerProps.getProperty("tcp.dest.port");

            Server server = new Server(http_port);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
