package com.hackacode25.api.dao;
import com.hackacode25.api.model.Patient;
import java.util.List;

public interface PatientDao {
    Patient getPatient(int id_paciente);
    List<Patient> getPatients();
    void deletePatient(int id_paciente);
    void updatePatient(Patient patient);
    void createPatient(Patient patient);
}
