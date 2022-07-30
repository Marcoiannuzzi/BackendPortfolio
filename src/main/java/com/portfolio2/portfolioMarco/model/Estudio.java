package com.portfolio2.portfolioMarco.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Getter @Setter
@Entity
public class Estudio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long eduId;
    private String institucion;
    private String titulo;
    private String start;
    private String end;

    public Estudio() {
    }

    public Estudio(Long eduId, String institucion, String titulo, String start, String end) {
        this.eduId = eduId;
        this.institucion = institucion;
        this.titulo = titulo;
        this.start = start;
        this.end = end;
    }
}
