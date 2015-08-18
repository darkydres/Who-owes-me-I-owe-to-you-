package com.novisa.logic;

import android.util.Log;

import java.util.ArrayList;

/**
 * Created by AndresFelipe on 27/07/2015.
 */
public class Order {

    int orderId;
    int idManagerAccount;
    int idClient;
    ArrayList<Item> itemsId;
    int amountOrder;

    public Order(int orderId, int idManagerAccount, int idClient, int amountOrder)
    {
        this.orderId = orderId;
        this. idManagerAccount = idManagerAccount;
        this.idClient = idClient;
        this.amountOrder = amountOrder;
        itemsId = new ArrayList<Item>();
    }

    public ArrayList<Item> getItemsId()
    {
        return itemsId;
    }
    /*
    public void addItemsToArray(Item item)
    {
        itemsId.add(item);
    }*/

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getIdManagerAccount() {
        return idManagerAccount;
    }

    public void setIdManagerAccount(int idManagerAccount) {
        this.idManagerAccount = idManagerAccount;
    }

    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public int getAmountOrder() {
        return amountOrder;
    }

    public void setAmountOrder(int amountOrder) {
        this.amountOrder = amountOrder;
    }
}
