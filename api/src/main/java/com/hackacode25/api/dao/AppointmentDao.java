package com.hackacode25.api.dao;
import com.hackacode25.api.model.Appointment;
import java.util.List;

public interface AppointmentDao {
    Appointment getAppointment(int id);
    List<Appointment> getAppointments();
    void deleteAppointment(int id);
    void updateAppointment(Appointment appointment);
    void createAppointment(Appointment appointment);
}
