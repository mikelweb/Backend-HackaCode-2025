package com.hackacode25.api.service;
import com.hackacode25.api.model.Doctor;
import java.util.List;

public interface IDoctorService {
    public Doctor getDoctor(int id_doctor);
    public List<Doctor> getDoctors();
    public void deleteDoctor(int id_doctor);
    public void updateDoctor(int id, Doctor doctor);
    public void createDoctor(Doctor doctor);
}
