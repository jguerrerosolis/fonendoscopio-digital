package com.fonendoscopio.digital;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Medicion {

    @Id   //define que un campo es una clave primaria de la BBDD
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String paciente;
    private String perfilUso;          // Paciente de riesgo, General, Deportista
    private int frecuenciaCardiaca;    // Va en latidos por minuto (ppm)
    private double expansionToracica;  // Señal de la banda textil
    private String calidadTecnica;     // Aceptable, Dudosa, No válida

    public Medicion() {
    }

    public Medicion(String paciente, String perfilUso, int frecuenciaCardiaca, double expansionToracica, String calidadTecnica) {
        this.paciente = paciente;
        this.perfilUso = perfilUso;
        this.frecuenciaCardiaca = frecuenciaCardiaca;
        this.expansionToracica = expansionToracica;
        this.calidadTecnica = calidadTecnica;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getPaciente() { return paciente; }
    public void setPaciente(String paciente) { this.paciente = paciente; }

    public String getPerfilUso() { return perfilUso; }
    public void setPerfilUso(String perfilUso) { this.perfilUso = perfilUso; }

    public int getFrecuenciaCardiaca() { return frecuenciaCardiaca; }
    public void setFrecuenciaCardiaca(int frecuenciaCardiaca) { this.frecuenciaCardiaca = frecuenciaCardiaca; }

    public double getExpansionToracica() { return expansionToracica; }
    public void setExpansionToracica(double expansionToracica) { this.expansionToracica = expansionToracica; }

    public String getCalidadTecnica() { return calidadTecnica; }
    public void setCalidadTecnica(String calidadTecnica) { this.calidadTecnica = calidadTecnica; }
}