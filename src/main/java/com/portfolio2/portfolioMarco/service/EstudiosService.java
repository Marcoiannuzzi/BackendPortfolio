package com.portfolio2.portfolioMarco.service;

import com.portfolio2.portfolioMarco.model.Estudio;
import com.portfolio2.portfolioMarco.repository.EstudioRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

@Service
@Transactional
public class EstudiosService {

    private final EstudioRepo estudioRepo;

    @Autowired
    public EstudiosService( EstudioRepo estudioRepo) {
        this.estudioRepo = estudioRepo;
    }

    // Buscar todos los estudios
    public List<Estudio> findAll() {
        return estudioRepo.findAll();
    }

    // Crear un nuevo estudio
    public Estudio create(Estudio estudio){
        return estudioRepo.save(estudio);
    }

    // Actualizar un estudio
    public ResponseEntity<Estudio> update(Estudio estudio){
        if(estudio.getEduId() == null){
            return ResponseEntity.badRequest().build();
        }
        if(!estudioRepo.existsById(estudio.getEduId())){
            return ResponseEntity.notFound().build();
        }
        Estudio result = estudioRepo.save(estudio);
        return ResponseEntity.ok(result);
    }

    //Borrar un estudio
    public ResponseEntity<Estudio> delete(Long id){
        if(!estudioRepo.existsById(id)){
            return ResponseEntity.notFound().build();
        }
        estudioRepo.deleteById(id);
        return ResponseEntity.noContent().build();
    }




}
