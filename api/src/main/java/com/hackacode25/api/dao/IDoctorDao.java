package com.hackacode25.api.dao;
import com.hackacode25.api.model.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDoctorDao extends JpaRepository<Doctor, Integer> {
}
