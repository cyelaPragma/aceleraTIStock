package com.acelerati.stock.domain.usecase;

import com.acelerati.stock.domain.model.gateways.repositories.StockRepository;
import com.acelerati.stock.domain.model.model.stock.Stock;
import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.List;
@AllArgsConstructor
public class ReadStockUseCase {

    private final StockRepository stockRepository;
    public List<Stock> readAllStocks(){
        return stockRepository.readAllStock();
    }
}
