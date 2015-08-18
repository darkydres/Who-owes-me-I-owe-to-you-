package com.novisa.logic;

/**
 * Created by AndresFelipe on 27/07/2015.
 */
public class Client {

    String clientName;
    int id;
    String cellphone;
    String address;
    String email;

    public Client(String clientName, int id, String cellphone, String address, String email)
    {
        this.clientName = clientName;
        this.id = id;
        this.cellphone = cellphone;
        this.address = address;
        this.email = email;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
