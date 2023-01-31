package com.kruger.orders.services;

import com.kruger.orders.entities.Order;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface OrderService {
    List<Order> getAll();

    Optional<Order> findById(Long id);

    Order save(Order order);

    void delete(Long id);

}
