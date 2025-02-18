package com.hackacode25.api.model;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import java.util.Date;

@Getter @Setter
@Entity
public class Doctor extends Person {

    private int id_doctor;
    private String especialidad;
    private String turnos_disponibles;
    private int sueldo;

    public Doctor() {

    }

    public Doctor(int id_persona,
                   String nombre,
                   String apellido,
                   String dni,
                   Date fecha_nac,
                   String email,
                   String telefono,
                   String direccion,
                   int id_doctor,
                   String especialidad,
                   String turnos_disponibles,
                   int sueldo) {

        this.id_doctor = id_doctor;
        this.especialidad = especialidad;
        this.turnos_disponibles = turnos_disponibles;
        this.sueldo = sueldo;
    }

    public enum Especialidad {
        CARDIOLOGÍA,
        DERMATOLOGÍA,
        PEDIATRÍA
    }
}
