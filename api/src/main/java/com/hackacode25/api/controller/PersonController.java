package com.hackacode25.api.controller;
import com.hackacode25.api.model.Person;
import com.hackacode25.api.service.IPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin(origins = "http://localhost:4200")
public class PersonController {

    @Autowired
    private IPersonService personService;

    @GetMapping("/persons")
    public List<Person> getAll() {
        return personService.getPersons();
    }

    @GetMapping("/persons/{id_persona}")
    public Person getPerson(@PathVariable int id_persona) {
        return personService.getPerson(id_persona);
    }

    @DeleteMapping("/persons/{id_persona}")
    public void deletePerson(@PathVariable int id_persona) {
        personService.deletePerson(id_persona);
    }

    @PutMapping("/persons/{id_persona}")
    public void updatePerson(@PathVariable int id_persona, @RequestBody Person person) {
        personService.updatePerson(id_persona, person);
    }

    @PostMapping("/persons")
    public void createPerson(@RequestBody Person person) {
        personService.createPerson(person);
    }
}