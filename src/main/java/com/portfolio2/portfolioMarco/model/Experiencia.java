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
    private String start;
    private String end;

    public Experiencia() {
    }

    public Experiencia(Long expId, String institucion, String tareas, String start, String end) {
        this.expId = expId;
        this.institucion = institucion;
        this.tareas = tareas;
        this.start = start;
        this.end = end;
    }
}
