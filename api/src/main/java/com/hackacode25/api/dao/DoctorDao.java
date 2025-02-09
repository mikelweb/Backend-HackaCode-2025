package com.hackacode25.api.dao;
import com.hackacode25.api.model.Doctor;
import java.util.List;

public interface DoctorDao {
    Doctor getDoctor(int id_doctor);
    List<Doctor> getDoctors();
    void deleteDoctor(int id_doctor);
    void updateDoctor(Doctor doctor);
    void createDoctor(Doctor doctor);
}
