package com.acelerati.stock.domain.model.stock;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Stock {
    private Long id;
    private Long idProduct;
    private int amount;
    private Double supplierPrice;
    private Double salePrice;
}
