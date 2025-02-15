package com.hackacode25.api.controller;
import com.hackacode25.api.model.MedicalService;
import com.hackacode25.api.model.ServicePack;
import com.hackacode25.api.service.IServicePackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin(origins = "http://localhost:4200")
public class ServicePackController {

    @Autowired
    private IServicePackService servicePackService;

    @GetMapping("/servicepacks")
    public List<ServicePack> getAll() {
        return servicePackService.getServicePacks();
    }

    @GetMapping("/servicepacks/{codigo_paquete}")
    public ServicePack getServicePack(@PathVariable int codigo_paquete) {
        return servicePackService.getServicePack(codigo_paquete);
    }

    @DeleteMapping("/servicepacks/{codigo_paquete}")
    public void deleteServicePack(@PathVariable int codigo_paquete) {
        servicePackService.deleteServicePack(codigo_paquete);
    }

    @PutMapping("/servicepacks/{codigo_paquete}")
    public void updateServicePack(@PathVariable int codigo_paquete, @RequestBody ServicePack servicePack) {
        servicePackService.updateServicePack(codigo_paquete, servicePack);
    }

    @PostMapping("/servicepacks")
    public void createServicePack(@RequestBody ServicePack servicePack) {
        servicePackService.createServicePack(servicePack);
    }
}
