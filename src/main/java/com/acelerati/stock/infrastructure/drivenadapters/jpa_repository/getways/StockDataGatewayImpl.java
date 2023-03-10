package com.acelerati.stock.infrastructure.drivenadapters.jpa_repository.getways;

import com.acelerati.stock.domain.model.getways.StockGateway;
import com.acelerati.stock.domain.model.stock.Stock;
import com.acelerati.stock.infrastructure.drivenadapters.jpa_repository.repository.StockDataRepository;
import com.acelerati.stock.infrastructure.mapper.MapperStock;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class StockDataGatewayImpl implements StockGateway {
    private final MapperStock mapperStock;
    private final StockDataRepository repository;

    @Override
    public Stock findStockById(Long stockId) {
        return mapperStock.toStock(repository.findById(stockId).orElseThrow(null));
    }
}

