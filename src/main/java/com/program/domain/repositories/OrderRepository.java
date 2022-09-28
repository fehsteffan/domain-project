package com.program.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.program.domain.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>     {

}
