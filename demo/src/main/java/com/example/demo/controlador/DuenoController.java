package com.example.demo.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.entidad.Dueno;
import com.example.demo.entidad.Mascota;
import com.example.demo.servicio.DuenoService;
import com.example.demo.servicio.MascotaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RequestMapping("/dueno")
@Controller
public class DuenoController {
    @Autowired
    DuenoService duenoService;

    @GetMapping("/all")
    public String MostrarDuenos(Model model) {
        model.addAttribute("duenos", duenoService.findAll());
        return "mostrarTodosDuenos";
    }

    @GetMapping("/find/{cedula}")
    public String MostrarInfoDueno(Model model, @PathVariable("cedula") String cedula) {
        
        //Dueno dueno = duenoService.findByCedula(cedula);
        // if(dueno != null) {
        //     model.addAttribute("dueno", dueno);
        // }
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
        return "crearDueno";
        

    }

    @PostMapping("/agregar")
    public String agregarDueno(@ModelAttribute("dueno") Dueno dueno) {
        duenoService.add(dueno);

        
        return "redirect:/dueno/all";
    }
    
    @GetMapping("/delete/{cedula}")
    public String borrarDueno(@PathVariable("cedula") String cedula) {
        duenoService.deleteByCedula(cedula);

        return "redirect:/dueno/all";
    }

    @GetMapping("/update/{cedula}")
    public String mostrarFormularioUpdate(@PathVariable("cedula") String cedula, Model model) {
        
        model.addAttribute("dueno", duenoService.findByCedula(cedula));
        
        return "actualizarDueno";
    }

    @PostMapping("/update/{cedula}")
    public String actualizarDueno(@ModelAttribute("dueno") Dueno dueno) {
        
        duenoService.update(dueno);

        return "redirect:/dueno/all";
    }
}
