package com.hackacode25.api.dao;
import com.hackacode25.api.model.ServicePack;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IServicePackDao extends JpaRepository<ServicePack, Integer> { }
