package com.company.jaxb;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="Envelope")
public class Envelope {

    @XmlElementWrapper(name="Body")
    @XmlElement(name="sendPayment", namespace = "wsapi:Payment")
    private ArrayList<Payment> Body;

    public void setBody(ArrayList<Payment> body){
        this.Body=body;
    }
    public List<Payment> getBody(){
        return Body;
    }

    public Envelope(){
        this.Body = new ArrayList<>();
    }

    public Envelope(ArrayList<Payment> body){
        this.Body = body;
    }
    public void add(Payment payment){
        Body.add(payment);
    }
}
