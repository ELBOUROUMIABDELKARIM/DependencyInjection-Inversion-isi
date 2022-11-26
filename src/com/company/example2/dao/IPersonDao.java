package com.company.example2.dao;

import com.company.example2.models.Person;

import java.util.ArrayList;

public interface IPersonDao {
    void addPerson(Person person);
    Person getPerson(int i);
    ArrayList<Person> getPersonAll();
    void deletePerson(int id);
    void updatePerson(int id, Person person);
}
