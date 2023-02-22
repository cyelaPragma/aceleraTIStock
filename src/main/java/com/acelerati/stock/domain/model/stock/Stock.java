package com.acelerati.stock.domain.model.stock;

import com.acelerati.stock.domain.model.product.Product;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Stock {
    private int id;
    private Product product;
    private Double entryPricing;
    private Double sellPricing;
    private String description;
    private Integer stockItem;
}
