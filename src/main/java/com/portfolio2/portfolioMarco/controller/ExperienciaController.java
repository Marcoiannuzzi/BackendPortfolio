package com.portfolio2.portfolioMarco.controller;

import com.portfolio2.portfolioMarco.model.Experiencia;
import com.portfolio2.portfolioMarco.service.ExperienciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("https://portfolio-marcoiannuzzi.web.app")
public class ExperienciaController {

    final ExperienciaService experienciaService;

    @Autowired
    public ExperienciaController(ExperienciaService experienciaService) {
        this.experienciaService = experienciaService;
    }

    //Buscar todas las experiencias

    @GetMapping("/api/experiencias")
    public List<Experiencia> findAll() {
        return experienciaService.findAll();
    }

    @GetMapping("/api/experiencias/{id}")
    public ResponseEntity<Experiencia> findById(@PathVariable Long id){
        return experienciaService.findById(id);
    }

    // Crear experiencia

    @PostMapping("/api/experiencias")
    public Experiencia create(@RequestBody Experiencia experiencia){
        return experienciaService.create(experiencia);
    }

    // Actualizar experiencia

    @PutMapping("/api/experiencias")
    public ResponseEntity<Experiencia> update(@RequestBody Experiencia experiencia){
        return experienciaService.update(experiencia);
    }

    //Borrar experiencia

    @DeleteMapping("/api/experiencias/{id}")
    public ResponseEntity<Experiencia> delete(@PathVariable Long id){
        return experienciaService.delete(id);
    }

}
