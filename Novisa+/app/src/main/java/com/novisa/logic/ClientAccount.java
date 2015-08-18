package com.novisa.logic;

/**
 * Created by AndresFelipe on 27/07/2015.
 */
public class ClientAccount {

    int idClient;
    int balance;
    int idOrder;


    public ClientAccount(int idClient, int balance, int idOrder)
    {
        this.idClient = idClient;
        this.balance = balance;
        this.idOrder = idOrder;
    }

    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(int idOrder) {
        this.idOrder = idOrder;
    }

}
