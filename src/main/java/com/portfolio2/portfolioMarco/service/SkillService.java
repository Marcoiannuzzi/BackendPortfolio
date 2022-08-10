package com.portfolio2.portfolioMarco.service;

import com.portfolio2.portfolioMarco.model.Skill;
import com.portfolio2.portfolioMarco.repository.SkillRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class SkillService {

    private final SkillRepo skillRepo;

    @Autowired
    public SkillService(SkillRepo skillRepo) {
        this.skillRepo = skillRepo;
    }

    // Buscar skill

    public List<Skill> findAll() {
        return skillRepo.findAll();
    }

    public ResponseEntity<Skill>findById(Long id){
        Optional<Skill> opSkill = skillRepo.findById(id);
        if(opSkill.isPresent()){
            return ResponseEntity.ok(opSkill.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // Crear skill

    public Skill create(Skill skill){
        return skillRepo.save(skill);
    }

    // Actualizar un skill

    public ResponseEntity<Skill> update( Skill skill){
        if(skill.getSkillId()==null){
            return ResponseEntity.badRequest().build();
        }
        if (!skillRepo.existsById(skill.getSkillId())){
            return ResponseEntity.notFound().build();
        }
        Skill result = skillRepo.save(skill);
        return ResponseEntity.ok(result);
    }

    //Borrar un Skill

    public ResponseEntity<Skill> delete(Long id){
        if(!skillRepo.existsById(id)){
            return ResponseEntity.notFound().build();
        }
        skillRepo.deleteById(id);
        return ResponseEntity.noContent().build();
    }


}
