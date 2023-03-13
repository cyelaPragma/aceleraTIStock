package com.acelerati.stock.domain.model.stock.repository;

import com.acelerati.stock.domain.model.stock.entity.Stock;

public interface StockRepository{
    Stock updatePrice(Double price);
    Stock findByStockId(Long stockId);

}
