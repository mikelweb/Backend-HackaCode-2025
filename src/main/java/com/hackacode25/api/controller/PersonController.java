package com.hackacode25.api.controller;

import com.hackacode25.api.dao.PersonDao;
import com.hackacode25.api.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class PersonController {

    @Autowired
    private PersonDao personDao;

    @RequestMapping("/persons")
    public List<Person> getAll() {
        return personDao.getPersons();
    }

    @RequestMapping("/persons/{id_persona}")
    public Person getPerson(@PathVariable int id_persona) {
        return personDao.getPerson(id_persona);
    }

    @RequestMapping(value = "/persons/{id_persona}", method = RequestMethod.DELETE)
    public void delete(@PathVariable int id_persona) {
        personDao.deletePerson(id_persona);
    }
}