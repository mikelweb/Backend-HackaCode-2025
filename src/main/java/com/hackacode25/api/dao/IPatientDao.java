package com.hackacode25.api.dao;
import com.hackacode25.api.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPatientDao extends JpaRepository<Patient, Integer> { }
