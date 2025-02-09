package com.hackacode25.api.dao;

import com.hackacode25.api.model.Person;
import java.util.List;

public interface PersonDao {

    Person getPerson(int id_persona);
    List<Person> getPersons();
    void deletePerson(int id_persona);
    void updatePerson(Person person);
    void createPerson(Person person);
}
