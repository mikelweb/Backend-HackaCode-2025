package com.hackacode25.api.service;
import com.hackacode25.api.dao.PatientDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientService {

    @Autowired
    private PatientDao patientDao;
}
