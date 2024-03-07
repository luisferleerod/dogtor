package com.example.demo.controlador;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.entidad.Dueno;
import com.example.demo.entidad.Mascota;
import com.example.demo.errorHandling.notFoundException;
import com.example.demo.servicio.DuenoService;
import com.example.demo.servicio.MascotaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;




@RequestMapping("/mascotas")
@Controller
public class MascotaController {
    @Autowired
    MascotaService mascotaService;

    @Autowired
    DuenoService duenoService;

    // http://localhost:8090/mascotas/all
    @GetMapping("/all")
    public String Mostrarmascotas(Model model) {
        model.addAttribute("mascotas", mascotaService.findAll());
        return "mostrarTodasMascotas";
    }

    // http://localhost:8090/mascotas/find/1
    @GetMapping("/find/{id}")
    public String MostrarInfoMascota(Model model, @PathVariable("id") Long id) {
        try {
            Mascota mascota = mascotaService.findById(id);
            model.addAttribute("mascota", mascota);
            return "mostrarMascota";
        } catch (NoSuchElementException ex) {
            throw new notFoundException(id);
        }
    }

    
    

    // http://localhost:8090/mascotas/add
    @GetMapping("/add")
    public String mostrarFormularioCrear(Model model) {
        
        Mascota mascota = new Mascota(null, null, null, 0, null, null, null, null);
        mascota.setEstado("Activo");
        model.addAttribute("mascota", mascota);
        return "nuevoPaciente";
    }

    @PostMapping("/agregar")
    public String agregarMascota(@ModelAttribute("mascota") Mascota mascota, Model model) {

        // Dueno dueno = duenoService.findByCedula(mascota.getDueno().getCedula());

        // mascota.setDueno(dueno);

        

        // mascotaService.add(mascota);

        
        // return "redirect:/mascotas/all";

        
        Dueno dueno = duenoService.findByCedula(mascota.getDueno().getCedula());

        if(dueno != null){
            mascota.setDueno(dueno);

            mascotaService.update(mascota);
    
            return "redirect:/mascotas/all";
            
           
        }
        else{
            model.addAttribute("error", "Cédula incorrecta");
            model.addAttribute("cedulaNoExiste", true);
            
            return "redirect:/mascotas/add";
        }
        
            

        }
    
    
    @GetMapping("/delete/{id}")
    public String borrarMascota(@PathVariable("id") Long id) {
        // Obtener la mascota por ID
        Mascota mascota = mascotaService.findById(id);
    
        // Verificar si la mascota existe
        if (mascota != null) {
            // Cambiar el estado de la mascota a "inactivo"
            mascota.setEstado("inactivo"); // Suponiendo que tienes un campo "estado" en tu entidad Mascota
    
            // Guardar la mascota actualizada en la base de datos
            mascotaService.update(mascota);
        }
    
        // Redirigir a la página que muestra todas las mascotas
        return "redirect:/mascotas/all";
    }
    

    @GetMapping("/update/{id}")
    public String mostrarFormularioUpdate(@PathVariable("id") Long id, Model model) {
        model.addAttribute("mascota", mascotaService.findById(id));
        return "actualizarMascota";
    }

    @PostMapping("/update/{id}")
    public String actualizarMascota(@ModelAttribute("mascota") Mascota mascota, Model model) {
        

        Dueno dueno = duenoService.findByCedula(mascota.getDueno().getCedula());

        if(dueno != null){
            mascota.setDueno(dueno);

            mascotaService.update(mascota);
    
            return "redirect:/mascotas/all";
            
           
        }
        else{
            model.addAttribute("error", "Cédula incorrecta");
            model.addAttribute("cedulaNoExiste", true);
            
            return "redirect:/mascotas/update/{id}";
        }
        
            

        }
      
    
}
