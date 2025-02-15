package com.hackacode25.api.dao;
import com.hackacode25.api.model.MedicalService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMedicalServiceDao extends JpaRepository<MedicalService, Integer> { }
