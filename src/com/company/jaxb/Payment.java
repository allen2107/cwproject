package com.company.jaxb;

import com.sun.xml.internal.txw2.annotation.XmlElement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="SendPayment", namespace = "wsapi:Payment")
public class Payment{

    private String token;
    private String cardNumber;
    private String requestID;
    private String amount;
    private String currency;
    private ArrayList<Account> accounts;
    private String page;
    private ArrayList<Field> fields;

    public Payment(){
        accounts=new ArrayList<>();
        fields = new ArrayList<>();
    }

    @XmlElement
    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @XmlElement
    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @XmlElement
    public String getRequestID() {
        return requestID;
    }

    public void setRequestID(String requestID) {
        this.requestID = requestID;
    }

    @XmlElement
    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    @XmlElement
    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @XmlElement
    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(ArrayList<Account> accounts) {
        this.accounts = accounts;
    }

    @XmlElement
    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

    @XmlElement
    public ArrayList<Field> getFields() {
        return fields;
    }

    public void setFields(ArrayList<Field> fields) {
        this.fields = fields;
    }

    public Payment(String token, String cardNumber, String requestID,
                   String amount, String currency, ArrayList<Account> accounts,
                   String page, ArrayList<Field> fields) {
        this.token=token;
        this.cardNumber=cardNumber;
        this.requestID=requestID;
        this.amount=amount;
        this.currency=currency;
        this.accounts=accounts;
        this.page=page;
        this.fields=fields;
    }
}