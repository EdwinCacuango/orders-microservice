package com.kruger.orders.services;

import com.kruger.orders.entities.OrderState;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface OrderStateService {
    List<OrderState> getAll();

    Optional<OrderState> findById(Long id);

    OrderState save(OrderState state);

    void delete(Long id);
}
