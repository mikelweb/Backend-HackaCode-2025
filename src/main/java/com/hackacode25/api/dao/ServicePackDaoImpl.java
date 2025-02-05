package com.hackacode25.api.dao;
import com.hackacode25.api.model.ServicePack;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Repository
@Transactional
public class ServicePackDaoImpl implements ServicePackDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Transactional
    public ServicePack getServicePack(int codigo_paquete) {
        return this.entityManager.find(ServicePack.class, codigo_paquete);
    }

    @Override
    public List<Integer> getServicePacks() {
        String query = "FROM ServicePack";
        return this.entityManager.createQuery(query).getResultList();
    }

    @Override
    public void deleteServicePack(int codigo_paquete) {
        ServicePack servicePack = this.entityManager.find(ServicePack.class, codigo_paquete);
        this.entityManager.remove(servicePack);
    }

    @Override
    public void updateServicePack(ServicePack servicePack) {
        this.entityManager.merge(servicePack);
    }

    @Override
    public void createServicePack(ServicePack servicePack) {
        this.entityManager.persist(servicePack);
    }
}
