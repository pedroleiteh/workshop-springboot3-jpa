package com.snyzen.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.snyzen.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
