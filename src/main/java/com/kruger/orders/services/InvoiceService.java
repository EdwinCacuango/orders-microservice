package com.kruger.orders.services;


import com.kruger.orders.entities.Invoice;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface InvoiceService {

    List<Invoice> getAll();

    Optional<Invoice> findById(Long id);

    Invoice save(Invoice invoice);

    void delete(Long id);
}
