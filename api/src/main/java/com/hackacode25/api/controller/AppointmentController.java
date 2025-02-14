package com.hackacode25.api.controller;
import com.hackacode25.api.model.Appointment;
import com.hackacode25.api.service.IAppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin(origins = "http://localhost:4200")
public class AppointmentController {

    @Autowired
    private IAppointmentService appointmentService;

    @GetMapping("/appointments")
    public List<Appointment> getAll() {
        return appointmentService.getAppointments();
    }

    @GetMapping("/appointments/{id}")
    public Appointment getAppointments(@PathVariable int id) {
        return appointmentService.getAppointment(id);
    }

    @DeleteMapping("/appointments/{id}")
    public void deleteAppointment(@PathVariable int id) {
        appointmentService.deleteAppointment(id);
    }

    @PutMapping("/appointments/{id}")
    public void updateAppointment(@PathVariable int id, @RequestBody Appointment appointment) {
        appointmentService.updateAppointment(id, appointment);
    }

    @PostMapping("/appointments")
    public void createAppointment(@RequestBody Appointment appointment) {
        appointmentService.createAppointment(appointment);
    }
}
