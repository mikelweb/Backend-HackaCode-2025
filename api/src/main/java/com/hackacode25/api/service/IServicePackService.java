package com.hackacode25.api.service;
import com.hackacode25.api.model.MedicalService;
import com.hackacode25.api.model.ServicePack;
import java.util.List;

public interface IServicePackService {
    public ServicePack getServicePack(int codigo_paquete);
    public List<ServicePack> getServicePacks();
    public void deleteServicePack(int codigo_paquete);
    public void updateServicePack(int codigo_paquete, ServicePack servicePack);
    public void createServicePack(ServicePack servicePack);
}
