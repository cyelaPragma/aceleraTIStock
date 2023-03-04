package com.acelerati.stock.domain.model.stock;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Product {
    private String name;
    private String supplier;
    private String category;
    private String brand;
}
