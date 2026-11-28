package com.fonendoscopio.digital;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MedicionViewController {

    @Autowired
    private MedicionService medicionService;

    // Listas para los desplegables del formulario
    @ModelAttribute("perfiles")
    public List<String> perfiles() {
        return List.of("Paciente de riesgo", "General", "Deportista");
    }

    @ModelAttribute("calidades")
    public List<String> calidades() {
        return List.of("Aceptable", "Dudosa", "No válida");
    }

    @GetMapping("/")
    public String index() {
        return "redirect:/web/mediciones";
    }

    // Lista todas las mediciones
    @GetMapping("/web/mediciones")
    public String listMediciones(Model model) {
        model.addAttribute("mediciones", medicionService.getAllMediciones());
        return "listMediciones";
    }

    // Formulario vacío para crear
    @GetMapping("/web/mediciones/nueva")
    public String nuevaMedicion(Model model) {
        model.addAttribute("medicion", new Medicion());
        return "formMedicion";
    }

    // Formulario relleno para editar
    @GetMapping("/web/mediciones/{id}/editar")
    public String editarMedicion(@PathVariable("id") Long id, Model model) {
        Medicion m = medicionService.getMedicion(id);
        if (m == null) {
            return "redirect:/web/mediciones";
        }
        model.addAttribute("medicion", m);
        return "formMedicion";
    }

    // Sirve para crear (id vacío) y para actualizar (id relleno)
    @PostMapping("/web/mediciones/guardar")
    public String guardarMedicion(@ModelAttribute("medicion") Medicion medicion) {
        medicionService.saveMedicion(medicion);
        return "redirect:/web/mediciones";
    }

    @PostMapping("/web/mediciones/{id}/eliminar")
    public String eliminarMedicion(@PathVariable("id") Long id) {
        medicionService.deleteMedicion(id);
        return "redirect:/web/mediciones";
    }
}