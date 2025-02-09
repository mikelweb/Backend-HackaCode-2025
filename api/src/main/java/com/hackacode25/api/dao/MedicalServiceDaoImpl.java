package com.hackacode25.api.dao;

import com.hackacode25.api.model.MedicalService;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class MedicalServiceDaoImpl implements MedicalServiceDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Transactional
    public MedicalService getMedicalService(int codigo_servicio) {
        return this.entityManager.find(MedicalService.class, codigo_servicio);
    }

    @Override
    @Transactional
    public List<MedicalService> getMedicalServices() {
        String query = "FROM MedicalService";
        return this.entityManager.createQuery(query).getResultList();
    }

    @Override
    @Transactional
    public void deleteMedicalService(int codigo_servicio) {
        MedicalService medicalService = this.entityManager.find(MedicalService.class, codigo_servicio);
        this.entityManager.remove(medicalService);
    }

    @Override
    @Transactional
    public void updateMedicalService(MedicalService medicalService) {
        this.entityManager.merge(medicalService);
    }

    @Override
    @Transactional
    public void createMedicalService(MedicalService medicalService) {
        this.entityManager.persist(medicalService);
    }

}
