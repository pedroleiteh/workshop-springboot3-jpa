package com.snyzen.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.snyzen.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	
}
