package com.example.demo.servicio;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entidad.Mascota;
import com.example.demo.repositorio.MascotaRepository;

@Service
public class MascotaServiceImpl implements MascotaService {
    @Autowired
    MascotaRepository mascotaRepository;

    @Override
    public Mascota findById(int id) {
        return mascotaRepository.findById(id);
    }

    @Override
    public Collection<Mascota> findAll() {
        return mascotaRepository.findAll();
    }

    @Override
    public void deleteById(int id) {
        mascotaRepository.deleteById(id);
    }

    @Override
    public void update(Mascota mascota) {
        mascotaRepository.update(mascota);
    }
    
    @Override
    public void add(Mascota mascota) {
        mascotaRepository.add(mascota);
    }
}
