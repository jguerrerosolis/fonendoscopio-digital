package com.fonendoscopio.digital;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Bateria{

    @GetMapping("/bateria")
    public String info() {
        return "Estado de la batería: 95% - Autonomía de 12 horas";
    }
}