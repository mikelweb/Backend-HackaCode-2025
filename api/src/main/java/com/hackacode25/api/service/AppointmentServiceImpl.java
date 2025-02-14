package com.hackacode25.api.service;
import com.hackacode25.api.dao.IAppointmentDao;
import com.hackacode25.api.model.Appointment;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

public class AppointmentServiceImpl implements IAppointmentService {

    @Autowired
    private IAppointmentDao appointmentDao;

    @Override
    public Appointment getAppointment(int id) {
        return this.appointmentDao.findById(id).orElse(null);
    }

    @Override
    public List<Appointment> getAppointments() {
        return this.appointmentDao.findAll();
    }

    @Override
    public void deleteAppointment(int id) {
        this.appointmentDao.deleteById(id);
    }

    @Override
    public void updateAppointment(int id, Appointment appointment) {
        if(id == appointment.getId())
            this.appointmentDao.save(appointment);
        else
            throw new RuntimeException("Parameter appointment ID doesn't match with appointment obj ID");
    }

    @Override
    public void createAppointment(Appointment appointment) {
        this.appointmentDao.save(appointment);
    }
}
