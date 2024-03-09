package com.example.demo.entidad;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Especialidad {
    @Id
    @GeneratedValue
    private Long id;

    private String especialidad;

    @OneToMany(mappedBy = "especialidad")
    private List<Veterinario> veterinarios = new ArrayList<>();

    public Especialidad() {
        
    }

    public Especialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public Especialidad(Long id, String especialidad) {
        this.id = id;
        this.especialidad = especialidad;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public List<Veterinario> getVeterinarios() {
        return veterinarios;
    }

    public void setVeterinarios(List<Veterinario> veterinarios) {
        this.veterinarios = veterinarios;
    }

   
    

}
