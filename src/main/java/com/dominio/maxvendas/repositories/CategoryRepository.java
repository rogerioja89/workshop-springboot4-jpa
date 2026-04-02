package com.dominio.maxvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dominio.maxvendas.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}