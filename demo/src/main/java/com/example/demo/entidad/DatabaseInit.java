package com.example.demo.entidad;

import java.util.List;

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
        mascotaRepository.save(new Mascota("sparky", "shih tzu", 3, 4.2, "juguetón", "asa", "activo"));
        mascotaRepository.save(new Mascota("toby", "husky", 2, 7.8, "energético", "asa", "activo"));
        mascotaRepository.save(new Mascota("princess", "pomeranian", 1, 3.5, "adorable", "asa", "inactivo"));
        mascotaRepository.save(new Mascota("chico", "dachshund", 4, 5.1, "curioso", "asa", "activo"));
        mascotaRepository.save(new Mascota("ginger", "golden retriever", 5, 6.0, "juguetón", "asa", "inactivo"));
        mascotaRepository.save(new Mascota("roxy", "poodle", 2, 3.8, "alegre", "asa", "activo"));
        mascotaRepository.save(new Mascota("bentley", "bulldog", 3, 6.5, "relajado", "asa", "inactivo"));
        mascotaRepository.save(new Mascota("lulu", "labrador", 2, 4.0, "juguetón", "asa", "activo"));
        mascotaRepository.save(new Mascota("peanut", "beagle", 1, 5.2, "curioso", "asa", "inactivo"));
        mascotaRepository.save(new Mascota("mochi", "shihtzu", 4, 4.5, "tranquilo", "asa", "activo"));
        mascotaRepository.save(new Mascota("jasper", "corgi", 2, 6.8, "feliz", "asa", "inactivo"));
        mascotaRepository.save(new Mascota("izzy", "pug", 1, 3.3, "juguetón", "asa", "activo"));
        mascotaRepository.save(new Mascota("apollo", "german shepherd", 3, 8.0, "leal", "asa", "inactivo"));
        mascotaRepository.save(new Mascota("lola", "french bulldog", 2, 4.8, "juguetona", "asa", "activo"));
        mascotaRepository.save(new Mascota("cooper", "schnauzer", 5, 5.5, "inteligente", "asa", "inactivo"));
        mascotaRepository.save(new Mascota("lily", "maltese", 1, 2.5, "dulce", "asa", "activo"));
        mascotaRepository.save(new Mascota("dexter", "boxer", 4, 7.2, "amistoso", "asa", "inactivo"));
        mascotaRepository.save(new Mascota("sasha", "doberman", 3, 9.0, "vigilante", "asa", "activo"));
        mascotaRepository.save(new Mascota("zoe", "yorkshire terrier", 2, 3.7, "independiente", "asa", "inactivo"));
        mascotaRepository.save(new Mascota("chester", "rottweiler", 4, 8.5, "valiente", "asa", "activo"));
        mascotaRepository.save(new Mascota("bella", "labrador", 3, 5.0, "alegre", "asa", "inactivo"));
        mascotaRepository.save(new Mascota("coco", "great dane", 2, 9.8, "gentil", "asa", "activo"));
        mascotaRepository.save(new Mascota("leo", "english bulldog", 1, 4.3, "joven", "asa", "inactivo"));
        mascotaRepository.save(new Mascota("koda", "siberian husky", 5, 6.5, "amigable", "asa", "activo"));
        mascotaRepository.save(new Mascota("maddie", "border collie", 2, 4.5, "traviesa", "asa", "inactivo"));
        mascotaRepository.save(new Mascota("rusty", "golden doodle", 4, 7.0, "amoroso", "asa", "activo"));
        mascotaRepository.save(new Mascota("shadow", "chow chow", 3, 5.2, "leal", "asa", "inactivo"));
        mascotaRepository.save(new Mascota("luna", "akita", 2, 8.2, "divertida", "asa", "activo"));
        mascotaRepository.save(new Mascota("zeus", "bernese mountain dog", 4, 9.5, "fuerte", "asa", "inactivo"));
        mascotaRepository.save(new Mascota("nova", "shiba inu", 3, 6.0, "independiente", "asa", "activo"));
        mascotaRepository.save(new Mascota("jax", "australian shepherd", 1, 4.7, "activo", "asa", "inactivo"));
        mascotaRepository.save(new Mascota("oliver", "papillon", 5, 3.5, "inteligente", "asa", "activo"));
        mascotaRepository.save(new Mascota("zoey", "saint bernard", 2, 8.8, "gentil", "asa", "inactivo"));
        mascotaRepository.save(new Mascota("riley", "pomeranian", 3, 4.0, "juguetón", "asa", "activo"));
        mascotaRepository.save(new Mascota("moose", "mastiff", 4, 10.0, "tranquilo", "asa", "inactivo"));
        mascotaRepository.save(new Mascota("ivy", "cavalier king charles spaniel", 2, 3.2, "elegante", "asa", "activo"));
        mascotaRepository.save(new Mascota("tucker", "doberman", 1, 6.3, "activo", "asa", "inactivo"));
        mascotaRepository.save(new Mascota("daisy", "golden retriever", 3, 5.5, "dulce", "asa", "activo"));
        mascotaRepository.save(new Mascota("bruno", "bulldog", 2, 6.7, "juguetón", "asa", "inactivo"));
        mascotaRepository.save(new Mascota("lola", "pug", 4, 3.8, "amorosa", "asa", "activo"));
        mascotaRepository.save(new Mascota("jax", "siberian husky", 3, 7.0, "curioso", "asa", "inactivo"));
        mascotaRepository.save(new Mascota("sadie", "labrador", 1, 4.0, "juguetona", "asa", "activo"));
        mascotaRepository.save(new Mascota("max", "french bulldog", 2, 5.0, "adorable", "asa", "inactivo"));
        mascotaRepository.save(new Mascota("ruby", "corgi", 5, 6.5, "divertida", "asa", "activo"));
        mascotaRepository.save(new Mascota("bear", "pomeranian", 2, 3.5, "amoroso", "asa", "inactivo"));
        mascotaRepository.save(new Mascota("rosie", "golden doodle", 3, 7.2, "gentil", "asa", "activo"));
        mascotaRepository.save(new Mascota("jax", "german shepherd", 4, 8.0, "leal", "asa", "inactivo"));
        mascotaRepository.save(new Mascota("zoey", "shihtzu", 2, 4.8, "juguetona", "asa", "activo"));
        mascotaRepository.save(new Mascota("riley", "husky", 1, 6.5, "activo", "asa", "inactivo"));
        mascotaRepository.save(new Mascota("lily", "beagle", 3, 5.0, "curiosa", "asa", "activo"));
        mascotaRepository.save(new Mascota("rocky", "labrador", 2, 8.0, "juguetón", "asa", "inactivo"));
        mascotaRepository.save(new Mascota("luna", "boxer", 4, 7.5, "amorosa", "asa", "activo"));
        mascotaRepository.save(new Mascota("cooper", "yorkshire terrier", 1, 3.0, "curioso", "asa", "inactivo"));
        mascotaRepository.save(new Mascota("mila", "schnauzer", 3, 5.8, "juguetona", "asa", "activo"));
        mascotaRepository.save(new Mascota("charlie", "golden retriever", 2, 6.0, "amigable", "asa", "inactivo"));
        mascotaRepository.save(new Mascota("lola", "poodle", 1, 3.2, "dulce", "asa", "activo"));
        mascotaRepository.save(new Mascota("duke", "doberman", 5, 9.0, "vigilante", "asa", "inactivo"));
        mascotaRepository.save(new Mascota("lulu", "cavalier king charles spaniel", 2, 4.5, "elegante", "asa", "activo"));
        mascotaRepository.save(new Mascota("bentley", "french bulldog", 3, 6.7, "juguetón", "asa", "inactivo"));
        mascotaRepository.save(new Mascota("mia", "pug", 4, 3.8, "amorosa", "asa", "activo"));
        mascotaRepository.save(new Mascota("max", "siberian husky", 1, 7.0, "curioso", "asa", "inactivo"));
        mascotaRepository.save(new Mascota("sophie", "labrador", 3, 4.0, "juguetona", "asa", "activo"));
        mascotaRepository.save(new Mascota("bear", "german shepherd", 2, 8.0, "leal", "asa", "inactivo"));
        mascotaRepository.save(new Mascota("lola", "shihtzu", 5, 5.0, "juguetona", "asa", "activo"));
        mascotaRepository.save(new Mascota("leo", "schnauzer", 2, 6.0, "amistoso", "asa", "inactivo"));
        mascotaRepository.save(new Mascota("oliver", "golden doodle", 1, 4.5, "juguetón", "asa", "activo"));
        mascotaRepository.save(new Mascota("luna", "corgi", 4, 5.5, "curiosa", "asa", "inactivo"));
        mascotaRepository.save(new Mascota("tucker", "beagle", 3, 6.0, "amigable", "asa", "activo"));
        mascotaRepository.save(new Mascota("daisy", "pug", 2, 3.5, "dulce", "asa", "inactivo"));
        mascotaRepository.save(new Mascota("rocky", "golden retriever", 5, 7.2, "juguetón", "asa", "activo"));
        mascotaRepository.save(new Mascota("molly", "schnauzer", 2, 4.5, "amorosa", "asa", "inactivo"));
        mascotaRepository.save(new Mascota("zeus", "husky", 4, 8.0, "juguetón", "asa", "activo"));
        mascotaRepository.save(new Mascota("abby", "labrador", 3, 5.5, "amigable", "asa", "inactivo"));
        mascotaRepository.save(new Mascota("max", "french bulldog", 2, 6.0, "juguetón", "asa", "activo"));
        mascotaRepository.save(new Mascota("lily", "pomeranian", 1, 3.5, "dulce", "asa", "inactivo"));
        mascotaRepository.save(new Mascota("charlie", "boxer", 3, 7.0, "amoroso", "asa", "activo"));
        mascotaRepository.save(new Mascota("sophie", "siberian husky", 2, 5.0, "juguetona", "asa", "inactivo"));
        mascotaRepository.save(new Mascota("leo", "golden retriever", 4, 6.5, "curioso", "asa", "activo"));
        mascotaRepository.save(new Mascota("mia", "poodle", 3, 4.0, "amistosa", "asa", "inactivo"));
        mascotaRepository.save(new Mascota("rocky", "doberman", 2, 8.5, "vigilante", "asa", "activo"));
        mascotaRepository.save(new Mascota("lola", "cavalier king charles spaniel", 1, 3.8, "elegante", "asa", "inactivo"));
        mascotaRepository.save(new Mascota("cooper", "french bulldog", 4, 6.0, "juguetón", "asa", "activo"));
        mascotaRepository.save(new Mascota("zoey", "pug", 2, 3.2, "amorosa", "asa", "inactivo"));
        mascotaRepository.save(new Mascota("bentley", "labrador", 3, 7.0, "activo", "asa", "activo"));
        mascotaRepository.save(new Mascota("lulu", "corgi", 1, 4.2, "juguetona", "asa", "inactivo"));
        mascotaRepository.save(new Mascota("sadie", "golden retriever", 5, 6.5, "amigable", "asa", "activo"));
        mascotaRepository.save(new Mascota("max", "beagle", 2, 5.0, "juguetón", "asa", "inactivo"));
        mascotaRepository.save(new Mascota("milo", "shiba inu", 3, 6.0, "activo", "asa", "activo"));
        mascotaRepository.save(new Mascota("lola", "cavalier king charles spaniel", 4, 5.5, "elegante", "asa", "inactivo"));
        mascotaRepository.save(new Mascota("charlie", "schnauzer", 2, 6.5, "juguetón", "asa", "activo"));
        mascotaRepository.save(new Mascota("daisy", "bulldog", 3, 4.0, "amistosa", "asa", "inactivo"));
        mascotaRepository.save(new Mascota("rocky", "husky", 1, 8.0, "juguetón", "asa", "activo"));
        mascotaRepository.save(new Mascota("lily", "pug", 2, 3.5, "dulce", "asa", "inactivo"));
        mascotaRepository.save(new Mascota("bella", "labrador", 5, 7.2, "juguetona", "asa", "activo"));
        mascotaRepository.save(new Mascota("cooper", "siberian husky", 2, 4.5, "amoroso", "asa", "inactivo"));
        mascotaRepository.save(new Mascota("luna", "golden doodle", 3, 6.0, "juguetona", "asa", "activo"));
        mascotaRepository.save(new Mascota("milo", "doberman", 1, 9.0, "vigilante", "asa", "inactivo"));
        mascotaRepository.save(new Mascota("zoe", "french bulldog", 4, 4.8, "juguetona", "asa", "activo"));
        mascotaRepository.save(new Mascota("charlie", "shiba inu", 2, 6.5, "activo", "asa", "inactivo"));
        mascotaRepository.save(new Mascota("lola", "beagle", 3, 5.0, "curiosa", "asa", "activo"));
        mascotaRepository.save(new Mascota("max", "labrador", 1, 8.0, "juguetón", "asa", "inactivo"));

        

        duenoRepository.save(new Dueno("1234", "Juan", "juancito@juancito", "11111"));
        duenoRepository.save(new Dueno("4321", "Pedro", "pedro@pedro", "22222"));
        duenoRepository.save(new Dueno("789", "Maria", "maria@maria", "33333"));


        // //asociar mascotas a dueños
        // Dueno asociar= duenoRepository.findById(1L).get();
        // for(Mascota m: mascotaRepository.findAll()){
        //     m.setDueno(asociar);
        //     mascotaRepository.save(m);
        // }


         // Obtener los dueños por id
        Dueno dueno1 = duenoRepository.findById(1L).get();
        Dueno dueno2 = duenoRepository.findById(2L).get();
        Dueno dueno3 = duenoRepository.findById(3L).get();

        // Obtener todas las mascotas
        List<Mascota> mascotas = mascotaRepository.findAll();

        // Asociar las primeras 33 mascotas al dueño 1
        for (int i = 0; i < 33 && i < mascotas.size(); i++) {
            mascotas.get(i).setDueno(dueno1);
            mascotaRepository.save(mascotas.get(i));
        }

        // Asociar las siguientes 33 mascotas al dueño 2
        for (int i = 33; i < 66 && i < mascotas.size(); i++) {
            mascotas.get(i).setDueno(dueno2);
            mascotaRepository.save(mascotas.get(i));
        }

        // Asociar las últimas mascotas al dueño 3
        for (int i = 66; i < mascotas.size(); i++) {
            mascotas.get(i).setDueno(dueno3);
            mascotaRepository.save(mascotas.get(i));
        }
    }
}
