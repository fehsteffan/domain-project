package com.program.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.program.domain.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {

}
