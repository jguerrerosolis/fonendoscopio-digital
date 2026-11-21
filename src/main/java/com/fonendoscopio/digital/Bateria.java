package com.fonendoscopio.digital;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Bateria{

    @GetMapping("/bateria")
    public String info() {
        return "Estado de la bateria: 95% - Autonomía de 12 horas";
        return "Estado de la batería: 90% - Voltaje: 3.7V";
    }
}