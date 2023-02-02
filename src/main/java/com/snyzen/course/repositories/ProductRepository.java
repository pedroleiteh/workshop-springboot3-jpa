package com.snyzen.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.snyzen.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
}
