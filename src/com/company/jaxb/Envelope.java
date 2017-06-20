package com.company.jaxb;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="Envelope")
public class Envelope {
    @XmlElementWrapper(name="body")
    ArrayList<Payment> body;

    public void setBody(ArrayList<Payment> body){
        this.body=body;
    }

    public List<Payment> getBody(){
        return body;
    }

    public Envelope(){
        this.body = new ArrayList<>();
    }

}
