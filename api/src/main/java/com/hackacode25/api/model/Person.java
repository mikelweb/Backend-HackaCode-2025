package com.hackacode25.api.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "Person")
public class Person {

    @Id
    @Column(name = "id_persona")
    protected int id_persona;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellido")
    private String apellido;

    @Column(name = "dni")
    private String dni;

    @Column(name = "fecha_nac")
    private Date fecha_nac;

    @Column(name = "email")
    private String email;

    @Column(name = "telefono")
    private String telefono;

    @Column(name = "direccion")
    private String direccion;

    public Person() { }
    public Person(int id_persona, String nombre, String apellido, String dni, Date fecha_nac, String email, String telefono, String direccion) {
        this.id_persona = id_persona;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fecha_nac = fecha_nac;
        this.email = email;
        this.telefono = telefono;
        this.direccion = direccion;
    }
}
