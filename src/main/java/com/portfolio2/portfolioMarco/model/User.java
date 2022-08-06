package com.portfolio2.portfolioMarco.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    private String email;
    private String password;

    public User() {
    }

    public User(Long userId, String email, String password) {
        this.userId = userId;
        this.email = email;
        this.password = password;
    }
}
