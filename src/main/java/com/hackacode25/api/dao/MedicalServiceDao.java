package com.hackacode25.api.dao;

import com.hackacode25.api.model.MedicalService;

import java.util.List;

public interface MedicalServiceDao {
    MedicalService getMedicalService(int codigo_servicio);
    List<MedicalService> getMedicalServices();
    void deleteMedicalService(int codigo_servicio);
    void updateMedicalService(MedicalService medicalService);
    void createMedicalService(MedicalService medicalService);
}
