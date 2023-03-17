package com.acelerati.stock.domain.model.gateways.repositories;

import com.acelerati.stock.domain.model.model.stock.Stock;

import java.util.List;

public interface StockRepository {

    public List<Stock> readAllStock();
}
