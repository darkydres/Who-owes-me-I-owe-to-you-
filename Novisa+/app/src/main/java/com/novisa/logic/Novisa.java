package com.novisa.logic;

import java.util.ArrayList;

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

}
