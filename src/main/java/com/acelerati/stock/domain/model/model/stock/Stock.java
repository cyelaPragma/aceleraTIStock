package com.acelerati.stock.domain.model.model.stock;

import com.acelerati.stock.domain.model.model.product.Product;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Stock {
    private Long id;
    private int amount;
    private Product product;
    private Double salePrice;
}
