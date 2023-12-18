package com.datarest.datarest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;

import com.datarest.datarest.model.Client;

@RepositoryRestController
public interface ClientRepository extends JpaRepository<Client, Long> {

}
