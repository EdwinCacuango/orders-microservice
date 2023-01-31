package com.kruger.orders.entities;


import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Email;

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
    @Email(message = "Enter valid email")
    private String mail;
    @Digits(message = "Number should contain 10 digits", fraction = 0, integer = 10)
    private String phone;
}
