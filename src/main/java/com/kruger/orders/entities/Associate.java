package com.kruger.orders.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "associates")
@Data
@AllArgsConstructor @NoArgsConstructor

public class Associate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty(message = "Name shouldn't be empty")
    @NotNull(message = "Name shouldn't be null")
    private String name;

    @NotEmpty(message = "Address shouldn't be empty")
    @NotNull(message = "Address shouldn't be null")
    private String address;
}
