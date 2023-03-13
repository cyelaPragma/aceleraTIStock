package com.acelerati.stock.domain.model.model.user;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class User {
    private Long id;
    private String name;
    private String surname;
    private String mail;
    private String phone;
    private String address;
    private String dniTypeId;
    private String dniNumber;
    private String personTypeId;
}
