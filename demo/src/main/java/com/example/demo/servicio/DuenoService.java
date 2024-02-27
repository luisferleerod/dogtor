package com.example.demo.servicio;
import java.util.Collection;

import com.example.demo.entidad.Dueno;



public interface DuenoService {

    
    public Dueno findByCedula(String cedula);

    public Collection<Dueno> findAll();

    public void deleteByCedula(String cedula);

    public void update(Dueno dueno);

    public void add(Dueno dueno);
}
