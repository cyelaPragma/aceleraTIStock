package com.acelerati.stock.domain.model.stock;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Supplier {
    private Long id;
    private String name;
    private String description;
}
