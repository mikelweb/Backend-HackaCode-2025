package com.hackacode25.api.service;
import com.hackacode25.api.dao.IPatientDao;
import com.hackacode25.api.model.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PatientServiceImpl implements IPatientService {

    @Autowired
    private IPatientDao patientDao;

    @Override
    public Patient getPatient(int id_paciente) {
        return this.patientDao.findById(id_paciente).orElse(null);
    }

    @Override
    public List<Patient> getPatients() {
        return this.patientDao.findAll();
    }

    @Override
    public void deletePatient(int id_paciente) {
        this.patientDao.deleteById(id_paciente);
    }

    @Override
    public void updatePatient(int id_paciente, Patient patient) {
        if(id_paciente == patient.getId_paciente())
            this.patientDao.save(patient);
        else
            throw new RuntimeException("Parameter patient ID doesn't match with patient obj ID");
    }

    @Override
    public void createPatient(Patient patient) {
        this.patientDao.save(patient);
    }
}
