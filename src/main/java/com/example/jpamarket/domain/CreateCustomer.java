package com.example.jpamarket.domain;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class CreateCustomer {

    private String name;
    private String address;
    private String phoneNumber;

    public static CreateCustomer ofDefault() {
        return CreateCustomer.builder()
                .name("chanwu")
                .address("seoul")
                .phoneNumber("010-2222-2222")
                .build();
    }
}
