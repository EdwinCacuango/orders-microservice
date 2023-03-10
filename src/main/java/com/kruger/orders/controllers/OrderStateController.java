package com.kruger.orders.controllers;

import com.kruger.orders.entities.OrderState;
import com.kruger.orders.services.OrderStateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class OrderStateController {
    @Autowired
    private OrderStateService service;

    @GetMapping("/order-state")
    public List<OrderState> getAll(){
        return service.getAll();
    }

    @PostMapping("/order-state")
    @ResponseStatus(HttpStatus.CREATED)
    public OrderState save(@RequestBody OrderState state){
        return service.save(state);
    }

    @DeleteMapping("/order-state/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        Optional<OrderState> o = service.findById(id);
        if(o.isPresent()){
            service.delete(id);
            return ResponseEntity.noContent().build();
        }else{
            return ResponseEntity.notFound().build();
        }
    }
}
