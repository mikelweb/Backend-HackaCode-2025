package com.hackacode25.api.service;
import com.hackacode25.api.dao.IDoctorDao;
import com.hackacode25.api.model.Doctor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class DoctorServiceImpl implements IDoctorService {

    @Autowired
    private IDoctorDao doctorDao;

    @Override
    public Doctor getDoctor(int id_doctor) {
        return this.doctorDao.findById(id_doctor).orElse(null);
    }

    @Override
    public List<Doctor> getDoctors() {
        return this.doctorDao.findAll();
    }

    @Override
    public void deleteDoctor(int id_doctor) {
        this.doctorDao.deleteById(id_doctor);
    }

    @Override
    public void updateDoctor(int id, Doctor doctor) {
        if(id == doctor.getId_doctor())
            this.doctorDao.save(doctor);
        else
            throw new RuntimeException("Parameter doctor ID doesn't match with doctor obj ID");
    }

    @Override
    public void createDoctor(Doctor doctor) {
        this.doctorDao.save(doctor);
    }
}
