package com.acelerati.stock.domain.model.gateways;

import com.acelerati.stock.domain.model.stock.Stock;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface StockGateway {
    Page<Stock> getAllStock(Pageable pageable);

    Stock findStockById(Long idStock);
}
