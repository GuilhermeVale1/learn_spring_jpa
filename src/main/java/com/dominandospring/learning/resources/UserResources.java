package com.dominandospring.learning.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dominandospring.learning.entities.User;

@RestController

@RequestMapping(value = "/users")

public class UserResources {
	
	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1L, "Maria" , "Maria@gmail.com" , "999999" , "1234");
		return ResponseEntity.ok().body(u);
	}
}
