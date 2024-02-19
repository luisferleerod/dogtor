package com.example.demo.repositorio;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Repository;
import com.example.demo.entidad.Mascota;

@Repository
public class MascotaRepository {
    private Map<Integer, Mascota> data_mascota = new HashMap<>();

    public MascotaRepository() {
        data_mascota.put(1, new Mascota("Pepito", "Pitbull", 2, 5.0, "Enfermedad", "url", "Activo"));
        data_mascota.put(2, new Mascota("Max", "Rottweiler", 8, 50.0, "Enfermedad", "url", "Activo"));
        data_mascota.put(3, new Mascota("Kira", "Criolla", 4, 20.0, "Epilepsia", "url", "Activo"));
        data_mascota.put(4, new Mascota("Sarita", "Golden", 14, 8.0, "Enfermedad", "url", "Activo"));
        data_mascota.put(5, new Mascota("Dash", "Shitsu", 12, 5.0, "Enfermedad", "url", "Activo"));
        data_mascota.put(6, new Mascota("SapoPerro", "Labrador", 2, 30.0, "Enfermedad", "url", "Activo"));
    }

    //Buscar por ID
    public Mascota findById(int id) {
        return data_mascota.get(id);
    }

    //Listar todas las mascotas
    public Collection<Mascota> findAll() {
        return data_mascota.values();
    }
}
