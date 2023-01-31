package com.kruger.orders.services;

import com.kruger.orders.entities.Order;
import com.kruger.orders.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderImpl  implements  OrderService{
    @Autowired
    private OrderRepository repo;
    @Override
    public List<Order> getAll() {
        return (List<Order>) repo.findAll();
    }

    @Override
    public Optional<Order> findById(Long id) {
        return repo.findById(id);
    }

    @Override
    public Order save(Order order) {
        return repo.save(order);
    }

    @Override
    public void delete(Long id) {
        repo.deleteById(id);
    }
}
