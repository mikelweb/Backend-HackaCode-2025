package com.hackacode25.api.controller;

import com.hackacode25.api.dao.PatientDao;
import com.hackacode25.api.model.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin(origins = "http://localhost:4200")
public class PatientController {
    @Autowired
    private PatientDao patientDao;

    @GetMapping("/patients")
    public List<Patient> getAll() {
        return patientDao.getPatients();
    }

    @GetMapping("/patients/{id_paciente}")
    public Patient getPatient(@PathVariable int id_paciente) {
        return patientDao.getPatient(id_paciente);
    }

    @RequestMapping(value = "/patients/{id_paciente}", method = RequestMethod.DELETE)
    public void deletePatient(@PathVariable int id_paciente) {
        patientDao.deletePatient(id_paciente);
    }

    @RequestMapping(value = "/patients/{id_paciente}", method = RequestMethod.PUT)
    public void updatePatient(@PathVariable int id_paciente, @RequestBody Patient patient) {
        patientDao.updatePatient(patient);
    }

    @RequestMapping(value = "/patients", method = RequestMethod.POST)
    public void createPatient(@RequestBody Patient patient) {
        patientDao.createPatient(patient);
    }
}
