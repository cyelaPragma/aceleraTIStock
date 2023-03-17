package com.acelerati.stock.infrastructure.drivenadapters.jpa_repository.getways;

import com.acelerati.stock.domain.model.getways.repositories.StockGateway;
import com.acelerati.stock.domain.model.model.stock.Stock;
import com.acelerati.stock.infrastructure.drivenadapters.jpa_repository.repository.StockDataRepository;
import com.acelerati.stock.infrastructure.mapper.MapperStock;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class StockDataGatewayImpl implements StockGateway {
    private final MapperStock mapperStock;
    private final StockDataRepository repository;

    @Override
    public Stock findStockById(Long stockId) {
        return mapperStock.entityToStock(
                repository.findById(stockId).orElseThrow(null)
        );
    }
}

