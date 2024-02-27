package com.example.demo.controlador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.entidad.Mascota;
import com.example.demo.servicio.MascotaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RequestMapping("/mascotas")
@Controller
public class MascotaController {
    @Autowired
    MascotaService mascotaService;

    // http://localhost:8090/mascotas/all
    @GetMapping("/all")
    public String Mostrarmascotas(Model model) {
        model.addAttribute("mascotas", mascotaService.findAll());
        return "mostrarTodasMascotas";
    }

    // http://localhost:8090/mascotas/find/1
    @GetMapping("/find/{id}")
    public String MostrarInfoMascota(Model model, @PathVariable("id") int id) {
        model.addAttribute("mascota", mascotaService.findById(id));
        return "mostrarMascota";
    }

    // http://localhost:8090/mascotas/add
    @GetMapping("/add")
    public String mostrarFormularioCrear(Model model) {
        
        Mascota mascota = new Mascota(0, "", "", 0, 0.0, "", "", "");
        model.addAttribute("mascota", mascota);
        return "crearMascota";
    }

    @PostMapping("/agregar")
    public String agregarMascota(@ModelAttribute("mascota") Mascota mascota) {
        mascotaService.add(mascota);

        
        return "redirect:/mascotas/all";
    }
    
    @GetMapping("/delete/{id}")
    public String borrarMascota(@PathVariable("id") int id) {
        mascotaService.deleteById(id);

        return "redirect:/mascotas/all";
    }

    @GetMapping("/update/{id}")
    public String mostrarFormularioUpdate(@PathVariable("id") int id, Model model) {
        model.addAttribute("mascota", mascotaService.findById(id));
        return "actualizarMascota";
    }

    @PostMapping("/update/{id}")
    public String actualizarMascota(@ModelAttribute("mascota") Mascota mascota) {
        
        mascotaService.update(mascota);

        return "redirect:/mascotas/all";
    }
}
