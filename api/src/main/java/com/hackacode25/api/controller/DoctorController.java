package com.hackacode25.api.controller;
import com.hackacode25.api.dao.DoctorDao;
import com.hackacode25.api.model.Doctor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin(origins = "http://localhost:4200")
public class DoctorController {

    @Autowired
    private DoctorDao doctorDao;

    @GetMapping("/doctors")
    public List<Doctor> getAll() {
        return doctorDao.getDoctors();
    }

    @GetMapping("/doctors/{id_doctor}")
    public Doctor getDoctor(@PathVariable int id_doctor) {
        return doctorDao.getDoctor(id_doctor);
    }

    @RequestMapping(value = "/doctors/{id_doctor}", method = RequestMethod.DELETE)
    public void deleteDoctor(@PathVariable int id_doctor) {
        doctorDao.deleteDoctor(id_doctor);
    }

    @RequestMapping(value = "/doctors/{id_doctor}", method = RequestMethod.PUT)
    public void updateDoctor(@PathVariable int id_doctor, @RequestBody Doctor doctor) {
        doctorDao.updateDoctor(doctor);
    }

    @RequestMapping(value = "/doctors", method = RequestMethod.POST)
    public void createDoctor(@RequestBody Doctor doctor) {
        doctorDao.createDoctor(doctor);
    }
}
