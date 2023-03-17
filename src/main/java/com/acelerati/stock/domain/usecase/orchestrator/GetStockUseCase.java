package com.acelerati.stock.domain.usecase.orchestrator;

import com.acelerati.stock.domain.model.model.stock.Stock;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
public class GetStockUseCase {
    public List<Stock> getStocks(){
        return new ArrayList<>();
    }
}
