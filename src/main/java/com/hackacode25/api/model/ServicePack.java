package com.hackacode25.api.model;

import java.util.ArrayList;
import java.util.List;

public class ServicePack {
    private int codigo_paquete;
    private List<MedicalService> lista_servicios_incluidos;
    private float precio_paquete;

    public ServicePack() {}

    public ServicePack(int codigo_paquete, List<MedicalService> lista_servicios_incluidos, int precio_paquete) {
        this.codigo_paquete = codigo_paquete;
        this. lista_servicios_incluidos = new ArrayList<>(lista_servicios_incluidos);
        this.precio_paquete = precio_paquete;
    }

    public int getCodigo_paquete() {
        return codigo_paquete;
    }
    public List<MedicalService> getLista_servicios_incluidos() {
        return lista_servicios_incluidos;
    }
    public float getPrecio_paquete() {
        return precio_paquete;
    }

    public void setCodigo_paquete(int codigo_paquete) {
        this.codigo_paquete = codigo_paquete;
    }
    public void setLista_servicios_incluidos(List<MedicalService> lista_servicios_incluidos) {
        this.lista_servicios_incluidos = lista_servicios_incluidos;
    }
    public void setPrecio_paquete(float precio_paquete) {
        this.precio_paquete = precio_paquete;
    }

    public float calcularPrecioPaquete() {

        int precio = 0;
        float descuento = 0.15f;

        for(MedicalService medicalService : this.lista_servicios_incluidos) {
            precio += medicalService.getPrecio();
        }

        return precio * (1-descuento);
    }
}
