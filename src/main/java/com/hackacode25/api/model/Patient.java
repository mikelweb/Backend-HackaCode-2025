package com.hackacode25.api.model;

import java.util.Date;

public class Patient extends Person {

    private int id_paciente;

    public Patient() {

    }

    public Patient(int id_persona,
                   String nombre,
                   String apellido,
                   String dni,
                   Date fecha_nac,
                   String email,
                   String telefono,
                   String direccion,
                   int id_paciente) {

        super(id_persona,nombre,apellido,dni,fecha_nac, email, telefono, direccion);
        this.id_paciente = id_paciente;
    }

    public int getId_paciente() {
        return id_paciente;
    }

    public void setId_paciente(int id_paciente) {
        this.id_paciente = id_paciente;
    }
}
