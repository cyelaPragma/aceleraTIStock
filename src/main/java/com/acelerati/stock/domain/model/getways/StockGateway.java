package com.acelerati.stock.domain.model.getways;

import com.acelerati.stock.domain.model.stock.Stock;

import java.util.List;

public interface StockGateway {
    Stock findStockById(Long idStock);
}
