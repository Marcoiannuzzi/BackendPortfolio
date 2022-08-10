package com.portfolio2.portfolioMarco.service;

import com.portfolio2.portfolioMarco.model.Persona;
import com.portfolio2.portfolioMarco.repository.PersonaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class PersonaService {

    private final PersonaRepo personaRepo;

    @Autowired
    public PersonaService(PersonaRepo personaRepo) {
        this.personaRepo = personaRepo;
    }


    public List<Persona> findAll() {
        return personaRepo.findAll();
    }

   public ResponseEntity<Persona> findById(Long id){
        Optional<Persona> personaOpt = personaRepo.findById(id);
        if(personaOpt.isPresent()){
            return ResponseEntity.ok(personaOpt.get());
        } else
            return ResponseEntity.notFound().build();
    }


    public Persona create(Persona persona){
        // Guardar el libro recibido por parametros en la base de datos
        return personaRepo.save(persona);
    }


    public ResponseEntity<Persona> update(Persona persona){
        if (persona.getId() == null){ // si id es null es que no existe en bd por lo que se debe crear y no actualizar.
            return ResponseEntity.badRequest().build();
        }
        if(!personaRepo.existsById(persona.getId())){
            return ResponseEntity.notFound().build();
        }
        Persona result = personaRepo.save(persona);
        return ResponseEntity.ok(result);
    }

   public ResponseEntity<Persona> delete(Long id){
        if(!personaRepo.existsById(id)){
            return ResponseEntity.notFound().build();
        }
        personaRepo.deleteById(id);
        return ResponseEntity.noContent().build();
    }


}
