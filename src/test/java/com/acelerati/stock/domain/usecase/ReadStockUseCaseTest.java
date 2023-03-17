package com.acelerati.stock.domain.usecase;

import com.acelerati.stock.domain.model.exceptions.StockEmptyException;
import com.acelerati.stock.domain.model.gateways.repositories.StockRepository;
import com.acelerati.stock.domain.model.model.stock.Stock;
import com.acelerati.stock.mock.StockMock;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(classes = ReadStockUseCase.class)
class ReadStockUseCaseTest {
    @InjectMocks
    private ReadStockUseCase readStockUseCase;
    @Mock
    private StockRepository stockRepository;

    @BeforeEach
    void setup(){
        readStockUseCase = new ReadStockUseCase(stockRepository);
    }

    @Test
    void readStocksSuccess() {
        List<Stock> stockList = readStockUseCase.readAllStocks();
        assertArrayEquals(StockMock.getStockList().toArray(), stockList.toArray());
    }

    @Test
    void readStocksEmpty() {
        assertThrows(StockEmptyException.class, () -> readStockUseCase.readAllStocks());
    }

    @Test
    void readStocksTechnicalError() {
        assertThrows(StockEmptyException.class, () -> readStockUseCase.readAllStocks());
    }
}