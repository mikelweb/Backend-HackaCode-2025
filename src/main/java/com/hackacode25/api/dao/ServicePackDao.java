package com.hackacode25.api.dao;
import com.hackacode25.api.model.ServicePack;
import java.util.List;

public interface ServicePackDao {
    ServicePack getServicePack(int codigo_paquete);
    List<Integer> getServicePacks();
    void deleteServicePack(int codigo_paquete);
    void updateServicePack(ServicePack servicePack);
    void createServicePack(ServicePack servicePack);
}
