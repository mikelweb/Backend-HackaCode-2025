package com.hackacode25.api.service;
import com.hackacode25.api.model.MedicalService;
import java.util.List;

public interface IMedicalServiceService {

    public MedicalService getMedicalService(int codigo_servicio);
    public List<MedicalService> getMedicalServices();
    public void deleteMedicalService(int codigo_servicio);
    public void updateMedicalService(int codigo_servicio, MedicalService medicalService);
    public void createMedicalService(MedicalService medicalService);
}
