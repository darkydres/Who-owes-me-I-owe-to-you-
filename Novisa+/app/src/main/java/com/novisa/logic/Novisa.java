package com.novisa.logic;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by AndresFelipe on 30/07/2015.
 */
public class Novisa {

    private ArrayList<Client> clients;
    private ArrayList<ClientAccount> clientsAccount;
    private ArrayList<Item> items;
    private ArrayList<ManagerAccount> managers;

    public Novisa()
    {
        clients = new ArrayList<Client>();
        clientsAccount = new ArrayList<ClientAccount>();
        items = new ArrayList<Item>();
        managers = new ArrayList<ManagerAccount>();
    }

    public boolean existClient(Client client)
    {
        boolean exist = false;

            if(clients.contains(client))
            {
                exist = true;
            }
        return exist;
    }

    public boolean existManagers(ManagerAccount manager)
    {
        boolean exist = false;

        if(managers.contains(manager))
        {
            exist = true;
        }
        return exist;
    }

    public boolean existItem(Item item)
    {
        boolean exist = false;

        if(items.contains(item))
        {
            exist = true;
        }
        return exist;
    }

    public boolean addNewManager(int idManager, String name, String email, String password)
    {
        boolean wasRight = false;
        ManagerAccount newManager = new ManagerAccount(idManager, name, email, password);
        if(existManagers(newManager) == false)
        {
            managers.add(newManager);
            wasRight = true;
        }

        return wasRight;
    }

    public boolean existClientAccount(ClientAccount clientAccount)
    {
        boolean exist = false;

        if(clientsAccount.contains(clientAccount))
        {
            exist = true;
        }
        return exist;
    }

    public boolean addNewClient(String clientName, int id, String cellphone, String address, String email)
    {
        boolean wasRight = false;
        Client newClient = new Client(clientName, id, cellphone, address, email);
        if(existClient(newClient) == false)
        {
            clients.add(newClient);
            wasRight = true;
        }

        return wasRight;
    }

    public boolean addNewItem(int idItem, String name, int price)
    {
        boolean wasRight = false;
        Item newItem = new Item(idItem, name, price);
        if(existItem(newItem) == false)
        {
            items.add(newItem);
            wasRight = true;
        }
        return wasRight;
    }

    public boolean createNewClientAccount(ClientAccount clientAccount)
    {
        boolean wasRight = false;

        if(!existClientAccount(clientAccount))
        {
            clientsAccount.add(clientAccount);
        }
        return wasRight;
    }

    public Order newOrder(int idOrder,ManagerAccount ma,ClientAccount ca,ArrayList<Item> items, int amount)
    {
        Order order = new Order(idOrder, ma.getIdManager(), ca.idClient, items, amount);
        return  order;
    }

    public Payment newPayment(Order order, int idPayment, Date date, int amount, String description)
    {
        Payment payment = new Payment(order.getOrderId(), idPayment, date, amount, description);
        return  payment;
    }
}
