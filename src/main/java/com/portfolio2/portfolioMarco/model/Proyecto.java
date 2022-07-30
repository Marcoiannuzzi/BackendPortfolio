package com.portfolio2.portfolioMarco.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter @Setter
@Entity
public class Proyecto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long proyId;
    private String titulo;
    private String descripcion;
    private String proyUrl;

    public Proyecto() {
    }

    public Proyecto(Long proyId, String titulo, String descripcion, String proyUrl) {
        this.proyId = proyId;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.proyUrl = proyUrl;
    }
}
