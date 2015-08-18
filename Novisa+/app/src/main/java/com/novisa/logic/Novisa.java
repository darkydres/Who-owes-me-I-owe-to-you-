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


}
