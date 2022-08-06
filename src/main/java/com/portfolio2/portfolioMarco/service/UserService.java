package com.portfolio2.portfolioMarco.service;

import com.portfolio2.portfolioMarco.model.User;
import com.portfolio2.portfolioMarco.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class UserService {
    private final UserRepo userRepo;

    @Autowired
    public UserService(UserRepo userRepo) {

        this.userRepo = userRepo;
    }
    public ResponseEntity<User> findById(Long id){
        Optional<User> userOpt = userRepo.findById(id);

        //opcion 1 -- Devuelve un Responce entity, si lo encuentra devuelve una persona sino devuelve un 404 not found
        if(userOpt.isPresent()){
            return ResponseEntity.ok(userOpt.get());
        } else
            return ResponseEntity.notFound().build();

        // opcion 2 Devuelve una persona o un null si no la encuentra (el estado siempre sera un 200 ok)
        // return personaRepo.findById(id).orElse(null);
    }

}
