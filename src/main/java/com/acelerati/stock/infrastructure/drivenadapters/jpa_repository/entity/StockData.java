package com.acelerati.stock.infrastructure.drivenadapters.jpa_repository.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "stocks")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class StockData {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long id;
    @Column(name = "ID_PRODUCT")
    private Long productId;
    @Column(name = "AMOUNT_STOCK")
    private int amount;
    @Column(name = "SUPPLIER_PRICE")
    private Double supplierPrice;
    @Column(name = "SALE_PRICE")
    private Double salePrice;
}


