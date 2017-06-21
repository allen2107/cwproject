package com.company.jaxb.xmlparser;

import com.company.jaxb.Envelope;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.StringReader;

public class XmlParser {

    public static Envelope parsexml(String xml) throws JAXBException{
        JAXBContext context = JAXBContext.newInstance(Envelope.class);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        return (Envelope) unmarshaller.unmarshal(new StringReader(xml));
    }
}