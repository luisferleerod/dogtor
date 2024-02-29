package com.example.demo.servicio;
import java.util.Collection;

import com.example.demo.entidad.Dueno;



public interface DuenoService {

    
    public Dueno findById(Long id);

    public Collection<Dueno> findAll();

    public void deleteById(Long id);

    public void update(Dueno dueno);

    public void add(Dueno dueno);

    public Dueno findByCedula(String cedula);

    
}
