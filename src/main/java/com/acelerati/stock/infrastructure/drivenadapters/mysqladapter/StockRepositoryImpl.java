package com.acelerati.stock.infrastructure.drivenadapters.mysqladapter;

import com.acelerati.stock.domain.model.gateways.repositories.StockRepository;
import com.acelerati.stock.domain.model.model.stock.Stock;

import java.util.List;

public class StockRepositoryImpl implements StockRepository {
    @Override
    public List<Stock> readAllStock() {
        return null;
    }
}
