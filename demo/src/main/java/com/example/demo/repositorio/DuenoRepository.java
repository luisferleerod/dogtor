package com.example.demo.repositorio;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Repository;

import com.example.demo.entidad.Dueno;



@Repository
public class DuenoRepository {
    private Map<String, Dueno> data_dueno = new HashMap<>();

    public DuenoRepository() {
        data_dueno.put("1234", new Dueno("1234", "Juan", "a@a.com", "1234567890"));
        data_dueno.put("5678", new Dueno("5678", "Pedro", "b@b.com", "1234567890"));
        data_dueno.put("9012", new Dueno("9012", "Maria", "c@c.com", "1234567890"));

    }

    //Buscar por ID
    public Dueno findByCedula(String cedula) {
        return data_dueno.get(cedula);
    }

    //Listar todas las mascotas
    public Collection<Dueno> findAll() {
        return data_dueno.values();
    }

    //Metodos CRUD

    public void deleteByCedula(String cedula) {
        data_dueno.remove(cedula);
    }

    public void update(Dueno dueno) {
        data_dueno.put(dueno.getCedula(), dueno);

    }

    public void add(Dueno dueno) {

        data_dueno.put(dueno.getCedula(), dueno);
    }
}
