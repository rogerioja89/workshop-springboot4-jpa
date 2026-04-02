package com.dominio.maxvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dominio.maxvendas.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}