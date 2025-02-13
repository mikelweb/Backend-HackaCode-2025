package com.hackacode25.api.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Servicepack")
public class ServicePack {

    @Id
    @Column(name = "codigo_paquete")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int codigo_paquete;
    @Column(name = "lista_servicios_incluidos")
    private List<Integer> lista_servicios_incluidos;
    @Column(name = "precio_paquete")
    private float precio_paquete;

    public ServicePack() {}

    public ServicePack(int codigo_paquete, List<Integer> lista_servicios_incluidos, int precio_paquete) {
        this.codigo_paquete = codigo_paquete;
        this.lista_servicios_incluidos = new ArrayList<>(lista_servicios_incluidos);
        this.precio_paquete = precio_paquete;
    }

    public float calcularPrecioPaquete() {

        int precio = 0;
        float descuento = 0.15f;

        /*for(MedicalService medicalService : this.lista_servicios_incluidos) {
            precio += medicalService.getPrecio();
        }*/

        return precio * (1-descuento);
    }
}
