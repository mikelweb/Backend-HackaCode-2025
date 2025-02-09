package com.hackacode25.api.dao;
import com.hackacode25.api.model.Doctor;
import com.hackacode25.api.model.Patient;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Repository
@Transactional
public class DoctorDaoImpl implements DoctorDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Transactional
    public Doctor getDoctor(int id_doctor) {
        return this.entityManager.find(Doctor.class, id_doctor);
    }

    @Override
    @Transactional
    public List<Doctor> getDoctors() {
        String query = "FROM Doctor";
        return this.entityManager.createQuery(query).getResultList();
    }

    @Override
    @Transactional
    public void deleteDoctor(int id_doctor) {
        Doctor doctor = this.entityManager.find(Doctor.class, id_doctor);
        this.entityManager.remove(doctor);
    }

    @Override
    @Transactional
    public void updateDoctor(Doctor doctor) {
        this.entityManager.merge(doctor);
    }

    @Override
    @Transactional
    public void createDoctor(Doctor doctor) {
        this.updateDoctor(doctor);
    }
}
