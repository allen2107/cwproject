package com.company.http;

import com.company.Bootstrap;
import com.company.jaxb.xmlparser.XmlParser;
import com.company.json.JsonConverter;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.bind.JAXBException;
import java.io.IOException;

public class XmlParserServlet extends HttpServlet {
    private String xml;
    private String jsonString;
    private static final Logger logger = Logger.getLogger(XmlParserServlet.class);


    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PropertyConfigurator.configure("src/logger/log4j.properties");
        try {
            xml = req.getParameter("xmltext");
            jsonString=JsonConverter.envelopeToJson(XmlParser.parsexml(xml));
            System.out.println(jsonString);
            logger.info("JSON RESULT:" + jsonString);
        } catch (JAXBException e) {
            logger.error(e.getMessage());
            resp.setContentType("text/html");
            resp.getWriter().print("MR. ERROR");
            resp.sendError(400);
        } catch(JsonProcessingException e){
            logger.error(e.getMessage());
        }
    }

}
