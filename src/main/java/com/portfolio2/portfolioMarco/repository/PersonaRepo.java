package com.portfolio2.portfolioMarco.repository;

import com.portfolio2.portfolioMarco.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepo extends JpaRepository<Persona,Long> {

}
