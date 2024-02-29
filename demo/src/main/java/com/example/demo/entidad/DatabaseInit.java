package com.example.demo.entidad;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Controller;

import com.example.demo.repositorio.DuenoRepository;
import com.example.demo.repositorio.MascotaRepository;

import jakarta.transaction.Transactional;

@Controller
@Transactional
public class DatabaseInit implements ApplicationRunner{

    @Autowired
    DuenoRepository duenoRepository;

    @Autowired
    MascotaRepository mascotaRepository;
    @Override
    public void run(ApplicationArguments args) throws Exception {
        mascotaRepository.save(new Mascota("dash", "puddle", 2, 3.0, "depre", "asa", "activo"));
        mascotaRepository.save(new Mascota("rocky", "rotweiller", 4, 8.5, "amsieda", "asa", "activo"));
        mascotaRepository.save(new Mascota("max", "labrador", 12, 5.0, "sueño", "asa", "activo"));
        

        duenoRepository.save(new Dueno("1234", "Juan", "juancito@juancito", "11111"));
        duenoRepository.save(new Dueno("4321", "Pedro", "pedro@pedro", "22222"));
        duenoRepository.save(new Dueno("789", "Maria", "maria@maria", "33333"));


        //asociar mascotas a dueños
        Dueno asociar= duenoRepository.findById(1L).get();
        for(Mascota m: mascotaRepository.findAll()){
            m.setDueno(asociar);
            mascotaRepository.save(m);
        }
    }
}
