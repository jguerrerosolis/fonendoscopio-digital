package com.fonendoscopio.digital;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MedicionController {

    @Autowired
    private MedicionService medicionService;

    // Devuelve todas las mediciones
    @GetMapping("/mediciones")
    public List<Medicion> getMediciones() {
        return medicionService.getAllMediciones();
    }

    // Devuelve la medicion con ese id
    @GetMapping("/medicion/{id}")
    public Medicion getMedicion(@PathVariable("id") Long id) {
        return medicionService.getMedicion(id);
    }

    // Crea una medicion con el objeto Medicion recibido en formato JSON
    @PostMapping(value = "/medicion", consumes = { MediaType.APPLICATION_JSON_VALUE })
    public ResponseEntity<?> saveMedicion(@RequestBody Medicion medicion) {
        try {
            medicionService.saveMedicion(medicion);
            return ResponseEntity.ok().body("Una nueva medicion se ha anyadido");
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body("No se ha podido guardar la medicion");
        }
    }

    // Actualiza la medicion con el id recibido en el JSON
    @PutMapping(value = "/medicion", consumes = { MediaType.APPLICATION_JSON_VALUE })
    public ResponseEntity<?> updateMedicion(@RequestBody Medicion medicion) {
        try {
            medicionService.saveMedicion(medicion);
            return ResponseEntity.ok().body("La medicion se ha actualizado");
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body("No se ha podido actualizar la medicion");
        }
    }

    // Elimina la medicion con ese id
    @DeleteMapping("/medicion/{id}")
    public ResponseEntity<?> deleteMedicion(@PathVariable("id") Long id) {
        try {
            medicionService.deleteMedicion(id);
            return ResponseEntity.ok().body("La medicion se ha eliminado");
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body("La medicion no existe");
        }
    }
}
