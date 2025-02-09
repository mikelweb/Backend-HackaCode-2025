package com.hackacode25.api.model;

import java.util.Date;

public class Doctor extends Person {

    private int id_doctor;
    private Especialidad especialidad;
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
                   Especialidad especialidad,
                   String turnos_disponibles,
                   int sueldo) {

        super(id_persona,nombre,apellido,dni,fecha_nac, email, telefono, direccion);
        this.id_doctor = id_doctor;
        this.especialidad = especialidad;
        this.turnos_disponibles = turnos_disponibles;
        this.sueldo = sueldo;
    }

    public int getId_doctor() {
        return id_doctor;
    }
    public Especialidad getEspecialidad() {
        return especialidad;
    }
    public String getTurnos_disponibles() {
        return turnos_disponibles;
    }
    public int getSueldo() {
        return sueldo;
    }

    public void setId_doctor(int id_doctor) {
        this.id_doctor = id_doctor;
    }
    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }
    public void setTurnos_disponibles(String turnos_disponibles) {
        this.turnos_disponibles = turnos_disponibles;
    }
    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public enum Especialidad {
        CARDIOLOGÍA,
        DERMATOLOGÍA,
        PEDIATRÍA
    }
}
