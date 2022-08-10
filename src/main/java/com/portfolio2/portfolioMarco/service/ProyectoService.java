package com.portfolio2.portfolioMarco.service;

import com.portfolio2.portfolioMarco.model.Proyecto;
import com.portfolio2.portfolioMarco.repository.ProyectoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

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


    public ResponseEntity<Proyecto> findById(Long id){
        Optional<Proyecto> opProyecto = proyectoRepo.findById(id);
        if(opProyecto.isPresent()){
            return ResponseEntity.ok(opProyecto.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // Crear un proyecto

    public Proyecto create(Proyecto proyecto){
        return proyectoRepo.save(proyecto);
    }


    // Actualizar un proyecto

    public ResponseEntity<Proyecto> update( Proyecto proyecto){
        if (proyecto.getProyId()==null){
            return ResponseEntity.badRequest().build();
        }
        if (!proyectoRepo.existsById(proyecto.getProyId())){
            return ResponseEntity.notFound().build();
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
