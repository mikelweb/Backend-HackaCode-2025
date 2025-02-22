package com.hackacode25.api.model;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name="Medicalservice")
public class MedicalService {

    @Id
    private int codigo_servicio;
    private String nombre;
    private String descripcion;
    private int precio;

    public MedicalService() {}

    public MedicalService(int codigo_servicio, String nombre, String descripcion, int precio) {
        this.codigo_servicio = codigo_servicio;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
    }
}
