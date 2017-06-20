package com.company;


import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.webapp.WebAppContext;

import java.io.FileInputStream;
import java.util.Properties;

public class Bootstrap {

    private static Properties ServerProps = new Properties();
    private static FileInputStream in;
    static final Logger logger = Logger.getLogger(Bootstrap.class);

    public static void main(String[] args) {
        try {
            PropertyConfigurator.configure("src/logger/log4j.properties");
            logger.info("Started.");

            in = new FileInputStream("config.property");
            ServerProps.load(in);
            int http_port = Integer.parseInt(ServerProps.getProperty("http.port"));
            String tcp_addr = ServerProps.getProperty("tcp.dest.addr");
            String tcp_port = ServerProps.getProperty("tcp.dest.port");

            Server server = new Server(http_port);

            WebAppContext context = new WebAppContext();
            context.setDescriptor("webapp/WEB-INF/web.xml");
            context.setResourceBase("webapp");
            context.setContextPath("/");
            context.setParentLoaderPriority(true);

            server.setHandler(context);


            server.start();
            server.dumpStdErr();
            server.join();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}