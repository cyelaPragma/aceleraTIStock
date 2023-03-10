package com.acelerati.stock.domain.model.product;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Brand {
    private Long id;
    private String name;
    private String description;
}

