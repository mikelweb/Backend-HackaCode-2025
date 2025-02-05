package com.hackacode25.api.controller;
import com.hackacode25.api.dao.ServicePackDao;
import com.hackacode25.api.model.ServicePack;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin(origins = "http://localhost:4200")
public class ServicePackController {

    @Autowired
    private ServicePackDao servicePackDao;

    @RequestMapping("/servicepacks")
    public List<Integer> getAll() {
        return servicePackDao.getServicePacks();
    }

    @RequestMapping("/servicepacks/{codigo_paquete}")
    public ServicePack getServicePack(@PathVariable int codigo_paquete) {
        return servicePackDao.getServicePack(codigo_paquete);
    }

    @RequestMapping(value = "/servicepacks/{codigo_paquete}", method = RequestMethod.DELETE)
    public void deleteServicePack(@PathVariable int codigo_paquete) {
        servicePackDao.deleteServicePack(codigo_paquete);
    }

    @RequestMapping(value = "/servicepacks/{codigo_paquete}", method = RequestMethod.PUT)
    public void updateServicePack(@PathVariable int codigo_paquete, @RequestBody ServicePack servicePack) {
        servicePackDao.updateServicePack(servicePack);
    }

    @RequestMapping(value = "/servicepacks", method = RequestMethod.POST)
    public void createServicePack(@RequestBody ServicePack servicePack) {
        servicePackDao.createServicePack(servicePack);
    }
}
