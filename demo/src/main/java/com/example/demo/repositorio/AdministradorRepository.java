package com.example.demo.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entidad.Administrador;


public interface AdministradorRepository extends JpaRepository<Administrador, Long> {
    
}