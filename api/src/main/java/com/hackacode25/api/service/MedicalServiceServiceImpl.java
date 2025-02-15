package com.hackacode25.api.service;
import com.hackacode25.api.dao.IMedicalServiceDao;
import com.hackacode25.api.model.MedicalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MedicalServiceServiceImpl implements IMedicalServiceService {

    @Autowired
    private IMedicalServiceDao medicalServiceDao;

    @Override
    public MedicalService getMedicalService(int codigo_servicio) {
        return this.medicalServiceDao.findById(codigo_servicio).orElse(null);
    }

    @Override
    public List<MedicalService> getMedicalServices() {
        return this.medicalServiceDao.findAll();
    }

    @Override
    public void deleteMedicalService(int codigo_servicio) {
        this.medicalServiceDao.deleteById(codigo_servicio);
    }

    @Override
    public void updateMedicalService(int codigo_servicio, MedicalService medicalService) {
        if(codigo_servicio == medicalService.getCodigo_servicio())
            this.medicalServiceDao.save(medicalService);
        else
            throw new RuntimeException("Parameter medicalService ID doesn't match with medicalService obj ID");
    }

    @Override
    public void createMedicalService(MedicalService medicalService) {
        this.medicalServiceDao.save(medicalService);
    }

}
