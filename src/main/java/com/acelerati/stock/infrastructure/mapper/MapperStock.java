package com.acelerati.stock.infrastructure.mapper;

import com.acelerati.stock.domain.model.model.product.Product;
import com.acelerati.stock.domain.model.model.stock.Stock;
import com.acelerati.stock.infrastructure.drivenadapters.jpa_repository.entity.StockData;
import org.springframework.stereotype.Component;

@Component
public class MapperStock {

    Product product;

    public Stock entityToStock(StockData stockData){
        return new Stock(
            stockData.getId(),
            stockData.getAmount(),
            product,
            stockData.getSalePrice()
        );
    }

    public StockData stockToEntity(Stock stock){
        return new StockData(
                stock.getId(),
                stock.getAmount(),
                stock.getProduct().getId(),
                stock.getSalePrice()
        );
    }
}

