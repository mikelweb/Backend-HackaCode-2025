package com.hackacode25.api.dao;
import com.hackacode25.api.model.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAppointmentDao extends JpaRepository<Appointment, Integer> {

}
