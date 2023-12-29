package com.practice.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.google.common.base.Optional;
import com.practice.demo.model.User;

public interface IMyRepository extends JpaRepository<User, Integer>{

	Optional<User> findByUsername(String username);

	
}
