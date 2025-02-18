package com.hackacode25.api.service;
import com.hackacode25.api.model.Patient;
import java.util.List;

public interface IPatientService {
    public Patient getPatient(int id_paciente);
    public List<Patient> getPatients();
    public void deletePatient(int id_paciente);
    public void updatePatient(int id_paciente, Patient patient);
    public void createPatient(Patient patient);
}
