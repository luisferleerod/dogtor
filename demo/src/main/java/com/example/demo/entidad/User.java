package com.example.demo.entidad;

public class User {
    private String nombre;
    private String cedula;
    private String especialidad;
    private int numero_atencion;
    

    public User(String nombre, String cedula, String especialidad, int numero_atencion) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.especialidad = especialidad;
        this.numero_atencion = numero_atencion;
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getCedula() {
        return cedula;
    }


    public void setCedula(String cedula) {
        this.cedula = cedula;
    }


    public String getEspecialidad() {
        return especialidad;
    }


    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }


    public int getNumero_atencion() {
        return numero_atencion;
    }


    public void setNumero_atencion(int numero_atencion) {
        this.numero_atencion = numero_atencion;
    }

    

}
