package com.example.demo.repositorio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entidad.Dueno;



@Repository
public interface DuenoRepository extends JpaRepository<Dueno, Long> {

    Dueno findByCedula(String cedula);

    //Dueno deleteByCedula(String cedula);

    //delete * from dueno where cedula = :cedula
    
}