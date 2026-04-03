package com.dominio.maxvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dominio.maxvendas.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}