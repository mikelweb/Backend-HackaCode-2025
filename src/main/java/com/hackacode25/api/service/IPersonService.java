package com.hackacode25.api.service;
import com.hackacode25.api.model.Person;
import java.util.List;

public interface IPersonService {
    public Person getPerson(int id_persona);
    public List<Person> getPersons();
    public void updatePerson(int id_persona, Person person);
    public void createPerson(Person person);
    public void deletePerson(int id_persona);
}
