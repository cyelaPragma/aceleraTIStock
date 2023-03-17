package com.acelerati.stock.domain.model.getways.repositories;

import com.acelerati.stock.domain.model.model.stock.Stock;

public interface StockGateway {
    Stock findStockById(Long idStock);
}
