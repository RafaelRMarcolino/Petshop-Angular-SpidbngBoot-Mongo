package com.backend.ApiPet.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.registry.infomodel.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backend.ApiPet.exception.ResourceNotFoundException;
import com.backend.ApiPet.model.Users;
import com.backend.ApiPet.repository.UsersRepository;
import com.backend.ApiPet.service.SequenceGeneratorService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class UsersController {
	
	@Autowired
	private SequenceGeneratorService service;
	
	@Autowired
	private  UsersRepository repo;
	
	@GetMapping("/usuarios")
	public List<Users> getAllUsers() throws ResourceNotFoundException {
		
		return repo.findAll();
	}

	@GetMapping("/usuarios/{id}")
	public ResponseEntity<Users> getByIdUsers(@PathVariable(value= "id") Long id) throws ResourceNotFoundException {
		
		Users obj = repo.findById(id).orElseThrow(() -> new ResourceNotFoundException("Cliente não encontrado " + User.class));
		
		return ResponseEntity.ok().body(obj);	
	}
	
	
	@PostMapping("/usuarios")
	public Users insertUsers(@RequestBody Users obj) throws ResourceNotFoundException {
		

		obj.setId(service.generatorSequence(Users.SEQUENCE_NAME));
		return repo.save(obj);
	}
	
	
	@PutMapping("/usuarios/{id}")
	public ResponseEntity<Users> updatetUsers(@PathVariable (value = "id") long id,  @RequestBody Users obj) 
			throws ResourceNotFoundException {

		Users usuarios = repo.findById(id).orElseThrow(()-> new ResourceNotFoundException("Cliente não existe " + id));
		
		usuarios.setName(obj.getName());
		usuarios.setEmail(obj.getEmail());
		usuarios.setPhone(obj.getPhone());
		
		final Users updateUsers = repo.save(usuarios);
		return ResponseEntity.ok(updateUsers);

	}
	
	public Map<String, Boolean > deleteUsers(@PathVariable(value = "id") Long id) throws ResourceNotFoundException{
		
		Users obj = repo.findById(id).orElseThrow(() -> new ResourceNotFoundException("Cliente não existe " + id));
		
		Map<String, Boolean> response = new HashMap<>();
		
		return response;
	}
	
	

	
}
