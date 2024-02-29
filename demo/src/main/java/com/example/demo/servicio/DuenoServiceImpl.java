package com.example.demo.servicio;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entidad.Dueno;

import com.example.demo.repositorio.DuenoRepository;

@Service
public class DuenoServiceImpl implements DuenoService{
    @Autowired
    DuenoRepository duenoRepository;

     @Override
    public Dueno findById(Long id) {
        return duenoRepository.findById(id).get();
    }

    @Override
    public Dueno findByCedula(String cedula){
        return duenoRepository.findByCedula(cedula);
    }

    @Override
    public void deleteById(Long id) {
        duenoRepository.deleteById(id);
    }

    @Override
    public Collection<Dueno> findAll() {
        return duenoRepository.findAll();
    }

    @Override
    public void update(Dueno dueno) {
        duenoRepository.save(dueno);
    }
    
    @Override
    public void add(Dueno dueno) {
        duenoRepository.save(dueno);
    }
}
