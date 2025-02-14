package com.hackacode25.api.service;
import com.hackacode25.api.model.Appointment;
import java.util.List;

public interface IAppointmentService {
    public Appointment getAppointment(int id);
    public List<Appointment> getAppointments();
    public void deleteAppointment(int id);
    public void updateAppointment(int id, Appointment appointment);
    public void createAppointment(Appointment appointment);
}
