package com.hackacode25.api.controller;
import com.hackacode25.api.model.Patient;
import com.hackacode25.api.service.IPatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin(origins = "http://localhost:4200")
public class PatientController {

    @Autowired
    private IPatientService patientService;

    @GetMapping("/patients")
    public List<Patient> getAll() {
        return patientService.getPatients();
    }

    @GetMapping("/patients/{id_paciente}")
    public Patient getPatient(@PathVariable int id_paciente) {
        return patientService.getPatient(id_paciente);
    }

    @DeleteMapping("/patients/{id_paciente}")
    public void deletePatient(@PathVariable int id_paciente) {
        patientService.deletePatient(id_paciente);
    }

    @PutMapping("/patients/{id_paciente}")
    public void updatePatient(@PathVariable int id_paciente, @RequestBody Patient patient) {
        patientService.updatePatient(id_paciente, patient);
    }

    @PostMapping("/patients")
    public void createPatient(@RequestBody Patient patient) {
        patientService.createPatient(patient);
    }
}
