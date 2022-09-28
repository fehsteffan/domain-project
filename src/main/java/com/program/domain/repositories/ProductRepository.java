package com.program.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.program.domain.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
