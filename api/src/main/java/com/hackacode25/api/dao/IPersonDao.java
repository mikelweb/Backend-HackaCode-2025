package com.hackacode25.api.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import com.hackacode25.api.model.Person;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonDao extends JpaRepository<Person, Integer> {


}
