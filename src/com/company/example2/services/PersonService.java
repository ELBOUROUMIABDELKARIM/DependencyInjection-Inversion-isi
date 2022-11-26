package com.company.example2.services;

import com.company.example2.dao.IPersonDao;
import com.company.example2.dao.PersonDaoMySQL;
import com.company.example2.models.Person;
import com.company.example2.utils.EmailServiceGmail;
import com.company.example2.utils.interfaces.IEmailService;

import java.sql.SQLException;
import java.util.List;

public class PersonService {

    private IPersonDao personDao;

    private IEmailService emailService;

    public PersonService(IPersonDao personDao, IEmailService emailService)  {
        this.personDao = personDao;
        this.emailService = emailService;
    }

    public void addPerson(Person person) {
        emailService.sendEmail(person.getEmail());
        personDao.addPerson(person);
    }

    public List<Person> getPersonAll() {
        return personDao.getPersonAll();
    }

    public Person getPerson(int id){
        return personDao.getPerson(id);
    }

    public void deletePerson(int id) {
        personDao.deletePerson(id);
    }

    public void updatePerson(int id, Person obj) {
        personDao.updatePerson(id,obj);
    }
}
