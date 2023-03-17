package com.acelerati.stock.mockData;

import com.acelerati.stock.domain.model.model.stock.Stock;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StockMockData {

     public static Stock stock01(){
         return new Stock(
                 1L,
                 25,
                 ProductMockData.Product01(),
                 75.0
         );
     }

    public static Stock stock02(){
        return new Stock(
                2L,
                40,
                ProductMockData.Product02(),
                105.0
        );
    }

    public static List<Stock> getAllStocks(){
        List<Stock> stocks = new ArrayList<>();
        stocks.add(stock01());
        stocks.add(stock02());
        return stocks;
    }

    public static List<Stock> filterStockByPrice(Double minPrice, Double maxPrice){
        List<Stock> stocks = getAllStocks();
        return stocks
                .stream()
                .filter(stock -> stock.getSalePrice() >= maxPrice && stock.getSalePrice() <= maxPrice )
                .collect(Collectors.toList());
    }

    public static List<Stock> filterStockByBrand(String brand){
        List<Stock> stocks = getAllStocks();
        return stocks
                .stream()
                .filter(stock -> stock.getProduct().getBrand().getName().equals(brand))
                .collect(Collectors.toList());
    }

    public static List<Stock> filterStockByCategory(String category){
        List<Stock> stocks = getAllStocks();
        return stocks
                .stream()
                .filter(stock -> stock.getProduct().getCategory().getName().equals(category))
                .collect(Collectors.toList());
    }
}
