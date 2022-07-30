package com.portfolio2.portfolioMarco.repository;

import com.portfolio2.portfolioMarco.model.Experiencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExperienciaRepo extends JpaRepository<Experiencia, Long> {
}
