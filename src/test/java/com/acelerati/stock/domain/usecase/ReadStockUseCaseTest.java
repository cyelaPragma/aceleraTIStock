package com.acelerati.stock.domain.usecase;

import com.acelerati.stock.domain.model.getways.repositories.StockGateway;
import com.acelerati.stock.domain.model.model.stock.Stock;
import com.acelerati.stock.mockData.StockMockData;
import jdk.jfr.Name;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class ReadStockUseCaseTest {

    @InjectMocks
    ReadStockUseCase readStockUseCase;

    @Mock
    StockGateway stockGateway;

    @BeforeEach
    void setUp() {
        readStockUseCase = new ReadStockUseCase(stockGateway);
    }

    @Test
    @Name("test a stock get all stock")
    void getListStocks() {
        List<Stock> stocksTest = readStockUseCase.getAllStocks();
        assertEquals(StockMockData.getAllStocks().toArray(), stocksTest.toArray());
    }

    @Test
    @Name("test a stock filter by price")
    void filterStockByPrice() {
        Double minPrice = 100.0;
        Double maxPrice = 150.0;
        List<Stock> stocksTest = readStockUseCase.filterStockByPrice(minPrice, maxPrice);
        assertEquals(StockMockData.filterStockByPrice(minPrice, maxPrice).toArray(), stocksTest.toArray());
    }

    @Test
    @Name("test a stock filter by brand")
    void filterStockByBrand() {
        String brand = "";
        List<Stock> stocksTest = readStockUseCase.filterStockByBrand(brand);
        assertEquals(StockMockData.filterStockByBrand(brand).toArray(), stocksTest.toArray());
    }

    @Test
    @Name("test a stock filter by category")
    void filterStockByCategory() {
        String category = "";
        List<Stock> stocksTest = readStockUseCase.filterStockByCategory(category);
        assertEquals(StockMockData.filterStockByCategory(category).toArray(), stocksTest.toArray());
    }
}