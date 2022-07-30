package com.portfolio2.portfolioMarco.repository;

import com.portfolio2.portfolioMarco.model.Proyecto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProyectoRepo extends JpaRepository<Proyecto, Long> {
}
