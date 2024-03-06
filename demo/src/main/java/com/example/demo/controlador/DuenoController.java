package com.example.demo.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.entidad.Dueno;

import com.example.demo.servicio.DuenoService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;






@RequestMapping("/dueno")
@Controller
public class DuenoController {
    @Autowired
    DuenoService duenoService;


    @GetMapping("/inicioSesion")
    public String mostrarFormularioInicioSesion(Model model) {
        Dueno dueno = new Dueno( "", "", "", "");  // Puedes inicializar un objeto Dueno si es necesario
        model.addAttribute("dueno", dueno);
        return "inicioSesion";
    }


    @PostMapping("/inicioSesion")
    public String iniciarSesion(@ModelAttribute("dueno") Dueno dueno, Model model) {
        Dueno duenoEncontrado = duenoService.findByCedula(dueno.getCedula());
    
        if (duenoEncontrado != null) {
            // Agregar el objeto Dueno al modelo
            model.addAttribute("dueno", duenoEncontrado);
            // Redirigir a una página que muestre los detalles del usuario
            return "mostrarDueno";
        } else {
            model.addAttribute("error", "Cédula incorrecta");
            model.addAttribute("cedulaNoExiste", true);
            return "inicioSesion";
        }
    }
    


    

    @GetMapping("/all")
    public String MostrarDuenos(Model model) {
        model.addAttribute("duenos", duenoService.findAll());
        return "mostrarTodosDuenos";
    }

    @GetMapping("/find/{cedula}")
    public String MostrarInfoDueno(Model model, @PathVariable("cedula") String cedula) {
        
        Dueno dueno = duenoService.findByCedula(cedula);
        if(dueno != null) {
            model.addAttribute("dueno", dueno);
        }
        // else{
        //     throw new notFoundException(cedula);
        // }

        model.addAttribute("dueno", duenoService.findByCedula(cedula));
        return "mostrarDueno";
    }


    @GetMapping("/add")
    public String mostrarFormularioCrear(Model model) {

        Dueno dueno = new Dueno("", "", "", "");
        model.addAttribute("dueno", dueno);
        return "nuevoCliente";
    }

    @PostMapping("/agregar")
    public String agregarDueno(@ModelAttribute("dueno") Dueno dueno) {
        duenoService.add(dueno);

        
        return "redirect:/dueno/all";
    }
    
    @GetMapping("/delete/{id}")
    public String borrarDueno(@PathVariable("id") Long id) {
        duenoService.deleteById(id);

        return "redirect:/dueno/all";
    }

    @GetMapping("/update/{id}")
    public String mostrarFormularioUpdate(@PathVariable("id") Long id, Model model) {
        
        model.addAttribute("dueno", duenoService.findById(id));
        
        return "actualizarDueno";
    }

    @PostMapping("/update/{id}")
    public String actualizarDueno(@ModelAttribute("dueno") Dueno dueno) {
        
        duenoService.update(dueno);

        return "redirect:/dueno/all";
    }

}