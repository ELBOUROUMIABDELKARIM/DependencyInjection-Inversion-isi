package com.company.example1;

public class User {
    private IDatabase database;

    public User(IDatabase database){
        this.database = database;
    }
/*
    public void setDatabase(MySqlDatabase database) {
        this.database = database;
    }*/

    public void add(String data){
        database.persist(data);
    }
}
