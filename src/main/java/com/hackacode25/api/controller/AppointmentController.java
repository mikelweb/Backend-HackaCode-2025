package com.hackacode25.api.controller;
import com.hackacode25.api.dao.AppointmentDao;
import com.hackacode25.api.model.Appointment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin(origins = "http://localhost:4200")
public class AppointmentController {

    @Autowired
    private AppointmentDao appointmentDao;

    @RequestMapping("/appointments")
    public List<Appointment> getAll() {
        return appointmentDao.getAppointments();
    }

    @RequestMapping("/appointments/{id}")
    public Appointment getAppointments(@PathVariable int id) {
        return appointmentDao.getAppointment(id);
    }

    @RequestMapping(value = "/appointments/{id}", method = RequestMethod.DELETE)
    public void deleteAppointment(@PathVariable int id) {
        appointmentDao.deleteAppointment(id);
    }

    @RequestMapping(value = "/appointments/{id}", method = RequestMethod.PUT)
    public void updateAppointment(@PathVariable int id, @RequestBody Appointment appointment) {
        appointmentDao.updateAppointment(appointment);
    }

    @RequestMapping(value = "/appointments", method = RequestMethod.POST)
    public void createAppointment(@RequestBody Appointment appointment) {
        appointmentDao.createAppointment(appointment);
    }
}
