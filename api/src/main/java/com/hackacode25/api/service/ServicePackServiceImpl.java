package com.hackacode25.api.service;
import com.hackacode25.api.dao.IServicePackDao;
import com.hackacode25.api.model.ServicePack;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ServicePackServiceImpl implements IServicePackService {

    @Autowired
    private IServicePackDao servicePackDao;

    @Override
    public ServicePack getServicePack(int codigo_paquete) {
        return this.servicePackDao.findById(codigo_paquete).orElse(null);
    }

    @Override
    public List<ServicePack> getServicePacks() {
        return this.servicePackDao.findAll();
    }

    @Override
    public void deleteServicePack(int codigo_paquete) {
        this.servicePackDao.deleteById(codigo_paquete);
    }

    @Override
    public void updateServicePack(int codigo_paquete, ServicePack servicePack) {
        if(codigo_paquete == servicePack.getCodigo_paquete())
            this.servicePackDao.save(servicePack);
        else
            throw new RuntimeException("Parameter servicePack ID doesn't match with servicePack obj ID");
    }

    @Override
    public void createServicePack(ServicePack servicePack) {
        this.servicePackDao.save(servicePack);
    }
}
