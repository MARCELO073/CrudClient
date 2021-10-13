package com.MARCELO073.CrudClient.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.MARCELO073.CrudClient.entities.Client;
@Repository
public interface ClientRepository extends JpaRepository<Client, Long > {

}
 	 	