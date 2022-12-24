package com.snyzen.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.snyzen.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
}
