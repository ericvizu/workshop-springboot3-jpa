package com.ericvizu.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ericvizu.course.entities.OrderItem;

// Opcional a anotation Repository pois UserRepository já está herdando do JpaRepository que está registrada como componente
public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
