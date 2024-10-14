package com.example.jpamarket.domain;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Table(name = "customers")
@Getter
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String address;
    private String phoneNumber;

    public Customer(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public static Customer newCustomer(CreateCustomer createCustomer){
        return new Customer(createCustomer.getName(), createCustomer.getAddress(), createCustomer.getPhoneNumber());
    }
}
