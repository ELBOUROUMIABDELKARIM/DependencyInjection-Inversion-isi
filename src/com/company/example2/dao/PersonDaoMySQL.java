package com.company.example2.dao;

import com.company.example2.models.Person;
import com.company.example2.utils.DbConfigMySQL;

import java.sql.*;
import java.util.ArrayList;

public class PersonDaoMySQL  implements IPersonDao{

    Connection conn;

    public PersonDaoMySQL() throws SQLException {
        this.conn = DbConfigMySQL.getDbConn();
    }

    public void addPerson(Person person) {
        String SQL = "INSERT INTO person (email,age) VALUES (?,?)";
        try {
            PreparedStatement preparedStatement = conn.prepareStatement(SQL);
            preparedStatement.setString(1, person.getEmail());
            preparedStatement.setInt(2, person.getAge());
            preparedStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Person getPerson(int i) {
        return null;
    }

    public ArrayList<Person> getPersonAll() {
        return null;
    }

    public void deletePerson(int id) {
    }

    public void updatePerson(int id, Person person) {

    }

}
