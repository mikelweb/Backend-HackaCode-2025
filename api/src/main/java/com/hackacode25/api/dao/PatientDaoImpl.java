package com.hackacode25.api.dao;
import com.hackacode25.api.model.Patient;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Repository
@Transactional
public class PatientDaoImpl implements PatientDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Transactional
    public Patient getPatient(int id_paciente) {
        return this.entityManager.find(Patient.class, id_paciente);
    }

    @Override
    @Transactional
    public List<Patient> getPatients() {
        String query = "FROM Patient";
        return this.entityManager.createQuery(query).getResultList();
    }

    @Override
    @Transactional
    public void deletePatient(int id_paciente) {
        Patient patient = this.entityManager.find(Patient.class, id_paciente);
        this.entityManager.remove(patient);
    }

    @Override
    @Transactional
    public void updatePatient(Patient patient) {
        this.entityManager.merge(patient);
    }

    @Override
    @Transactional
    public void createPatient(Patient patient) {
        this.entityManager.persist(patient);
    }
}
