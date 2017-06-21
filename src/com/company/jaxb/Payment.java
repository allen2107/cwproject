package com.company.jaxb;

import javax.xml.bind.annotation.*;

import java.util.ArrayList;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="sendPayment", namespace = "wsapi:Payment")
public class Payment{
    @XmlElement
    private String token;
    @XmlElement
    private String cardNumber;
    @XmlElement
    private String requestID;
    @XmlElement
    private String amount;
    @XmlElement
    private String currency;
    @XmlElement(namespace = "wsapi:Utils")
    private ArrayList<Account> account;
    @XmlElement
    private String page;
    @XmlElement
    private ArrayList<Field> field;

    public Payment(){
        account=new ArrayList<>();
        field = new ArrayList<>();
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getRequestID() {
        return requestID;
    }

    public void setRequestID(String requestID) {
        this.requestID = requestID;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public ArrayList<Account> getAccounts() {
        return account;
    }

    public void setAccounts(ArrayList<Account> accounts) {
        this.account = accounts;
    }

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

    public ArrayList<Field> getFields() {
        return field;
    }

    public void setFields(ArrayList<Field> field) {
        this.field = field;
    }

    public Payment(String token, String cardNumber, String requestID,
                   String amount, String currency, ArrayList<Account> accounts,
                   String page, ArrayList<Field> fields) {
        this.token=token;
        this.cardNumber=cardNumber;
        this.requestID=requestID;
        this.amount=amount;
        this.currency=currency;
        this.account=accounts;
        this.page=page;
        this.field=fields;
    }
//for test
    @Override
    public String toString() {
        return token+";"+cardNumber+";"+requestID+";"+amount+";"+currency+";"+page+";"+account.size()+":"+field.size();
    }
}