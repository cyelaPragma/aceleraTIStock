package com.acelerati.stock.domain.usecase;

import com.acelerati.stock.domain.model.getways.repositories.StockGateway;
import com.acelerati.stock.domain.model.model.stock.Stock;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class ReadStockUseCase {

    private final StockGateway stockGateway;

    public Stock findStockById(Long idStock) {
        return stockGateway.findStockById(idStock);
    }

    public List<Stock> filterStockByPrice(Double minPrice, Double maxPrice){
        return null;
    }

    public List<Stock> filterStockByBrand(String brand){
        return null;
    }

    public List<Stock> filterStockByCategory(String category) {
        return null;
    }

    public List<Stock> getAllStocks() {
        return null;
    }
}
