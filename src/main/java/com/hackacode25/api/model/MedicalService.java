package com.hackacode25.api.model;

public class MedicalService {

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

    public int getCodigo_servicio() {
        return codigo_servicio;
    }
    public String getNombre() {
        return nombre;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public int getPrecio() {
        return precio;
    }

    public void setCodigo_servicio(int codigo_servicio) {
        this.codigo_servicio = codigo_servicio;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public void setPrecio(int precio) {
        this.precio = precio;
    }
}
