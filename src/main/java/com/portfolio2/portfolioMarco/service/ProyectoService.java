package com.portfolio2.portfolioMarco.service;

import com.portfolio2.portfolioMarco.model.Proyecto;
import com.portfolio2.portfolioMarco.repository.ProyectoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ProyectoService {

    private final ProyectoRepo proyectoRepo;

    @Autowired
    public ProyectoService(ProyectoRepo proyectoRepo) {
        this.proyectoRepo = proyectoRepo;
    }


    // Buscar un proyecto

    public List<Proyecto> findAll() {
        return proyectoRepo.findAll();
    }

    // Crear un proyecto

    public Proyecto create(Proyecto proyecto){
        return proyectoRepo.save(proyecto);
    }


    // Actualizar un proyecto

    public ResponseEntity<Proyecto> update( Proyecto proyecto){
        if (proyecto.getProyId()==null){
            return ResponseEntity.notFound().build();
        }
        if (!proyectoRepo.existsById(proyecto.getProyId())){
            return ResponseEntity.badRequest().build();
        }
        Proyecto result = proyectoRepo.save(proyecto);
        return ResponseEntity.ok(result);
    }

    // Borrar un proyecto

    public ResponseEntity<Proyecto> delete(Long id){
        if(!proyectoRepo.existsById(id)){
            ResponseEntity.notFound().build();
        }
        proyectoRepo.deleteById(id);
        return ResponseEntity.noContent().build();
    }

}
