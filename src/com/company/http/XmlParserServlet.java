package com.company.http;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class XmlParserServlet extends HttpServlet {
        private String xml;

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        xml = req.getParameter("xmltext");
        System.out.println("xml:  " + xml);
    }
}
