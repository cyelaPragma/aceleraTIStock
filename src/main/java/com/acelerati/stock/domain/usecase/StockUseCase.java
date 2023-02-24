package com.acelerati.stock.domain.usecase;

import com.acelerati.stock.domain.model.stock.Stock;
import com.acelerati.stock.infrastructure.drivenadapters.restapi.StockFeignClient;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class StockUseCase {
    private final StockFeignClient feignClient;

    public Stock findStockById(Long idStock){
        return feignClient.findStockById(idStock) ;
    }

    public List<Stock> getAllStock(){
        return feignClient.getAllStock();
    }
}
