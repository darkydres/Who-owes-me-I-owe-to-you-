package com.novisa.logic;

/**
 * Created by AndresFelipe on 27/07/2015.
 */
public class Item {

    int idItem;
    String name;
    int price;

    public Item(int idItem, String name, int price)
    {
        this.idItem = idItem;
        this.name = name;
        this.price = price;
    }

    public int getIdItem() {
        return idItem;
    }

    public void setIdItem(int idItem) {
        this.idItem = idItem;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
