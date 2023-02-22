package com.acelerati.stock.domain.model.stock;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@AllArgsConstructor
@Getter
@Setter
public class Provision {
    private int id;
    private Date date;
    private int userId;
    private int stock;
    private Double entryPricing;
    private Supplier supplier;
}
