package com.hackacode25.api.model;

import lombok.Getter;
import lombok.Setter;
import java.util.Date;

@Getter
@Setter
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
}
