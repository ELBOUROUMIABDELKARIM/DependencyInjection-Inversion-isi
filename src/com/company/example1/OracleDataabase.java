package com.company.example1;

public class OracleDataabase implements IDatabase{
    @Override
    public void persist(String data) {
        System.out.println("Oracle Connected Successfully !! : "+data);
    }
}
