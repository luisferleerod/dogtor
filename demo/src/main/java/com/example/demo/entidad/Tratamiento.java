package com.example.demo.entidad;

import java.time.LocalDate;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Tratamiento {
    
    private LocalDate fecha;

    @ManyToOne
    private Mascota mascota;

    @ManyToOne
    private Droga droga;

    @ManyToOne
    private Veterinario veterinario;

    @Id
    @GeneratedValue
    private Long id;

    public Tratamiento() {
        
    }

    public Tratamiento(Long id, LocalDate fecha, Mascota mascota, Droga droga, Veterinario veterinario) {
        
        this.id = id;
        
        this.fecha = fecha;
        this.mascota = mascota;
        this.droga = droga;
        this.veterinario = veterinario;

    }

    public Tratamiento(LocalDate fecha, Mascota mascota, Droga droga, Veterinario veterinario) {
        this.fecha = fecha;
        this.mascota = mascota;
        this.droga = droga;
        this.veterinario = veterinario;
    }

    public Tratamiento(LocalDate fecha){
        this.fecha = fecha;
    }

    public Tratamiento(String fecha){
        this.fecha = LocalDate.parse(fecha);
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    public Droga getDroga() {
        return droga;
    }

    public void setDroga(Droga droga) {
        this.droga = droga;
    }

    public Veterinario getVeterinario() {
        return veterinario;
    }

    public void setVeterinario(Veterinario veterinario) {
        this.veterinario = veterinario;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    
}
