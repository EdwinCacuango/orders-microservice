package com.kruger.orders.entities;


import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "users")
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String lastName;
    private String address;
    private String mail;
    private String phone;
}
