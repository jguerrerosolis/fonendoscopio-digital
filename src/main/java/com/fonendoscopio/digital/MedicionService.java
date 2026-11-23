package com.fonendoscopio.digital;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MedicionService {

    @Autowired
    MedicionRepository medicionRepository;

    public List<Medicion> getAllMediciones() {
        return medicionRepository.findAll();
    }

    public Medicion getMedicion(Long id) {
        return medicionRepository.getReferenceById(id);
    }

    // Sirve para crear una medicion nueva (sin id) o actualizar una existente (con id)
    public Medicion saveMedicion(Medicion medicion) {
        return medicionRepository.saveAndFlush(medicion);
    }

    public void deleteMedicion(Long id) {
        medicionRepository.delete(medicionRepository.getReferenceById(id));
    }
}
