package com.hackacode25.api.model;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.Date;

@Getter @Setter
@Inheritance(strategy = InheritanceType.JOINED)
@Entity
public abstract class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected int id_persona;
    private String nombre;
    private String apellido;
    private String dni;
    private Date fecha_nac;
    private String email;
    private String telefono;
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
