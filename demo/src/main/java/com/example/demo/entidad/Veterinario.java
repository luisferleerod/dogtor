package com.example.demo.entidad;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Veterinario {
    

    private String usuario;
    private String contrasena;
    private String foto;
    private int numAtenciones;
    private String nombre;
    private String estado;
    
    @ManyToOne
    private Especialidad especialidad;

    @Id
    @GeneratedValue
    private Long id;

    @OneToMany(mappedBy = "veterinario")
    private List<Tratamiento> tratamientos = new ArrayList<>();

    public Veterinario() {
        
    }

    public Veterinario(Long id, String usuario, String contrasena, Especialidad especialidad, String foto, int numAtenciones, String nombre, String estado) {
        this.id = id;
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.especialidad = especialidad;
        this.foto = foto;
        this.numAtenciones = numAtenciones;
        this.nombre = nombre;
        this.estado = estado;

    }

    public Veterinario(String usuario, String contrasena, String foto, int numAtenciones, String nombre, String estado) {
        this.usuario = usuario;
        this.contrasena = contrasena;
        
        this.foto = foto;
        this.numAtenciones = numAtenciones;
        this.nombre = nombre;
        this.estado = estado;

    }

    public String getUsuario() {
        return usuario;
    }


    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }


    public String getContrasena() {
        return contrasena;
    }


    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }


    public Especialidad getEspecialidad() {
        return especialidad;
    }


    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }


    public String getFoto() {
        return foto;
    }


    public void setFoto(String foto) {
        this.foto = foto;
    }


    public int getNumAtenciones() {
        return numAtenciones;
    }


    public void setNumAtenciones(int numAtenciones) {
        this.numAtenciones = numAtenciones;
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getEstado() {
        return estado;
    }


    public void setEstado(String estado) {
        this.estado = estado;
    }


    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }

    public List<Tratamiento> getTratamientos() {
        return tratamientos;
    }

    public void setTratamientos(List<Tratamiento> tratamientos) {
        this.tratamientos = tratamientos;
    }

    


}

