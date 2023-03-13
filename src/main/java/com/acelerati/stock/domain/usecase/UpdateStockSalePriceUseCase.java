package com.acelerati.stock.domain.usecase;

import com.acelerati.stock.domain.model.stock.repository.StockRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class UpdateStockSalePriceUseCase {
    private final StockRepository stockRepository ;
    public void updateSalePriceProductById(Long stockId, Double salePrice) {
        var stock = stockRepository.findByStockId(stockId);
        stockRepository.updatePrice(stock.getSalePrice()).setSalePrice(salePrice);
    }
}