package com.company.jaxb.xmlparser;

import com.company.jaxb.Envelope;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.StringReader;

/**
 * Created by Guitar on 20.06.2017.
 */
public class XmlParser {

    public static void parsexml(String xml){
        try {
            System.out.println(xml);
            JAXBContext context = JAXBContext.newInstance(Envelope.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            Envelope customer = (Envelope) unmarshaller.unmarshal(new StringReader(xml));
            System.out.println(customer.getBody().size());
        } catch (JAXBException e) {
            System.out.println("whoops");
            e.printStackTrace();
        }
    }
}
