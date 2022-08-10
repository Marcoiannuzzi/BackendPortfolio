package com.portfolio2.portfolioMarco.controller;

import com.portfolio2.portfolioMarco.model.Proyecto;
import com.portfolio2.portfolioMarco.service.ProyectoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:4200/")
public class ProyectoController {

    final ProyectoService proyectoService;

    @Autowired
    public ProyectoController(ProyectoService proyectoService) {
        this.proyectoService = proyectoService;
    }

    //Buscar proyecto

    @GetMapping("/api/proyectos")
    public List<Proyecto> findAll() {
        return proyectoService.findAll();
    }

    @GetMapping("/api/proyectos/{id}")
    public ResponseEntity<Proyecto> findById(@PathVariable Long id){
        return proyectoService.findById(id);
    }

    //Crear Proyecto

    @PostMapping("/api/proyectos")
    public Proyecto create(@RequestBody Proyecto proyecto) {
        return proyectoService.create(proyecto);
    }

    //Actualizar Proyecto

    @PutMapping("/api/proyectos")
    public ResponseEntity<Proyecto> update(@RequestBody Proyecto proyecto){
        return proyectoService.update(proyecto);
    }

    //Borrar Proyecto

    @DeleteMapping("/api/proyectos/{id}")
    public ResponseEntity<Proyecto> delete(@PathVariable Long id){
        return proyectoService.delete(id);
    }


}
