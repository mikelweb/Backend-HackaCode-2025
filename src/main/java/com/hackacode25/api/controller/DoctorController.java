package com.hackacode25.api.controller;
import com.hackacode25.api.model.Doctor;
import com.hackacode25.api.service.IDoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin(origins = "http://localhost:4200")
public class DoctorController {

    @Autowired
    private IDoctorService doctorService;

    @GetMapping("/doctors")
    public List<Doctor> getAll() {
        return doctorService.getDoctors();
    }

    @GetMapping("/doctors/{id_doctor}")
    public Doctor getDoctor(@PathVariable int id_doctor) {
        return doctorService.getDoctor(id_doctor);
    }

    @DeleteMapping("/doctors/{id_doctor}")
    public void deleteDoctor(@PathVariable int id_doctor) {
        doctorService.deleteDoctor(id_doctor);
    }

    @PutMapping("/doctors/{id_doctor}")
    public void updateDoctor(@PathVariable int id_doctor, @RequestBody Doctor doctor) {
        doctorService.updateDoctor(id_doctor, doctor);
    }

    @PostMapping("/doctors")
    public void createDoctor(@RequestBody Doctor doctor) {
        doctorService.createDoctor(doctor);
    }
}
