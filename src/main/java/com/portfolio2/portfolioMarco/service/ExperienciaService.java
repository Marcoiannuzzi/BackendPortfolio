package com.portfolio2.portfolioMarco.service;

import com.portfolio2.portfolioMarco.model.Experiencia;
import com.portfolio2.portfolioMarco.repository.ExperienciaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ExperienciaService {

    private final ExperienciaRepo experienciaRepo;

    @Autowired
    public ExperienciaService(ExperienciaRepo experienciaRepo) {
        this.experienciaRepo = experienciaRepo;
    }

    // Buscar experiencias

    public List<Experiencia> findAll(){
        return experienciaRepo.findAll();
    }

    // Crear experiencia

    public Experiencia create(Experiencia experiencia){
        return experienciaRepo.save(experiencia);
    }

    //Actualizar una experiencia

    public ResponseEntity<Experiencia> update(Experiencia exp){
        if (exp.getExpId() == null){
            return ResponseEntity.badRequest().build();
        }
        if (experienciaRepo.existsById(exp.getExpId())){
            return ResponseEntity.notFound().build();
        }
        Experiencia result = experienciaRepo.save(exp);
        return ResponseEntity.ok(result);
    }


    //Borrar una experiencia

    public ResponseEntity<Experiencia> delete(Long id){
        if (!experienciaRepo.existsById(id)){
            return ResponseEntity.notFound().build();
        }
        experienciaRepo.deleteById(id);
        return ResponseEntity.noContent().build();
    }


}
