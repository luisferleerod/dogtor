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

    // Método para mostrar el formulario de inicio de sesión
    // http://localhost:8090/dueno/inicioSesion
    @GetMapping("/inicioSesion")
    public String mostrarFormularioInicioSesion(Model model) {
        Dueno dueno = new Dueno( "", "", "", "");  // Puedes inicializar un objeto Dueno si es necesario
        model.addAttribute("dueno", dueno);
        return "inicioSesion";
    }

    // Método para iniciar sesión
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
    


    
    // Método para mostrar todos los dueños
    // http://localhost:8090/dueno/all
    @GetMapping("/all")
    public String MostrarDuenos(Model model) {
        model.addAttribute("duenos", duenoService.findAll());
        return "mostrarTodosDuenos";
    }

    // Método para mostrar información de un dueño específico
    // http://localhost:8090/dueno/find/{id}
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

    // Método para mostrar el formulario de creación de un nuevo dueño
    // http://localhost:8090/dueno/add
    @GetMapping("/add")
    public String mostrarFormularioCrear(Model model) {

        Dueno dueno = new Dueno("", "", "", "");
        model.addAttribute("dueno", dueno);
        return "nuevoCliente";
    }

    // Método para agregar un nuevo dueño
    @PostMapping("/agregar")
    public String agregarDueno(@ModelAttribute("dueno") Dueno dueno) {
        duenoService.add(dueno);

        
        return "redirect:/dueno/all";
    }
    
    // Método para eliminar un dueño
    // http://localhost:8090/dueno/delete/{id}
    @GetMapping("/delete/{id}")
    public String borrarDueno(@PathVariable("id") Long id) {
        duenoService.deleteById(id);

        return "redirect:/dueno/all";
    }

    // Método para mostrar el formulario de actualización de un dueño
    // http://localhost:8090/dueno/update/{id}
    @GetMapping("/update/{id}")
    public String mostrarFormularioUpdate(@PathVariable("id") Long id, Model model) {
        
        model.addAttribute("dueno", duenoService.findById(id));
        
        return "actualizarDueno";
    }

    // Método para actualizar la información de un dueño
    // http://localhost:8090/dueno/update/{id}
    @PostMapping("/update/{id}")
    public String actualizarDueno(@ModelAttribute("dueno") Dueno dueno) {
        
        duenoService.update(dueno);

        return "redirect:/dueno/all";
    }

}