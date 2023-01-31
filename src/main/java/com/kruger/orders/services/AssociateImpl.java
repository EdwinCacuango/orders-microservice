package com.kruger.orders.services;

import com.kruger.orders.entities.Associate;
import com.kruger.orders.repositories.AssociateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AssociateImpl implements AssociateService{
    @Autowired
    private AssociateRepository repo;
    @Override
    public List<Associate> getAll() {
        return (List<Associate>) repo.findAll();
    }

    @Override
    public Optional<Associate> findById(Long id) {
        return repo.findById(id);
    }

    @Override
    public Associate save(Associate associate) {
        return repo.save(associate);
    }

    @Override
    public void delete(Long id) {
        repo.deleteById(id);
    }
}
