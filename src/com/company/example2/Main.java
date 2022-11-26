package com.company.example2;

import com.company.example2.dao.PersonDaoMySQL;
import com.company.example2.dao.PersonDaoNoSQL;
import com.company.example2.dao.PersonDaoOracle;
import com.company.example2.models.Person;
import com.company.example2.services.PersonService;
import com.company.example2.utils.EmailServiceGmail;
import com.company.example2.utils.EmailServiceOutlook;

import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws SQLException {
        PersonService personService = new PersonService(new PersonDaoNoSQL(), new EmailServiceOutlook());
        personService.addPerson(new Person("k@gmail.com", 21));
    }
}
