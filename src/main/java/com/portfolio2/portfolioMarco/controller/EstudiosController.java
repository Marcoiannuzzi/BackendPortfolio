package com.portfolio2.portfolioMarco.controller;

import com.portfolio2.portfolioMarco.model.Estudio;
import com.portfolio2.portfolioMarco.service.EstudiosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:4200/")
public class EstudiosController {

    final EstudiosService estudiosService;

    @Autowired
    public EstudiosController(EstudiosService estudiosService) {
        this.estudiosService = estudiosService;
    }


    // Buscar un estudio

    @GetMapping("/api/estudios")
    public List<Estudio> findAll() {
        return estudiosService.findAll();
    }

    // Crear un estudio
    @PostMapping("/api/estudios")
    public Estudio create(@RequestBody Estudio estudio) {
        return estudiosService.create(estudio);
    }

    @PutMapping("/api/estudios")
    public ResponseEntity<Estudio> update(@RequestBody Estudio estudio){
        return estudiosService.update(estudio);
    }

    @DeleteMapping("/api/estudios/{id}")
    public ResponseEntity<Estudio> delete(@PathVariable Long id) {
        return estudiosService.delete(id);
    }

}
