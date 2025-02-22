package com.hackacode25.api.controller;
import com.hackacode25.api.model.MedicalService;
import com.hackacode25.api.service.IMedicalServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin(origins = "http://localhost:4200")
public class MedicalServiceController {

    @Autowired
    private IMedicalServiceService medicalServiceService;

    @RequestMapping("/medicalservices")
    public List<MedicalService> getAll() {
        return this.medicalServiceService.getMedicalServices();
    }

    @RequestMapping("/medicalservices/{codigo_servicio}")
    public MedicalService getMedicalService(@PathVariable int codigo_servicio) {
        return this.medicalServiceService.getMedicalService(codigo_servicio);
    }

    @DeleteMapping("/medicalservices/{codigo_servicio}")
    public void deleteMedicalService(@PathVariable int codigo_servicio) {
        this.medicalServiceService.deleteMedicalService(codigo_servicio);
    }

    @PutMapping("/medicalservices/{codigo_servicio}")
    public void updateMedicalService(@PathVariable int codigo_servicio, @RequestBody MedicalService medicalService) {
        this.medicalServiceService.updateMedicalService(codigo_servicio, medicalService);
    }

    @PostMapping("/medicalservices")
    public void createMedicalService(@RequestBody MedicalService medicalService) {
        this.medicalServiceService.createMedicalService(medicalService);
    }
}