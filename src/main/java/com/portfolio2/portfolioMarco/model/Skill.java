package com.portfolio2.portfolioMarco.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter @Setter
@Entity
public class Skill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long skillId;
    private String imgUrl;
    private int procentaje;

    public Skill() {
    }

    public Skill(Long skillId, String imgUrl, int procentaje) {
        this.skillId = skillId;
        this.imgUrl = imgUrl;
        this.procentaje = procentaje;
    }
}
