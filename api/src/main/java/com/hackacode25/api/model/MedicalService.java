package com.hackacode25.api.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Medicalservice")
public class MedicalService {

    @Id
    @Column(name = "codigo_servicio")
    private int codigo_servicio;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "precio")
    private int precio;

    public MedicalService() {}

    public MedicalService(int codigo_servicio, String nombre, String descripcion, int precio) {
        this.codigo_servicio = codigo_servicio;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
    }
}
