package com.example.demo.repositorio;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Repository;

import com.example.demo.entidad.Dueno;
import com.example.demo.entidad.Mascota;

@Repository
public class MascotaRepository {
    private Map<Integer, Mascota> data_mascota = new HashMap<>();

    public MascotaRepository() {
        data_mascota.put(1, new Mascota(1,"Sarita", "Pitbull", 14, 8.0, "Enfermedad", "https://cdn.pixabay.com/photo/2023/10/17/05/25/fox-squirrel-8320423_1280.jpg", "Activo", new Dueno("1234", "Juan", "a@a.com", "1234567890")));
        data_mascota.put(2, new Mascota(2, "Max", "Rottweiler", 8, 50.0, "Enfermedad", "url", "Activo", new Dueno("1234", "Juan", "a@a.com", "1234567890")));
        data_mascota.put(3, new Mascota(3, "Kira", "Criolla", 4, 20.0, "Epilepsia", "url", "Activo", new Dueno("5678", "Pedro", "b@b.com", "1234567890")));
        data_mascota.put(4, new Mascota(4, "Pepito", "Golden", 5, 16.0, "Enfermedad", "url", "Activo", new Dueno("5678", "Pedro", "b@b.com", "1234567890")));
        data_mascota.put(5, new Mascota(5, "Dash", "Shitsu", 12, 5.0, "Enfermedad", "url", "Activo", new Dueno("5678", "Pedro", "b@b.com", "1234567890")));
        data_mascota.put(6, new Mascota(6, "SapoPerro", "Labrador", 2, 30.0, "Enfermedad", "url", "Activo", new Dueno("9012", "Maria", "c@c.com", "1234567890")));
        data_mascota.put(7, new Mascota(7, "Juanito", "Rottweiler", 8, 50.0, "Enfermedad", "url", "Activo", new Dueno("9012", "Maria", "c@c.com", "1234567890")));
        data_mascota.put(8, new Mascota(8, "Pepe", "Criolla", 4, 20.0, "Epilepsia", "url", "Activo", new Dueno("9012", "Maria", "c@c.com", "1234567890")));
        data_mascota.put(9, new Mascota(9, "Carlos", "Golden", 4, 16.0, "Enfermedad", "url", "Activo", new Dueno("9012", "Maria", "c@c.com", "1234567890")));
        data_mascota.put(10, new Mascota(10, "Andres", "Shitsu", 13, 5.0, "Enfermedad", "url", "Activo", new Dueno("9012", "Maria", "c@c.com", "1234567890")));
        data_mascota.put(11, new Mascota(11, "Blue", "Labrador", 1, 26.0, "Enfermedad", "url", "Activo", new Dueno("9012", "Maria", "c@c.com", "1234567890")));
    }

    //Buscar por ID
    public Mascota findById(int id) {
        return data_mascota.get(id);
    }

    //Listar todas las mascotas
    public Collection<Mascota> findAll() {
        return data_mascota.values();
    }

    //Metodos CRUD

    public void deleteById(int id) {
        data_mascota.remove(id);
    }

    public void update(Mascota mascota) {
        data_mascota.put(mascota.getId(), mascota);
    }

    public void add(Mascota mascota) {
        int tam = data_mascota.size();
        int lastId = data_mascota.get(tam).getId();

        mascota.setId(lastId + 1);
        data_mascota.put(mascota.getId(), mascota);
    }
}
