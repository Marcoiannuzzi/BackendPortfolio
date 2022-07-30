package com.portfolio2.portfolioMarco.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Getter @Setter
@Entity
public class Persona implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String apellido;
    private String ocupacion;
    private String localidad;
    private String telefono;
    private String email;
    private String acerca;
    private String linkedInUrl;
    private String imgUrl;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "eduId")
    private List<Estudio> estudiosList;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "expId")
    private List<Experiencia> esperienciaList;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "skillId")
    private List<Skill> skillList;

    public Persona() {
    }

    public Persona(Long id, String nombre, String apellido, String ocupacion, String localidad, String telefono, String email, String acerca, String linkedInUrl, String imgUrl) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.ocupacion = ocupacion;
        this.localidad = localidad;
        this.telefono = telefono;
        this.email = email;
        this.acerca = acerca;
        this.linkedInUrl = linkedInUrl;
        this.imgUrl = imgUrl;
    }
}
