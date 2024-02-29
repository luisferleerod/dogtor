package com.example.demo.repositorio;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entidad.Dueno;
import com.example.demo.entidad.Mascota;

@Repository
public interface MascotaRepository extends JpaRepository<Mascota, Long> {

    
}