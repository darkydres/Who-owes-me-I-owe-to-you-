package com.novisa.logic;

import java.util.Date;

/**
 * Created by AndresFelipe on 27/07/2015.
 */
public class Payment {

    int orderNumber;
    int idPayment;
    int amount;

    public Payment(int orderNumber, int idPayment, Date date, int amount, String description)
    {
        this.orderNumber = idPayment;
        this.idPayment = idPayment;
        this.date = date;
        this.amount = amount;
        this.description = description;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public int getIdPayment() {
        return idPayment;
    }

    public void setIdPayment(int idPayment) {
        this.idPayment = idPayment;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    Date date;
    String description;

}
