package com.company.example1;

public class MySqlDatabase implements IDatabase {

    @Override
    public void persist(String data){
        System.out.println("MySQL Connected Successfully !! : "+data);
    }
}
