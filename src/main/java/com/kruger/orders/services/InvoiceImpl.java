package com.kruger.orders.services;

import com.kruger.orders.entities.Invoice;
import com.kruger.orders.repositories.InvoiceRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class InvoiceImpl implements InvoiceService{
    @Autowired
    private InvoiceRepository repo;
    @Override
    public List<Invoice> getAll() {
        return (List<Invoice>) repo.findAll();
    }

    @Override
    public Optional<Invoice> findById(Long id) {
        return repo.findById(id);
    }

    @Override
    public Invoice save(Invoice invoice) {
        return repo.save(invoice);
    }

    @Override
    public void delete(Long id) {
        repo.deleteById(id);
    }
}
