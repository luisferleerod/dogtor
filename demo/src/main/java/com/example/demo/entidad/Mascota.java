package com.example.demo.entidad;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;


//POJO (Plain Old Java Object)
//Crea la tabla acorde a la entidad
@Entity 
public class Mascota {
    

    private String nombre;
    private String raza;
    private int edad;
    private Double peso;
    private String enfermedad;
    private String foto;
    private String estado;
    
    @ManyToOne
    private Dueno dueno;

    @Id
    @GeneratedValue
    private Long id;

    public Mascota(Long id, String nombre, String raza, int edad, Double peso, String enfermedad, String foto, String estado) {
        this.id = id;
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.peso = peso;
        this.enfermedad = enfermedad;
        this.foto = foto;
        this.estado = estado;
        // this.dueno = dueno;
    }

    public Mascota() {
        
    }

    public Mascota( String nombre, String raza, int edad, Double peso, String enfermedad, String foto, String estado) {
        
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.peso = peso;
        this.enfermedad = enfermedad;
        this.foto = foto;
        this.estado = estado;
        // this.dueno = dueno;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public String getEnfermedad() {
        return enfermedad;
    }

    public void setEnfermedad(String enfermedad) {
        this.enfermedad = enfermedad;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }



    public Dueno getDueno() {
        return dueno;
    }



    public void setDueno(Dueno dueno) {
        this.dueno = dueno;
    }

}
