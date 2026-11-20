package com.fonendoscopio.digital;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Conexion {

    @GetMapping("/conexion")
    public String info() {
        return "Estado de la conexión: conectado por Bluetooth - Señal 85% - Última sincronización hace 2 minutos";
    }
}