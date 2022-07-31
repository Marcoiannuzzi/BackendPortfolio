package com.portfolio2.portfolioMarco.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter @Setter
@Entity
public class Experiencia {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long expId;
    private String institucion;
    private String tareas;
    private String inicio;
    private String fin;

    public Experiencia() {
    }

    public Experiencia(Long expId, String institucion, String tareas, String inicio, String fin) {
        this.expId = expId;
        this.institucion = institucion;
        this.tareas = tareas;
        this.inicio = inicio;
        this.fin = fin;
    }
}
