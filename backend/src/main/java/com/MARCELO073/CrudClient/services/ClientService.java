package com.MARCELO073.CrudClient.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MARCELO073.CrudClient.entities.Client;
import com.MARCELO073.CrudClient.repositories.ClientRepository;

@Service
public class ClientService {
	@Autowired
	private ClientRepository repository;

	public List<Client> findAll() {
		return repository.findAll();

	}

}
