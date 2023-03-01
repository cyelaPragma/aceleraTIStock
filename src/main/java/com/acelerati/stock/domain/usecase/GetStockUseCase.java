package com.acelerati.stock.domain.usecase;

import com.acelerati.stock.domain.model.gateways.StockGateway;
import com.acelerati.stock.domain.model.stock.Stock;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Collections;
import java.util.List;

@RequiredArgsConstructor
public class GetStockUseCase {
    private final StockGateway stockGateway;

    public Stock findStockById(Long idStock){
        return stockGateway.findStockById(idStock) ;
    }
    public Page<Stock> getAllStock(Pageable pageable){
        try{
            return stockGateway.getAllStock(pageable);
        }catch(RuntimeException e){
            return null;
        }
    }
}
