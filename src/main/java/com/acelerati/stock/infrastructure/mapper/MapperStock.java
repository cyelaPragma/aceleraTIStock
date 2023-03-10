package com.acelerati.stock.infrastructure.mapper;

import com.acelerati.stock.domain.model.stock.Stock;
import com.acelerati.stock.infrastructure.drivenadapters.jpa_repository.entity.StockData;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MapperStock {
    public Stock toStock(StockData stockData){
        return new Stock(
            stockData.getId(),
            stockData.getProductId(),
            stockData.getAmount(),
            stockData.getSupplierPrice(),
            stockData.getSalePrice()
        );
    }

    public StockData toData(Stock stock){
        return new StockData(
                stock.getId(),
                stock.getIdProduct(),
                stock.getAmount(),
                stock.getSupplierPrice(),
                stock.getSalePrice()
        );
    }
}

