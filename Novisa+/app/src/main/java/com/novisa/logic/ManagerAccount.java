package com.novisa.logic;

/**
 * Created by AndresFelipe on 27/07/2015.
 */
public class ManagerAccount {

    int idManager;
    String name;
    String email;
    String password;

    public ManagerAccount(int idManager, String name, String email, String password)
    {
        this.idManager = idManager;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public int getIdManager() {

        return idManager;
    }

    public void setIdManager(int idManager) {
        this.idManager = idManager;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
