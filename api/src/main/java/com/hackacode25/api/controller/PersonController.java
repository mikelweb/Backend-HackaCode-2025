package com.hackacode25.api.controller;

import com.hackacode25.api.dao.PersonDao;
import com.hackacode25.api.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin(origins = "http://localhost:4200")
public class PersonController {

    @Autowired
    private PersonDao personDao;

    @GetMapping("/persons")
    public List<Person> getAll() {
        return personDao.getPersons();
    }

    @GetMapping("/persons/{id_persona}")
    public Person getPerson(@PathVariable int id_persona) {
        return personDao.getPerson(id_persona);
    }

    @RequestMapping(value = "/persons/{id_persona}", method = RequestMethod.DELETE)
    public void deletePerson(@PathVariable int id_persona) {
        personDao.deletePerson(id_persona);
    }

    @RequestMapping(value = "/persons/{id_persona}", method = RequestMethod.PUT)
    public void updatePerson(@PathVariable int id_persona, @RequestBody Person person) {
        personDao.updatePerson(person);
    }

    @RequestMapping(value = "/persons", method = RequestMethod.POST)
    public void createPerson(@RequestBody Person person) {
        personDao.createPerson(person);
    }

}