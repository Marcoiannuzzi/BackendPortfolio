package com.portfolio2.portfolioMarco.repository;

import com.portfolio2.portfolioMarco.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RestController;

@RestController
public interface UserRepo extends JpaRepository<User,Long> {
}
