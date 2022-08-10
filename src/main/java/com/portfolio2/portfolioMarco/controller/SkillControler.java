package com.portfolio2.portfolioMarco.controller;

import com.portfolio2.portfolioMarco.model.Skill;
import com.portfolio2.portfolioMarco.service.SkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:4200/")
public class SkillControler {
    final SkillService skillService;

    @Autowired

    public SkillControler(SkillService skillService) {
        this.skillService = skillService;
    }

    //Buscar Skill

    @GetMapping("/api/skills")
    public List<Skill> findAll() {
        return skillService.findAll();
    }

    @GetMapping("/api/skills/{id}")
    public ResponseEntity<Skill> findById(@PathVariable Long id) {
        return skillService.findById(id);
    }

    //Crear Skill

    @PostMapping("/api/skills")
    public Skill create(@RequestBody Skill skill) {
        return skillService.create(skill);
    }

    //Actualizar Skill

    @PutMapping("/api/skills")
    public ResponseEntity<Skill> update(@RequestBody Skill skill) {
        return skillService.update(skill);
    }

    // Borrar Skill

    @DeleteMapping("/api/skills/{id}")
    public ResponseEntity<Skill> delete(@PathVariable Long id) {
        return skillService.delete(id);
    }

}
