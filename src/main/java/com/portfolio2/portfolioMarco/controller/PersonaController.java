package com.portfolio2.portfolioMarco.controller;

import com.portfolio2.portfolioMarco.model.Persona;
import com.portfolio2.portfolioMarco.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:4200/")
public class PersonaController {

    private PersonaService personaService;

    @Autowired
    public PersonaController(PersonaService personaService) {
        this.personaService = personaService;
    }

    // Buscar todas las Personas

    /**
     * http://locashost:8081/api/personas
     * @return devuelve todas las personas en la base de datos
     */
    @GetMapping("/api/personas")
    public List<Persona> findAll() {
        return personaService.findAll();
    }

    ///////////

    // Buscar una persona por id
    @GetMapping("/api/persona/{id}")
    public ResponseEntity<Persona> findById(@PathVariable Long id){
        return personaService.findById(id);
    }


    // Crear una nueva persona

    @PostMapping("/api/personas")
    public Persona create(@RequestBody Persona persona){
    return personaService.create(persona);
    }


    /**
     * Actualizar una nueva persona
     *
     */
    @PutMapping("/api/personas")
    public ResponseEntity<Persona> update(@RequestBody Persona persona){
        return personaService.update(persona);
    }

    // Borrar persona

    @DeleteMapping("/api/persona/{id}")
    public ResponseEntity<Persona> delete(@PathVariable Long id){
        return personaService.delete(id);
    }

}
