package com.hackacode25.api.service;
import com.hackacode25.api.dao.IPersonDao;
import com.hackacode25.api.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PersonServiceImpl implements IPersonService {

    @Autowired
    private IPersonDao personDao;

    @Override
    public Person getPerson(int id_persona) {
        return this.personDao.findById(id_persona).orElse(null);
    }

    @Override
    public List<Person> getPersons() {
        return this.personDao.findAll();
    }

    @Override
    public void deletePerson(int id_persona) {
        this.personDao.deleteById(id_persona);
    }

    @Override
    public void updatePerson(int id_persona, Person person) {
        if(id_persona == person.getId_persona())
            this.personDao.save(person);
        else
            throw new RuntimeException("Parameter person ID doesn't match with person obj ID");
    }

    @Override
    public void createPerson(Person person) {
        this.personDao.save(person);
    }
}
