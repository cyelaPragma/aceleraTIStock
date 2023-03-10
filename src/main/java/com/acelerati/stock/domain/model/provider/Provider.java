package com.acelerati.stock.domain.model.provider;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Provider {
    private Long id;
    private String name;
    private String surname;
    private String mail;
    private String phone;
    private String address;
    private String idDniType;
    private String dniNumber;
    private String idPersonType;
}


