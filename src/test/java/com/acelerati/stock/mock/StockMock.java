package com.acelerati.stock.mock;

import com.acelerati.stock.domain.model.model.stock.Stock;
import java.util.ArrayList;
import java.util.List;

public class StockMock {

    public static Stock createStock(Long id) {
        return new Stock(
                id,
                0,
                ProductMock.createProduct(id),
                0.0);
    }

    public static List<Stock> getStockList() {
        List<Stock> stockList = new ArrayList<>();
        stockList.add(createStock(1L));
        stockList.add(createStock(2L));
        stockList.add(createStock(3L));
        return stockList;
    }
}
