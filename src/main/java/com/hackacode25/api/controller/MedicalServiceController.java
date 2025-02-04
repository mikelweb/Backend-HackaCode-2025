package com.hackacode25.api.controller;

import com.hackacode25.api.dao.MedicalServiceDao;
import com.hackacode25.api.model.MedicalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin(origins = "http://localhost:4200")
public class MedicalServiceController {

    @Autowired
    private MedicalServiceDao medicalServiceDao;

    @RequestMapping("/medicalservices")
    public List<MedicalService> getAll() {
        return medicalServiceDao.getMedicalServices();
    }

    @RequestMapping("/medicalservices/{codigo_servicio}")
    public MedicalService getMedicalService(@PathVariable int codigo_servicio) {
        return medicalServiceDao.getMedicalService(codigo_servicio);
    }

    @RequestMapping(value = "/medicalservices/{codigo_servicio}", method = RequestMethod.DELETE)
    public void deleteMedicalService(@PathVariable int codigo_servicio) {
        medicalServiceDao.deleteMedicalService(codigo_servicio);
    }

    @RequestMapping(value = "/medicalservices/{codigo_servicio}", method = RequestMethod.PUT)
    public void updateMedicalService(@PathVariable int codigo_servicio, @RequestBody MedicalService medicalService) {
        medicalServiceDao.updateMedicalService(medicalService);
    }

    @RequestMapping(value = "/medicalservices", method = RequestMethod.POST)
    public void createMedicalService(@RequestBody MedicalService medicalService) {
        medicalServiceDao.createMedicalService(medicalService);
    }
}