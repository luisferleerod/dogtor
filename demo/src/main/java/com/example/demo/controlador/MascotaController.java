package com.example.demo.controlador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner.Mode;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.servicio.MascotaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RequestMapping("/mascotas")
@Controller
public class MascotaController {
    @Autowired
    MascotaService mascotaService;

    // http://localhost:8090/mascotas/all
    @GetMapping("/all")
    public String Mostrarmascotas(org.springframework.ui.Model model) {
        model.addAttribute("mascotas", mascotaService.findAll());
        return "MostrarTodasMascotas";
    }

    // http://localhost:8090/mascotas/find/1
    @GetMapping("/find/{id}")
    public String MostrarInfoMascota(Model model, @PathVariable("id") int id) {
        model.addAttribute("mascota", mascotaService.findById(id));
        return "mostrar_mascota";
    }

}
