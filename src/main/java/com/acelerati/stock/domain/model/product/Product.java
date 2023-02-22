package com.acelerati.stock.domain.model.product;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Product {

    private Long id;
    private Brand brand;
    private Category category;
    private String name;
    private String description;
    private String model;
}
