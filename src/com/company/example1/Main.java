package com.company.example1;

public class Main {
    public static void main(String[] args) {
        User user = new User(new OracleDataabase());
        //user.setDatabase(new MySqlDatabase());
        user.add("Hassan");
    }
}
