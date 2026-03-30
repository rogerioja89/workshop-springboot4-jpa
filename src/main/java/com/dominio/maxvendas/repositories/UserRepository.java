package com.dominio.maxvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dominio.maxvendas.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}