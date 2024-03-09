package com.example.demo.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entidad.Especialidad;

public interface EspecialidadRepository extends JpaRepository<Especialidad, Long> {
    
}
