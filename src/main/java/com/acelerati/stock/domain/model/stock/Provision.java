package com.acelerati.stock.domain.model.stock;

import com.acelerati.stock.domain.model.product.Product;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@AllArgsConstructor
@Getter
@Setter
public class Provision {
    private Long id;
    private Date date;
    private Long userId;
    private int stock;
    private Double entryPricing;
    private Supplier supplier;
    private Product product;
}
