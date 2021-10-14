package com.MARCELO073.CrudClient.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.MARCELO073.CrudClient.dto.ClientDTO;
import com.MARCELO073.CrudClient.entities.Client;
import com.MARCELO073.CrudClient.exeception.ResourceNotFoundException;
import com.MARCELO073.CrudClient.repositories.ClientRepository;

@Service
public class ClientService {
	
	
	@Autowired
	private ClientRepository repository;
	
	// busca todos os objetos
    @Transactional(readOnly = true) 
	public List<ClientDTO> findAll() {
    	List<Client> list = repository.findAll();
    	return list.stream().map(x -> new ClientDTO(x)).collect(Collectors.toList());
 
    	}
    // busca obijeto por id, caso não encontre passa excessão
    @Transactional(readOnly = true)
	public ClientDTO findById(Long id) {
    	Optional<Client> obj = repository.findById(id);
    	Client entity = obj.orElseThrow(()-> new ResourceNotFoundException("Entity not found"));
    	
	
		return new ClientDTO(entity);
	}
    	
		

	}


