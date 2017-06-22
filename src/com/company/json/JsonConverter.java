package com.company.json;


import com.company.jaxb.Envelope;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonConverter {

    public static String envelopeToJson(Envelope envelope) throws JsonProcessingException{
        ObjectMapper mapper = new ObjectMapper();

        return mapper.writeValueAsString(envelope);
    }
}