package com.snyzen.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.snyzen.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
	
}
