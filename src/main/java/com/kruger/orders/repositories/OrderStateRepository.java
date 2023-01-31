package com.kruger.orders.repositories;

import com.kruger.orders.entities.OrderState;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderStateRepository extends JpaRepository<OrderState, Long> {
}
