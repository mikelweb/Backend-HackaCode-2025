package com.hackacode25.api.dao;

import com.hackacode25.api.model.Person;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class PersonDaoImpl implements PersonDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Transactional
    public Person getPerson(int id_persona) {
        Person person = this.entityManager.find(Person.class, id_persona);
        return person;
    }

    @Override
    @Transactional
    public List<Person> getPersons() {
        String query = "FROM Person";
        return this.entityManager.createQuery(query).getResultList();
    }

    @Override
    @Transactional
    public void deletePerson(int id_persona) {
        Person person = this.entityManager.find(Person.class, id_persona);
        this.entityManager.remove(person);
    }
}
