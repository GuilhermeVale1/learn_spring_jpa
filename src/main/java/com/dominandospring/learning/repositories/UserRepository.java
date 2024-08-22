package com.dominandospring.learning.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dominandospring.learning.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	
}
