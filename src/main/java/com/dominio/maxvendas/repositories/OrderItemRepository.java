package com.dominio.maxvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dominio.maxvendas.entities.OrderItem;
import com.dominio.maxvendas.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}