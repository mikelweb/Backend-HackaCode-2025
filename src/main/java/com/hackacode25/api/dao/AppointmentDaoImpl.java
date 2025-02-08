package com.hackacode25.api.dao;
import com.hackacode25.api.model.Appointment;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Repository
@Transactional
public class AppointmentDaoImpl implements AppointmentDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Transactional
    public Appointment getAppointment(int id) {
        return this.entityManager.find(Appointment.class, id);
    }

    @Override
    public List<Appointment> getAppointments() {
        String query = "FROM Appointment";
        return this.entityManager.createQuery(query).getResultList();
    }

    @Override
    public void deleteAppointment(int id) {
        Appointment appointment = this.entityManager.find(Appointment.class, id);
        this.entityManager.remove(appointment);
    }

    @Override
    public void updateAppointment(Appointment appointment) {
        this.entityManager.merge(appointment);
    }

    @Override
    public void createAppointment(Appointment appointment) {
        this.entityManager.persist(appointment);
    }
}
