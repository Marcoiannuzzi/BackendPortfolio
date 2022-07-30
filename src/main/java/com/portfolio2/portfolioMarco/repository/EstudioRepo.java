package com.portfolio2.portfolioMarco.repository;

import com.portfolio2.portfolioMarco.model.Estudio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstudioRepo extends JpaRepository<Estudio,Long> {
}
